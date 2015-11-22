package com.sdcards.greenit.greenit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;

public class SuccessActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success);
        String options[] = {"Hotel", "School", "Hospital", "Office"};
        ListAdapter bobsAdapter = new CustomAdapter(this, options);
        ListView whyList = (ListView) findViewById(R.id.whyList);
        whyList.setAdapter(bobsAdapter);
    }
}
