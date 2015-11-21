package com.sdcards.greenit.greenit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;

public class HouseInfraActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_house_infra);

        String options[] = {"Material", "Insulation"};
        ListAdapter bobsAdapter = new CustomAdapter(this, options);
        ListView structList = (ListView) findViewById(R.id.structList);
        structList.setAdapter(bobsAdapter);
    }
}
