package com.sneha.vtusgpaandcgpacalculator.sgpa2017;

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

public class o8 extends AppCompatActivity {
    private EditText editText93;
    private EditText editText101;
    private EditText editText102;
    private EditText editText103;
    private EditText editText104;
    private EditText editText105;
    private TextView textView273;
    private TextView textView274;
    private Button button31, s07, cb07;

    private float cr, cr1, cr2, cr3, cr4, cr5;

    private int scheme = 2017;
    private String sem = "8th semester";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_o8);

        getSupportActionBar().setTitle(("SGPA 8th Sem"));

        editText93 = (EditText) findViewById(R.id.editText93);
        editText101 = (EditText) findViewById(R.id.editText101);
        editText102 = (EditText) findViewById(R.id.editText102);
        editText103 = (EditText) findViewById(R.id.editText103);
        editText104 = (EditText) findViewById(R.id.editText104);
        editText105 = (EditText) findViewById(R.id.editText105);
        textView273 = (TextView) findViewById(R.id.textView273);
        textView274 = (TextView) findViewById(R.id.textView274);
        button31 = (Button) findViewById(R.id.button31);
        s07 = (Button) findViewById(R.id.s07);
        cb07 = (Button) findViewById(R.id.cb07);

        editText93.addTextChangedListener(new TextWatcher() {

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
                String strTest = editText93.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 100) {
                        editText93.setText(null);
                        Toast.makeText(o8.this, "Enter a value less than 100", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });

        editText101.addTextChangedListener(new TextWatcher() {

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
                String strTest = editText101.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 100) {
                        editText101.setText(null);
                        Toast.makeText(o8.this, "Enter a value less than 100", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });

        editText102.addTextChangedListener(new TextWatcher() {

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
                String strTest = editText102.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 100) {
                        editText102.setText(null);
                        Toast.makeText(o8.this, "Enter a value less than 100", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });

        editText103.addTextChangedListener(new TextWatcher() {

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
                String strTest = editText103.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 100) {
                        editText103.setText(null);
                        Toast.makeText(o8.this, "Enter a value less than 100", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });

        editText104.addTextChangedListener(new TextWatcher() {

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
                String strTest = editText93.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 200) {
                        editText93.setText(null);
                        Toast.makeText(o8.this, "Enter a value less than 200", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });

        editText105.addTextChangedListener(new TextWatcher() {

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
                String strTest = editText105.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 200) {
                        editText105.setText(null);
                        Toast.makeText(o8.this, "Enter a value less than 200", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });

        button31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((editText93.getText().toString().trim().length() <= 0) || (editText101.getText().toString().trim().length() <= 0) || (editText102.getText().toString().trim().length() <= 0) || (editText103.getText().toString().trim().length() <= 0) || (editText104.getText().toString().trim().length() <= 0) || (editText105.getText().toString().trim().length() <= 0)) {
                    View layout = LayoutInflater.from(o8.this).inflate(R.layout.custom_toast, (ViewGroup) findViewById(R.id.linlayContainer));
                    TextView tv = (TextView) layout.findViewById(R.id.txtMsg);
                    tv.setText("All fields are mandatory");
                    Toast toast = new Toast(o8.this);
                    toast.setGravity(Gravity.CENTER_VERTICAL, 0, 100);
                    toast.setDuration(Toast.LENGTH_SHORT);
                    toast.setView(layout);
                    toast.show();
                } else {
                    float sub1 = Float.parseFloat(editText93.getText().toString());
                    if (sub1 < 40) {
                        cr = 0;
                    } else if (sub1 >= 40 && sub1 < 45) {
                        cr = 4;
                    } else if (sub1 >= 45 && sub1 < 50) {
                        cr = 5;
                    } else if (sub1 >= 50 && sub1 < 60) {
                        cr = 6;
                    } else if (sub1 >= 60 && sub1 < 70) {
                        cr = 7;
                    } else if (sub1 >= 70 && sub1 < 80) {
                        cr = 8;
                    } else if (sub1 >= 80 && sub1 < 90) {
                        cr = 9;
                    } else if (sub1 >= 90 && sub1 <= 100) {
                        cr = 10;
                    }
                    float sub2 = Float.parseFloat(editText101.getText().toString());
                    if (sub2 < 40) {
                        cr1 = 0;
                    } else if (sub2 >= 40 && sub2 < 45) {
                        cr1 = 4;
                    } else if (sub2 >= 45 && sub2 < 50) {
                        cr1 = 5;
                    } else if (sub2 >= 50 && sub2 < 60) {
                        cr1 = 6;
                    } else if (sub2 >= 60 && sub2 < 70) {
                        cr1 = 7;
                    } else if (sub2 >= 70 && sub2 < 80) {
                        cr1 = 8;
                    } else if (sub2 >= 80 && sub2 < 90) {
                        cr1 = 9;
                    } else if (sub2 >= 90 && sub2 <= 100) {
                        cr1 = 10;
                    }
                    float sub3 = Float.parseFloat(editText102.getText().toString());
                    if (sub3 < 40) {
                        cr2 = 0;
                    } else if (sub3 >= 40 && sub3 < 45) {
                        cr2 = 4;
                    } else if (sub3 >= 45 && sub3 < 50) {
                        cr2 = 5;
                    } else if (sub1 >= 50 && sub3 < 60) {
                        cr2 = 6;
                    } else if (sub3 >= 60 && sub3 < 70) {
                        cr2 = 7;
                    } else if (sub3 >= 70 && sub3 < 80) {
                        cr2 = 8;
                    } else if (sub3 >= 80 && sub3 < 90) {
                        cr2 = 9;
                    } else if (sub3 >= 90 && sub3 <= 100) {
                        cr2 = 10;
                    }
                    float sub4 = Float.parseFloat(editText103.getText().toString());
                    if (sub4 < 40) {
                        cr3 = 0;
                    } else if (sub4 >= 40 && sub4 < 45) {
                        cr3 = 4;
                    } else if (sub4 >= 45 && sub4 < 50) {
                        cr3 = 5;
                    } else if (sub4 >= 50 && sub4 < 60) {
                        cr3 = 6;
                    } else if (sub4 >= 60 && sub4 < 70) {
                        cr3 = 7;
                    } else if (sub4 >= 70 && sub4 < 80) {
                        cr3 = 8;
                    } else if (sub4 >= 80 && sub4 < 90) {
                        cr3 = 9;
                    } else if (sub4 >= 90 && sub4 <= 100) {
                        cr3 = 10;
                    }
                    float sub5 = Float.parseFloat(editText104.getText().toString());
                    if (sub4 < 40) {
                        cr4 = 0;
                    } else if (sub4 >= 40 && sub4 < 45) {
                        cr4 = 4;
                    } else if (sub4 >= 45 && sub4 < 50) {
                        cr4 = 5;
                    } else if (sub4 >= 50 && sub4 < 60) {
                        cr4 = 6;
                    } else if (sub4 >= 60 && sub4 < 70) {
                        cr4 = 7;
                    } else if (sub4 >= 70 && sub4 < 80) {
                        cr4 = 8;
                    } else if (sub4 >= 80 && sub4 < 90) {
                        cr4 = 9;
                    } else if (sub4 >= 90 && sub4 <= 100) {
                        cr4 = 10;
                    }
                    float sub6 = Float.parseFloat(editText105.getText().toString());
                    if ((sub5 / 2) < 40) {
                        cr5 = 0;
                    } else if (((sub5 / 2) >= 40) && ((sub5 / 2) < 45)) {
                        cr5 = 4;
                    } else if (((sub5 / 2) >= 45) && ((sub5 / 2) < 50)) {
                        cr5 = 5;
                    } else if (((sub5 / 2) >= 50) && ((sub5 / 2) < 60)) {
                        cr5 = 6;
                    } else if (((sub5 / 2) >= 60) && ((sub5 / 2) < 70)) {
                        cr5 = 7;
                    } else if (((sub5 / 2) >= 70) && ((sub5 / 2) < 80)) {
                        cr5 = 8;
                    } else if (((sub5 / 2) >= 80) && ((sub5 / 2) < 90)) {
                        cr5 = 9;
                    } else if (((sub5 / 2) >= 90) && ((sub5 / 2) <= 100)) {
                        cr5 = 10;
                    }

                    double result = ((cr * 4) + (cr1 * 4) + (cr2 * 3) + (cr4 * 2) + (cr5 * 6) + (cr3 * 1)) / 20;
                    textView273.setText(String.format("%.2f", result) + " /10");
                    double per = (sub1 + sub2 + sub3 + sub4 + sub5 + sub6) / 7;
                    textView274.setText(String.format("%.2f", per) + " %");
                }

                if (!textView273.getText().toString().equals("")) {
                    s07.setVisibility(View.VISIBLE);
                    cb07.setVisibility(View.VISIBLE);
                }
            }
        });

        cb07.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s07.setVisibility(View.GONE);
                cb07.setVisibility(View.GONE);
                editText93.getText().clear();
                editText101.getText().clear();
                editText102.getText().clear();
                editText103.getText().clear();
                editText104.getText().clear();
                editText105.getText().clear();
                textView273.setText("");
                textView274.setText("");


            }
        });
        s07.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dbmanager dm = new dbmanager(getApplicationContext());
                final SQLiteDatabase db = dm.getWritableDatabase();

                final EditText editText;

                final AlertDialog.Builder alert = new AlertDialog.Builder(o8.this);
                alert.setMessage("Enter student Name");


                editText = new EditText(o8.this);
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
                            Animation shake = AnimationUtils.loadAnimation(o8.this, R.anim.shake);
                            editText.startAnimation(shake);
                            editText.setError("Please enter student name");
                        } else {
                            ContentValues cv = new ContentValues();
                            cv.put("sname", value);
                            cv.put("semester", sem);
                            cv.put("sgpa", textView273.getText().toString());
                            cv.put("percent", textView274.getText().toString());
                            cv.put("schemes", scheme);
                            long i = db.insert("Sgpa", null, cv);
                            if (i == -1) {
                                editText.setError("This name already exists. Enter another name.");
                            } else {
                                Toast.makeText(o8.this, "data inserted successfully", Toast.LENGTH_SHORT).show();
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
