package com.example.activitylife_date;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void mt(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_LONG).show();
    }

    public void onchanges(View v) {
        ((TextView) findViewById(R.id.textView)).setText(new Date().toString());
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("date", ((TextView) findViewById(R.id.textView)).getText().toString());
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        if (savedInstanceState != null)
            ((TextView) findViewById(R.id.textView)).setText(new Date().toString());
    }
}