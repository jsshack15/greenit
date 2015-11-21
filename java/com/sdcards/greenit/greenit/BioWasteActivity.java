package com.sdcards.greenit.greenit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;

public class BioWasteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bio_waste);

        String options[] = {"Onsite", "Offsite"};
        ListAdapter bobsAdapter = new CustomAdapter(this, options);
        ListView bioList = (ListView) findViewById(R.id.bioList);
        bioList.setAdapter(bobsAdapter);
    }
}
