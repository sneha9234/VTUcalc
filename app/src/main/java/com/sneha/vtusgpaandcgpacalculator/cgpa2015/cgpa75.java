package com.sneha.vtusgpaandcgpacalculator.cgpa2015;

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

public class cgpa75 extends AppCompatActivity {

    private EditText editText2975;
    private EditText editText3075;
    private EditText editText3175;
    private EditText editText3275;
    private EditText editText3375;
    private EditText editText3475;
    private EditText editText3575;
    private Button button2275;
    private TextView textView8075;
    private TextView textView8175;
    private Button clr75;
    private Button save75;
    private int no_of_sem = 7;
    private int scheme = 2015;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cgpa75);

        getSupportActionBar().setTitle(("CGPA"));

        editText2975 = (EditText) findViewById(R.id.editText2975);
        editText3075 = (EditText) findViewById(R.id.editText3075);
        editText3175 = (EditText) findViewById(R.id.editText3175);
        editText3275 = (EditText) findViewById(R.id.editText3275);
        editText3375 = (EditText) findViewById(R.id.editText3375);
        editText3475 = (EditText) findViewById(R.id.editText3475);
        editText3575 = (EditText) findViewById(R.id.editText3575);
        textView8075 = (TextView) findViewById(R.id.textView8075);
        textView8175 = (TextView) findViewById(R.id.textView8175);
        button2275 = (Button) findViewById(R.id.button2275);
        clr75 = (Button) findViewById(R.id.clr75);
        save75 = (Button) findViewById(R.id.save75);

        editText2975.addTextChangedListener(new TextWatcher() {

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
                String strTest = editText2975.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 10) {
                        editText2975.setText(null);
                        Toast.makeText(cgpa75.this, "enter a value less than 10", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });

        editText3075.addTextChangedListener(new TextWatcher() {

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
                String strTest = editText3075.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 10) {
                        editText3075.setText(null);
                        Toast.makeText(cgpa75.this, "enter a value less than 10", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });
        editText3175.addTextChangedListener(new TextWatcher() {

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
                String strTest = editText3175.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 10) {
                        editText3175.setText(null);
                        Toast.makeText(cgpa75.this, "enter a value less than 10", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });

        editText3275.addTextChangedListener(new TextWatcher() {

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
                String strTest = editText3275.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 10) {
                        editText3275.setText(null);
                        Toast.makeText(cgpa75.this, "enter a value less than 10", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });

        editText3375.addTextChangedListener(new TextWatcher() {

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
                String strTest = editText3375.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 10) {
                        editText3375.setText(null);
                        Toast.makeText(cgpa75.this, "enter a value less than 10", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });

        editText3475.addTextChangedListener(new TextWatcher() {

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
                String strTest = editText3475.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 10) {
                        editText3475.setText(null);
                        Toast.makeText(cgpa75.this, "enter a value less than 10", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });

        editText3575.addTextChangedListener(new TextWatcher() {

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
                String strTest = editText3575.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 10) {
                        editText3575.setText(null);
                        Toast.makeText(cgpa75.this, "enter a value less than 10", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });

        button2275.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((editText2975.getText().toString().trim().length() <= 0) || (editText3075.getText().toString().trim().length() <= 0) || (editText3175.getText().toString().trim().length() <= 0) || (editText3275.getText().toString().trim().length() <= 0) || (editText3375.getText().toString().trim().length() <= 0) || (editText3475.getText().toString().trim().length() <= 0) || (editText3575.getText().toString().trim().length() <= 0)) {
                    View layout = LayoutInflater.from(cgpa75.this).inflate(R.layout.custom_toast, (ViewGroup) findViewById(R.id.linlayContainer));
                    TextView tv = (TextView) layout.findViewById(R.id.txtMsg);
                    tv.setText("All fields are mandatory");
                    Toast toast = new Toast(cgpa75.this);
                    toast.setGravity(Gravity.CENTER_VERTICAL, 0, 100);
                    toast.setDuration(Toast.LENGTH_SHORT);
                    toast.setView(layout);
                    toast.show();
                } else {
                    float a = Float.parseFloat(editText2975.getText().toString());
                    float b = Float.parseFloat(editText3075.getText().toString());
                    float c = Float.parseFloat(editText3175.getText().toString());
                    float d = Float.parseFloat(editText3275.getText().toString());
                    float e = Float.parseFloat(editText3375.getText().toString());
                    float f = Float.parseFloat(editText3475.getText().toString());
                    float g = Float.parseFloat(editText3575.getText().toString());
                    double result = ((24 * a) + (24 * b) + (28 * c) + (28 * d) + (26 * e) + (26 * f) + (24 * g)) / 180;
                    double per = (result - 0.75) * 10;
                    textView8075.setText(String.format("%.2f", result) + " /10");
                    textView8175.setText(String.format("%.2f", per) + "%");
                }
                if (!textView8075.getText().toString().equals("")) {
                    save75.setVisibility(View.VISIBLE);
                    clr75.setVisibility(View.VISIBLE);
                }
            }

        });
        clr75.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText2975.getText().clear();
                editText3075.getText().clear();
                editText3175.getText().clear();
                editText3275.getText().clear();
                editText3375.getText().clear();
                editText3475.getText().clear();
                editText3575.getText().clear();
                textView8075.setText("");
                textView8175.setText("");
                button2275.setVisibility(View.VISIBLE);
                save75.setVisibility(View.GONE);
                clr75.setVisibility(View.GONE);


            }
        });
        save75.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dbmanager dm = new dbmanager(getApplicationContext());
                final SQLiteDatabase db = dm.getWritableDatabase();

                final EditText editText;

                final AlertDialog.Builder alert = new AlertDialog.Builder(cgpa75.this);
                alert.setMessage("Enter student Name");


                editText = new EditText(cgpa75.this);
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
                            Animation shake = AnimationUtils.loadAnimation(cgpa75.this, R.anim.shake);
                            editText.startAnimation(shake);
                            editText.setError("Please enter student name");
                        } else {
                            ContentValues cv = new ContentValues();
                            cv.put("cname", value);
                            cv.put("no_of_sems", no_of_sem);
                            cv.put("cgpa", textView8075.getText().toString());
                            cv.put("percentage", textView8175.getText().toString());
                            cv.put("schemec", scheme);
                            long i = db.insert("Cgpa", null, cv);
                            if (i == -1) {
                                editText.setError("This name already exists. Enter another name.");
                            } else {
                                Toast.makeText(cgpa75.this, "data inserted successfully", Toast.LENGTH_SHORT).show();
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
