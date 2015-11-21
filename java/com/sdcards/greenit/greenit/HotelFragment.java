package com.sdcards.greenit.greenit;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class HotelFragment extends Fragment {


    public HotelFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_hotel, container, false);

        Button wasteButton = (Button) view.findViewById(R.id.wasteButton);

        wasteButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(v.getContext(), HotelWasteActivity.class));
                    }
                }
        );

        Button energyButton = (Button) view.findViewById(R.id.energyButton);

        energyButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(v.getContext(), HotelEnergyActivity.class));
                    }
                }
        );

        Button waterButton = (Button) view.findViewById(R.id.waterButton);

        waterButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(v.getContext(), HotelWaterActivity.class));
                    }
                }
        );

        Button employeeButton = (Button) view.findViewById(R.id.employeeButton);

        employeeButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(v.getContext(), HotelEmployeeActivity.class));
                    }
                }
        );

        return view;
    }


}
