package com.example.fragment_run_time;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class KinzaFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_kinza, container, false);

        Button goToRabiaFragment = view.findViewById(R.id.go_rabia_fragment_button);

        goToRabiaFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                MainActivity.fragmentManager.beginTransaction().replace(R.id.container_layout, new RabiaFragment(), null).addToBackStack(null).commit();
            }
        });

        return view;
    }
}