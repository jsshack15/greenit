package com.sdcards.greenit.greenit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;

public class LandActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_land);

        String options[] = {"Landscape"};
        ListAdapter bobsAdapter = new CustomAdapter(this, options);
        ListView landList = (ListView) findViewById(R.id.landList);
        landList.setAdapter(bobsAdapter);
    }
}
