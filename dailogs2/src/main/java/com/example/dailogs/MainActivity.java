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
    public void onAlert(View view) {
        dialog(App_dailog.No_Internet);
    }

    public void onDate(View view) {
        dialog(App_dailog.TAG_DATE);
    }

    public void onTime(View view) {
        dialog(App_dailog.TAG_TIME);
    }

    public void onProgress(View view) {
        dialog(App_dailog.TAG_PROGRESS);
    }

    public void onCustom(View view) {
        dialog(App_dailog.TAG_CUSTOM);
    }

    public void dialog(String tag) {
        App_dailog dialog = new App_dailog();
        dialog.show(getSupportFragmentManager(), tag);
    }
}
