package com.example.contactsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeRecyclerView();
    }
      public void initializeRecyclerView() {
          RecyclerView recyclerView = findViewById(R.id.recycler);
          ArrayList <String > contacts = new ArrayList<>();

          contacts.add("Friends");
          contacts.add("Family");
          contacts.add("Colleagues");
          contacts.add("Drivers");
          contacts.add("Cleaners");
          contacts.add("Students");
          contacts.add("Workers");

          recyclerAdapter recyclerAdapter = new recyclerAdapter(contacts, this);
          recyclerView.setAdapter(recyclerAdapter);
      }

}