package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<ContactModel> arrContacts = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerContact);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        arrContacts.add(new ContactModel(R.drawable.a, "A", "8954278932"));
        arrContacts.add(new ContactModel(R.drawable.b, "B", "8954278932"));
        arrContacts.add(new ContactModel(R.drawable.c, "C", "8954278932"));
        arrContacts.add(new ContactModel(R.drawable.d, "D", "8954278932"));
        arrContacts.add(new ContactModel(R.drawable.e, "E", "8954278932"));
        arrContacts.add(new ContactModel(R.drawable.f, "F", "8954278932"));
        arrContacts.add(new ContactModel(R.drawable.g, "G", "8954278932"));
        arrContacts.add(new ContactModel(R.drawable.a, "A", "8954278932"));
        arrContacts.add(new ContactModel(R.drawable.b, "B", "8954278932"));
        arrContacts.add(new ContactModel(R.drawable.c, "C", "8954278932"));
        arrContacts.add(new ContactModel(R.drawable.d, "D", "8954278932"));
        arrContacts.add(new ContactModel(R.drawable.e, "E", "8954278932"));
        arrContacts.add(new ContactModel(R.drawable.f, "F", "8954278932"));
        arrContacts.add(new ContactModel(R.drawable.g, "G", "8954278932"));
        arrContacts.add(new ContactModel(R.drawable.a, "A", "8954278932"));
        arrContacts.add(new ContactModel(R.drawable.b, "B", "8954278932"));

        RecyclerContactAdapter adapter = new RecyclerContactAdapter(this, arrContacts);
        recyclerView.setAdapter(adapter);


    }
}