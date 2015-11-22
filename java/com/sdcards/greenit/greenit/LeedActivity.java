package com.sdcards.greenit.greenit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;

public class LeedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leed);

        String options[] = {"leed"};
        ListAdapter bobsAdapter = new CustomAdapter(this, options);
        ListView leedList = (ListView) findViewById(R.id.leedList);
        leedList.setAdapter(bobsAdapter);
    }
}
