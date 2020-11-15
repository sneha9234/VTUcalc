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

public class cgpa8 extends AppCompatActivity {

    private EditText editText36;
    private EditText editText37;
    private EditText editText38;
    private EditText editText39;
    private EditText editText40;
    private EditText editText41;
    private EditText editText42;
    private EditText editText43;
    private Button button23;
    private Button save7;
    private Button clr7;
    private TextView textView93;
    private TextView textView94;
    private int no_of_sem = 8;
    private int scheme = 2017;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cgpa8);

        getSupportActionBar().setTitle(("CGPA"));

        editText36 = (EditText) findViewById(R.id.editText36);
        editText37 = (EditText) findViewById(R.id.editText37);
        editText38 = (EditText) findViewById(R.id.editText38);
        editText39 = (EditText) findViewById(R.id.editText39);
        editText40 = (EditText) findViewById(R.id.editText40);
        editText41 = (EditText) findViewById(R.id.editText41);
        editText42 = (EditText) findViewById(R.id.editText42);
        editText43 = (EditText) findViewById(R.id.editText43);
        textView93 = (TextView) findViewById(R.id.textView93);
        textView94 = (TextView) findViewById(R.id.textView94);
        button23 = (Button) findViewById(R.id.button23);
        clr7 = (Button) findViewById(R.id.clr7);
        save7 = (Button) findViewById(R.id.save7);


        editText36.addTextChangedListener(new TextWatcher() {

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
                String strTest = editText36.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 10) {
                        editText36.setText(null);
                        Toast.makeText(cgpa8.this, "enter a value less than 10", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });

        editText37.addTextChangedListener(new TextWatcher() {

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
                String strTest = editText37.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 10) {
                        editText37.setText(null);
                        Toast.makeText(cgpa8.this, "enter a value less than 10", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });

        editText38.addTextChangedListener(new TextWatcher() {

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
                String strTest = editText38.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 10) {
                        editText38.setText(null);
                        Toast.makeText(cgpa8.this, "enter a value less than 10", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });
        editText39.addTextChangedListener(new TextWatcher() {

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
                String strTest = editText39.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 10) {
                        editText39.setText(null);
                        Toast.makeText(cgpa8.this, "enter a value less than 10", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });

        editText40.addTextChangedListener(new TextWatcher() {

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
                String strTest = editText40.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 10) {
                        editText40.setText(null);
                        Toast.makeText(cgpa8.this, "enter a value less than 10", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });

        editText41.addTextChangedListener(new TextWatcher() {

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
                String strTest = editText41.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 10) {
                        editText41.setText(null);
                        Toast.makeText(cgpa8.this, "enter a value less than 10", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });
        editText42.addTextChangedListener(new TextWatcher() {

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
                String strTest = editText42.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 10) {
                        editText42.setText(null);
                        Toast.makeText(cgpa8.this, "enter a value less than 10", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });


        button23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((editText36.getText().toString().trim().length() <= 0) || (editText37.getText().toString().trim().length() <= 0) || (editText38.getText().toString().trim().length() <= 0) || (editText39.getText().toString().trim().length() <= 0) || (editText40.getText().toString().trim().length() <= 0) || (editText41.getText().toString().trim().length() <= 0) || (editText42.getText().toString().trim().length() <= 0) || (editText43.getText().toString().trim().length() <= 0)) {
                    View layout = LayoutInflater.from(cgpa8.this).inflate(R.layout.custom_toast, (ViewGroup) findViewById(R.id.linlayContainer));
                    TextView tv = (TextView) layout.findViewById(R.id.txtMsg);
                    tv.setText("All fields are mandatory");
                    Toast toast = new Toast(cgpa8.this);
                    toast.setGravity(Gravity.CENTER_VERTICAL, 0, 100);
                    toast.setDuration(Toast.LENGTH_SHORT);
                    toast.setView(layout);
                    toast.show();
                } else {
                    float a = Float.parseFloat(editText36.getText().toString());
                    float b = Float.parseFloat(editText37.getText().toString());
                    float c = Float.parseFloat(editText38.getText().toString());
                    float d = Float.parseFloat(editText39.getText().toString());
                    float e = Float.parseFloat(editText40.getText().toString());
                    float f = Float.parseFloat(editText41.getText().toString());
                    float g = Float.parseFloat(editText42.getText().toString());
                    float h = Float.parseFloat(editText43.getText().toString());
                    double result = ((24 * a) + (24 * b) + (28 * c) + (28 * d) + (26 * e) + (26 * f) + (24 * g) + (20 * h)) / 200;
                    double per = (result - 0.75) * 10;
                    textView93.setText(String.format("%.2f", result) + " /10");
                    textView94.setText(String.format("%.2f", per) + "%");
                }
                if (!textView93.getText().toString().equals("")) {
                    save7.setVisibility(View.VISIBLE);
                    clr7.setVisibility(View.VISIBLE);
                }

            }

        });
        clr7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText36.getText().clear();
                editText37.getText().clear();
                editText38.getText().clear();
                editText39.getText().clear();
                editText40.getText().clear();
                editText41.getText().clear();
                editText42.getText().clear();
                editText43.getText().clear();
                textView93.setText("");
                textView94.setText("");
                button23.setVisibility(View.VISIBLE);
                save7.setVisibility(View.GONE);
                clr7.setVisibility(View.GONE);


            }
        });
        save7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dbmanager dm = new dbmanager(getApplicationContext());
                final SQLiteDatabase db = dm.getWritableDatabase();

                final EditText editText;

                final AlertDialog.Builder alert = new AlertDialog.Builder(cgpa8.this);
                alert.setMessage("Enter student Name");


                editText = new EditText(cgpa8.this);
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
                            Animation shake = AnimationUtils.loadAnimation(cgpa8.this, R.anim.shake);
                            editText.startAnimation(shake);
                            editText.setError("Please enter student name");
                        } else {
                            ContentValues cv = new ContentValues();
                            cv.put("cname", value);
                            cv.put("no_of_sems", no_of_sem);
                            cv.put("cgpa", textView93.getText().toString());
                            cv.put("percentage", textView94.getText().toString());
                            cv.put("schemec", scheme);
                            long i = db.insert("Cgpa", null, cv);
                            if (i == -1) {
                                editText.setError("This name already exists. Enter another name.");
                            } else {
                                Toast.makeText(cgpa8.this, "data inserted successfully", Toast.LENGTH_SHORT).show();
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

