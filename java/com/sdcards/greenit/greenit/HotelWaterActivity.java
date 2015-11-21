package com.sdcards.greenit.greenit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;

public class HotelWaterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel_water);

        String options[] = {"Bathroom", "Sewage"};
        ListAdapter bobsAdapter = new CustomAdapter(this, options);
        ListView waterList = (ListView) findViewById(R.id.waterList);
        waterList.setAdapter(bobsAdapter);
    }
}
