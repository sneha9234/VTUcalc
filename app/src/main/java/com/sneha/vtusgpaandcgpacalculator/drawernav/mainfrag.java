package com.sneha.vtusgpaandcgpacalculator.drawernav;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.sneha.vtusgpaandcgpacalculator.R;
import com.sneha.vtusgpaandcgpacalculator.cgpa.scheme;
import com.sneha.vtusgpaandcgpacalculator.sgpa.MainActivity;


public class mainfrag extends Fragment {

    private FirebaseAnalytics mFirebaseAnalytics;
    private View view;
    private AdView adView;
    private AdView adView2;
    private Button button10;
    private Button button11;

    public mainfrag() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mFirebaseAnalytics = FirebaseAnalytics.getInstance(getContext());

    }


    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        view = inflater.inflate(R.layout.fragment_mainfrag, container, false);

        adView = view.findViewById(R.id.adView);
        adView2 = view.findViewById(R.id.adView2);

        MobileAds.initialize(getContext(), new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });

        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);

        AdRequest adRequest2 = new AdRequest.Builder().build();
        adView2.loadAd(adRequest2);

        button10 = (Button) view.findViewById(R.id.button10);
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openmainactivity();
            }
        });
        button11 = (Button) view.findViewById(R.id.button11);
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openscheme();
            }
        });
        return view;
    }

    public void openmainactivity() {
        Intent intent = new Intent(getContext(), MainActivity.class);
        startActivity(intent);
    }

    public void openscheme() {
        Intent intent = new Intent(getContext(), scheme.class);
        startActivity(intent);
    }


}


