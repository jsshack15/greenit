package com.sdcards.greenit.greenit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;

public class HouseholdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_household);

        String options[] = {"Household"};
        ListAdapter bobsAdapter = new CustomAdapter(this, options);
        ListView houseList = (ListView) findViewById(R.id.houseList);
        houseList.setAdapter(bobsAdapter);
    }
}
