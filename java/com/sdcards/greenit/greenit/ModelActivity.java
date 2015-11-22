package com.sdcards.greenit.greenit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;

public class ModelActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_model);

        String options[] = {"model"};
        ListAdapter bobsAdapter = new CustomAdapter(this, options);
        ListView modelList = (ListView) findViewById(R.id.modelList);
        modelList.setAdapter(bobsAdapter);
    }
}
