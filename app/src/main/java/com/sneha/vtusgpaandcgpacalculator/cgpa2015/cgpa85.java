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

public class cgpa85 extends AppCompatActivity {

    private EditText editText3685;
    private EditText editText3785;
    private EditText editText3885;
    private EditText editText3985;
    private EditText editText4085;
    private EditText editText4185;
    private EditText editText4285;
    private EditText editText4385;
    private Button button2385;
    private Button save85;
    private Button clr85;
    private TextView textView9385;
    private TextView textView9485;
    private int no_of_sem = 8;
    private int scheme = 2015;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cgpa85);
        getSupportActionBar().setTitle(("CGPA"));

        editText3685 = (EditText) findViewById(R.id.editText3685);
        editText3785 = (EditText) findViewById(R.id.editText3785);
        editText3885 = (EditText) findViewById(R.id.editText3885);
        editText3985 = (EditText) findViewById(R.id.editText3985);
        editText4085 = (EditText) findViewById(R.id.editText4085);
        editText4185 = (EditText) findViewById(R.id.editText4185);
        editText4285 = (EditText) findViewById(R.id.editText4285);
        editText4385 = (EditText) findViewById(R.id.editText4385);
        textView9385 = (TextView) findViewById(R.id.textView9385);
        textView9485 = (TextView) findViewById(R.id.textView9485);
        button2385 = (Button) findViewById(R.id.button2385);
        clr85 = (Button) findViewById(R.id.clr85);
        save85 = (Button) findViewById(R.id.save85);


        editText3685.addTextChangedListener(new TextWatcher() {

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
                String strTest = editText3685.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 10) {
                        editText3685.setText(null);
                        Toast.makeText(cgpa85.this, "enter a value less than 10", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });

        editText3785.addTextChangedListener(new TextWatcher() {

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
                String strTest = editText3785.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 10) {
                        editText3785.setText(null);
                        Toast.makeText(cgpa85.this, "enter a value less than 10", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });

        editText3885.addTextChangedListener(new TextWatcher() {

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
                String strTest = editText3885.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 10) {
                        editText3885.setText(null);
                        Toast.makeText(cgpa85.this, "enter a value less than 10", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });
        editText3985.addTextChangedListener(new TextWatcher() {

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
                String strTest = editText3985.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 10) {
                        editText3985.setText(null);
                        Toast.makeText(cgpa85.this, "enter a value less than 10", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });

        editText4085.addTextChangedListener(new TextWatcher() {

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
                String strTest = editText4085.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 10) {
                        editText4085.setText(null);
                        Toast.makeText(cgpa85.this, "enter a value less than 10", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });

        editText4185.addTextChangedListener(new TextWatcher() {

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
                String strTest = editText4185.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 10) {
                        editText4185.setText(null);
                        Toast.makeText(cgpa85.this, "enter a value less than 10", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });
        editText4285.addTextChangedListener(new TextWatcher() {

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
                String strTest = editText4285.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 10) {
                        editText4285.setText(null);
                        Toast.makeText(cgpa85.this, "enter a value less than 10", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });


        button2385.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((editText3685.getText().toString().trim().length() <= 0) || (editText3785.getText().toString().trim().length() <= 0) || (editText3885.getText().toString().trim().length() <= 0) || (editText3985.getText().toString().trim().length() <= 0) || (editText4085.getText().toString().trim().length() <= 0) || (editText4185.getText().toString().trim().length() <= 0) || (editText4285.getText().toString().trim().length() <= 0) || (editText4385.getText().toString().trim().length() <= 0)) {
                    View layout = LayoutInflater.from(cgpa85.this).inflate(R.layout.custom_toast, (ViewGroup) findViewById(R.id.linlayContainer));
                    TextView tv = (TextView) layout.findViewById(R.id.txtMsg);
                    tv.setText("All fields are mandatory");
                    Toast toast = new Toast(cgpa85.this);
                    toast.setGravity(Gravity.CENTER_VERTICAL, 0, 100);
                    toast.setDuration(Toast.LENGTH_SHORT);
                    toast.setView(layout);
                    toast.show();
                } else {
                    float a = Float.parseFloat(editText3685.getText().toString());
                    float b = Float.parseFloat(editText3785.getText().toString());
                    float c = Float.parseFloat(editText3885.getText().toString());
                    float d = Float.parseFloat(editText3985.getText().toString());
                    float e = Float.parseFloat(editText4085.getText().toString());
                    float f = Float.parseFloat(editText4185.getText().toString());
                    float g = Float.parseFloat(editText4285.getText().toString());
                    float h = Float.parseFloat(editText4385.getText().toString());
                    double result = ((24 * a) + (24 * b) + (28 * c) + (28 * d) + (26 * e) + (26 * f) + (24 * g) + (20 * h)) / 200;
                    double per = (result - 0.75) * 10;
                    textView9385.setText(String.format("%.2f", result) + " /10");
                    textView9485.setText(String.format("%.2f", per) + "%");
                }
                if (!textView9385.getText().toString().equals("")) {
                    save85.setVisibility(View.VISIBLE);
                    clr85.setVisibility(View.VISIBLE);
                }

            }

        });
        clr85.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText3685.getText().clear();
                editText3785.getText().clear();
                editText3885.getText().clear();
                editText3985.getText().clear();
                editText4085.getText().clear();
                editText4185.getText().clear();
                editText4285.getText().clear();
                editText4385.getText().clear();
                textView9385.setText("");
                textView9485.setText("");
                button2385.setVisibility(View.VISIBLE);
                save85.setVisibility(View.GONE);
                clr85.setVisibility(View.GONE);


            }
        });
        save85.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dbmanager dm = new dbmanager(getApplicationContext());
                final SQLiteDatabase db = dm.getWritableDatabase();

                final EditText editText;

                final AlertDialog.Builder alert = new AlertDialog.Builder(cgpa85.this);
                alert.setMessage("Enter student Name");


                editText = new EditText(cgpa85.this);
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
                            Animation shake = AnimationUtils.loadAnimation(cgpa85.this, R.anim.shake);
                            editText.startAnimation(shake);
                            editText.setError("Please enter student name");
                        } else {
                            ContentValues cv = new ContentValues();
                            cv.put("cname", value);
                            cv.put("no_of_sems", no_of_sem);
                            cv.put("cgpa", textView9385.getText().toString());
                            cv.put("percentage", textView9485.getText().toString());
                            cv.put("schemec", scheme);
                            long i = db.insert("Cgpa", null, cv);
                            if (i == -1) {
                                editText.setError("This name already exists. Enter another name.");
                            } else {
                                Toast.makeText(cgpa85.this, "data inserted successfully", Toast.LENGTH_SHORT).show();
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


