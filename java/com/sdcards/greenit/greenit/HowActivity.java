package com.sdcards.greenit.greenit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;

public class HowActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_how);

        String options[] = {"how"};
        ListAdapter bobsAdapter = new CustomAdapter(this, options);
        ListView howList = (ListView) findViewById(R.id.howList);
        howList.setAdapter(bobsAdapter);
    }
}
