package com.example.bloodbagbb.Fragment;


import android.app.AlertDialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.bloodbagbb.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/**
 * A simple {@link Fragment} subclass.
 */
public class ForRequestFragment extends Fragment {

    private  Context context;
    private FloatingActionButton addFab;
    public ForRequestFragment() {
        // Required empty public constructor
    }
    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        this.context = context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_for_request, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        initViews(view);
        ClickEvents();
    }

    private void ClickEvents() {

        addFab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPostRequestDialog();
            }
        });
    }

    private void openPostRequestDialog() {

        final AlertDialog.Builder alert = new AlertDialog.Builder(context);
        View dialogView = getLayoutInflater().inflate(R.layout.post_request_dialog, null);

    }

    private void initViews(View view) {
        addFab = view.findViewById(R.id.addFAB);
    }
}
