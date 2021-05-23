package com.example.contactsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class contactList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_list);

        Intent intent = getIntent();
        String title = intent.getStringExtra("CONTACT_CATEGORY");

        getSupportActionBar().setTitle(title);


    }

    public  boolean onSupportNavigatorUp(){return  super. onSupportNavigateUp();}
}