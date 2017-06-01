package com.example.fragments_creation;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class Panel_Fragment extends Fragment {


    public Panel_Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_panel_, container, false);
     final MainActivity activity=(MainActivity) getActivity();
        v.findViewById(R.id.button1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity.loadFragment(First_Fragment.getInstance(R.drawable.android));
            }
        });
       v.findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               activity.loadFragment(First_Fragment.getInstance(R.drawable.applw));
           }
       });
       v.findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               activity.loadFragment(First_Fragment.getInstance(R.drawable.base));
           }
       });
        return  v;
    }

}
