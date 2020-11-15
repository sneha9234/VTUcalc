package com.sneha.vtusgpaandcgpacalculator.sgpa;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.sneha.vtusgpaandcgpacalculator.R;
import com.sneha.vtusgpaandcgpacalculator.sgpa2015.choosesem;
import com.sneha.vtusgpaandcgpacalculator.sgpa2017.activity2017;
import com.sneha.vtusgpaandcgpacalculator.sgpa2018.choosesem18;
import com.sneha.vtusgpaandcgpacalculator.soon1;

public class MainActivity extends AppCompatActivity {
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button35;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle(("Select Scheme"));

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openactivity2015();
            }
        });
        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opensemester();
            }
        });
        button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openactivity2018();
            }
        });
        button35 = (Button) findViewById(R.id.button35);
        button35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opensoon();
            }
        });
    }

    public void openactivity2015() {
        Intent intent = new Intent(this, choosesem.class);
        startActivity(intent);
    }

    public void opensemester() {
        Intent intent = new Intent(this, activity2017.class);
        startActivity(intent);
    }

    public void openactivity2018() {
        Intent intent = new Intent(this, choosesem18.class);
        startActivity(intent);
    }

    public void opensoon() {
        Intent intent = new Intent(this, soon1.class);
        startActivity(intent);
    }

}
