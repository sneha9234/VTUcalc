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

public class cgpa68 extends AppCompatActivity {

    private EditText s168;
    private EditText s268;
    private EditText s368;
    private EditText s468;
    private EditText s568;
    private EditText s668;
    private Button calc68;
    private TextView cgpa68;
    private TextView perc68;
    private Button clrc68;
    private Button svc68;
    private int no_of_sem = 6;
    private int scheme = 2018;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cgpa68);

        getSupportActionBar().setTitle(("CGPA"));

        s168 = (EditText) findViewById(R.id.s168);
        s268 = (EditText) findViewById(R.id.s268);
        s368 = (EditText) findViewById(R.id.s368);
        s468 = (EditText) findViewById(R.id.s468);
        s568 = (EditText) findViewById(R.id.s568);
        s668 = (EditText) findViewById(R.id.s668);
        cgpa68 = (TextView) findViewById(R.id.cgpa68);
        perc68 = (TextView) findViewById(R.id.perc68);
        calc68 = (Button) findViewById(R.id.calc68);
        svc68 = (Button) findViewById(R.id.svc68);
        clrc68 = (Button) findViewById(R.id.clrc68);

        s168.addTextChangedListener(new TextWatcher() {

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
                String strTest = s168.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 10) {
                        s168.setText(null);
                        Toast.makeText(cgpa68.this, "Enter a value less than 10", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });

        s268.addTextChangedListener(new TextWatcher() {

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
                String strTest = s268.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 10) {
                        s268.setText(null);
                        Toast.makeText(cgpa68.this, "enter a value less than 10", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });

        s368.addTextChangedListener(new TextWatcher() {

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
                String strTest = s368.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 10) {
                        s368.setText(null);
                        Toast.makeText(cgpa68.this, "enter a value less than 10", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });

        s468.addTextChangedListener(new TextWatcher() {

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
                String strTest = s468.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 10) {
                        s468.setText(null);
                        Toast.makeText(cgpa68.this, "enter a value less than 10", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });

        s568.addTextChangedListener(new TextWatcher() {

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
                String strTest = s568.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 10) {
                        s568.setText(null);
                        Toast.makeText(cgpa68.this, "enter a value less than 10", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });

        s668.addTextChangedListener(new TextWatcher() {

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
                String strTest = s668.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 10) {
                        s668.setText(null);
                        Toast.makeText(cgpa68.this, "enter a value less than 10", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });

        calc68.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if ((s168.getText().toString().trim().length() <= 0) || (s268.getText().toString().trim().length() <= 0) || (s368.getText().toString().trim().length() <= 0) || (s468.getText().toString().trim().length() <= 0) || (s568.getText().toString().trim().length() <= 0) || (s668.getText().toString().trim().length() <= 0)) {
                    View layout = LayoutInflater.from(cgpa68.this).inflate(R.layout.custom_toast, (ViewGroup) findViewById(R.id.linlayContainer));
                    TextView tv = (TextView) layout.findViewById(R.id.txtMsg);
                    tv.setText("All fields are mandatory");
                    Toast toast = new Toast(cgpa68.this);
                    toast.setGravity(Gravity.CENTER_VERTICAL, 0, 100);
                    toast.setDuration(Toast.LENGTH_SHORT);
                    toast.setView(layout);
                    toast.show();
                } else {
                    float a = Float.parseFloat(s168.getText().toString());
                    float b = Float.parseFloat(s268.getText().toString());
                    float c = Float.parseFloat(s368.getText().toString());
                    float d = Float.parseFloat(s468.getText().toString());
                    float e = Float.parseFloat(s568.getText().toString());
                    float f = Float.parseFloat(s668.getText().toString());
                    double result = ((20 * a) + (20 * b) + (24 * c) + (24 * d) + (25 * e) + (24 * f)) / 137;
                    double per = (result - 0.75) * 10;
                    cgpa68.setText(String.format("%.2f", result) + " /10");
                    perc68.setText(String.format("%.2f", per) + " %");
                }
                if (!cgpa68.getText().toString().equals("")) {
                    svc68.setVisibility(View.VISIBLE);
                    clrc68.setVisibility(View.VISIBLE);
                }
            }


        });

        clrc68.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc68.setVisibility(View.VISIBLE);
                svc68.setVisibility(View.GONE);
                clrc68.setVisibility(View.GONE);
                s168.getText().clear();
                s268.getText().clear();
                s368.getText().clear();
                s468.getText().clear();
                s568.getText().clear();
                s668.getText().clear();
                cgpa68.setText("");
                perc68.setText("");


            }
        });

        svc68.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {

                dbmanager dm = new dbmanager(getApplicationContext());
                final SQLiteDatabase db = dm.getWritableDatabase();

                final EditText editText;

                final AlertDialog.Builder alert = new AlertDialog.Builder(cgpa68.this);
                alert.setMessage("Enter student Name");


                editText = new EditText(cgpa68.this);
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
                            Animation shake = AnimationUtils.loadAnimation(cgpa68.this, R.anim.shake);
                            editText.startAnimation(shake);
                            editText.setError("Please enter student name");
                        } else {
                            ContentValues cv = new ContentValues();
                            cv.put("cname", value);
                            cv.put("no_of_sems", no_of_sem);
                            cv.put("cgpa", cgpa68.getText().toString());
                            cv.put("percentage", perc68.getText().toString());
                            cv.put("schemec", scheme);
                            long i = db.insert("Cgpa", null, cv);
                            if (i == -1) {
                                editText.setError("This name already exists. Enter another name.");
                            } else {
                                Toast.makeText(cgpa68.this, "data inserted successfully", Toast.LENGTH_SHORT).show();
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


