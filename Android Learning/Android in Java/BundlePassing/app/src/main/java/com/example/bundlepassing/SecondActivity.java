package com.example.bundlepassing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView tvStudentInfo = findViewById(R.id.tvStudentInfo);

        Intent myIntent;
        myIntent = getIntent();
        String name = myIntent.getStringExtra("name");
        int rollNo = myIntent.getIntExtra("roll_no", 0);
        String title = myIntent.getStringExtra("title");

        tvStudentInfo.setText("Name: "+name+" Roll No: "+rollNo);


        getSupportActionBar().setTitle(title);
    }
}