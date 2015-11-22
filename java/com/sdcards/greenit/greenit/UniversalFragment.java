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

        Button leedButton = (Button) view.findViewById(R.id.leedButton);

        leedButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(v.getContext(), LeedActivity.class));
                    }
                }
        );

        Button rButton = (Button) view.findViewById(R.id.rButton);

        rButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(v.getContext(), RActivity.class));
                    }
                }
        );

        Button renewableButton = (Button) view.findViewById(R.id.renewableButton);

        renewableButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(v.getContext(), RenewableActivity.class));
                    }
                }
        );

        Button modelButton = (Button) view.findViewById(R.id.modelButton);

        modelButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(v.getContext(), ModelActivity.class));
                    }
                }
        );

        return view;
    }


}
