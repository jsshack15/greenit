package com.sdcards.greenit.greenit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;

public class IeqActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ieq);

        String options[] = {"Ventilation", "Emission"};
        ListAdapter bobsAdapter = new CustomAdapter(this, options);
        ListView ieqList = (ListView) findViewById(R.id.ieqList);
        ieqList.setAdapter(bobsAdapter);
    }
}
