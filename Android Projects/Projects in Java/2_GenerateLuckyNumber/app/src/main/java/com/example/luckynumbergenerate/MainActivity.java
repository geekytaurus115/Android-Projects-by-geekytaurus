package com.example.luckynumbergenerate;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity{
    EditText edtName;
    Button btnGenerate;

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtName = findViewById(R.id.edtName);
        btnGenerate = findViewById(R.id.btnGenerate);


        Intent intent = new Intent(this, SecondActivity.class);

        btnGenerate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = edtName.getText().toString().trim();

                if (name.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Enter your name to generate", Toast.LENGTH_SHORT).show();
                }else{
                    intent.putExtra("name", name);
                    startActivity(intent);
                }
            }
        });
    }

}