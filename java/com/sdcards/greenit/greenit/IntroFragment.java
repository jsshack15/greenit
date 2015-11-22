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
public class IntroFragment extends Fragment {


    public IntroFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_intro, container, false);

        Button whatButton = (Button) view.findViewById(R.id.whatButton);

        whatButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(v.getContext(), WhatActivity.class));
                    }
                }
        );

        Button whyButton = (Button) view.findViewById(R.id.whyButton);

        whyButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(v.getContext(), WhyActivity.class));
                    }
                }
        );

        Button howButton = (Button) view.findViewById(R.id.howButton);

        howButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(v.getContext(), HowActivity.class));
                    }
                }
        );

        Button exampleButton = (Button) view.findViewById(R.id.exampleButton);

        exampleButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(v.getContext(), ExampleActivity.class));
                    }
                }
        );

        return view;
    }


}
