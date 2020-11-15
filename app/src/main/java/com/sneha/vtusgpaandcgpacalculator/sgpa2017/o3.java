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

public class o3 extends AppCompatActivity {

    private EditText editText74;
    private EditText editText75;
    private EditText editText76;
    private EditText editText77;
    private EditText editText78;
    private EditText editText79;
    private EditText editText80;
    private EditText editText81;
    private EditText editText82;
    private Button button28, s02, cb02;
    private TextView textView181;
    private TextView textView182;
    private float cr, cr1, cr2, cr3, cr4, cr5, cr6, cr7, cr8;
    private String sem = "3rd semester";
    private int scheme = 2017;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_o3);

        getSupportActionBar().setTitle(("SGPA 3rd Sem"));

        editText74 = (EditText) findViewById(R.id.editText74);
        editText75 = (EditText) findViewById(R.id.editText75);
        editText76 = (EditText) findViewById(R.id.editText76);
        editText77 = (EditText) findViewById(R.id.editText77);
        editText78 = (EditText) findViewById(R.id.editText78);
        editText79 = (EditText) findViewById(R.id.editText79);
        editText80 = (EditText) findViewById(R.id.editText80);
        editText81 = (EditText) findViewById(R.id.editText81);
        editText82 = (EditText) findViewById(R.id.editText82);
        textView181 = (TextView) findViewById(R.id.textView181);
        textView182 = (TextView) findViewById(R.id.textView182);
        button28 = (Button) findViewById(R.id.button28);
        s02 = (Button) findViewById(R.id.s02);
        cb02 = (Button) findViewById(R.id.cb02);


        editText74.addTextChangedListener(new TextWatcher() {

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
                String strTest = editText74.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 100) {
                        editText74.setText(null);
                        Toast.makeText(o3.this, "Enter a value less than 100", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });

        editText75.addTextChangedListener(new TextWatcher() {

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
                String strTest = editText75.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 100) {
                        editText75.setText(null);
                        Toast.makeText(o3.this, "Enter a value less than 100", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });

        editText76.addTextChangedListener(new TextWatcher() {

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
                String strTest = editText76.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 100) {
                        editText76.setText(null);
                        Toast.makeText(o3.this, "Enter a value less than 100", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });

        editText77.addTextChangedListener(new TextWatcher() {

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
                String strTest = editText77.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 100) {
                        editText77.setText(null);
                        Toast.makeText(o3.this, "Enter a value less than 100", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });

        editText78.addTextChangedListener(new TextWatcher() {

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
                String strTest = editText78.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 100) {
                        editText78.setText(null);
                        Toast.makeText(o3.this, "Enter a value less than 100", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });

        editText79.addTextChangedListener(new TextWatcher() {

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
                String strTest = editText79.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 100) {
                        editText79.setText(null);
                        Toast.makeText(o3.this, "Enter a value less than 100", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });

        editText80.addTextChangedListener(new TextWatcher() {

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
                String strTest = editText80.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 100) {
                        editText80.setText(null);
                        Toast.makeText(o3.this, "Enter a value less than 100", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });

        editText81.addTextChangedListener(new TextWatcher() {

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
                String strTest = editText81.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 100) {
                        editText81.setText(null);
                        Toast.makeText(o3.this, "Enter a value less than 100", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });

        editText82.addTextChangedListener(new TextWatcher() {

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
                String strTest = editText82.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 50) {
                        editText82.setText(null);
                        Toast.makeText(o3.this, "Enter a value less than 50", Toast.LENGTH_LONG).show();

                    }

                }

            }
        });
        button28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((editText74.getText().toString().trim().length() <= 0) || (editText75.getText().toString().trim().length() <= 0) || (editText76.getText().toString().trim().length() <= 0) || (editText77.getText().toString().trim().length() <= 0) || (editText78.getText().toString().trim().length() <= 0) || (editText79.getText().toString().trim().length() <= 0) || (editText80.getText().toString().trim().length() <= 0) || (editText81.getText().toString().trim().length() <= 0) || (editText82.getText().toString().trim().length() <= 0)) {
                    View layout = LayoutInflater.from(o3.this).inflate(R.layout.custom_toast, (ViewGroup) findViewById(R.id.linlayContainer));
                    TextView tv = (TextView) layout.findViewById(R.id.txtMsg);
                    tv.setText("All fields are mandatory");
                    Toast toast = new Toast(o3.this);
                    toast.setGravity(Gravity.CENTER_VERTICAL, 0, 100);
                    toast.setDuration(Toast.LENGTH_SHORT);
                    toast.setView(layout);
                    toast.show();
                } else {
                    float sub1 = Float.parseFloat(editText74.getText().toString());
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
                    float sub2 = Float.parseFloat(editText75.getText().toString());
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
                    float sub3 = Float.parseFloat(editText76.getText().toString());
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
                    float sub4 = Float.parseFloat(editText77.getText().toString());
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
                    float sub5 = Float.parseFloat(editText78.getText().toString());
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
                    float sub6 = Float.parseFloat(editText79.getText().toString());
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
                    float sub7 = Float.parseFloat(editText80.getText().toString());
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
                    float sub8 = Float.parseFloat(editText81.getText().toString());
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
                    float sub9 = Float.parseFloat(editText82.getText().toString());
                    if ((sub9 * 2) < 40) {
                        cr8 = 0;
                    } else if (((sub9 * 2) >= 40) && ((sub9 * 2) < 45)) {
                        cr8 = 4;
                    } else if (((sub9 * 2) >= 45) && ((sub9 * 2) < 50)) {
                        cr8 = 5;
                    } else if (((sub9 * 2) >= 50) && ((sub9 * 2) < 60)) {
                        cr8 = 6;
                    } else if (((sub9 * 2) >= 60) && ((sub9 * 2) < 70)) {
                        cr8 = 7;
                    } else if (((sub9 * 2) >= 70) && ((sub9 * 2) < 80)) {
                        cr8 = 8;
                    } else if (((sub9 * 2) >= 80) && ((sub9 * 2) < 90)) {
                        cr8 = 9;
                    } else if (((sub9 * 2) >= 90) && ((sub9 * 2) <= 100)) {
                        cr8 = 10;
                    }
                    double result = ((cr * 4) + (cr1 * 4) + (cr2 * 4) + (cr3 * 4) + (cr4 * 4) + (cr5 * 3) + (cr6 * 2) + (cr7 * 2) + (cr8 * 1)) / 28;
                    textView181.setText(String.format("%.2f", result) + " /10");
                    double per = ((sub1 + sub2 + sub3 + sub4 + sub5 + sub6 + sub7 + sub8 + sub9) * 100) / 850;
                    textView182.setText(String.format("%.2f", per) + " %");
                }

                if (!textView181.getText().toString().equals("")) {
                    s02.setVisibility(View.VISIBLE);
                    cb02.setVisibility(View.VISIBLE);
                }
            }
        });

        cb02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s02.setVisibility(View.GONE);
                cb02.setVisibility(View.GONE);
                editText74.getText().clear();
                editText75.getText().clear();
                editText76.getText().clear();
                editText77.getText().clear();
                editText78.getText().clear();
                editText79.getText().clear();
                editText80.getText().clear();
                editText81.getText().clear();
                editText82.getText().clear();
                textView181.setText("");
                textView182.setText("");


            }
        });
        s02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dbmanager dm = new dbmanager(getApplicationContext());
                final SQLiteDatabase db = dm.getWritableDatabase();

                final EditText editText;

                final AlertDialog.Builder alert = new AlertDialog.Builder(o3.this);
                alert.setMessage("Enter student Name");


                editText = new EditText(o3.this);
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
                            Animation shake = AnimationUtils.loadAnimation(o3.this, R.anim.shake);
                            editText.startAnimation(shake);
                            editText.setError("Please enter student name");
                        } else {
                            ContentValues cv = new ContentValues();
                            cv.put("sname", value);
                            cv.put("semester", sem);
                            cv.put("sgpa", textView181.getText().toString());
                            cv.put("percent", textView182.getText().toString());
                            cv.put("schemes", scheme);
                            long i = db.insert("Sgpa", null, cv);
                            if (i == -1) {
                                editText.setError("This name already exists. Enter another name.");
                            } else {
                                Toast.makeText(o3.this, "data inserted successfully", Toast.LENGTH_SHORT).show();
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
