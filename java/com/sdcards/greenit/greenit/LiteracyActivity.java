package com.sdcards.greenit.greenit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;

public class LiteracyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_literacy);

        String options[] = {"Syllabus", "Activities"};
        ListAdapter bobsAdapter = new CustomAdapter(this, options);
        ListView bobsListView = (ListView) findViewById(R.id.listView);
        bobsListView.setAdapter(bobsAdapter);
    }
}
