package com.example.animationguide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtAnim;
    Button btnTranslate, btnScale, btnRotate, btnAlpha;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtAnim = findViewById(R.id.txtAnim);
        btnTranslate = findViewById(R.id.btnTranslate);
        btnScale = findViewById(R.id.btnScale);
        btnRotate = findViewById(R.id.btnRotate);
        btnAlpha = findViewById(R.id.btnAlpha);

        Animation translate = AnimationUtils.loadAnimation(MainActivity.this, R.anim.translate);
        Animation scale = AnimationUtils.loadAnimation(MainActivity.this, R.anim.scale);
        Animation rotate = AnimationUtils.loadAnimation(MainActivity.this, R.anim.rotate);
        Animation alpha = AnimationUtils.loadAnimation(MainActivity.this, R.anim.alpha);

        btnTranslate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtAnim.startAnimation(translate);
            }
        });

        btnScale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtAnim.startAnimation(scale);
            }
        });

        btnRotate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtAnim.startAnimation(rotate);
            }
        });

        btnAlpha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtAnim.startAnimation(alpha);
            }
        });


    }
}