package com.example.toast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onToast(View view)
    {
        Toast t= Toast.makeText(this,"Hey Buddy!",Toast.LENGTH_LONG);
        Button b=new Button(this);
        b.setText("Learning Android!!");
        t.setView(b);
        t.show();
    }
}
