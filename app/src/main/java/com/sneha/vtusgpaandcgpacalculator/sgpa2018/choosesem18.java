package com.sneha.vtusgpaandcgpacalculator.sgpa2018;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import com.sneha.vtusgpaandcgpacalculator.R;

public class choosesem18 extends AppCompatActivity {

    private Button buttoncs18;
    private Spinner spinnercs18;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choosesem18);

        getSupportActionBar().setTitle(("Select semester"));

        Button buttoncs18 = (Button) findViewById(R.id.buttoncs18);
        final Spinner spinnercs18 = (Spinner) findViewById(R.id.spinnercs18);
        ArrayAdapter<String> myAdapter2 = new ArrayAdapter<String>(choosesem18.this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.cs));
        myAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnercs18.setAdapter(myAdapter2);
        buttoncs18.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                String text2 = spinnercs18.getSelectedItem().toString();

                if (text2.equals("sem 1 chemistry cycle")) {
                    Intent intent = new Intent(choosesem18.this, sem1chem8.class);
                    startActivity(intent);
                } else if (text2.equals("sem 2 chemistry cycle")) {
                    Intent intent = new Intent(choosesem18.this, sem2chem8.class);
                    startActivity(intent);
                }
                if (text2.equals("sem 1 physics cycle")) {
                    Intent intent = new Intent(choosesem18.this, sem1phy8.class);
                    startActivity(intent);
                } else if (text2.equals("sem 2 physics cycle")) {
                    Intent intent = new Intent(choosesem18.this, sem2phy8.class);
                    startActivity(intent);
                } else if (text2.equals("3")) {
                    Intent intent = new Intent(choosesem18.this, sem38.class);
                    startActivity(intent);
                } else if (text2.equals("4")) {
                    Intent intent = new Intent(choosesem18.this, sem48.class);
                    startActivity(intent);
                } else if (text2.equals("5")) {
                    Intent intent = new Intent(choosesem18.this, sem58.class);
                    startActivity(intent);
                } else if (text2.equals("6")) {
                    Intent intent = new Intent(choosesem18.this, sem68.class);
                    startActivity(intent);
                } else if (text2.equals("7")) {
                    Intent intent = new Intent(choosesem18.this, sem78.class);
                    startActivity(intent);
                } else if (text2.equals("8")) {
                    Intent intent = new Intent(choosesem18.this, sem88.class);
                    startActivity(intent);
                }
            }

        });
    }
}