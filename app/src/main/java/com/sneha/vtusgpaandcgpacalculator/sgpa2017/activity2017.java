package com.sneha.vtusgpaandcgpacalculator.sgpa2017;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import com.sneha.vtusgpaandcgpacalculator.R;

public class activity2017 extends AppCompatActivity {

    private Spinner spinner3;
    Button button15;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity2017);

        getSupportActionBar().setTitle("Select semester");

        Button button15 = (Button) findViewById(R.id.button15);
        final Spinner spinner3 = (Spinner) findViewById(R.id.spinner3);
        ArrayAdapter<String> myAdapter2 = new ArrayAdapter<String>(activity2017.this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.cs));
        myAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner3.setAdapter(myAdapter2);
        button15.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                String text2 = spinner3.getSelectedItem().toString();

                if (text2.equals("sem 1 chemistry cycle")) {
                    Intent intent = new Intent(activity2017.this, chem1.class);
                    startActivity(intent);
                } else if (text2.equals("sem 2 chemistry cycle")) {
                    Intent intent = new Intent(activity2017.this, chem2.class);
                    startActivity(intent);
                } else if (text2.equals("sem 1 physics cycle")) {
                    Intent intent = new Intent(activity2017.this, phy1.class);
                    startActivity(intent);
                } else if (text2.equals("sem 2 physics cycle")) {
                    Intent intent = new Intent(activity2017.this, phy2.class);
                    startActivity(intent);
                } else if (text2.equals("3")) {
                    Intent intent = new Intent(activity2017.this, o3.class);
                    startActivity(intent);
                } else if (text2.equals("4")) {
                    Intent intent = new Intent(activity2017.this, o4.class);
                    startActivity(intent);
                } else if (text2.equals("5")) {
                    Intent intent = new Intent(activity2017.this, o5.class);
                    startActivity(intent);
                } else if (text2.equals("6")) {
                    Intent intent = new Intent(activity2017.this, o6.class);
                    startActivity(intent);
                } else if (text2.equals("7")) {
                    Intent intent = new Intent(activity2017.this, o7.class);
                    startActivity(intent);
                } else if (text2.equals("8")) {
                    Intent intent = new Intent(activity2017.this, o8.class);
                    startActivity(intent);
                }
            }

        });
    }
}
