package com.sneha.vtusgpaandcgpacalculator.drawernav.bottom_navi;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.sneha.vtusgpaandcgpacalculator.R;
import com.sneha.vtusgpaandcgpacalculator.drawernav.bottom_navi.recycler_view.cgpa_frag;
import com.sneha.vtusgpaandcgpacalculator.drawernav.bottom_navi.recycler_view.sgpa_frag;
import com.sneha.vtusgpaandcgpacalculator.drawernav.mainfrag;
import com.sneha.vtusgpaandcgpacalculator.drawernav.uploadedfragment;


public class savedFragment extends Fragment {

    public savedFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        FragmentTransaction tx = getChildFragmentManager().beginTransaction();
        tx.replace(R.id.container, new sgpa_frag());
        tx.commit();
    }

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            int id = item.getItemId();
            Fragment fragment = null;
            switch (id) {
                case R.id.navigation_sgpa:
                    sgpa_frag sf = new sgpa_frag();
                    FragmentManager fragmentManager = getChildFragmentManager();
                    fragmentManager.beginTransaction().replace(R.id.container, sf).commit();
                    return true;
                case R.id.navigation_cgpa:
                    cgpa_frag cf = new cgpa_frag();
                    fragmentManager = getChildFragmentManager();
                    fragmentManager.beginTransaction().replace(R.id.container, cf).commit();
                    return true;
            }
            return false;
        }

    };


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View v = inflater.inflate(R.layout.fragment_saved, container, false);

        BottomNavigationView nav = (BottomNavigationView) v.findViewById(R.id.bottom_navigation);
        nav.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);


        return v;
    }


}