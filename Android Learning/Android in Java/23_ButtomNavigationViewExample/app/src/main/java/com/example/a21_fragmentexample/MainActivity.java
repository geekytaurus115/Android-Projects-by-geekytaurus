package com.example.a21_fragmentexample;


import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity{
    BottomNavigationView bnView;

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bnView = findViewById(R.id.bnView);

        bnView.setOnItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();
                if (id == R.id.nav_home){
                    loadFrage(new AFragment(), false);

                }else if (id == R.id.nav_search){
                    loadFrage(new BFragment(), false);

                }else if (id == R.id.nav_settings){
                    loadFrage(new CFragment(), false);

                }else if (id == R.id.nav_contacts){
                    loadFrage(new DFragment(), false);

                }else{ // profile
                    loadFrage(new EFragment(), true);
                }

                return true;
            }
        });

        bnView.setSelectedItemId(R.id.nav_Profile);
    }

    public void loadFrage(Fragment fragement, boolean flag){
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();

        if (flag){
            ft.add(R.id.container, fragement);
        }else{
            ft.replace(R.id.container, fragement);
        }

        ft.commit();

    }
}
