package com.example.runtime_config_changes_manually;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this,"onRestart",Toast.LENGTH_LONG).show();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        if(newConfig.orientation==Configuration.ORIENTATION_LANDSCAPE)
            ((ImageView)findViewById(R.id.imageView)).setImageResource(R.drawable.android);
        else if(newConfig.orientation==Configuration.ORIENTATION_PORTRAIT)
            ((ImageView)findViewById(R.id.imageView)).setImageResource(R.drawable.applw);
        else
            ((ImageView)findViewById(R.id.imageView)).setImageResource(R.drawable.base);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this,"onDestroy",Toast.LENGTH_SHORT).show();
    }
}
