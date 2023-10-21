package com.example.a21_fragmentexample;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity{
    private static final String ROOT_FRAGMENT_TAG = "root_fragment";
    Button btnFragA, btnFragB, btnFragC;

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnFragA = findViewById(R.id.btnFragA);
        btnFragB = findViewById(R.id.btnFragB);
        btnFragC = findViewById(R.id.btnFragC);

        // Default Frag Open
        loadFragment(new AFragment(), 0);

        btnFragA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadFragment(new AFragment(), 0);

            }
        });

        btnFragB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadFragment(new BFragment(), 1);
            }
        });

        btnFragC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadFragment(new CFragment(), 1);
            }
        });
    }

    public void loadFragment(Fragment fragment, int flag){
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
//                AFragment aFragment = new AFragment();

        Bundle bundle = new Bundle();
        bundle.putString("Arg1", "Raman");
        bundle.putInt("Arg2", 7);

        fragment.setArguments(bundle);


        if (flag == 0){
            ft.add(R.id.container, fragment);
            fm.popBackStack(ROOT_FRAGMENT_TAG, FragmentManager.POP_BACK_STACK_INCLUSIVE);
            ft.addToBackStack(ROOT_FRAGMENT_TAG);

        }else{
            ft.replace(R.id.container, fragment);
            ft.addToBackStack(null);

        }
        ft.commit();
    }
}
