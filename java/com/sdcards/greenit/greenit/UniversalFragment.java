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
public class UniversalFragment extends Fragment {


    public UniversalFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_universal, container, false);

        Button structButton = (Button) view.findViewById(R.id.structButton);

        structButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(v.getContext(), HealthInfraActivity.class));
                    }
                }
        );

        Button enefButton = (Button) view.findViewById(R.id.enefButton);

        enefButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(v.getContext(), EnefActivity.class));
                    }
                }
        );

        Button landButton = (Button) view.findViewById(R.id.landButton);

        landButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(v.getContext(), BioWasteActivity.class));
                    }
                }
        );

        Button householdButton = (Button) view.findViewById(R.id.householdButton);

        householdButton.setOnClickListener(
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
