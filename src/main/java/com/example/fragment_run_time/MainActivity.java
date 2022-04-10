package com.example.fragment_run_time;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    public static FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(findViewById(R.id.container_layout) != null){

            if(savedInstanceState != null){
                return;
            }

        fragmentManager = getSupportFragmentManager();

        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        KinzaFragment kinzaFragment = new KinzaFragment();

        fragmentTransaction.add(R.id.container_layout, kinzaFragment, null);

        fragmentTransaction.commit();

        }
    }
}