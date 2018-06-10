package com.example.shubham.agriculturestudio;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class Tab2 extends Fragment {
    Spinner sp;
    String[] item={
            "Vegetables",
            "tftufyuvhj"
    };

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.tab2, container, false);
        sp =(Spinner) rootView.findViewById(R.id.spinner1);
        ArrayAdapter<String> adapter= new ArrayAdapter<String>(Tab2.super.getContext(), android.R.layout.simple_spinner_dropdown_item , item);
        sp.setAdapter(adapter);


        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                // Get select item
                int sid=sp.getSelectedItemPosition();
                Toast.makeText(Tab2.super.getContext() , "You have selected City : " + item[sid],
                        Toast.LENGTH_SHORT).show();
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                // TODO Auto-generated method stub
            }
        });
        return rootView;
    }
}


