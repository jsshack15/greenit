package com.sdcards.greenit.greenit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;

public class MedDeviceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_med_device);

        String options[] = {"Device"};
        ListAdapter bobsAdapter = new CustomAdapter(this, options);
        ListView deviceList = (ListView) findViewById(R.id.deviceList);
        deviceList.setAdapter(bobsAdapter);
    }
}
