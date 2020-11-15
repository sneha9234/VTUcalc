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

public class phy2 extends AppCompatActivity {

    private EditText editText44;
    private EditText editText45;
    private EditText editText46;
    private EditText editText47;
    private EditText editText48;
    private EditText editText49;
    private EditText editText50;
    private Button button24, s09, cb09;
    private TextView textView112;
    private TextView textView115;
    private float cr, cr1, cr2, cr3, cr4, cr5, cr6;
    private String sem = "2nd semester (physics cycle)";
    private int scheme = 2017;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phy2);

        getSupportActionBar().setTitle(("2nd Sem Physics cycle"));

        editText44 = (EditText) findViewById(R.id.editText44);
        editText45 = (EditText) findViewById(R.id.editText45);
        editText46 = (EditText) findViewById(R.id.editText46);
        editText47 = (EditText) findViewById(R.id.editText47);
        editText48 = (EditText) findViewById(R.id.editText48);
        editText49 = (EditText) findViewById(R.id.editText49);
        editText50 = (EditText) findViewById(R.id.editText50);
        textView112 = (TextView) findViewById(R.id.textView112);
        textView115 = (TextView) findViewById(R.id.textView115);
        button24 = (Button) findViewById(R.id.button24);
        s09 = (Button) findViewById(R.id.s09);
        cb09 = (Button) findViewById(R.id.cb09);

        editText44.addTextChangedListener(new TextWatcher() {

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
                String strTest = editText44.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 100) {
                        editText44.setText(null);
                        Toast.makeText(phy2.this, "Enter a value less than 100", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });

        editText45.addTextChangedListener(new TextWatcher() {

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
                String strTest = editText45.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 100) {
                        editText45.setText(null);
                        Toast.makeText(phy2.this, "Enter a value less than 100", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });

        editText46.addTextChangedListener(new TextWatcher() {

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
                String strTest = editText46.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 100) {
                        editText46.setText(null);
                        Toast.makeText(phy2.this, "Enter a value less than 100", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });

        editText47.addTextChangedListener(new TextWatcher() {

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
                String strTest = editText47.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 100) {
                        editText47.setText(null);
                        Toast.makeText(phy2.this, "Enter a value less than 100", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });

        editText48.addTextChangedListener(new TextWatcher() {

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
                String strTest = editText48.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 100) {
                        editText48.setText(null);
                        Toast.makeText(phy2.this, "Enter a value less than 100", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });

        editText49.addTextChangedListener(new TextWatcher() {

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
                String strTest = editText49.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 100) {
                        editText49.setText(null);
                        Toast.makeText(phy2.this, "Enter a value less than 100", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });

        editText50.addTextChangedListener(new TextWatcher() {

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
                String strTest = editText50.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 100) {
                        editText50.setText(null);
                        Toast.makeText(phy2.this, "Enter a value less than 100", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });

        button24.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if ((editText44.getText().toString().trim().length() <= 0) || (editText45.getText().toString().trim().length() <= 0) || (editText46.getText().toString().trim().length() <= 0) || (editText47.getText().toString().trim().length() <= 0) || (editText48.getText().toString().trim().length() <= 0) || (editText49.getText().toString().trim().length() <= 0) || (editText50.getText().toString().trim().length() <= 0)) {
                    View layout = LayoutInflater.from(phy2.this).inflate(R.layout.custom_toast, (ViewGroup) findViewById(R.id.linlayContainer));
                    TextView tv = (TextView) layout.findViewById(R.id.txtMsg);
                    tv.setText("All fields are mandatory");
                    Toast toast = new Toast(phy2.this);
                    toast.setGravity(Gravity.CENTER_VERTICAL, 0, 100);
                    toast.setDuration(Toast.LENGTH_SHORT);
                    toast.setView(layout);
                    toast.show();
                } else {
                    float mat = Float.parseFloat(editText44.getText().toString());
                    if (mat < 40) {
                        cr = 0;
                    } else if (mat >= 40 && mat < 45) {
                        cr = 4;
                    } else if (mat >= 45 && mat < 50) {
                        cr = 5;
                    } else if (mat >= 50 && mat < 60) {
                        cr = 6;
                    } else if (mat >= 60 && mat < 70) {
                        cr = 7;
                    } else if (mat >= 70 && mat < 80) {
                        cr = 8;
                    } else if (mat >= 80 && mat < 90) {
                        cr = 9;
                    } else if (mat >= 90 && mat <= 100) {
                        cr = 10;
                    }
                    float phy = Float.parseFloat(editText45.getText().toString());
                    if (phy < 40) {
                        cr1 = 0;
                    } else if (phy >= 40 && phy < 45) {
                        cr1 = 4;
                    } else if (phy >= 45 && phy < 50) {
                        cr1 = 5;
                    } else if (phy >= 50 && phy < 60) {
                        cr1 = 6;
                    } else if (phy >= 60 && phy < 70) {
                        cr1 = 7;
                    } else if (phy >= 70 && phy < 80) {
                        cr1 = 8;
                    } else if (phy >= 80 && phy < 90) {
                        cr1 = 9;
                    } else if (phy >= 90 && phy <= 100) {
                        cr1 = 10;
                    }
                    float civ = Float.parseFloat(editText46.getText().toString());
                    if (civ < 40) {
                        cr2 = 0;
                    } else if (civ >= 40 && civ < 45) {
                        cr2 = 4;
                    } else if (civ >= 45 && civ < 50) {
                        cr2 = 5;
                    } else if (civ >= 50 && civ < 60) {
                        cr2 = 6;
                    } else if (civ >= 60 && civ < 70) {
                        cr2 = 7;
                    } else if (civ >= 70 && civ < 80) {
                        cr2 = 8;
                    } else if (civ >= 80 && civ < 90) {
                        cr2 = 9;
                    } else if (civ >= 90 && civ <= 100) {
                        cr2 = 10;
                    }
                    float eme = Float.parseFloat(editText47.getText().toString());
                    if (eme < 40) {
                        cr3 = 0;
                    } else if (eme >= 40 && eme < 45) {
                        cr3 = 4;
                    } else if (eme >= 45 && eme < 50) {
                        cr3 = 5;
                    } else if (eme >= 50 && eme < 60) {
                        cr3 = 6;
                    } else if (eme >= 60 && eme < 70) {
                        cr3 = 7;
                    } else if (eme >= 70 && eme < 80) {
                        cr3 = 8;
                    } else if (eme >= 80 && eme < 90) {
                        cr3 = 9;
                    } else if (eme >= 90 && eme <= 100) {
                        cr3 = 10;
                    }
                    float ele = Float.parseFloat(editText48.getText().toString());
                    if (ele < 40) {
                        cr4 = 0;
                    } else if (ele >= 40 && ele < 45) {
                        cr4 = 4;
                    } else if (ele >= 45 && ele < 50) {
                        cr4 = 5;
                    } else if (ele >= 50 && ele < 60) {
                        cr4 = 6;
                    } else if (ele >= 60 && ele < 70) {
                        cr4 = 7;
                    } else if (ele >= 70 && ele < 80) {
                        cr4 = 8;
                    } else if (ele >= 80 && ele < 90) {
                        cr4 = 9;
                    } else if (ele >= 90 && ele <= 100) {
                        cr4 = 10;
                    }
                    float wsl = Float.parseFloat(editText49.getText().toString());
                    if (wsl < 40) {
                        cr5 = 0;
                    } else if (wsl >= 40 && wsl < 45) {
                        cr5 = 4;
                    } else if (wsl >= 45 && wsl < 50) {
                        cr5 = 5;
                    } else if (wsl >= 50 && wsl < 60) {
                        cr5 = 6;
                    } else if (wsl >= 60 && wsl < 70) {
                        cr5 = 7;
                    } else if (wsl >= 70 && wsl < 80) {
                        cr5 = 8;
                    } else if (wsl >= 80 && wsl < 90) {
                        cr5 = 9;
                    } else if (wsl >= 90 && wsl <= 100) {
                        cr5 = 10;
                    }
                    float phyl = Float.parseFloat(editText50.getText().toString());
                    if (phyl < 40) {
                        cr6 = 0;
                    } else if (phyl >= 40 && phyl < 45) {
                        cr6 = 4;
                    } else if (phyl >= 45 && phyl < 50) {
                        cr6 = 5;
                    } else if (phyl >= 50 && phyl < 60) {
                        cr6 = 6;
                    } else if (phyl >= 60 && phyl < 70) {
                        cr6 = 7;
                    } else if (phyl >= 70 && phyl < 80) {
                        cr6 = 8;
                    } else if (phyl >= 80 && phyl < 90) {
                        cr6 = 9;
                    } else if (phyl >= 90 && phyl <= 100) {
                        cr6 = 10;
                    }
                    double result = ((cr * 4) + (cr1 * 4) + (cr2 * 4) + (cr3 * 4) + (cr4 * 4) + (cr5 * 2) + (cr6 * 2)) / 24;
                    textView112.setText(String.format("%.2f", result) + "/10");
                    double per = (mat + phy + civ + eme + ele + wsl + phyl) / 7;
                    textView115.setText(String.format("%.2f", per) + "%");
                }

                if (!textView112.getText().toString().equals("")) {
                    s09.setVisibility(View.VISIBLE);
                    cb09.setVisibility(View.VISIBLE);
                }
            }

        });

        cb09.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s09.setVisibility(View.GONE);
                cb09.setVisibility(View.GONE);
                editText44.getText().clear();
                editText45.getText().clear();
                editText46.getText().clear();
                editText47.getText().clear();
                editText48.getText().clear();
                editText49.getText().clear();
                editText50.getText().clear();
                textView112.setText("");
                textView115.setText("");


            }
        });
        s09.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dbmanager dm = new dbmanager(getApplicationContext());
                final SQLiteDatabase db = dm.getWritableDatabase();

                final EditText editText;

                final AlertDialog.Builder alert = new AlertDialog.Builder(phy2.this);
                alert.setMessage("Enter student Name");


                editText = new EditText(phy2.this);
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
                            Animation shake = AnimationUtils.loadAnimation(phy2.this, R.anim.shake);
                            editText.startAnimation(shake);
                            editText.setError("Please enter student name");
                        } else {
                            ContentValues cv = new ContentValues();
                            cv.put("sname", value);
                            cv.put("semester", sem);
                            cv.put("sgpa", textView112.getText().toString());
                            cv.put("percent", textView115.getText().toString());
                            cv.put("schemes", scheme);
                            long i = db.insert("Sgpa", null, cv);
                            if (i == -1) {
                                editText.setError("This name already exists. Enter another name.");
                            } else {
                                Toast.makeText(phy2.this, "data inserted successfully", Toast.LENGTH_SHORT).show();
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


