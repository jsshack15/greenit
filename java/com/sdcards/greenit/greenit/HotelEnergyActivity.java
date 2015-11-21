package com.sdcards.greenit.greenit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;

public class HotelEnergyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel_energy);

        String options[] = {"Lighting", "Integration"};
        ListAdapter bobsAdapter = new CustomAdapter(this, options);
        ListView energyList = (ListView) findViewById(R.id.energyList);
        energyList.setAdapter(bobsAdapter);
    }
}
