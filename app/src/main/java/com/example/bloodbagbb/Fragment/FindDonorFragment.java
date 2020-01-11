package com.example.bloodbagbb.Fragment;


import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.bloodbagbb.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FindDonorFragment extends Fragment {

    private AutoCompleteTextView bloodSearchBox;
    private Context context;
    public FindDonorFragment() {
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
        return inflater.inflate(R.layout.fragment_find_donor, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        inItView(view);
        bloodSearchBox.setThreshold(1);
        bloodSearchBox.setAdapter(new ArrayAdapter<>(context,android.R.layout.simple_list_item_1,
                getResources().getStringArray(R.array.districts)));
    }

    private void inItView(View view) {
        bloodSearchBox = view.findViewById(R.id.searchBox);
    }
}
