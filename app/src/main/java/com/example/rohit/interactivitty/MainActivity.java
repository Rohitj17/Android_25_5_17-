package com.example.rohit.interactivitty;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.jar.Attributes;

import static android.R.id.edit;

public class MainActivity extends AppCompatActivity {
public static final String key_res="keyres";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent it = new Intent();
        Bundle b1 = it.getExtras();
        if (b1 != null) {
            String s = b1.getString(Interactivity.key_r);
            ((TextView) (findViewById(R.id.editText2))).setText(s);
        }

         findViewById(R.id.button).setOnClickListener(new View.OnClickListener(){
             @Override
             public void onClick(View v) {
                 Bundle b=new Bundle();
                 b.putString(key_res,((RadioGroup)findViewById(R.id.radioGroup2)).getCheckedRadioButtonId()==R.id.radioButton ?"Mobile" :"Tv");
                 Intent i=new Intent();
                 i.putExtras(b);
                 setResult(200,i);
                 finish();
             }
         });
    }
}

