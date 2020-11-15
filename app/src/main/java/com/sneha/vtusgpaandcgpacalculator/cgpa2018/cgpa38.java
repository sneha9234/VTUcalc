package com.sneha.vtusgpaandcgpacalculator.cgpa2018;

import android.content.ContentValues;
import android.content.DialogInterface;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.sneha.vtusgpaandcgpacalculator.R;
import com.sneha.vtusgpaandcgpacalculator.cgpa2017.cgpa4;
import com.sneha.vtusgpaandcgpacalculator.sqlitepackage.dbmanager;

public class cgpa38 extends AppCompatActivity {

    private EditText s138;
    private EditText s238;
    private EditText s338;
    private Button calc38;
    private TextView cgpa38;
    private TextView perc38;
    private Button clrc38;
    private Button svc38;
    private int no_of_sem = 3;
    private int scheme = 2018;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cgpa38);

        getSupportActionBar().setTitle(("CGPA"));

        s138 = (EditText) findViewById(R.id.s138);
        s238 = (EditText) findViewById(R.id.s238);
        s338 = (EditText) findViewById(R.id.s338);
        cgpa38 = (TextView) findViewById(R.id.cgpa38);
        perc38 = (TextView) findViewById(R.id.perc38);
        calc38 = (Button) findViewById(R.id.calc38);
        svc38 = (Button) findViewById(R.id.svc38);
        clrc38 = (Button) findViewById(R.id.clrc38);

        s138.addTextChangedListener(new TextWatcher() {

            @Override
            public void afterTextChanged(Editable s) {
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start,
                                          int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start,
                                      int before, int count) {
                String strTest = s138.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 10) {
                        s138.setText(null);
                        Toast.makeText(cgpa38.this, "Enter a value less than 10", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });

        s238.addTextChangedListener(new TextWatcher() {

            @Override
            public void afterTextChanged(Editable s) {
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start,
                                          int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start,
                                      int before, int count) {
                String strTest = s238.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 10) {
                        s238.setText(null);
                        Toast.makeText(cgpa38.this, "enter a value less than 10", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });

        s338.addTextChangedListener(new TextWatcher() {

            @Override
            public void afterTextChanged(Editable s) {
            }

            @Override
            public void beforeTextChanged(CharSequence s, int start,
                                          int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start,
                                      int before, int count) {
                String strTest = s338.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 10) {
                        s338.setText(null);
                        Toast.makeText(cgpa38.this, "enter a value less than 10", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });

        calc38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if ((s138.getText().toString().trim().length() <= 0) || (s238.getText().toString().trim().length() <= 0) || (s338.getText().toString().trim().length() <= 0)) {
                    View layout = LayoutInflater.from(cgpa38.this).inflate(R.layout.custom_toast, (ViewGroup) findViewById(R.id.linlayContainer));
                    TextView tv = (TextView) layout.findViewById(R.id.txtMsg);
                    tv.setText("All fields are mandatory");
                    Toast toast = new Toast(cgpa38.this);
                    toast.setGravity(Gravity.CENTER_VERTICAL, 0, 100);
                    toast.setDuration(Toast.LENGTH_SHORT);
                    toast.setView(layout);
                    toast.show();
                } else {
                    float a = Float.parseFloat(s138.getText().toString());
                    float b = Float.parseFloat(s238.getText().toString());
                    float c = Float.parseFloat(s338.getText().toString());
                    double result = ((20 * a) + (20 * b) + (24 * c)) / 64;
                    double per = (result - 0.75) * 10;
                    cgpa38.setText(String.format("%.2f", result) + " /10");
                    perc38.setText(String.format("%.2f", per) + " %");
                }
                if (!cgpa38.getText().toString().equals("")) {
                    svc38.setVisibility(View.VISIBLE);
                    clrc38.setVisibility(View.VISIBLE);
                }
            }


        });

        clrc38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc38.setVisibility(View.VISIBLE);
                svc38.setVisibility(View.GONE);
                clrc38.setVisibility(View.GONE);
                s138.getText().clear();
                s238.getText().clear();
                s338.getText().clear();
                cgpa38.setText("");
                perc38.setText("");


            }
        });

        svc38.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {

                dbmanager dm = new dbmanager(getApplicationContext());
                final SQLiteDatabase db = dm.getWritableDatabase();

                final EditText editText;

                final AlertDialog.Builder alert = new AlertDialog.Builder(cgpa38.this);
                alert.setMessage("Enter student Name");


                editText = new EditText(cgpa38.this);
                alert.setView(editText);
                alert.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {

                    }
                });

                alert.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {

                    }
                });

                final AlertDialog dialogs = alert.create();
                dialogs.show();

                dialogs.getButton(AlertDialog.BUTTON_POSITIVE).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String value = editText.getText().toString();
                        if (value.isEmpty()) {
                            Animation shake = AnimationUtils.loadAnimation(cgpa38.this, R.anim.shake);
                            editText.startAnimation(shake);
                            editText.setError("Please enter student name");
                        } else {
                            ContentValues cv = new ContentValues();
                            cv.put("cname", value);
                            cv.put("no_of_sems", no_of_sem);
                            cv.put("cgpa", cgpa38.getText().toString());
                            cv.put("percentage", perc38.getText().toString());
                            cv.put("schemec", scheme);
                            long i = db.insert("Cgpa", null, cv);
                            if (i == -1) {
                                editText.setError("This name already exists. Enter another name.");
                            } else {
                                Toast.makeText(cgpa38.this, "data inserted successfully", Toast.LENGTH_SHORT).show();
                                dialogs.dismiss();
                            }
                        }

                    }
                });

                dialogs.getButton(AlertDialog.BUTTON_NEGATIVE).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        dialogs.dismiss();
                    }
                });

            }

            ;

        });

    }

}
