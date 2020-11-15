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

public class cgpa88 extends AppCompatActivity {

    private EditText s188;
    private EditText s288;
    private EditText s388;
    private EditText s488;
    private EditText s588;
    private EditText s688;
    private EditText s788;
    private EditText s888;
    private Button calc88;
    private TextView cgpa88;
    private TextView perc88;
    private Button clrc88;
    private Button svc88;
    private int no_of_sem = 8;
    private int scheme = 2018;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cgpa88);

        getSupportActionBar().setTitle(("CGPA"));

        s188 = (EditText) findViewById(R.id.s188);
        s288 = (EditText) findViewById(R.id.s288);
        s388 = (EditText) findViewById(R.id.s388);
        s488 = (EditText) findViewById(R.id.s488);
        s588 = (EditText) findViewById(R.id.s588);
        s688 = (EditText) findViewById(R.id.s688);
        s788 = (EditText) findViewById(R.id.s788);
        s888 = (EditText) findViewById(R.id.s888);
        cgpa88 = (TextView) findViewById(R.id.cgpa88);
        perc88 = (TextView) findViewById(R.id.perc88);
        calc88 = (Button) findViewById(R.id.calc88);
        svc88 = (Button) findViewById(R.id.svc88);
        clrc88 = (Button) findViewById(R.id.clrc88);

        s188.addTextChangedListener(new TextWatcher() {

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
                String strTest = s188.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 10) {
                        s188.setText(null);
                        Toast.makeText(cgpa88.this, "Enter a value less than 10", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });

        s288.addTextChangedListener(new TextWatcher() {

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
                String strTest = s288.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 10) {
                        s288.setText(null);
                        Toast.makeText(cgpa88.this, "enter a value less than 10", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });

        s388.addTextChangedListener(new TextWatcher() {

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
                String strTest = s388.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 10) {
                        s388.setText(null);
                        Toast.makeText(cgpa88.this, "enter a value less than 10", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });

        s488.addTextChangedListener(new TextWatcher() {

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
                String strTest = s488.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 10) {
                        s488.setText(null);
                        Toast.makeText(cgpa88.this, "enter a value less than 10", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });

        s588.addTextChangedListener(new TextWatcher() {

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
                String strTest = s588.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 10) {
                        s588.setText(null);
                        Toast.makeText(cgpa88.this, "enter a value less than 10", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });

        s688.addTextChangedListener(new TextWatcher() {

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
                String strTest = s688.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 10) {
                        s688.setText(null);
                        Toast.makeText(cgpa88.this, "enter a value less than 10", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });

        s788.addTextChangedListener(new TextWatcher() {

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
                String strTest = s788.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 10) {
                        s788.setText(null);
                        Toast.makeText(cgpa88.this, "enter a value less than 10", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });

        s888.addTextChangedListener(new TextWatcher() {

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
                String strTest = s888.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 10) {
                        s888.setText(null);
                        Toast.makeText(cgpa88.this, "enter a value less than 10", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });

        calc88.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if ((s188.getText().toString().trim().length() <= 0) || (s288.getText().toString().trim().length() <= 0) || (s388.getText().toString().trim().length() <= 0) || (s488.getText().toString().trim().length() <= 0) || (s588.getText().toString().trim().length() <= 0) || (s688.getText().toString().trim().length() <= 0) || (s788.getText().toString().trim().length() <= 0) || (s888.getText().toString().trim().length() <= 0)) {
                    View layout = LayoutInflater.from(cgpa88.this).inflate(R.layout.custom_toast, (ViewGroup) findViewById(R.id.linlayContainer));
                    TextView tv = (TextView) layout.findViewById(R.id.txtMsg);
                    tv.setText("All fields are mandatory");
                    Toast toast = new Toast(cgpa88.this);
                    toast.setGravity(Gravity.CENTER_VERTICAL, 0, 100);
                    toast.setDuration(Toast.LENGTH_SHORT);
                    toast.setView(layout);
                    toast.show();
                } else {
                    float a = Float.parseFloat(s188.getText().toString());
                    float b = Float.parseFloat(s288.getText().toString());
                    float c = Float.parseFloat(s388.getText().toString());
                    float d = Float.parseFloat(s488.getText().toString());
                    float e = Float.parseFloat(s588.getText().toString());
                    float f = Float.parseFloat(s688.getText().toString());
                    float g = Float.parseFloat(s788.getText().toString());
                    float h = Float.parseFloat(s888.getText().toString());
                    double result = ((20 * a) + (20 * b) + (24 * c) + (24 * d) + (25 * e) + (24 * f) + (20 * g) + (18 * h)) / 175;
                    double per = (result - 0.75) * 10;
                    cgpa88.setText(String.format("%.2f", result) + " /10");
                    perc88.setText(String.format("%.2f", per) + " %");
                }
                if (!cgpa88.getText().toString().equals("")) {
                    svc88.setVisibility(View.VISIBLE);
                    clrc88.setVisibility(View.VISIBLE);
                }
            }


        });

        clrc88.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc88.setVisibility(View.VISIBLE);
                svc88.setVisibility(View.GONE);
                clrc88.setVisibility(View.GONE);
                s188.getText().clear();
                s288.getText().clear();
                s388.getText().clear();
                s488.getText().clear();
                s588.getText().clear();
                s688.getText().clear();
                s788.getText().clear();
                s888.getText().clear();
                cgpa88.setText("");
                perc88.setText("");


            }
        });

        svc88.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {

                dbmanager dm = new dbmanager(getApplicationContext());
                final SQLiteDatabase db = dm.getWritableDatabase();

                final EditText editText;

                final AlertDialog.Builder alert = new AlertDialog.Builder(cgpa88.this);
                alert.setMessage("Enter student Name");


                editText = new EditText(cgpa88.this);
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
                            Animation shake = AnimationUtils.loadAnimation(cgpa88.this, R.anim.shake);
                            editText.startAnimation(shake);
                            editText.setError("Please enter student name");
                        } else {
                            ContentValues cv = new ContentValues();
                            cv.put("cname", value);
                            cv.put("no_of_sems", no_of_sem);
                            cv.put("cgpa", cgpa88.getText().toString());
                            cv.put("percentage", perc88.getText().toString());
                            cv.put("schemec", scheme);
                            long i = db.insert("Cgpa", null, cv);
                            if (i == -1) {
                                editText.setError("This name already exists. Enter another name.");
                            } else {
                                Toast.makeText(cgpa88.this, "data inserted successfully", Toast.LENGTH_SHORT).show();
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

