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

public class cgpa28 extends AppCompatActivity {

    private EditText s128;
    private EditText s228;
    private Button calc28;
    private TextView cgpa28;
    private TextView perc28;
    private Button clrc28;
    private Button svc28;
    private int no_of_sem = 2;
    private int scheme = 2018;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cgpa28);

        getSupportActionBar().setTitle(("CGPA"));

        s128 = (EditText) findViewById(R.id.s128);
        s228 = (EditText) findViewById(R.id.s228);
        cgpa28 = (TextView) findViewById(R.id.cgpa28);
        perc28 = (TextView) findViewById(R.id.perc28);
        calc28 = (Button) findViewById(R.id.calc28);
        svc28 = (Button) findViewById(R.id.svc28);
        clrc28 = (Button) findViewById(R.id.clrc28);

        s128.addTextChangedListener(new TextWatcher() {

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
                String strTest = s128.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 10) {
                        s128.setText(null);
                        Toast.makeText(cgpa28.this, "Enter a value less than 10", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });

        s228.addTextChangedListener(new TextWatcher() {

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
                String strTest = s228.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 10) {
                        s228.setText(null);
                        Toast.makeText(cgpa28.this, "enter a value less than 10", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });

        calc28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if ((s128.getText().toString().trim().length() <= 0) || (s228.getText().toString().trim().length() <= 0)) {
                    View layout = LayoutInflater.from(cgpa28.this).inflate(R.layout.custom_toast, (ViewGroup) findViewById(R.id.linlayContainer));
                    TextView tv = (TextView) layout.findViewById(R.id.txtMsg);
                    tv.setText("All fields are mandatory");
                    Toast toast = new Toast(cgpa28.this);
                    toast.setGravity(Gravity.CENTER_VERTICAL, 0, 100);
                    toast.setDuration(Toast.LENGTH_SHORT);
                    toast.setView(layout);
                    toast.show();
                } else {
                    float a = Float.parseFloat(s128.getText().toString());
                    float b = Float.parseFloat(s228.getText().toString());
                    double result = ((20 * a) + (20 * b)) / 40;
                    double per = (result - 0.75) * 10;
                    cgpa28.setText(String.format("%.2f", result) + " /10");
                    perc28.setText(String.format("%.2f", per) + " %");
                }
                if (!cgpa28.getText().toString().equals("")) {
                    svc28.setVisibility(View.VISIBLE);
                    clrc28.setVisibility(View.VISIBLE);
                }
            }


        });

        clrc28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calc28.setVisibility(View.VISIBLE);
                svc28.setVisibility(View.GONE);
                clrc28.setVisibility(View.GONE);
                s128.getText().clear();
                s228.getText().clear();
                cgpa28.setText("");
                perc28.setText("");


            }
        });

        svc28.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {

                dbmanager dm = new dbmanager(getApplicationContext());
                final SQLiteDatabase db = dm.getWritableDatabase();

                final EditText editText;

                final AlertDialog.Builder alert = new AlertDialog.Builder(cgpa28.this);
                alert.setMessage("Enter student Name");


                editText = new EditText(cgpa28.this);
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
                            Animation shake = AnimationUtils.loadAnimation(cgpa28.this, R.anim.shake);
                            editText.startAnimation(shake);
                            editText.setError("Please enter student name");
                        } else {
                            ContentValues cv = new ContentValues();
                            cv.put("cname", value);
                            cv.put("no_of_sems", no_of_sem);
                            cv.put("cgpa", cgpa28.getText().toString());
                            cv.put("percentage", perc28.getText().toString());
                            cv.put("schemec", scheme);
                            long i = db.insert("Cgpa", null, cv);
                            if (i == -1) {
                                editText.setError("This name already exists. Enter another name.");
                            } else {
                                Toast.makeText(cgpa28.this, "data inserted successfully", Toast.LENGTH_SHORT).show();
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

