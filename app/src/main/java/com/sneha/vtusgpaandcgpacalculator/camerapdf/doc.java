package com.sneha.vtusgpaandcgpacalculator.camerapdf;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.sneha.vtusgpaandcgpacalculator.R;

public class doc extends AppCompatActivity {

    FloatingActionButton floatingActionButton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doc);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle(("Documents"));

        View layout = LayoutInflater.from(doc.this).inflate(R.layout.custom_toast, (ViewGroup) findViewById(R.id.linlayContainer));
        TextView tv = (TextView) layout.findViewById(R.id.txtMsg);
        tv.setText("This feature will be available after some time");
        Toast toast = new Toast(doc.this);
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 100);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(layout);
        toast.show();


        floatingActionButton2 = (FloatingActionButton) findViewById(R.id.floatingActionButton2);

        floatingActionButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(doc.this,"This functionality is unavailable for now",Toast.LENGTH_SHORT).show();

//                Intent intent = new Intent();
//                intent.setAction(Intent.ACTION_GET_CONTENT);
//                intent.setType("application/pdf");
//                //startActivityForResult(intent, 1212) ;
//                startActivity(intent);
            }

        });


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        onBackPressed();
        return true;
    }
}




