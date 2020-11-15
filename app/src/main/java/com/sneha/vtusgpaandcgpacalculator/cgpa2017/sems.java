package com.sneha.vtusgpaandcgpacalculator.cgpa2017;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import com.sneha.vtusgpaandcgpacalculator.R;

public class sems extends AppCompatActivity {

    private Spinner spinner;
    private Button button10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sems);

        getSupportActionBar().setTitle(("CGPA"));

        Button button10 = (Button) findViewById(R.id.button10);
        final Spinner spinner = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(sems.this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.noofsem));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(myAdapter);
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = spinner.getSelectedItem().toString();
//                if(text.equals("1")){
//                }
                if (text.equals("2")) {
                    Intent intent = new Intent(sems.this, cgpa2.class);
                    startActivity(intent);
                } else if (text.equals("3")) {
                    Intent intent = new Intent(sems.this, cgpa3.class);
                    startActivity(intent);
                } else if (text.equals("4")) {
                    Intent intent = new Intent(sems.this, cgpa4.class);
                    startActivity(intent);
                } else if (text.equals("5")) {
                    Intent intent = new Intent(sems.this, cgpa5.class);
                    startActivity(intent);
                } else if (text.equals("6")) {
                    Intent intent = new Intent(sems.this, cgpa6.class);
                    startActivity(intent);
                } else if (text.equals("7")) {
                    Intent intent = new Intent(sems.this, cgpa7.class);
                    startActivity(intent);
                } else if (text.equals("8")) {
                    Intent intent = new Intent(sems.this, cgpa8.class);
                    startActivity(intent);
                }
            }
        });

    }
}
