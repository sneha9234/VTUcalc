package com.sneha.vtusgpaandcgpacalculator.cgpa2015;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import com.sneha.vtusgpaandcgpacalculator.R;

public class selectns extends AppCompatActivity {

    private Spinner spinnersns;
    private Button buttonsns;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selectns);

        getSupportActionBar().setTitle(("CGPA"));

        Button buttonsns = findViewById(R.id.buttonsns);
        final Spinner spinnersns = findViewById(R.id.spinnersns);
        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(selectns.this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.noofsem));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnersns.setAdapter(myAdapter);
        buttonsns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = spinnersns.getSelectedItem().toString();
//                if(text.equals("1")){
//                }
                if (text.equals("2")) {
                    Intent intent = new Intent(selectns.this, cgpa25.class);
                    startActivity(intent);
                } else if (text.equals("3")) {
                    Intent intent = new Intent(selectns.this, cgpa35.class);
                    startActivity(intent);
                } else if (text.equals("4")) {
                    Intent intent = new Intent(selectns.this, cgpa45.class);
                    startActivity(intent);
                } else if (text.equals("5")) {
                    Intent intent = new Intent(selectns.this, cgpa55.class);
                    startActivity(intent);
                } else if (text.equals("6")) {
                    Intent intent = new Intent(selectns.this, cgpa65.class);
                    startActivity(intent);
                } else if (text.equals("7")) {
                    Intent intent = new Intent(selectns.this, cgpa75.class);
                    startActivity(intent);
                } else if (text.equals("8")) {
                    Intent intent = new Intent(selectns.this, cgpa85.class);
                    startActivity(intent);
                }
            }
        });

    }
}
