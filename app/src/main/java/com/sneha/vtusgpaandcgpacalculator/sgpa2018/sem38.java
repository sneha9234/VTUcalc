package com.sneha.vtusgpaandcgpacalculator.sgpa2018;

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

public class sem38 extends AppCompatActivity {

    private EditText s31;
    private EditText s32;
    private EditText s33;
    private EditText s34;
    private EditText s35;
    private EditText s36;
    private EditText s37;
    private EditText s38;
    private EditText s39;
    private Button ok38, sv38, cb38;
    private TextView sgpa38;
    private TextView per38;
    private float cr, cr1, cr2, cr3, cr4, cr5, cr6, cr7, cr8;
    private String sem = "3rd semester";
    private int scheme = 2018;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem38);

        getSupportActionBar().setTitle(("SGPA 3rd Sem"));

        s31 = (EditText) findViewById(R.id.s31);
        s32 = (EditText) findViewById(R.id.s32);
        s33 = (EditText) findViewById(R.id.s33);
        s34 = (EditText) findViewById(R.id.s34);
        s35 = (EditText) findViewById(R.id.s35);
        s36 = (EditText) findViewById(R.id.s36);
        s37 = (EditText) findViewById(R.id.s37);
        s38 = (EditText) findViewById(R.id.s38);
        s39 = (EditText) findViewById(R.id.s39);
        sgpa38 = (TextView) findViewById(R.id.sgpa38);
        per38 = (TextView) findViewById(R.id.per38);
        ok38 = (Button) findViewById(R.id.ok38);
        sv38 = (Button) findViewById(R.id.sv38);
        cb38 = (Button) findViewById(R.id.cb38);


        s31.addTextChangedListener(new TextWatcher() {

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
                String strTest = s31.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 100) {
                        s31.setText(null);
                        Toast.makeText(sem38.this, "Enter a value less than 100", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });

        s32.addTextChangedListener(new TextWatcher() {

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
                String strTest = s32.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 100) {
                        s32.setText(null);
                        Toast.makeText(sem38.this, "Enter a value less than 100", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });

        s33.addTextChangedListener(new TextWatcher() {

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
                String strTest = s33.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 100) {
                        s33.setText(null);
                        Toast.makeText(sem38.this, "Enter a value less than 100", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });

        s34.addTextChangedListener(new TextWatcher() {

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
                String strTest = s34.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 100) {
                        s34.setText(null);
                        Toast.makeText(sem38.this, "Enter a value less than 100", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });

        s35.addTextChangedListener(new TextWatcher() {

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
                String strTest = s35.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 100) {
                        s35.setText(null);
                        Toast.makeText(sem38.this, "Enter a value less than 100", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });

        s36.addTextChangedListener(new TextWatcher() {

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
                String strTest = s36.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 100) {
                        s36.setText(null);
                        Toast.makeText(sem38.this, "Enter a value less than 100", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });

        s37.addTextChangedListener(new TextWatcher() {

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
                String strTest = s37.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 100) {
                        s37.setText(null);
                        Toast.makeText(sem38.this, "Enter a value less than 100", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });

        s38.addTextChangedListener(new TextWatcher() {

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
                String strTest = s38.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 100) {
                        s38.setText(null);
                        Toast.makeText(sem38.this, "Enter a value less than 100", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });

        s39.addTextChangedListener(new TextWatcher() {

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
                String strTest = s39.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 100) {
                        s39.setText(null);
                        Toast.makeText(sem38.this, "Enter a value less than 100", Toast.LENGTH_LONG).show();

                    }

                }

            }
        });
        ok38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((s31.getText().toString().trim().length() <= 0) || (s32.getText().toString().trim().length() <= 0) || (s33.getText().toString().trim().length() <= 0) || (s34.getText().toString().trim().length() <= 0) || (s35.getText().toString().trim().length() <= 0) || (s36.getText().toString().trim().length() <= 0) || (s37.getText().toString().trim().length() <= 0) || (s38.getText().toString().trim().length() <= 0) || (s39.getText().toString().trim().length() <= 0)) {
                    View layout = LayoutInflater.from(sem38.this).inflate(R.layout.custom_toast, (ViewGroup) findViewById(R.id.linlayContainer));
                    TextView tv = (TextView) layout.findViewById(R.id.txtMsg);
                    tv.setText("All fields are mandatory");
                    Toast toast = new Toast(sem38.this);
                    toast.setGravity(Gravity.CENTER_VERTICAL, 0, 100);
                    toast.setDuration(Toast.LENGTH_SHORT);
                    toast.setView(layout);
                    toast.show();
                } else {
                    float sub1 = Float.parseFloat(s31.getText().toString());
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
                    float sub2 = Float.parseFloat(s32.getText().toString());
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
                    float sub3 = Float.parseFloat(s33.getText().toString());
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
                    float sub4 = Float.parseFloat(s34.getText().toString());
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
                    float sub5 = Float.parseFloat(s35.getText().toString());
                    if (sub5 < 40) {
                        cr4 = 0;
                    } else if (sub5 >= 40 && sub5 < 45) {
                        cr4 = 4;
                    } else if (sub5 >= 45 && sub5 < 50) {
                        cr4 = 5;
                    } else if (sub5 >= 50 && sub5 < 60) {
                        cr4 = 6;
                    } else if (sub5 >= 60 && sub5 < 70) {
                        cr4 = 7;
                    } else if (sub5 >= 70 && sub5 < 80) {
                        cr4 = 8;
                    } else if (sub5 >= 80 && sub5 < 90) {
                        cr4 = 9;
                    } else if (sub5 >= 90 && sub5 <= 100) {
                        cr4 = 10;
                    }
                    float sub6 = Float.parseFloat(s36.getText().toString());
                    if (sub6 < 40) {
                        cr5 = 0;
                    } else if (sub6 >= 40 && sub6 < 45) {
                        cr5 = 4;
                    } else if (sub6 >= 45 && sub6 < 50) {
                        cr5 = 5;
                    } else if (sub6 >= 50 && sub6 < 60) {
                        cr5 = 6;
                    } else if (sub6 >= 60 && sub6 < 70) {
                        cr5 = 7;
                    } else if (sub6 >= 70 && sub6 < 80) {
                        cr5 = 8;
                    } else if (sub6 >= 80 && sub6 < 90) {
                        cr5 = 9;
                    } else if (sub6 >= 90 && sub6 <= 100) {
                        cr5 = 10;
                    }
                    float sub7 = Float.parseFloat(s37.getText().toString());
                    if (sub7 < 40) {
                        cr6 = 0;
                    } else if (sub7 >= 40 && sub7 < 45) {
                        cr6 = 4;
                    } else if (sub7 >= 45 && sub7 < 50) {
                        cr6 = 5;
                    } else if (sub7 >= 50 && sub7 < 60) {
                        cr6 = 6;
                    } else if (sub7 >= 60 && sub7 < 70) {
                        cr6 = 7;
                    } else if (sub7 >= 70 && sub7 < 80) {
                        cr6 = 8;
                    } else if (sub7 >= 80 && sub7 < 90) {
                        cr6 = 9;
                    } else if (sub7 >= 90 && sub7 <= 100) {
                        cr6 = 10;
                    }
                    float sub8 = Float.parseFloat(s38.getText().toString());
                    if (sub8 < 40) {
                        cr7 = 0;
                    } else if (sub8 >= 40 && sub8 < 45) {
                        cr7 = 4;
                    } else if (sub8 >= 45 && sub8 < 50) {
                        cr7 = 5;
                    } else if (sub8 >= 50 && sub8 < 60) {
                        cr7 = 6;
                    } else if (sub8 >= 60 && sub8 < 70) {
                        cr7 = 7;
                    } else if (sub8 >= 70 && sub8 < 80) {
                        cr7 = 8;
                    } else if (sub8 >= 80 && sub8 < 90) {
                        cr7 = 9;
                    } else if (sub8 >= 90 && sub8 <= 100) {
                        cr7 = 10;
                    }
                    float sub9 = Float.parseFloat(s39.getText().toString());
                    if (sub8 < 40) {
                        cr8 = 0;
                    } else if (sub8 >= 40 && sub8 < 45) {
                        cr8 = 4;
                    } else if (sub8 >= 45 && sub8 < 50) {
                        cr8 = 5;
                    } else if (sub8 >= 50 && sub8 < 60) {
                        cr8 = 6;
                    } else if (sub8 >= 60 && sub8 < 70) {
                        cr8 = 7;
                    } else if (sub8 >= 70 && sub8 < 80) {
                        cr8 = 8;
                    } else if (sub8 >= 80 && sub8 < 90) {
                        cr8 = 9;
                    } else if (sub8 >= 90 && sub8 <= 100) {
                        cr8 = 10;
                    }
                    double result = ((cr * 3) + (cr1 * 4) + (cr2 * 3) + (cr3 * 3) + (cr4 * 3) + (cr5 * 3) + (cr6 * 2) + (cr7 * 2) + (cr8 * 1)) / 24;
                    sgpa38.setText(String.format("%.2f", result) + " /10");
                    double per = (sub1 + sub2 + sub3 + sub4 + sub5 + sub6 + sub7 + sub8 + sub9) / 9;
                    per38.setText(String.format("%.2f", per) + " %");
                }

                if (!sgpa38.getText().toString().equals("")) {
                    sv38.setVisibility(View.VISIBLE);
                    cb38.setVisibility(View.VISIBLE);
                }
            }
        });

        cb38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sv38.setVisibility(View.GONE);
                cb38.setVisibility(View.GONE);
                s31.getText().clear();
                s32.getText().clear();
                s33.getText().clear();
                s34.getText().clear();
                s35.getText().clear();
                s36.getText().clear();
                s37.getText().clear();
                s38.getText().clear();
                s39.getText().clear();
                sgpa38.setText("");
                per38.setText("");


            }
        });
        sv38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dbmanager dm = new dbmanager(getApplicationContext());
                final SQLiteDatabase db = dm.getWritableDatabase();

                final EditText editText;

                final AlertDialog.Builder alert = new AlertDialog.Builder(sem38.this);
                alert.setMessage("Enter student Name");


                editText = new EditText(sem38.this);
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
                            Animation shake = AnimationUtils.loadAnimation(sem38.this, R.anim.shake);
                            editText.startAnimation(shake);
                            editText.setError("Please enter student name");
                        } else {
                            ContentValues cv = new ContentValues();
                            cv.put("sname", value);
                            cv.put("semester", sem);
                            cv.put("sgpa", sgpa38.getText().toString());
                            cv.put("percent", per38.getText().toString());
                            cv.put("schemes", scheme);
                            long i = db.insert("Sgpa", null, cv);
                            if (i == -1) {
                                editText.setError("This name already exists. Enter another name.");
                            } else {
                                Toast.makeText(sem38.this, "data inserted successfully", Toast.LENGTH_SHORT).show();
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

