package com.sneha.vtusgpaandcgpacalculator.cgpa;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.sneha.vtusgpaandcgpacalculator.R;
import com.sneha.vtusgpaandcgpacalculator.cgpa2015.selectns;
import com.sneha.vtusgpaandcgpacalculator.cgpa2017.sems;
import com.sneha.vtusgpaandcgpacalculator.cgpa2018.selectns18;
import com.sneha.vtusgpaandcgpacalculator.soon2;

public class scheme extends AppCompatActivity {

    private Button button5;
    private Button button6;
    private Button button7;
    private Button button34;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scheme);

        getSupportActionBar().setTitle(("Select Scheme"));

        button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openactivity2015();
            }
        });
        button6 = (Button) findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opensems();
            }
        });
        button7 = (Button) findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openactivity2018();
            }
        });
        button34 = (Button) findViewById(R.id.button34);
        button34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opensoon();
            }
        });
    }

    public void openactivity2015() {
        Intent intent = new Intent(this, selectns.class);
        startActivity(intent);
    }

    public void opensems() {
        Intent intent = new Intent(this, sems.class);
        startActivity(intent);
    }

    public void openactivity2018() {
        Intent intent = new Intent(this, selectns18.class);
        startActivity(intent);
    }

    public void opensoon() {
        Intent intent = new Intent(this, soon2.class);
        startActivity(intent);
    }
}
