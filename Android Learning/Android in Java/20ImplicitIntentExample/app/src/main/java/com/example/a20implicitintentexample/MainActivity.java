package com.example.a20implicitintentexample;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity{
    Button btnDial, btnMsg, btnEmail, btnShare;

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnDial = findViewById(R.id.btnDial);
        btnMsg = findViewById(R.id.btnMsg);
        btnEmail = findViewById(R.id.btnEmail);
        btnShare = findViewById(R.id.btnShare);

        btnDial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iDial = new Intent();
                iDial.setAction(Intent.ACTION_DIAL);

                // or in single line
                //Intent iDial = new Intent(Intent.ACTION_DIAL);

                iDial.setData(Uri.parse("tel: +917060040418"));
                startActivity(iDial);
            }
        });

        btnMsg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iMsg = new Intent(Intent.ACTION_SENDTO);

                iMsg.setData(Uri.parse("smsto:"+Uri.encode("+91 9045672345")));
                iMsg.putExtra("sms_body", "Please solve this issue asap...");
                startActivity(iMsg);
            }
        });

        btnEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iEmail = new Intent(Intent.ACTION_SEND);

                iEmail.setType("message/rfc822");
                iEmail.putExtra(Intent.EXTRA_EMAIL, new String[]{"ms@gmail.com", "ok@gmail.com"});
                iEmail.putExtra(Intent.EXTRA_SUBJECT, "Queries");
                iEmail.putExtra(Intent.EXTRA_TEXT, "Please solve my query!");

                startActivity(Intent.createChooser(iEmail, "Email via"));
            }
        });

        btnShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iShare = new Intent(Intent.ACTION_SEND);

                iShare.setType("text/plain");
                iShare.putExtra(Intent.EXTRA_EMAIL, "Download this amazing app from google.com");

                startActivity(Intent.createChooser(iShare, "Share via"));
            }
        });


    }
}