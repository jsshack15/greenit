package com.sdcards.greenit.greenit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;

public class HotelEmployeeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel_employee);

        String options[] = {"Awareness"};
        ListAdapter bobsAdapter = new CustomAdapter(this, options);
        ListView employeeList = (ListView) findViewById(R.id.employeeList);
        employeeList.setAdapter(bobsAdapter);
    }
}
