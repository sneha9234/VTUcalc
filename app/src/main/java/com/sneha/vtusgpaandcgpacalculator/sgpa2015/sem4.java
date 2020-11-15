package com.sneha.vtusgpaandcgpacalculator.sgpa2015;

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

public class sem4 extends AppCompatActivity {

    private EditText editText74s4;
    private EditText editText75s4;
    private EditText editText76s4;
    private EditText editText77s4;
    private EditText editText78s4;
    private EditText editText79s4;
    private EditText editText80s4;
    private EditText editText81s4;

    private Button button28s4, s02s4, cb02s4;
    private TextView textView181s4;
    private TextView textView182s4;
    private float cr, cr1, cr2, cr3, cr4, cr5, cr6, cr7;
    private String sem = "4th semester";
    private int scheme = 2015;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem4);

        getSupportActionBar().setTitle(("SGPA 3rd Sem"));

        editText74s4 = (EditText) findViewById(R.id.editText74s4);
        editText75s4 = (EditText) findViewById(R.id.editText75s4);
        editText76s4 = (EditText) findViewById(R.id.editText76s4);
        editText77s4 = (EditText) findViewById(R.id.editText77s4);
        editText78s4 = (EditText) findViewById(R.id.editText78s4);
        editText79s4 = (EditText) findViewById(R.id.editText79s4);
        editText80s4 = (EditText) findViewById(R.id.editText80s4);
        editText81s4 = (EditText) findViewById(R.id.editText81s4);
        textView181s4 = (TextView) findViewById(R.id.textView181s4);
        textView182s4 = (TextView) findViewById(R.id.textView182s4);
        button28s4 = (Button) findViewById(R.id.button28s4);
        s02s4 = (Button) findViewById(R.id.s02s4);
        cb02s4 = (Button) findViewById(R.id.cb02s4);


        editText74s4.addTextChangedListener(new TextWatcher() {

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
                String strTest = editText74s4.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 100) {
                        editText74s4.setText(null);
                        Toast.makeText(sem4.this, "Enter a value less than 100", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });

        editText75s4.addTextChangedListener(new TextWatcher() {

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
                String strTest = editText75s4.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 100) {
                        editText75s4.setText(null);
                        Toast.makeText(sem4.this, "Enter a value less than 100", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });

        editText76s4.addTextChangedListener(new TextWatcher() {

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
                String strTest = editText76s4.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 100) {
                        editText76s4.setText(null);
                        Toast.makeText(sem4.this, "Enter a value less than 100", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });

        editText77s4.addTextChangedListener(new TextWatcher() {

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
                String strTest = editText77s4.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 100) {
                        editText77s4.setText(null);
                        Toast.makeText(sem4.this, "Enter a value less than 100", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });

        editText78s4.addTextChangedListener(new TextWatcher() {

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
                String strTest = editText78s4.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 100) {
                        editText78s4.setText(null);
                        Toast.makeText(sem4.this, "Enter a value less than 100", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });

        editText79s4.addTextChangedListener(new TextWatcher() {

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
                String strTest = editText79s4.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 100) {
                        editText79s4.setText(null);
                        Toast.makeText(sem4.this, "Enter a value less than 100", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });

        editText80s4.addTextChangedListener(new TextWatcher() {

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
                String strTest = editText80s4.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 100) {
                        editText80s4.setText(null);
                        Toast.makeText(sem4.this, "Enter a value less than 100", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });

        editText81s4.addTextChangedListener(new TextWatcher() {

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
                String strTest = editText81s4.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 100) {
                        editText81s4.setText(null);
                        Toast.makeText(sem4.this, "Enter a value less than 100", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });


        button28s4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((editText74s4.getText().toString().trim().length() <= 0) || (editText75s4.getText().toString().trim().length() <= 0) || (editText76s4.getText().toString().trim().length() <= 0) || (editText77s4.getText().toString().trim().length() <= 0) || (editText78s4.getText().toString().trim().length() <= 0) || (editText79s4.getText().toString().trim().length() <= 0) || (editText80s4.getText().toString().trim().length() <= 0) || (editText81s4.getText().toString().trim().length() <= 0)) {
                    View layout = LayoutInflater.from(sem4.this).inflate(R.layout.custom_toast, (ViewGroup) findViewById(R.id.linlayContainer));
                    TextView tv = (TextView) layout.findViewById(R.id.txtMsg);
                    tv.setText("All fields are mandatory");
                    Toast toast = new Toast(sem4.this);
                    toast.setGravity(Gravity.CENTER_VERTICAL, 0, 100);
                    toast.setDuration(Toast.LENGTH_SHORT);
                    toast.setView(layout);
                    toast.show();
                } else {
                    float sub1 = Float.parseFloat(editText74s4.getText().toString());
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
                    float sub2 = Float.parseFloat(editText75s4.getText().toString());
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
                    float sub3 = Float.parseFloat(editText76s4.getText().toString());
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
                    float sub4 = Float.parseFloat(editText77s4.getText().toString());
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
                    float sub5 = Float.parseFloat(editText78s4.getText().toString());
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
                    float sub6 = Float.parseFloat(editText79s4.getText().toString());
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
                    float sub7 = Float.parseFloat(editText80s4.getText().toString());
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
                    float sub8 = Float.parseFloat(editText81s4.getText().toString());
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

                    double result = ((cr * 4) + (cr1 * 4) + (cr2 * 4) + (cr3 * 4) + (cr4 * 4) + (cr5 * 4) + (cr6 * 2) + (cr7 * 2)) / 28;
                    textView181s4.setText(String.format("%.2f", result) + " /10");
                    double per = ((sub1 + sub2 + sub3 + sub4 + sub5 + sub6 + sub7 + sub8) * 100) / 800;
                    textView182s4.setText(String.format("%.2f", per) + " %");
                }

                if (!textView181s4.getText().toString().equals("")) {
                    s02s4.setVisibility(View.VISIBLE);
                    cb02s4.setVisibility(View.VISIBLE);
                }
            }
        });

        cb02s4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s02s4.setVisibility(View.GONE);
                cb02s4.setVisibility(View.GONE);
                editText74s4.getText().clear();
                editText75s4.getText().clear();
                editText76s4.getText().clear();
                editText77s4.getText().clear();
                editText78s4.getText().clear();
                editText79s4.getText().clear();
                editText80s4.getText().clear();
                editText81s4.getText().clear();
                textView181s4.setText("");
                textView182s4.setText("");


            }
        });
        s02s4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dbmanager dm = new dbmanager(getApplicationContext());
                final SQLiteDatabase db = dm.getWritableDatabase();

                final EditText editText;

                final AlertDialog.Builder alert = new AlertDialog.Builder(sem4.this);
                alert.setMessage("Enter student Name");


                editText = new EditText(sem4.this);
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
                            Animation shake = AnimationUtils.loadAnimation(sem4.this, R.anim.shake);
                            editText.startAnimation(shake);
                            editText.setError("Please enter student name");
                        } else {
                            ContentValues cv = new ContentValues();
                            cv.put("sname", value);
                            cv.put("semester", sem);
                            cv.put("sgpa", textView181s4.getText().toString());
                            cv.put("percent", textView182s4.getText().toString());
                            cv.put("schemes", scheme);
                            long i = db.insert("Sgpa", null, cv);
                            if (i == -1) {
                                editText.setError("This name already exists. Enter another name.");
                            } else {
                                Toast.makeText(sem4.this, "data inserted successfully", Toast.LENGTH_SHORT).show();
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

