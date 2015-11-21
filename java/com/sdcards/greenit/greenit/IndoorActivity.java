package com.sdcards.greenit.greenit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;

public class IndoorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_indoor);

        String options[] = {"Indoor"};
        ListAdapter bobsAdapter = new CustomAdapter(this, options);
        ListView indoorList = (ListView) findViewById(R.id.indoorList);
        indoorList.setAdapter(bobsAdapter);
    }
}
