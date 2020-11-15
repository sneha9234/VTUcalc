package com.sneha.vtusgpaandcgpacalculator.sgpa2015;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import com.sneha.vtusgpaandcgpacalculator.R;

public class choosesem extends AppCompatActivity {

    private Button buttoncs;
    private Spinner spinnercs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choosesem);

        getSupportActionBar().setTitle(("Select semester"));

        Button buttoncs = (Button) findViewById(R.id.buttoncs);
        final Spinner spinnercs = (Spinner) findViewById(R.id.spinnercs);
        ArrayAdapter<String> myAdapter2 = new ArrayAdapter<String>(choosesem.this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.cs));
        myAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnercs.setAdapter(myAdapter2);
        buttoncs.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                String text2 = spinnercs.getSelectedItem().toString();

                if (text2.equals("sem 1 chemistry cycle")) {
                    Intent intent = new Intent(choosesem.this, sem1chem.class);
                    startActivity(intent);
                } else if (text2.equals("sem 2 chemistry cycle")) {
                    Intent intent = new Intent(choosesem.this, sem2chem.class);
                    startActivity(intent);
                }
                if (text2.equals("sem 1 physics cycle")) {
                    Intent intent = new Intent(choosesem.this, sem1phy.class);
                    startActivity(intent);
                } else if (text2.equals("sem 2 physics cycle")) {
                    Intent intent = new Intent(choosesem.this, sem2phy.class);
                    startActivity(intent);
                } else if (text2.equals("3")) {
                    Intent intent = new Intent(choosesem.this, sem3.class);
                    startActivity(intent);
                } else if (text2.equals("4")) {
                    Intent intent = new Intent(choosesem.this, sem4.class);
                    startActivity(intent);
                } else if (text2.equals("5")) {
                    Intent intent = new Intent(choosesem.this, sem5.class);
                    startActivity(intent);
                } else if (text2.equals("6")) {
                    Intent intent = new Intent(choosesem.this, sem6.class);
                    startActivity(intent);
                } else if (text2.equals("7")) {
                    Intent intent = new Intent(choosesem.this, sem7.class);
                    startActivity(intent);
                } else if (text2.equals("8")) {
                    Intent intent = new Intent(choosesem.this, sem8.class);
                    startActivity(intent);
                }
            }

        });
    }
}