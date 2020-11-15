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

public class cgpa78 extends AppCompatActivity {

    private EditText s178;
    private EditText s278;
    private EditText s378;
    private EditText s478;
    private EditText s578;
    private EditText s678;
    private EditText s778;
    private Button calc78;
    private TextView cgpa78;
    private TextView perc78;
    private Button clrc78;
    private Button svc78;
    private int no_of_sem = 7;
    private int scheme = 2018;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cgpa78);

        getSupportActionBar().setTitle(("CGPA"));

        s178 = (EditText) findViewById(R.id.s178);
        s278 = (EditText) findViewById(R.id.s278);
        s378 = (EditText) findViewById(R.id.s378);
        s478 = (EditText) findViewById(R.id.s478);
        s578 = (EditText) findViewById(R.id.s578);
        s678 = (EditText) findViewById(R.id.s678);
        s778 = (EditText) findViewById(R.id.s778);
        cgpa78 = (TextView) findViewById(R.id.cgpa78);
        perc78 = (TextView) findViewById(R.id.perc78);
        calc78 = (Button) findViewById(R.id.calc78);
        svc78 = (Button) findViewById(R.id.svc78);
        clrc78 = (Button) findViewById(R.id.clrc78);

        s178.addTextChangedListener(new TextWatcher() {

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
                String strTest = s178.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 10) {
                        s178.setText(null);
                        Toast.makeText(cgpa78.this, "Enter a value less than 10", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });

        s278.addTextChangedListener(new TextWatcher() {

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
                String strTest = s278.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 10) {
                        s278.setText(null);
                        Toast.makeText(cgpa78.this, "enter a value less than 10", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });

        s378.addTextChangedListener(new TextWatcher() {

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
                String strTest = s378.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 10) {
                        s378.setText(null);
                        Toast.makeText(cgpa78.this, "enter a value less than 10", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });

        s478.addTextChangedListener(new TextWatcher() {

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
                String strTest = s478.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 10) {
                        s478.setText(null);
                        Toast.makeText(cgpa78.this, "enter a value less than 10", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });

        s578.addTextChangedListener(new TextWatcher() {

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
                String strTest = s578.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 10) {
                        s578.setText(null);
                        Toast.makeText(cgpa78.this, "enter a value less than 10", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });

        s678.addTextChangedListener(new TextWatcher() {

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
                String strTest = s678.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 10) {
                        s678.setText(null);
                        Toast.makeText(cgpa78.this, "enter a value less than 10", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });

        s778.addTextChangedListener(new TextWatcher() {

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
                String strTest = s778.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 10) {
                        s778.setText(null);
                        Toast.makeText(cgpa78.this, "enter a value less than 10", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });

        calc78.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if ((s178.getText().toString().trim().length() <= 0) || (s278.getText().toString().trim().length() <= 0) || (s378.getText().toString().trim().length() <= 0) || (s478.getText().toString().trim().length() <= 0) || (s578.getText().toString().trim().length() <= 0) || (s678.getText().toString().trim().length() <= 0) || (s778.getText().toString().trim().length() <= 0)) {
                    View layout = LayoutInflater.from(cgpa78.this).inflate(R.layout.custom_toast, (ViewGroup) findViewById(R.id.linlayContainer));
                    TextView tv = (TextView) layout.findViewById(R.id.txtMsg);
                    tv.setText("All fields are mandatory");
                    Toast toast = new Toast(cgpa78.this);
                    toast.setGravity(Gravity.CENTER_VERTICAL, 0, 100);
                    toast.setDuration(Toast.LENGTH_SHORT);
                    toast.setView(layout);
                    toast.show();
                } else {
                    float a = Float.parseFloat(s178.getText().toString());
                    float b = Float.parseFloat(s278.getText().toString());
                    float c = Float.parseFloat(s378.getText().toString());
                    float d = Float.parseFloat(s478.getText().toString());
                    float e = Float.parseFloat(s578.getText().toString());
                    float f = Float.parseFloat(s678.getText().toString());
                    float g = Float.parseFloat(s778.getText().toString());
                    double result = ((20 * a) + (20 * b) + (24 * c) + (24 * d) + (25 * e) + (24 * f) + (20 * g)) / 157;
                    double per = (result - 0.75) * 10;
                    cgpa78.setText(String.format("%.2f", result) + " /10");
                    perc78.setText(String.format("%.2f", per) + " %");
                }
                if (!cgpa78.getText().toString().equals("")) {
                    svc78.setVisibility(View.VISIBLE);
                    clrc78.setVisibility(View.VISIBLE);
                }
            }


        });

        clrc78.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc78.setVisibility(View.VISIBLE);
                svc78.setVisibility(View.GONE);
                clrc78.setVisibility(View.GONE);
                s178.getText().clear();
                s278.getText().clear();
                s378.getText().clear();
                s478.getText().clear();
                s578.getText().clear();
                s678.getText().clear();
                s778.getText().clear();
                cgpa78.setText("");
                perc78.setText("");


            }
        });

        svc78.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {

                dbmanager dm = new dbmanager(getApplicationContext());
                final SQLiteDatabase db = dm.getWritableDatabase();

                final EditText editText;

                final AlertDialog.Builder alert = new AlertDialog.Builder(cgpa78.this);
                alert.setMessage("Enter student Name");


                editText = new EditText(cgpa78.this);
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
                            Animation shake = AnimationUtils.loadAnimation(cgpa78.this, R.anim.shake);
                            editText.startAnimation(shake);
                            editText.setError("Please enter student name");
                        } else {
                            ContentValues cv = new ContentValues();
                            cv.put("cname", value);
                            cv.put("no_of_sems", no_of_sem);
                            cv.put("cgpa", cgpa78.getText().toString());
                            cv.put("percentage", perc78.getText().toString());
                            cv.put("schemec", scheme);
                            long i = db.insert("Cgpa", null, cv);
                            if (i == -1) {
                                editText.setError("This name already exists. Enter another name.");
                            } else {
                                Toast.makeText(cgpa78.this, "data inserted successfully", Toast.LENGTH_SHORT).show();
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
