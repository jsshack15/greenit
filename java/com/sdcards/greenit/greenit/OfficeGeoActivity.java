package com.sdcards.greenit.greenit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;

public class OfficeGeoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_office_geo);

        String options[] = {"Geo"};
        ListAdapter bobsAdapter = new CustomAdapter(this, options);
        ListView geoList = (ListView) findViewById(R.id.geoList);
        geoList.setAdapter(bobsAdapter);
    }
}
