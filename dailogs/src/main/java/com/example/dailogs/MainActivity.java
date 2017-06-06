package com.example.dailogs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onTime(View view)
    {


    }
    public void dailog(String s)
    {
        AppDialog d=new AppDialog();
        d.show(getSupportFragmentManager(),s);
    }

}
