package com.example.recyclerviewlearn;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class MainActivity extends Activity {
    ArrayList<ContactModel> arrContacts = new ArrayList<>();
    FloatingActionButton btnOpenDialog;
    RecyclerContactAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerContact);
        btnOpenDialog = findViewById(R.id.btnOpenDialog);


        btnOpenDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Dialog dialog = new Dialog(MainActivity.this);
                dialog.setContentView(R.layout.add_update_lay);


                EditText edtName = dialog.findViewById(R.id.edtName);
                EditText edtNumber = dialog.findViewById(R.id.edtNumber);
                Button btnSubmit = dialog.findViewById(R.id.btnSubmit);

                btnSubmit.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String name="", number="";
                        if (!edtName.getText().toString().equals("")) {
                            name = edtName.getText().toString();
                        } else {
                            Toast.makeText(MainActivity.this, "Please Enter Contact Name", Toast.LENGTH_SHORT).show();
                        }

                        if (edtNumber.getText().toString().equals("")) {
                            number = edtNumber.getText().toString();
                        } else{
                            Toast.makeText(MainActivity.this, "Please Enter Contact Number", Toast.LENGTH_SHORT).show();
                        }

                        arrContacts.add(new ContactModel(name, number));
                        adapter.notifyItemInserted(arrContacts.size()-1);

                        recyclerView.scrollToPosition(arrContacts.size()-1);

                        dialog.dismiss();


                    }
                });

                dialog.show();
            }
        });

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        arrContacts.add(new ContactModel(R.drawable.a, "A", "9845327890"));
        arrContacts.add(new ContactModel(R.drawable.b, "B", "7902398345"));
        arrContacts.add(new ContactModel(R.drawable.c, "C", "8902398345"));
        arrContacts.add(new ContactModel(R.drawable.d, "D", "9902398345"));
        arrContacts.add(new ContactModel(R.drawable.e, "E", "7802398345"));
        arrContacts.add(new ContactModel(R.drawable.a, "F", "9845327890"));
        arrContacts.add(new ContactModel(R.drawable.b, "G", "7902398345"));
        arrContacts.add(new ContactModel(R.drawable.c, "H", "8902398345"));
        arrContacts.add(new ContactModel(R.drawable.d, "I", "9902398345"));
        arrContacts.add(new ContactModel(R.drawable.e, "J", "7802398345"));
        arrContacts.add(new ContactModel(R.drawable.a, "K", "9845327890"));
        arrContacts.add(new ContactModel(R.drawable.b, "L", "7902398345"));
        arrContacts.add(new ContactModel(R.drawable.c, "M", "8902398345"));
        arrContacts.add(new ContactModel(R.drawable.d, "N", "9902398345"));
        arrContacts.add(new ContactModel(R.drawable.e, "O", "7802398345"));

        adapter = new RecyclerContactAdapter(this, arrContacts);
        recyclerView.setAdapter(adapter);

    }}