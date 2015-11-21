package com.sdcards.greenit.greenit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;

public class EnefActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enef);

        String options[] = {"Appliances", "Water"};
        ListAdapter bobsAdapter = new CustomAdapter(this, options);
        ListView enefList = (ListView) findViewById(R.id.enefList);
        enefList.setAdapter(bobsAdapter);
    }
}
