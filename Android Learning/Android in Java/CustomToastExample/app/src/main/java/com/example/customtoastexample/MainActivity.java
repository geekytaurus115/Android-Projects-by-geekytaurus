package com.example.customtoastexample;



import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity{
    Button btn;
    @Override protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //        default Toast
//                        Toast.makeText(getApplicationContext(), "This is my Toast", Toast.LENGTH_SHORT).show();

                Toast toast = new Toast(getApplicationContext());
                View v = getLayoutInflater().inflate(R.layout.custom_toast_layout, (ViewGroup) findViewById(R.id.viewParent));

                toast.setView(v);

//                 toast.setText(); // as by default toast set
                TextView txtMsg = v.findViewById(R.id.txtMsg); // as already converted to view from layout custom_toast_layout, so now need to find id like this
                txtMsg.setText("Message sent seccessfully!");

                toast.setDuration(Toast.LENGTH_LONG);

              //  toast.setGravity(Gravity.TOP|Gravity.RIGHT, 2, 0);
                toast.setGravity(Gravity.CENTER, 0, 0);


                toast.show();

            }
        });


    }
}