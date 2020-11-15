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

public class cgpa58 extends AppCompatActivity {

    private EditText s158;
    private EditText s258;
    private EditText s358;
    private EditText s458;
    private EditText s558;
    private Button calc58;
    private TextView cgpa58;
    private TextView perc58;
    private Button clrc58;
    private Button svc58;
    private int no_of_sem = 5;
    private int scheme = 2018;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cgpa58);

        getSupportActionBar().setTitle(("CGPA"));

        s158 = (EditText) findViewById(R.id.s158);
        s258 = (EditText) findViewById(R.id.s258);
        s358 = (EditText) findViewById(R.id.s358);
        s458 = (EditText) findViewById(R.id.s458);
        s558 = (EditText) findViewById(R.id.s558);
        cgpa58 = (TextView) findViewById(R.id.cgpa58);
        perc58 = (TextView) findViewById(R.id.perc58);
        calc58 = (Button) findViewById(R.id.calc58);
        svc58 = (Button) findViewById(R.id.svc58);
        clrc58 = (Button) findViewById(R.id.clrc58);

        s158.addTextChangedListener(new TextWatcher() {

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
                String strTest = s158.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 10) {
                        s158.setText(null);
                        Toast.makeText(cgpa58.this, "Enter a value less than 10", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });

        s258.addTextChangedListener(new TextWatcher() {

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
                String strTest = s258.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 10) {
                        s258.setText(null);
                        Toast.makeText(cgpa58.this, "enter a value less than 10", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });

        s358.addTextChangedListener(new TextWatcher() {

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
                String strTest = s358.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 10) {
                        s358.setText(null);
                        Toast.makeText(cgpa58.this, "enter a value less than 10", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });

        s458.addTextChangedListener(new TextWatcher() {

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
                String strTest = s458.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 10) {
                        s458.setText(null);
                        Toast.makeText(cgpa58.this, "enter a value less than 10", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });

        s558.addTextChangedListener(new TextWatcher() {

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
                String strTest = s558.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 10) {
                        s558.setText(null);
                        Toast.makeText(cgpa58.this, "enter a value less than 10", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });

        calc58.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if ((s158.getText().toString().trim().length() <= 0) || (s258.getText().toString().trim().length() <= 0) || (s358.getText().toString().trim().length() <= 0) || (s458.getText().toString().trim().length() <= 0) || (s558.getText().toString().trim().length() <= 0)) {
                    View layout = LayoutInflater.from(cgpa58.this).inflate(R.layout.custom_toast, (ViewGroup) findViewById(R.id.linlayContainer));
                    TextView tv = (TextView) layout.findViewById(R.id.txtMsg);
                    tv.setText("All fields are mandatory");
                    Toast toast = new Toast(cgpa58.this);
                    toast.setGravity(Gravity.CENTER_VERTICAL, 0, 100);
                    toast.setDuration(Toast.LENGTH_SHORT);
                    toast.setView(layout);
                    toast.show();
                } else {
                    float a = Float.parseFloat(s158.getText().toString());
                    float b = Float.parseFloat(s258.getText().toString());
                    float c = Float.parseFloat(s358.getText().toString());
                    float d = Float.parseFloat(s458.getText().toString());
                    float e = Float.parseFloat(s558.getText().toString());
                    double result = ((20 * a) + (20 * b) + (24 * c) + (24 * d) + (25 * e)) / 113;
                    double per = (result - 0.75) * 10;
                    cgpa58.setText(String.format("%.2f", result) + " /10");
                    perc58.setText(String.format("%.2f", per) + " %");
                }
                if (!cgpa58.getText().toString().equals("")) {
                    svc58.setVisibility(View.VISIBLE);
                    clrc58.setVisibility(View.VISIBLE);
                }
            }


        });

        clrc58.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc58.setVisibility(View.VISIBLE);
                svc58.setVisibility(View.GONE);
                clrc58.setVisibility(View.GONE);
                s158.getText().clear();
                s258.getText().clear();
                s358.getText().clear();
                s458.getText().clear();
                s558.getText().clear();
                cgpa58.setText("");
                perc58.setText("");


            }
        });

        svc58.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {

                dbmanager dm = new dbmanager(getApplicationContext());
                final SQLiteDatabase db = dm.getWritableDatabase();

                final EditText editText;

                final AlertDialog.Builder alert = new AlertDialog.Builder(cgpa58.this);
                alert.setMessage("Enter student Name");


                editText = new EditText(cgpa58.this);
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
                            Animation shake = AnimationUtils.loadAnimation(cgpa58.this, R.anim.shake);
                            editText.startAnimation(shake);
                            editText.setError("Please enter student name");
                        } else {
                            ContentValues cv = new ContentValues();
                            cv.put("cname", value);
                            cv.put("no_of_sems", no_of_sem);
                            cv.put("cgpa", cgpa58.getText().toString());
                            cv.put("percentage", perc58.getText().toString());
                            cv.put("schemec", scheme);
                            long i = db.insert("Cgpa", null, cv);
                            if (i == -1) {
                                editText.setError("This name already exists. Enter another name.");
                            } else {
                                Toast.makeText(cgpa58.this, "data inserted successfully", Toast.LENGTH_SHORT).show();
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

