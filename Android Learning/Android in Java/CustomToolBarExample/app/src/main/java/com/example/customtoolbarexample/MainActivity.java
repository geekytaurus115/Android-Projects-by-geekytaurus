package com.example.customtoolbarexample;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity{

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbar);
        /*
        * setSupportActionBar() --> when using Toolbar from appcompat library --> (New version of Toolbar)
        * setActionBar() --> when using Toolbar from normal widget library --> (Old version of Toolbar)
        * */

        // step - 1
        setSupportActionBar(toolbar);

        // step - 2
        /*
        * Customize toolbar - three dots, back symbol, or other customization
        * */
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true); //back button enabled
            getSupportActionBar().setTitle("My ToolBar");
        }

        //toolbar.setTitle("My ToolBar"); // here priority low i.e. will not overwrite
        toolbar.setSubtitle("Sub Title");


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menuComing) {
        new MenuInflater(this).inflate(R.menu.opt_menu, menuComing);
        return super.onCreateOptionsMenu(menuComing);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int itemId = item.getItemId();

        if (itemId == R.id.opt_new){
            Toast.makeText(this, "Created new file", Toast.LENGTH_SHORT).show();
        }else if (itemId == R.id.opt_open){
            Toast.makeText(this, "File Opened", Toast.LENGTH_SHORT).show();
        }else if (itemId == R.id.opt_save){
            Toast.makeText(this, "File Saved", Toast.LENGTH_SHORT).show();
        }else{
          // android.R.id.home
            super.onBackPressed();
        }

        return super.onOptionsItemSelected(item);
    }
}