package com.sdcards.greenit.greenit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;

public class ElearningActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elearning);

        String options[] = {"Elearning"};
        ListAdapter bobsAdapter = new CustomAdapter(this, options);
        ListView elearningList = (ListView) findViewById(R.id.elearningList);
        elearningList.setAdapter(bobsAdapter);
    }
}
