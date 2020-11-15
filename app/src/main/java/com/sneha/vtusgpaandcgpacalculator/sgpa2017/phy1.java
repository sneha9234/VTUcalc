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

public class phy1 extends AppCompatActivity {

    private Button button16, s08, cb08;
    private EditText editText;
    private EditText editText1;
    private EditText editText2;
    private EditText editText3;
    private EditText editText4;
    private EditText editText5;
    private EditText editText6;
    private TextView editText7;
    private TextView editText8;
    private float cr, cr1, cr2, cr3, cr4, cr5, cr6;
    private int scheme = 2017;
    private String sem = "1st semester (physics cycle)";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phy1);

        getSupportActionBar().setTitle(("1st Sem Physics cycle"));

        editText = (EditText) findViewById(R.id.editText);
        editText1 = (EditText) findViewById(R.id.editText1);
        editText2 = (EditText) findViewById(R.id.editText2);
        editText3 = (EditText) findViewById(R.id.editText3);
        editText4 = (EditText) findViewById(R.id.editText4);
        editText5 = (EditText) findViewById(R.id.editText5);
        editText6 = (EditText) findViewById(R.id.editText6);
        editText7 = (TextView) findViewById(R.id.editText7);
        editText8 = (TextView) findViewById(R.id.editText8);
        button16 = (Button) findViewById(R.id.button16);
        s08 = (Button) findViewById(R.id.s08);
        cb08 = (Button) findViewById(R.id.cb08);

        editText1.addTextChangedListener(new TextWatcher() {

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
                String strTest = editText1.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 100) {
                        editText1.setText(null);
                        Toast.makeText(phy1.this, "Enter a value less than 100", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });

        editText2.addTextChangedListener(new TextWatcher() {

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
                String strTest = editText2.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 100) {
                        editText2.setText(null);
                        Toast.makeText(phy1.this, "Enter a value less than 100", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });

        editText3.addTextChangedListener(new TextWatcher() {

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
                String strTest = editText3.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 100) {
                        editText3.setText(null);
                        Toast.makeText(phy1.this, "Enter a value less than 100", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });

        editText4.addTextChangedListener(new TextWatcher() {

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
                String strTest = editText4.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 100) {
                        editText4.setText(null);
                        Toast.makeText(phy1.this, "Enter a value less than 100", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });

        editText5.addTextChangedListener(new TextWatcher() {

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
                String strTest = editText5.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 100) {
                        editText5.setText(null);
                        Toast.makeText(phy1.this, "Enter a value less than 100", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });

        editText6.addTextChangedListener(new TextWatcher() {

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
                String strTest = editText6.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 100) {
                        editText6.setText(null);
                        Toast.makeText(phy1.this, "Enter a value less than 100", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });

        button16.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if ((editText.getText().toString().trim().length() <= 0) || (editText1.getText().toString().trim().length() <= 0) || (editText2.getText().toString().trim().length() <= 0) || (editText3.getText().toString().trim().length() <= 0) || (editText4.getText().toString().trim().length() <= 0) || (editText5.getText().toString().trim().length() <= 0) || (editText6.getText().toString().trim().length() <= 0)) {
                    View layout = LayoutInflater.from(phy1.this).inflate(R.layout.custom_toast, (ViewGroup) findViewById(R.id.linlayContainer));
                    TextView tv = (TextView) layout.findViewById(R.id.txtMsg);
                    tv.setText("All fields are mandatory");
                    Toast toast = new Toast(phy1.this);
                    toast.setGravity(Gravity.CENTER_VERTICAL, 0, 100);
                    toast.setDuration(Toast.LENGTH_SHORT);
                    toast.setView(layout);
                    toast.show();
                } else {
                    float mat = Float.parseFloat(editText.getText().toString());
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
                    float phy = Float.parseFloat(editText1.getText().toString());
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
                    float civ = Float.parseFloat(editText2.getText().toString());
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
                    float eme = Float.parseFloat(editText3.getText().toString());
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
                    float ele = Float.parseFloat(editText4.getText().toString());
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
                    float wsl = Float.parseFloat(editText5.getText().toString());
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
                    float phyl = Float.parseFloat(editText6.getText().toString());
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
                    editText7.setText(String.format("%.2f", result) + "/10");
                    double per = (mat + phy + civ + eme + ele + wsl + phyl) / 7;
                    editText8.setText(String.format("%.2f", per) + "%");
                }

                if (!editText7.getText().toString().equals("")) {
                    s08.setVisibility(View.VISIBLE);
                    cb08.setVisibility(View.VISIBLE);
                }
            }

        });


        cb08.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s08.setVisibility(View.GONE);
                cb08.setVisibility(View.GONE);
                editText.getText().clear();
                editText1.getText().clear();
                editText2.getText().clear();
                editText3.getText().clear();
                editText4.getText().clear();
                editText5.getText().clear();
                editText6.getText().clear();
                editText7.setText("");
                editText8.setText("");


            }
        });
        s08.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dbmanager dm = new dbmanager(getApplicationContext());
                final SQLiteDatabase db = dm.getWritableDatabase();

                final EditText editText;

                final AlertDialog.Builder alert = new AlertDialog.Builder(phy1.this);
                alert.setMessage("Enter student Name");


                editText = new EditText(phy1.this);
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
                            Animation shake = AnimationUtils.loadAnimation(phy1.this, R.anim.shake);
                            editText.startAnimation(shake);
                            editText.setError("Please enter student name");
                        } else {
                            ContentValues cv = new ContentValues();
                            cv.put("sname", value);
                            cv.put("semester", sem);
                            cv.put("sgpa", editText7.getText().toString());
                            cv.put("percent", editText8.getText().toString());
                            cv.put("schemes", scheme);
                            long i = db.insert("Sgpa", null, cv);
                            if (i == -1) {
                                editText.setError("This name already exists. Enter another name.");
                            } else {
                                Toast.makeText(phy1.this, "data inserted successfully", Toast.LENGTH_SHORT).show();
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
