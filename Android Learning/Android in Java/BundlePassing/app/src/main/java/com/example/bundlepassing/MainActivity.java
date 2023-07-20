package com.example.bundlepassing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity{
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnNext = findViewById(R.id.btnNext);

        Intent iNext;
        iNext = new Intent(MainActivity.this, SecondActivity.class);
        iNext.putExtra("name", "MS");
        iNext.putExtra("roll_no", "3");
        iNext.putExtra("title", "Student Info");

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(iNext);
            }
        });


    }
}



