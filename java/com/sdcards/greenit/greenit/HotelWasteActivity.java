package com.sdcards.greenit.greenit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;

public class HotelWasteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel_waste);

        String options[] = {"HotelWaste"};
        ListAdapter bobsAdapter = new CustomAdapter(this, options);
        ListView wasteList = (ListView) findViewById(R.id.wasteList);
        wasteList.setAdapter(bobsAdapter);
    }
}
