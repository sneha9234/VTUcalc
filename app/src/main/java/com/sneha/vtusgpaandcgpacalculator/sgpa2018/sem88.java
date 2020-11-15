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

public class sem88 extends AppCompatActivity {

    private EditText s81;
    private EditText s82;
    private EditText s83;
    private EditText s84;
    private EditText s85;
    private Button ok88, sv88, cb88;
    private TextView sgpa88;
    private TextView per88;
    private float cr, cr1, cr2, cr3, cr4;
    private String sem = "8th semester";
    private int scheme = 2018;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem88);

        getSupportActionBar().setTitle(("SGPA 8th Sem"));

        s81 = (EditText) findViewById(R.id.s81);
        s82 = (EditText) findViewById(R.id.s82);
        s83 = (EditText) findViewById(R.id.s83);
        s84 = (EditText) findViewById(R.id.s84);
        s85 = (EditText) findViewById(R.id.s85);
        sgpa88 = (TextView) findViewById(R.id.sgpa88);
        per88 = (TextView) findViewById(R.id.per88);
        ok88 = (Button) findViewById(R.id.ok88);
        sv88 = (Button) findViewById(R.id.sv88);
        cb88 = (Button) findViewById(R.id.cb88);


        s81.addTextChangedListener(new TextWatcher() {

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
                String strTest = s81.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 100) {
                        s81.setText(null);
                        Toast.makeText(sem88.this, "Enter a value less than 100", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });

        s82.addTextChangedListener(new TextWatcher() {

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
                String strTest = s82.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 100) {
                        s82.setText(null);
                        Toast.makeText(sem88.this, "Enter a value less than 100", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });

        s83.addTextChangedListener(new TextWatcher() {

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
                String strTest = s83.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 100) {
                        s83.setText(null);
                        Toast.makeText(sem88.this, "Enter a value less than 100", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });

        s84.addTextChangedListener(new TextWatcher() {

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
                String strTest = s84.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 100) {
                        s84.setText(null);
                        Toast.makeText(sem88.this, "Enter a value less than 100", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });

        s85.addTextChangedListener(new TextWatcher() {

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
                String strTest = s85.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 100) {
                        s85.setText(null);
                        Toast.makeText(sem88.this, "Enter a value less than 100", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });

        ok88.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((s81.getText().toString().trim().length() <= 0) || (s82.getText().toString().trim().length() <= 0) || (s83.getText().toString().trim().length() <= 0) || (s84.getText().toString().trim().length() <= 0) || (s85.getText().toString().trim().length() <= 0)) {
                    View layout = LayoutInflater.from(sem88.this).inflate(R.layout.custom_toast, (ViewGroup) findViewById(R.id.linlayContainer));
                    TextView tv = (TextView) layout.findViewById(R.id.txtMsg);
                    tv.setText("All fields are mandatory");
                    Toast toast = new Toast(sem88.this);
                    toast.setGravity(Gravity.CENTER_VERTICAL, 0, 100);
                    toast.setDuration(Toast.LENGTH_SHORT);
                    toast.setView(layout);
                    toast.show();
                } else {
                    float sub1 = Float.parseFloat(s81.getText().toString());
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
                    float sub2 = Float.parseFloat(s82.getText().toString());
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
                    float sub3 = Float.parseFloat(s83.getText().toString());
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
                    float sub4 = Float.parseFloat(s84.getText().toString());
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
                    float sub5 = Float.parseFloat(s85.getText().toString());
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

                    double result = ((cr * 3) + (cr1 * 3) + (cr2 * 8) + (cr3 * 1) + (cr4 * 3)) / 18;
                    sgpa88.setText(String.format("%.2f", result) + " /10");
                    double per = (sub1 + sub2 + sub3 + sub4 + sub5) / 5;
                    per88.setText(String.format("%.2f", per) + " %");
                }

                if (!sgpa88.getText().toString().equals("")) {
                    sv88.setVisibility(View.VISIBLE);
                    cb88.setVisibility(View.VISIBLE);
                }
            }
        });

        cb88.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sv88.setVisibility(View.GONE);
                cb88.setVisibility(View.GONE);
                s81.getText().clear();
                s82.getText().clear();
                s83.getText().clear();
                s84.getText().clear();
                s85.getText().clear();

                sgpa88.setText("");
                per88.setText("");


            }
        });
        sv88.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dbmanager dm = new dbmanager(getApplicationContext());
                final SQLiteDatabase db = dm.getWritableDatabase();

                final EditText editText;

                final AlertDialog.Builder alert = new AlertDialog.Builder(sem88.this);
                alert.setMessage("Enter student Name");


                editText = new EditText(sem88.this);
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
                            Animation shake = AnimationUtils.loadAnimation(sem88.this, R.anim.shake);
                            editText.startAnimation(shake);
                            editText.setError("Please enter student name");
                        } else {
                            ContentValues cv = new ContentValues();
                            cv.put("sname", value);
                            cv.put("semester", sem);
                            cv.put("sgpa", sgpa88.getText().toString());
                            cv.put("percent", per88.getText().toString());
                            cv.put("schemes", scheme);
                            long i = db.insert("Sgpa", null, cv);
                            if (i == -1) {
                                editText.setError("This name already exists. Enter another name.");
                            } else {
                                Toast.makeText(sem88.this, "data inserted successfully", Toast.LENGTH_SHORT).show();
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
