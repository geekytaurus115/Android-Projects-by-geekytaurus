package com.example.alertdialogexample;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Single Button Dialog Box
//        // here for context can't use getApplicationContext, only have to use this activity context
//        AlertDialog alertDialog = new AlertDialog.Builder(this).create();
//
//        alertDialog.setTitle("Terms & Conditions");
//        alertDialog.setIcon(R.drawable.baseline_info_24);
//        alertDialog.setMessage("Have you read all T&C?");
//
//        alertDialog.setButton(Dialog.BUTTON_POSITIVE, "Yes, proceed", new DialogInterface.OnClickListener() {
//
//            @Override
//            public void onClick(DialogInterface dialogInterface, int i) {
//                Toast.makeText(MainActivity.this, "Yes, you can proceed now..", Toast.LENGTH_SHORT).show();
//            }
//        });
//
//        alertDialog.show();

//        // *************** Double Button Dialog Box *******************
//        AlertDialog.Builder delDialog = new AlertDialog.Builder(MainActivity.this);
//
//        delDialog.setTitle("Delete?");
//        delDialog.setIcon(R.drawable.baseline_delete_24);
//        delDialog.setMessage("Are you sure to delete?");
//
//        delDialog.setPositiveButton("Yes", new DialogInterface.OnClickListener(){
//
//            @Override
//            public void onClick(DialogInterface dialogInterface, int i) {
//                Toast.makeText(MainActivity.this, "Deleted successfully!", Toast.LENGTH_SHORT).show();
//            }
//        });
//
//        delDialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialogInterface, int i) {
//                Toast.makeText(MainActivity.this, "Not want to delete", Toast.LENGTH_SHORT).show();
//            }
//        });
//
//        delDialog.show();

    }

    @Override
    public void onBackPressed() {
       AlertDialog.Builder exitDialog = new AlertDialog.Builder(this);

       exitDialog.setTitle("Exit?");
       exitDialog.setMessage("Are you want to exit?");
       exitDialog.setIcon(R.drawable.baseline_exit_to_app_24);

       exitDialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
           @Override
           public void onClick(DialogInterface dialogInterface, int i) {
               MainActivity.super.onBackPressed();
           }
       });
       exitDialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
           @Override
           public void onClick(DialogInterface dialogInterface, int i) {
               Toast.makeText(MainActivity.this, "Welcome back!", Toast.LENGTH_SHORT).show();
           }
       });
       exitDialog.setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
           @Override
           public void onClick(DialogInterface dialogInterface, int i) {
               Toast.makeText(MainActivity.this, "Thanks for staying", Toast.LENGTH_SHORT).show();
           }
       });
       exitDialog.show();
    }
}