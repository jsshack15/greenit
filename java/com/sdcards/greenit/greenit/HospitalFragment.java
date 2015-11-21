package com.sdcards.greenit.greenit;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class HospitalFragment extends Fragment {


    public HospitalFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_hospital, container, false);

        Button infraButton = (Button) view.findViewById(R.id.infraButton);

        infraButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(v.getContext(), HealthInfraActivity.class));
                    }
                }
        );

        Button equipmentButton = (Button) view.findViewById(R.id.equipmentButton);

        equipmentButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(v.getContext(), MedEquipActivity.class));
                    }
                }
        );

        Button biowasteButton = (Button) view.findViewById(R.id.biowasteButton);

        biowasteButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(v.getContext(), BioWasteActivity.class));
                    }
                }
        );

        Button deviceButton = (Button) view.findViewById(R.id.deviceButton);

        deviceButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(v.getContext(), MedDeviceActivity.class));
                    }
                }
        );

        return view;
    }


}
