package com.example.rohit.interactivitty;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Interactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interactivity);
        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String u = ((EditText) (findViewById(R.id.editText2))).getText().toString();
                String p = ((EditText) (findViewById(R.id.pass))).getText().toString();

                if (u.equals("Rohit") && p.equals("Rohit")) {
                   Bundle b=new Bundle();
                    b.putString("Str",u);
                    b.putInt("Key",124);
                    Intent i = new Intent(Interactivity.this, MainActivity.class);
                    i.putExtras(b);
                    startActivity(i);
                }
            }
        });
    }
}
