package com.example.autocompletelist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    AutoCompleteTextView autoComTextView;
    ArrayList<String> arrSubjects = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        autoComTextView = findViewById(R.id.autoComTextView);

        arrSubjects.add("C");
        arrSubjects.add("C++");
        arrSubjects.add("Java");
        arrSubjects.add("Python");
        arrSubjects.add("PHP");
        arrSubjects.add("Kotlin");
        arrSubjects.add("JavaScript");
        arrSubjects.add("Golang");

        ArrayAdapter<String> arrAdapter = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1, arrSubjects);
        autoComTextView.setAdapter(arrAdapter);
        autoComTextView.setThreshold(1); //from which letter start autocompleting

    }
}