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

public class chem2 extends AppCompatActivity {
    private EditText editText58;
    private EditText editText59;
    private EditText editText60;
    private EditText editText61;
    private EditText editText62;
    private EditText editText63;
    private EditText editText64;
    private Button button26, cb01, s01;
    private TextView textView154;
    private TextView textView155;
    private float c, c1, c2, c3, c4, c5, c6;
    private String sem = "2nd semester (chemistry cycle)";
    private int scheme = 2017;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chem2);

        getSupportActionBar().setTitle("2nd Sem Chemistry cycle");

        editText58 = (EditText) findViewById(R.id.editText58);
        editText59 = (EditText) findViewById(R.id.editText59);
        editText60 = (EditText) findViewById(R.id.editText60);
        editText61 = (EditText) findViewById(R.id.editText61);
        editText62 = (EditText) findViewById(R.id.editText62);
        editText63 = (EditText) findViewById(R.id.editText63);
        editText64 = (EditText) findViewById(R.id.editText64);
        textView154 = (TextView) findViewById(R.id.textView154);
        textView155 = (TextView) findViewById(R.id.textView155);
        button26 = (Button) findViewById(R.id.button26);
        s01 = (Button) findViewById(R.id.s01);
        cb01 = (Button) findViewById(R.id.cb01);

        editText58.addTextChangedListener(new TextWatcher() {

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
                String strTest = editText58.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 100) {
                        editText58.setText(null);
                        Toast.makeText(chem2.this, "Enter a value less than 100", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });

        editText59.addTextChangedListener(new TextWatcher() {

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
                String strTest = editText59.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 100) {
                        editText59.setText(null);
                        Toast.makeText(chem2.this, "Enter a value less than 100", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });

        editText60.addTextChangedListener(new TextWatcher() {

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
                String strTest = editText60.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 100) {
                        editText60.setText(null);
                        Toast.makeText(chem2.this, "Enter a value less than 100", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });

        editText61.addTextChangedListener(new TextWatcher() {

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
                String strTest = editText61.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 100) {
                        editText61.setText(null);
                        Toast.makeText(chem2.this, "Enter a value less than 100", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });

        editText62.addTextChangedListener(new TextWatcher() {

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
                String strTest = editText62.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 100) {
                        editText62.setText(null);
                        Toast.makeText(chem2.this, "Enter a value less than 100", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });

        editText63.addTextChangedListener(new TextWatcher() {

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
                String strTest = editText63.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 100) {
                        editText63.setText(null);
                        Toast.makeText(chem2.this, "Enter a value less than 100", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });

        editText64.addTextChangedListener(new TextWatcher() {

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
                String strTest = editText64.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 100) {
                        editText64.setText(null);
                        Toast.makeText(chem2.this, "Enter a value less than 100", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });

        button26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((editText58.getText().toString().trim().length() <= 0) || (editText59.getText().toString().trim().length() <= 0) || (editText60.getText().toString().trim().length() <= 0) || (editText61.getText().toString().trim().length() <= 0) || (editText62.getText().toString().trim().length() <= 0) || (editText63.getText().toString().trim().length() <= 0) || (editText64.getText().toString().trim().length() <= 0)) {
                    View layout = LayoutInflater.from(chem2.this).inflate(R.layout.custom_toast, (ViewGroup) findViewById(R.id.linlayContainer));
                    TextView tv = (TextView) layout.findViewById(R.id.txtMsg);
                    tv.setText("All fields are mandatory");
                    Toast toast = new Toast(chem2.this);
                    toast.setGravity(Gravity.CENTER_VERTICAL, 0, 100);
                    toast.setDuration(Toast.LENGTH_SHORT);
                    toast.setView(layout);
                    toast.show();
                } else {
                    float mat = Float.parseFloat(editText58.getText().toString());
                    if (mat < 40) {
                        c = 0;
                    } else if (mat >= 40 && mat < 45) {
                        c = 4;
                    } else if (mat >= 45 && mat < 50) {
                        c = 5;
                    } else if (mat >= 50 && mat < 60) {
                        c = 6;
                    } else if (mat >= 60 && mat < 70) {
                        c = 7;
                    } else if (mat >= 70 && mat < 80) {
                        c = 8;
                    } else if (mat >= 80 && mat < 90) {
                        c = 9;
                    } else if (mat >= 90 && mat <= 100) {
                        c = 10;
                    }
                    float che = Float.parseFloat(editText59.getText().toString());
                    if (che < 40) {
                        c1 = 0;
                    } else if (che >= 40 && che < 45) {
                        c1 = 4;
                    } else if (che >= 45 && che < 50) {
                        c1 = 5;
                    } else if (che >= 50 && che < 60) {
                        c1 = 6;
                    } else if (che >= 60 && che < 70) {
                        c1 = 7;
                    } else if (che >= 70 && che < 80) {
                        c1 = 8;
                    } else if (che >= 80 && che < 90) {
                        c1 = 9;
                    } else if (che >= 90 && che <= 100) {
                        c1 = 10;
                    }
                    float pcd = Float.parseFloat(editText60.getText().toString());
                    if (pcd < 40) {
                        c2 = 0;
                    } else if (pcd >= 40 && pcd < 45) {
                        c2 = 4;
                    } else if (pcd >= 45 && pcd < 50) {
                        c2 = 5;
                    } else if (pcd >= 50 && pcd < 60) {
                        c2 = 6;
                    } else if (pcd >= 60 && pcd < 70) {
                        c2 = 7;
                    } else if (pcd >= 70 && pcd < 80) {
                        c2 = 8;
                    } else if (pcd >= 80 && pcd < 90) {
                        c2 = 9;
                    } else if (pcd >= 90 && pcd <= 100) {
                        c2 = 10;
                    }
                    float ced = Float.parseFloat(editText61.getText().toString());
                    if (ced < 40) {
                        c3 = 0;
                    } else if (ced >= 40 && ced < 45) {
                        c3 = 4;
                    } else if (ced >= 45 && ced < 50) {
                        c3 = 5;
                    } else if (ced >= 50 && ced < 60) {
                        c3 = 6;
                    } else if (ced >= 60 && ced < 70) {
                        c3 = 7;
                    } else if (ced >= 70 && ced < 80) {
                        c3 = 8;
                    } else if (ced >= 80 && ced < 90) {
                        c3 = 9;
                    } else if (ced >= 90 && ced <= 100) {
                        c3 = 10;
                    }
                    float eln = Float.parseFloat(editText62.getText().toString());
                    if (eln < 40) {
                        c4 = 0;
                    } else if (eln >= 40 && eln < 45) {
                        c4 = 4;
                    } else if (eln >= 45 && eln < 50) {
                        c4 = 5;
                    } else if (eln >= 50 && eln < 60) {
                        c4 = 6;
                    } else if (eln >= 60 && eln < 70) {
                        c4 = 7;
                    } else if (eln >= 70 && eln < 80) {
                        c4 = 8;
                    } else if (eln >= 80 && eln < 90) {
                        c4 = 9;
                    } else if (eln >= 90 && eln <= 100) {
                        c4 = 10;
                    }
                    float cpl = Float.parseFloat(editText63.getText().toString());
                    if (cpl < 40) {
                        c5 = 0;
                    } else if (cpl >= 40 && cpl < 45) {
                        c5 = 4;
                    } else if (cpl >= 45 && cpl < 50) {
                        c5 = 5;
                    } else if (cpl >= 50 && cpl < 60) {
                        c5 = 6;
                    } else if (cpl >= 60 && cpl < 70) {
                        c5 = 7;
                    } else if (cpl >= 70 && cpl < 80) {
                        c5 = 8;
                    } else if (cpl >= 80 && cpl < 90) {
                        c5 = 9;
                    } else if (cpl >= 90 && cpl <= 100) {
                        c5 = 10;
                    }
                    float chel = Float.parseFloat(editText64.getText().toString());
                    if (chel < 40) {
                        c6 = 0;
                    } else if (chel >= 40 && chel < 45) {
                        c6 = 4;
                    } else if (chel >= 45 && chel < 50) {
                        c6 = 5;
                    } else if (chel >= 50 && chel < 60) {
                        c6 = 6;
                    } else if (chel >= 60 && chel < 70) {
                        c6 = 7;
                    } else if (chel >= 70 && chel < 80) {
                        c6 = 8;
                    } else if (chel >= 80 && chel < 90) {
                        c6 = 9;
                    } else if (chel >= 90 && chel <= 100) {
                        c6 = 10;
                    }
                    double result = ((c * 4) + (c1 * 4) + (c2 * 4) + (c3 * 4) + (c4 * 4) + (c5 * 2) + (c6 * 2)) / 24;
                    textView154.setText(String.format("%.2f", result) + " /10");
                    double per = (mat + che + pcd + ced + eln + cpl + chel) / 7;
                    textView155.setText(String.format("%.2f", per) + " %");
                }

                if (!textView154.getText().toString().equals("")) {
                    s01.setVisibility(View.VISIBLE);
                    cb01.setVisibility(View.VISIBLE);
                }
            }

        });

        cb01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s01.setVisibility(View.GONE);
                cb01.setVisibility(View.GONE);
                editText58.getText().clear();
                editText59.getText().clear();
                editText60.getText().clear();
                editText61.getText().clear();
                editText62.getText().clear();
                editText63.getText().clear();
                editText64.getText().clear();
                textView154.setText("");
                textView155.setText("");


            }
        });
        s01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dbmanager dm = new dbmanager(getApplicationContext());
                final SQLiteDatabase db = dm.getWritableDatabase();

                final EditText editText;

                final AlertDialog.Builder alert = new AlertDialog.Builder(chem2.this);
                alert.setMessage("Enter student Name");


                editText = new EditText(chem2.this);
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
                            Animation shake = AnimationUtils.loadAnimation(chem2.this, R.anim.shake);
                            editText.startAnimation(shake);
                            editText.setError("Please enter student name");
                        } else {
                            ContentValues cv = new ContentValues();
                            cv.put("sname", value);
                            cv.put("semester", sem);
                            cv.put("sgpa", textView154.getText().toString());
                            cv.put("percent", textView155.getText().toString());
                            cv.put("schemes", scheme);
                            long i = db.insert("Sgpa", null, cv);
                            if (i == -1) {
                                editText.setError("This name already exists. Enter another name.");
                            } else {
                                Toast.makeText(chem2.this, "data inserted successfully", Toast.LENGTH_SHORT).show();
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
