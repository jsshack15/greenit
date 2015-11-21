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
public class EducationFragment extends Fragment {


    public EducationFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_education, container, false);

        Button literacyButton = (Button) view.findViewById(R.id.literacyButton);

        literacyButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(v.getContext(), LiteracyActivity.class));
                    }
                }
        );

        Button indoorButton = (Button) view.findViewById(R.id.indoorButton);

        indoorButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(v.getContext(), IndoorActivity.class));
                    }
                }
        );

        Button signageButton = (Button) view.findViewById(R.id.signageButton);

        signageButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(v.getContext(), SignageActivity.class));
                    }
                }
        );

        Button elearningButton = (Button) view.findViewById(R.id.elearningButton);

        elearningButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(v.getContext(), ElearningActivity.class));
                    }
                }
        );

        return view;
    }
}
