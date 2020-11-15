package com.sneha.vtusgpaandcgpacalculator.cgpa2017;

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
import com.sneha.vtusgpaandcgpacalculator.sqlitepackage.dbmanager;

public class cgpa6 extends AppCompatActivity {

    private EditText editText23;
    private EditText editText24;
    private EditText editText25;
    private EditText editText26;
    private EditText editText27;
    private EditText editText28;
    private Button button21;
    private TextView textView69;
    private TextView textView70;
    private Button clr5;
    private Button save5;
    private int no_of_sem = 6;
    private int scheme = 2017;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cgpa6);

        getSupportActionBar().setTitle(("CGPA"));

        editText23 = (EditText) findViewById(R.id.editText23);
        editText24 = (EditText) findViewById(R.id.editText24);
        editText25 = (EditText) findViewById(R.id.editText25);
        editText26 = (EditText) findViewById(R.id.editText26);
        editText27 = (EditText) findViewById(R.id.editText27);
        editText28 = (EditText) findViewById(R.id.editText28);
        textView69 = (TextView) findViewById(R.id.textView69);
        textView70 = (TextView) findViewById(R.id.textView70);
        button21 = (Button) findViewById(R.id.button21);
        clr5 = (Button) findViewById(R.id.clr5);
        save5 = (Button) findViewById(R.id.save5);

        editText23.addTextChangedListener(new TextWatcher() {

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
                String strTest = editText23.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 10) {
                        editText23.setText(null);
                        Toast.makeText(cgpa6.this, "enter a value less than 10", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });
        editText24.addTextChangedListener(new TextWatcher() {

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
                String strTest = editText24.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 10) {
                        editText24.setText(null);
                        Toast.makeText(cgpa6.this, "enter a value less than 10", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });
        editText25.addTextChangedListener(new TextWatcher() {

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
                String strTest = editText25.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 10) {
                        editText25.setText(null);
                        Toast.makeText(cgpa6.this, "enter a value less than 10", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });
        editText26.addTextChangedListener(new TextWatcher() {

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
                String strTest = editText26.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 10) {
                        editText26.setText(null);
                        Toast.makeText(cgpa6.this, "enter a value less than 10", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });

        editText27.addTextChangedListener(new TextWatcher() {

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
                String strTest = editText27.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 10) {
                        editText27.setText(null);
                        Toast.makeText(cgpa6.this, "enter a value less than 10", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });

        editText28.addTextChangedListener(new TextWatcher() {

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
                String strTest = editText28.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 10) {
                        editText28.setText(null);
                        Toast.makeText(cgpa6.this, "enter a value less than 10", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });


        button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((editText23.getText().toString().trim().length() <= 0) || (editText24.getText().toString().trim().length() <= 0) || (editText25.getText().toString().trim().length() <= 0) || (editText26.getText().toString().trim().length() <= 0) || (editText27.getText().toString().trim().length() <= 0) || (editText28.getText().toString().trim().length() <= 0)) {
                    View layout = LayoutInflater.from(cgpa6.this).inflate(R.layout.custom_toast, (ViewGroup) findViewById(R.id.linlayContainer));
                    TextView tv = (TextView) layout.findViewById(R.id.txtMsg);
                    tv.setText("All fields are mandatory");
                    Toast toast = new Toast(cgpa6.this);
                    toast.setGravity(Gravity.CENTER_VERTICAL, 0, 100);
                    toast.setDuration(Toast.LENGTH_SHORT);
                    toast.setView(layout);
                    toast.show();
                } else {
                    float a = Float.parseFloat(editText23.getText().toString());
                    float b = Float.parseFloat(editText24.getText().toString());
                    float c = Float.parseFloat(editText25.getText().toString());
                    float d = Float.parseFloat(editText26.getText().toString());
                    float e = Float.parseFloat(editText27.getText().toString());
                    float f = Float.parseFloat(editText28.getText().toString());
                    double result = ((24 * a) + (24 * b) + (28 * c) + (28 * d) + (26 * e) + (26 * f)) / 156;
                    double per = (result - 0.75) * 10;
                    textView69.setText(String.format("%.2f", result) + " /10");
                    textView70.setText(String.format("%.2f", per) + "%");
                }
                if (!textView69.getText().toString().equals("")) {
                    save5.setVisibility(View.VISIBLE);
                    clr5.setVisibility(View.VISIBLE);
                }
            }

        });
        clr5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText23.getText().clear();
                editText24.getText().clear();
                editText25.getText().clear();
                editText26.getText().clear();
                editText27.getText().clear();
                editText28.getText().clear();
                textView69.setText("");
                textView70.setText("");
                button21.setVisibility(View.VISIBLE);
                save5.setVisibility(View.GONE);
                clr5.setVisibility(View.GONE);

            }
        });
        save5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                dbmanager dm = new dbmanager(getApplicationContext());
                final SQLiteDatabase db = dm.getWritableDatabase();

                final EditText editText;

                final AlertDialog.Builder alert = new AlertDialog.Builder(cgpa6.this);
                alert.setMessage("Enter student Name");


                editText = new EditText(cgpa6.this);
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
                            Animation shake = AnimationUtils.loadAnimation(cgpa6.this, R.anim.shake);
                            editText.startAnimation(shake);
                            editText.setError("Please enter student name");

                        } else {
                            ContentValues cv = new ContentValues();
                            cv.put("cname", value);
                            cv.put("no_of_sems", no_of_sem);
                            cv.put("cgpa", textView69.getText().toString());
                            cv.put("percentage", textView70.getText().toString());
                            cv.put("schemec", scheme);
                            long i = db.insert("Cgpa", null, cv);
                            if (i == -1) {
                                editText.setError("This name already exists. Enter another name.");
                            } else {
                                Toast.makeText(cgpa6.this, "data inserted successfully", Toast.LENGTH_SHORT).show();
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


