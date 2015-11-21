package com.sdcards.greenit.greenit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;

public class OfficeWorkActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_office_work);

        String options[] = {"Individual", "Company"};
        ListAdapter bobsAdapter = new CustomAdapter(this, options);
        ListView workList = (ListView) findViewById(R.id.workList);
        workList.setAdapter(bobsAdapter);
    }
}
