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
public class OfficeFragment extends Fragment {


    public OfficeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_office, container, false);

        Button exteriorButton = (Button) view.findViewById(R.id.exteriorButton);

        exteriorButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(v.getContext(), OfficeExteriorActivity.class));
                    }
                }
        );

        Button ieqButton = (Button) view.findViewById(R.id.ieqButton);

        ieqButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(v.getContext(), IeqActivity.class));
                    }
                }
        );

        Button workButton = (Button) view.findViewById(R.id.workButton);

        workButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(v.getContext(), OfficeWorkActivity.class));
                    }
                }
        );

        Button geoButton = (Button) view.findViewById(R.id.geoButton);

        geoButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(v.getContext(), OfficeGeoActivity.class));
                    }
                }
        );

        return view;
    }


}
