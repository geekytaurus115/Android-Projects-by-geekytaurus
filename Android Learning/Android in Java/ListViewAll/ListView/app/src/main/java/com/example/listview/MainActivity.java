package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    ArrayList<String> arrNames = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);

        arrNames.add("Mamata");
        arrNames.add("Avinashi");
        arrNames.add("Deepshikha");
        arrNames.add("Aditi");
        arrNames.add("Arshika");
        arrNames.add("Anu");
        arrNames.add("Mamata1");
        arrNames.add("Avinashi1");
        arrNames.add("Deepshikha1");
        arrNames.add("Aditi1");
        arrNames.add("Arshika1");
        arrNames.add("Anu1");
        arrNames.add("Mamata2");
        arrNames.add("Avinashi2");
        arrNames.add("Deepshikha2");
        arrNames.add("Aditi2");
        arrNames.add("Arshika2");
        arrNames.add("Anu2");
        arrNames.add("Mamata3");
        arrNames.add("Avinashi3");
        arrNames.add("Deepshikha3");
        arrNames.add("Aditi3");
        arrNames.add("Arshika3");
        arrNames.add("Anu3");

        ArrayAdapter<String> arrAdapter = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1, arrNames);

        listView.setAdapter(arrAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                if (i == 0){
                    Toast.makeText(MainActivity.this, "Clicked on first item", Toast.LENGTH_SHORT).show();
                }
                else if (i == 5){
                    Toast.makeText(MainActivity.this, "Clicked on 6th item", Toast.LENGTH_SHORT).show();
                }


                Toast.makeText(MainActivity.this, "Random click", Toast.LENGTH_SHORT).show();

            }
        });


    }
}