package com.example.fragments_creation;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


/**
 * A simple {@link Fragment} subclass.
 */
public class First_Fragment extends Fragment {

public static final String KEY_FRAG_NUM="fragnum";
    public First_Fragment() {
        // Required empty public constructor
    }
    public static First_Fragment getInstance(int image) {

        Bundle bundle = new Bundle();
        bundle.putInt(KEY_FRAG_NUM, image);
        First_Fragment fragment = new First_Fragment();
        fragment.setArguments(bundle);

        return fragment;
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View v= inflater.inflate(R.layout.fragment_first_, container, false);
        Bundle bundle = getArguments();
        int img = bundle.getInt(KEY_FRAG_NUM);

        ImageView imageView = (ImageView) v.findViewById(R.id.imageView);
        imageView.setImageResource(img);
        return v;
    }

}
