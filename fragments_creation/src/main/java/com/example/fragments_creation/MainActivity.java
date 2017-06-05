package com.example.fragments_creation;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadFragment(First_Fragment.getInstance(R.mipmap.ic_launcher_round));
    }
    public void loadFragment(Fragment frag) {
        String back=frag.getClass().getName();
        FragmentManager manager = getSupportFragmentManager();//for interacting with fragments and it
         //returns FragmentManger  obj
        FragmentTransaction txn = manager.beginTransaction();//starts series of edit operation on fragments related to  FragmentManger
        txn.setCustomAnimations(R.anim.enter, R.anim.exit);
        txn.replace(R.id.frag1, frag);//replaces current frag
        txn.addToBackStack(back);
        txn.commit();//commits transaction & executes all commands
    }
}