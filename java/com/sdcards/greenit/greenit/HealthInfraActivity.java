package com.sdcards.greenit.greenit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;

public class HealthInfraActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health_infra);

        String options[] = {"Patient"};
        ListAdapter bobsAdapter = new CustomAdapter(this, options);
        ListView infraList = (ListView) findViewById(R.id.infraList);
        infraList.setAdapter(bobsAdapter);
    }
}
