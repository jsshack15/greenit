package com.sdcards.greenit.greenit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;

public class RActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_r);

        String options[] = {"r"};
        ListAdapter bobsAdapter = new CustomAdapter(this, options);
        ListView rList = (ListView) findViewById(R.id.rList);
        rList.setAdapter(bobsAdapter);
    }
}
