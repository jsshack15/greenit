package com.sdcards.greenit.greenit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;

public class WhatActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_what);

        String options[] = {"sus"};
        ListAdapter bobsAdapter = new CustomAdapter(this, options);
        ListView whatList = (ListView) findViewById(R.id.whatList);
        whatList.setAdapter(bobsAdapter);
    }
}
