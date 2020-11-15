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

public class chem1 extends AppCompatActivity {
    private EditText editText51;
    private EditText editText52;
    private EditText editText53;
    private EditText editText54;
    private EditText editText55;
    private EditText editText56;
    private EditText editText57;
    private Button button25;
    private TextView textView127;
    private TextView textView128;
    float c, c1, c2, c3, c4, c5, c6;
    private Button cb, s;
    private String sem = "1st sem (chemistry cycle)";
    private int scheme = 2017;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chem1);

        getSupportActionBar().setTitle("1st Sem Chemistry cycle");

        editText51 = (EditText) findViewById(R.id.editText51);
        editText52 = (EditText) findViewById(R.id.editText52);
        editText53 = (EditText) findViewById(R.id.editText53);
        editText54 = (EditText) findViewById(R.id.editText54);
        editText55 = (EditText) findViewById(R.id.editText55);
        editText56 = (EditText) findViewById(R.id.editText56);
        editText57 = (EditText) findViewById(R.id.editText57);
        textView127 = (TextView) findViewById(R.id.textView127);
        textView128 = (TextView) findViewById(R.id.textView128);
        button25 = (Button) findViewById(R.id.button25);
        cb = (Button) findViewById(R.id.cb);
        s = (Button) findViewById(R.id.s);


        editText51.addTextChangedListener(new TextWatcher() {

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
                String strTest = editText51.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 100) {
                        editText51.setText(null);
                        Toast.makeText(chem1.this, "Enter a value less than 100", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });

        editText52.addTextChangedListener(new TextWatcher() {

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
                String strTest = editText52.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 100) {
                        editText52.setText(null);
                        Toast.makeText(chem1.this, "Enter a value less than 100", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });

        editText53.addTextChangedListener(new TextWatcher() {

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
                String strTest = editText53.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 100) {
                        editText53.setText(null);
                        Toast.makeText(chem1.this, "Enter a value less than 100", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });

        editText54.addTextChangedListener(new TextWatcher() {

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
                String strTest = editText54.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 100) {
                        editText54.setText(null);
                        Toast.makeText(chem1.this, "Enter a value less than 100", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });

        editText55.addTextChangedListener(new TextWatcher() {

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
                String strTest = editText55.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 100) {
                        editText55.setText(null);
                        Toast.makeText(chem1.this, "Enter a value less than 100", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });

        editText56.addTextChangedListener(new TextWatcher() {

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
                String strTest = editText56.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 100) {
                        editText56.setText(null);
                        Toast.makeText(chem1.this, "Enter a value less than 100", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });

        editText57.addTextChangedListener(new TextWatcher() {

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
                String strTest = editText57.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 100) {
                        editText57.setText(null);
                        Toast.makeText(chem1.this, "Enter a value less than 100", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });


        button25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((editText51.getText().toString().trim().length() <= 0) || (editText52.getText().toString().trim().length() <= 0) || (editText53.getText().toString().trim().length() <= 0) || (editText54.getText().toString().trim().length() <= 0) || (editText55.getText().toString().trim().length() <= 0) || (editText56.getText().toString().trim().length() <= 0) || (editText57.getText().toString().trim().length() <= 0)) {
                    View layout = LayoutInflater.from(chem1.this).inflate(R.layout.custom_toast, (ViewGroup) findViewById(R.id.linlayContainer));
                    TextView tv = (TextView) layout.findViewById(R.id.txtMsg);
                    tv.setText("All fields are mandatory");
                    Toast toast = new Toast(chem1.this);
                    toast.setGravity(Gravity.CENTER_VERTICAL, 0, 100);
                    toast.setDuration(Toast.LENGTH_SHORT);
                    toast.setView(layout);
                    toast.show();
                } else {
                    float mat = Float.parseFloat(editText51.getText().toString());
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
                    float che = Float.parseFloat(editText52.getText().toString());
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
                    float pcd = Float.parseFloat(editText53.getText().toString());
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
                    float ced = Float.parseFloat(editText54.getText().toString());
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
                    float eln = Float.parseFloat(editText55.getText().toString());
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
                    float cpl = Float.parseFloat(editText56.getText().toString());
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
                    float chel = Float.parseFloat(editText57.getText().toString());
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
                    textView127.setText(String.format("%.2f", result) + " /10");
                    double per = (mat + che + pcd + ced + eln + cpl + chel) / 7;
                    textView128.setText(String.format("%.2f", per) + " %");
                }

                if (!textView127.getText().toString().equals("")) {
                    s.setVisibility(View.VISIBLE);
                    cb.setVisibility(View.VISIBLE);
                }
            }


        });

        cb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s.setVisibility(View.GONE);
                cb.setVisibility(View.GONE);
                editText51.getText().clear();
                editText52.getText().clear();
                editText53.getText().clear();
                editText54.getText().clear();
                editText55.getText().clear();
                editText56.getText().clear();
                editText57.getText().clear();
                textView127.setText("");
                textView128.setText("");


            }
        });
        s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dbmanager dm = new dbmanager(getApplicationContext());
                final SQLiteDatabase db = dm.getWritableDatabase();

                final EditText editText;

                final AlertDialog.Builder alert = new AlertDialog.Builder(chem1.this);
                alert.setMessage("Enter student Name");


                editText = new EditText(chem1.this);
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
                            Animation shake = AnimationUtils.loadAnimation(chem1.this, R.anim.shake);
                            editText.startAnimation(shake);
                            editText.setError("Please enter student name");
                        } else {
                            ContentValues cv = new ContentValues();
                            cv.put("sname", value);
                            cv.put("semester", sem);
                            cv.put("sgpa", textView127.getText().toString());
                            cv.put("percent", textView128.getText().toString());
                            cv.put("schemes", scheme);
                            long i = db.insert("Sgpa", null, cv);
                            if (i == -1) {
                                editText.setError("This name already exists. Enter another name.");
                            } else {
                                Toast.makeText(chem1.this, "data inserted successfully", Toast.LENGTH_SHORT).show();
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