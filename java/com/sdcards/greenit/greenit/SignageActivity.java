package com.sdcards.greenit.greenit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;

public class SignageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signage);

        String options[] = {"IndoorSign", "Outdoor"};
        ListAdapter bobsAdapter = new CustomAdapter(this, options);
        ListView signageList = (ListView) findViewById(R.id.signageList);
        signageList.setAdapter(bobsAdapter);
    }
}
