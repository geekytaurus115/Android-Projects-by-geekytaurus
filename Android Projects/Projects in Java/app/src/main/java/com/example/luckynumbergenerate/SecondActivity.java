package com.example.luckynumbergenerate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class SecondActivity extends AppCompatActivity {
    TextView txtNumber;
    Button btnShare;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        txtNumber = findViewById(R.id.txtNumber);
        btnShare = findViewById(R.id.btnShare);

        Intent i = getIntent();

        String generatedNumber = Integer.toString(GenerateNumber());
        txtNumber.setText(generatedNumber);

        if (i != null){
            String name = i.getStringExtra("name");

            btnShare.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent iShare = new Intent(Intent.ACTION_SEND);

                    iShare.setType("text/plain");
                    iShare.putExtra(Intent.EXTRA_SUBJECT, "Lucky Number ");
                    iShare.putExtra(Intent.EXTRA_TEXT, name+"'s lucky number is "+generatedNumber);

                    Intent chooser = Intent.createChooser(iShare, "Share via");
                    if (iShare.resolveActivity(getPackageManager()) != null) {
                        startActivity(chooser);
                    }
                }
            });
        }else{
            Log.e("SecondActivity", "Received intent is null");
        }

    }

    public int GenerateNumber(){
        Random random = new Random();

        int min = 1;
        int max = 100;
        int randomNumber = random.nextInt((max - min) + 1) + min;

        return randomNumber;
    }
}