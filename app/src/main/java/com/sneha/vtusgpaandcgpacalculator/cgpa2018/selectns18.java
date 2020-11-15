package com.sneha.vtusgpaandcgpacalculator.cgpa2018;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import com.sneha.vtusgpaandcgpacalculator.R;

public class selectns18 extends AppCompatActivity {

    private Spinner spinnersns18;
    private Button buttonsns18;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selectns18);

        getSupportActionBar().setTitle(("CGPA"));

        Button buttonsns18 = (Button) findViewById(R.id.buttonsns18);
        final Spinner spinnersns18 = (Spinner) findViewById(R.id.spinnersns18);
        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(selectns18.this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.noofsem));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnersns18.setAdapter(myAdapter);
        buttonsns18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = spinnersns18.getSelectedItem().toString();
//                if(text.equals("1")){
//                }
                if (text.equals("2")) {
                    Intent intent = new Intent(selectns18.this, cgpa28.class);
                    startActivity(intent);
                } else if (text.equals("3")) {
                    Intent intent = new Intent(selectns18.this, cgpa38.class);
                    startActivity(intent);
                } else if (text.equals("4")) {
                    Intent intent = new Intent(selectns18.this, cgpa48.class);
                    startActivity(intent);
                } else if (text.equals("5")) {
                    Intent intent = new Intent(selectns18.this, cgpa58.class);
                    startActivity(intent);
                } else if (text.equals("6")) {
                    Intent intent = new Intent(selectns18.this, cgpa68.class);
                    startActivity(intent);
                } else if (text.equals("7")) {
                    Intent intent = new Intent(selectns18.this, cgpa78.class);
                    startActivity(intent);
                } else if (text.equals("8")) {
                    Intent intent = new Intent(selectns18.this, cgpa88.class);
                    startActivity(intent);
                }
            }
        });

    }
}
