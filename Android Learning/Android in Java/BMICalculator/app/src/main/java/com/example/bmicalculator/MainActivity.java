package com.example.bmicalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity{

    @Override
   protected void onCreate(Bundle savedInstanceState){
       super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);

        EditText edtWeight, edtHeightFt, edtHeightInch;
        Button btnCalculate;
        TextView tvResult;
        View lrMain;

        edtWeight = findViewById(R.id.edtWeight);
        edtHeightFt = findViewById(R.id.edtHeightFt);
        edtHeightInch = findViewById(R.id.edtHeightInch);
        btnCalculate = findViewById(R.id.btnCalculate);
        tvResult = findViewById(R.id.tvResult);
        lrMain = findViewById(R.id.lrMain);

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               int wt = Integer.parseInt(edtWeight.getText().toString());
               int htF = Integer.parseInt(edtHeightFt.getText().toString());
               int htI = Integer.parseInt(edtHeightInch.getText().toString());

               int totalIn = htF*12 + htI;
               double totalCm = totalIn*2.53;
               double totalM = totalCm/100;

               double bmi = wt/(totalM*totalM);

               if (bmi > 25){
                   tvResult.setText("You're Overweight");
                   lrMain.setBackgroundColor(getResources().getColor(R.color.colorOW));
               }
               else if(bmi < 18){
                   tvResult.setText("You're Underweight");
                   lrMain.setBackgroundColor(getResources().getColor(R.color.colorUW));
               }
               else{
                   tvResult.setText("You're Healthy");
                   lrMain.setBackgroundColor(getResources().getColor(R.color.colorH));
               }


            }
        });

   }

}