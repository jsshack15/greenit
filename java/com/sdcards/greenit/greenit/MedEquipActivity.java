package com.sdcards.greenit.greenit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;

public class MedEquipActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_med_equip);

        String options[] = {"LowEnergy"};
        ListAdapter bobsAdapter = new CustomAdapter(this, options);
        ListView equipList = (ListView) findViewById(R.id.equipList);
        equipList.setAdapter(bobsAdapter);
    }
}
