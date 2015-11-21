package com.sdcards.greenit.greenit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;

public class OfficeExteriorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_office_exterior);

        String options[] = {"Exterior"};
        ListAdapter bobsAdapter = new CustomAdapter(this, options);
        ListView exteriorList = (ListView) findViewById(R.id.exteriorList);
        exteriorList.setAdapter(bobsAdapter);
    }
}
