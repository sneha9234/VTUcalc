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

public class sem1phy8 extends AppCompatActivity {

    private EditText s18mat11p;
    private EditText s18phy12;
    private EditText s18ele13;
    private EditText s18civ14;
    private EditText s18egdl15;
    private EditText s18phyl16;
    private EditText s18elel17;
    private EditText s18egh18p;
    private Button oks1p8, ss1p8, cbs1p8;
    private TextView sgpas1p8;
    private TextView pers1p8;
    private float cr, cr1, cr2, cr3, cr4, cr5, cr6, cr7;
    private int scheme = 2018;
    private String sem = "1st Sem (physics cycle)";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem1phy8);

        getSupportActionBar().setTitle(("1st Sem Physics cycle"));

        s18mat11p = (EditText) findViewById(R.id.s18mat11p);
        s18phy12 = (EditText) findViewById(R.id.s18phy12);
        s18ele13 = (EditText) findViewById(R.id.s18ele13);
        s18civ14 = (EditText) findViewById(R.id.s18civ14);
        s18egdl15 = (EditText) findViewById(R.id.s18egdl15);
        s18phyl16 = (EditText) findViewById(R.id.s18phyl16);
        s18elel17 = (EditText) findViewById(R.id.s18elel17);
        s18egh18p = (EditText) findViewById(R.id.s18egh18p);
        sgpas1p8 = (TextView) findViewById(R.id.sgpas1p8);
        pers1p8 = (TextView) findViewById(R.id.pers1p8);
        oks1p8 = (Button) findViewById(R.id.oks1p8);
        ss1p8 = (Button) findViewById(R.id.ss1p8);
        cbs1p8 = (Button) findViewById(R.id.cbs1p8);

        s18mat11p.addTextChangedListener(new TextWatcher() {

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
                String strTest = s18mat11p.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 100) {
                        s18mat11p.setText(null);
                        Toast.makeText(sem1phy8.this, "Enter a value less than 100", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });

        s18phy12.addTextChangedListener(new TextWatcher() {

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
                String strTest = s18phy12.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 100) {
                        s18phy12.setText(null);
                        Toast.makeText(sem1phy8.this, "Enter a value less than 100", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });

        s18ele13.addTextChangedListener(new TextWatcher() {

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
                String strTest = s18ele13.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 100) {
                        s18ele13.setText(null);
                        Toast.makeText(sem1phy8.this, "Enter a value less than 100", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });
        s18civ14.addTextChangedListener(new TextWatcher() {

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
                String strTest = s18civ14.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 100) {
                        s18civ14.setText(null);
                        Toast.makeText(sem1phy8.this, "Enter a value less than 100", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });

        s18egdl15.addTextChangedListener(new TextWatcher() {

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
                String strTest = s18egdl15.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 100) {
                        s18egdl15.setText(null);
                        Toast.makeText(sem1phy8.this, "Enter a value less than 100", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });

        s18phyl16.addTextChangedListener(new TextWatcher() {

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
                String strTest = s18phyl16.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 100) {
                        s18phyl16.setText(null);
                        Toast.makeText(sem1phy8.this, "Enter a value less than 100", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });

        s18elel17.addTextChangedListener(new TextWatcher() {

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
                String strTest = s18elel17.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 100) {
                        s18elel17.setText(null);
                        Toast.makeText(sem1phy8.this, "Enter a value less than 100", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });

        s18egh18p.addTextChangedListener(new TextWatcher() {

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
                String strTest = s18egh18p.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 100) {
                        s18egh18p.setText(null);
                        Toast.makeText(sem1phy8.this, "Enter a value less than 100", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });


        oks1p8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if ((s18mat11p.getText().toString().trim().length() <= 0) || (s18phy12.getText().toString().trim().length() <= 0) || (s18ele13.getText().toString().trim().length() <= 0) || (s18civ14.getText().toString().trim().length() <= 0) || (s18egdl15.getText().toString().trim().length() <= 0) || (s18phyl16.getText().toString().trim().length() <= 0) || (s18elel17.getText().toString().trim().length() <= 0) || (s18egh18p.getText().toString().trim().length() <= 0)) {
                    View layout = LayoutInflater.from(sem1phy8.this).inflate(R.layout.custom_toast, (ViewGroup) findViewById(R.id.linlayContainer));
                    TextView tv = (TextView) layout.findViewById(R.id.txtMsg);
                    tv.setText("All fields are mandatory");
                    Toast toast = new Toast(sem1phy8.this);
                    toast.setGravity(Gravity.CENTER_VERTICAL, 0, 100);
                    toast.setDuration(Toast.LENGTH_SHORT);
                    toast.setView(layout);
                    toast.show();
                } else {
                    float sub1 = Float.parseFloat(s18mat11p.getText().toString());
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
                    float sub2 = Float.parseFloat(s18phy12.getText().toString());
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
                    float sub3 = Float.parseFloat(s18ele13.getText().toString());
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
                    float sub4 = Float.parseFloat(s18civ14.getText().toString());
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
                    float sub5 = Float.parseFloat(s18egdl15.getText().toString());
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
                    float sub6 = Float.parseFloat(s18phyl16.getText().toString());
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
                    float sub7 = Float.parseFloat(s18elel17.getText().toString());
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
                    float sub8 = Float.parseFloat(s18egh18p.getText().toString());
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

                    double result = ((cr * 4) + (cr1 * 4) + (cr2 * 3) + (cr3 * 3) + (cr4 * 3) + (cr5 * 1) + (cr6 * 1) + (cr7 * 1)) / 20;
                    sgpas1p8.setText(String.format("%.2f", result) + " /10");
                    double per = (sub1 + sub2 + sub3 + sub4 + sub5 + sub6 + sub7 + sub8) / 8;
                    pers1p8.setText(String.format("%.2f", per) + " %");
                }

                if (!sgpas1p8.getText().toString().equals("")) {
                    ss1p8.setVisibility(View.VISIBLE);
                    cbs1p8.setVisibility(View.VISIBLE);
                }
            }
        });

        cbs1p8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ss1p8.setVisibility(View.GONE);
                cbs1p8.setVisibility(View.GONE);
                s18mat11p.getText().clear();
                s18phy12.getText().clear();
                s18ele13.getText().clear();
                s18civ14.getText().clear();
                s18egdl15.getText().clear();
                s18phyl16.getText().clear();
                s18elel17.getText().clear();
                s18egh18p.getText().clear();
                sgpas1p8.setText("");
                pers1p8.setText("");


            }
        });
        ss1p8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dbmanager dm = new dbmanager(getApplicationContext());
                final SQLiteDatabase db = dm.getWritableDatabase();

                final EditText editText;

                final AlertDialog.Builder alert = new AlertDialog.Builder(sem1phy8.this);
                alert.setMessage("Enter student Name");


                editText = new EditText(sem1phy8.this);
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
                            Animation shake = AnimationUtils.loadAnimation(sem1phy8.this, R.anim.shake);
                            editText.startAnimation(shake);
                            editText.setError("Please enter student name");
                        } else {
                            ContentValues cv = new ContentValues();
                            cv.put("sname", value);
                            cv.put("semester", sem);
                            cv.put("sgpa", sgpas1p8.getText().toString());
                            cv.put("percent", pers1p8.getText().toString());
                            cv.put("schemes", scheme);
                            long i = db.insert("Sgpa", null, cv);
                            if (i == -1) {
                                editText.setError("This name already exists. Enter another name.");
                            } else {
                                Toast.makeText(sem1phy8.this, "data inserted successfully", Toast.LENGTH_SHORT).show();
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


