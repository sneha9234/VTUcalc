package com.sneha.vtusgpaandcgpacalculator.drawernav;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import com.sneha.vtusgpaandcgpacalculator.R;
import com.sneha.vtusgpaandcgpacalculator.camerapdf.doc;
import com.sneha.vtusgpaandcgpacalculator.camerapdf.image;
import com.sneha.vtusgpaandcgpacalculator.camerapdf.viewimages;


public class uploadedfragment extends Fragment {

    View view;
    CardView cardView2;
    CardView cardView1;

    public uploadedfragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

       // Toast.makeText(getContext(), "This feature will be available after some time", Toast.LENGTH_SHORT).show();


        view = inflater.inflate(R.layout.fragment_uploadedfragment, container, false);

        cardView1 = view.findViewById(R.id.cardView1);
        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openimage();
            }
        });

        cardView2 = view.findViewById(R.id.cardView2);
        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opendoc();
            }
        });


        return view;
    }


    public void openimage() {
        Intent intent = new Intent(getContext(), image.class);
        startActivity(intent);
    }

    public void opendoc() {
        Intent intent = new Intent(getContext(), doc.class);
        startActivity(intent);
    }


}
