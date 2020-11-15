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

public class cgpa48 extends AppCompatActivity {

    private EditText s148;
    private EditText s248;
    private EditText s348;
    private EditText s448;
    private Button calc48;
    private TextView cgpa48;
    private TextView perc48;
    private Button clrc48;
    private Button svc48;
    private int no_of_sem = 4;
    private int scheme = 2018;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cgpa48);

        getSupportActionBar().setTitle(("CGPA"));

        s148 = (EditText) findViewById(R.id.s148);
        s248 = (EditText) findViewById(R.id.s248);
        s348 = (EditText) findViewById(R.id.s348);
        s448 = (EditText) findViewById(R.id.s448);
        cgpa48 = (TextView) findViewById(R.id.cgpa48);
        perc48 = (TextView) findViewById(R.id.perc48);
        calc48 = (Button) findViewById(R.id.calc48);
        svc48 = (Button) findViewById(R.id.svc48);
        clrc48 = (Button) findViewById(R.id.clrc48);

        s148.addTextChangedListener(new TextWatcher() {

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
                String strTest = s148.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 10) {
                        s148.setText(null);
                        Toast.makeText(cgpa48.this, "Enter a value less than 10", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });

        s248.addTextChangedListener(new TextWatcher() {

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
                String strTest = s248.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 10) {
                        s248.setText(null);
                        Toast.makeText(cgpa48.this, "enter a value less than 10", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });

        s348.addTextChangedListener(new TextWatcher() {

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
                String strTest = s348.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 10) {
                        s348.setText(null);
                        Toast.makeText(cgpa48.this, "enter a value less than 10", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });

        s448.addTextChangedListener(new TextWatcher() {

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
                String strTest = s448.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 10) {
                        s448.setText(null);
                        Toast.makeText(cgpa48.this, "enter a value less than 10", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });

        calc48.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if ((s148.getText().toString().trim().length() <= 0) || (s248.getText().toString().trim().length() <= 0) || (s348.getText().toString().trim().length() <= 0) || (s448.getText().toString().trim().length() <= 0)) {
                    View layout = LayoutInflater.from(cgpa48.this).inflate(R.layout.custom_toast, (ViewGroup) findViewById(R.id.linlayContainer));
                    TextView tv = (TextView) layout.findViewById(R.id.txtMsg);
                    tv.setText("All fields are mandatory");
                    Toast toast = new Toast(cgpa48.this);
                    toast.setGravity(Gravity.CENTER_VERTICAL, 0, 100);
                    toast.setDuration(Toast.LENGTH_SHORT);
                    toast.setView(layout);
                    toast.show();
                } else {
                    float a = Float.parseFloat(s148.getText().toString());
                    float b = Float.parseFloat(s248.getText().toString());
                    float c = Float.parseFloat(s348.getText().toString());
                    float d = Float.parseFloat(s448.getText().toString());
                    double result = ((20 * a) + (20 * b) + (24 * c) + (24 * d)) / 88;
                    double per = (result - 0.75) * 10;
                    cgpa48.setText(String.format("%.2f", result) + " /10");
                    perc48.setText(String.format("%.2f", per) + " %");
                }
                if (!cgpa48.getText().toString().equals("")) {
                    svc48.setVisibility(View.VISIBLE);
                    clrc48.setVisibility(View.VISIBLE);
                }
            }


        });

        clrc48.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc48.setVisibility(View.VISIBLE);
                svc48.setVisibility(View.GONE);
                clrc48.setVisibility(View.GONE);
                s148.getText().clear();
                s248.getText().clear();
                s348.getText().clear();
                s448.getText().clear();
                cgpa48.setText("");
                perc48.setText("");


            }
        });

        svc48.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {

                dbmanager dm = new dbmanager(getApplicationContext());
                final SQLiteDatabase db = dm.getWritableDatabase();

                final EditText editText;

                final AlertDialog.Builder alert = new AlertDialog.Builder(cgpa48.this);
                alert.setMessage("Enter student Name");


                editText = new EditText(cgpa48.this);
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
                            Animation shake = AnimationUtils.loadAnimation(cgpa48.this, R.anim.shake);
                            editText.startAnimation(shake);
                            editText.setError("Please enter student name");
                        } else {
                            ContentValues cv = new ContentValues();
                            cv.put("cname", value);
                            cv.put("no_of_sems", no_of_sem);
                            cv.put("cgpa", cgpa48.getText().toString());
                            cv.put("percentage", perc48.getText().toString());
                            cv.put("schemec", scheme);
                            long i = db.insert("Cgpa", null, cv);
                            if (i == -1) {
                                editText.setError("This name already exists. Enter another name.");
                            } else {
                                Toast.makeText(cgpa48.this, "data inserted successfully", Toast.LENGTH_SHORT).show();
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
