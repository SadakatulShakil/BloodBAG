package com.example.bloodbagbb.Fragment;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.bloodbagbb.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ForRequestFragment extends Fragment {


    public ForRequestFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_for_request, container, false);
    }

}
