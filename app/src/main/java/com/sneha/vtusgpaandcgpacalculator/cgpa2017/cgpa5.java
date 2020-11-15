package com.sneha.vtusgpaandcgpacalculator.cgpa2017;

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
import com.sneha.vtusgpaandcgpacalculator.sqlitepackage.dbmanager;

public class cgpa5 extends AppCompatActivity {

    private EditText editText18;
    private EditText editText19;
    private EditText editText20;
    private EditText editText21;
    private EditText editText22;
    private TextView textView56;
    private TextView textView57;
    private Button button20;
    private Button clr4;
    private Button save4;
    private int no_of_sem = 5;
    private int scheme = 2017;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cgpa5);

        getSupportActionBar().setTitle(("CGPA"));

        editText18 = (EditText) findViewById(R.id.editText18);
        editText19 = (EditText) findViewById(R.id.editText19);
        editText20 = (EditText) findViewById(R.id.editText20);
        editText21 = (EditText) findViewById(R.id.editText21);
        editText22 = (EditText) findViewById(R.id.editText22);
        textView56 = (TextView) findViewById(R.id.textView56);
        textView57 = (TextView) findViewById(R.id.textView57);
        button20 = (Button) findViewById(R.id.button20);
        clr4 = (Button) findViewById(R.id.clr4);
        save4 = (Button) findViewById(R.id.save4);

        editText18.addTextChangedListener(new TextWatcher() {

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
                String strTest = editText18.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 10) {
                        editText18.setText(null);
                        Toast.makeText(cgpa5.this, "enter a value less than 10", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });
        editText19.addTextChangedListener(new TextWatcher() {

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
                String strTest = editText19.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 10) {
                        editText19.setText(null);
                        Toast.makeText(cgpa5.this, "enter a value less than 10", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });
        editText20.addTextChangedListener(new TextWatcher() {

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
                String strTest = editText20.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 10) {
                        editText20.setText(null);
                        Toast.makeText(cgpa5.this, "enter a value less than 10", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });
        editText21.addTextChangedListener(new TextWatcher() {

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
                String strTest = editText21.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 10) {
                        editText21.setText(null);
                        Toast.makeText(cgpa5.this, "enter a value less than 10", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });


        editText22.addTextChangedListener(new TextWatcher() {

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
                String strTest = editText22.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 10) {
                        editText22.setText(null);
                        Toast.makeText(cgpa5.this, "enter a value less than 10", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });


        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((editText18.getText().toString().trim().length() <= 0) || (editText19.getText().toString().trim().length() <= 0) || (editText20.getText().toString().trim().length() <= 0) || (editText21.getText().toString().trim().length() <= 0) || (editText22.getText().toString().trim().length() <= 0)) {
                    View layout = LayoutInflater.from(cgpa5.this).inflate(R.layout.custom_toast, (ViewGroup) findViewById(R.id.linlayContainer));
                    TextView tv = (TextView) layout.findViewById(R.id.txtMsg);
                    tv.setText("All fields are mandatory");
                    Toast toast = new Toast(cgpa5.this);
                    toast.setGravity(Gravity.CENTER_VERTICAL, 0, 100);
                    toast.setDuration(Toast.LENGTH_SHORT);
                    toast.setView(layout);
                    toast.show();
                } else {
                    float a = Float.parseFloat(editText18.getText().toString());
                    float b = Float.parseFloat(editText19.getText().toString());
                    float c = Float.parseFloat(editText20.getText().toString());
                    float d = Float.parseFloat(editText21.getText().toString());
                    float e = Float.parseFloat(editText22.getText().toString());
                    double result = ((24 * a) + (24 * b) + (28 * c) + (28 * d) + (26 * e)) / 130;
                    double per = (result - 0.75) * 10;
                    textView56.setText(String.format("%.2f", result) + " /10");
                    textView57.setText(String.format("%.2f", per) + "%");
                }

                if (!textView56.getText().toString().equals("")) {
                    save4.setVisibility(View.VISIBLE);
                    clr4.setVisibility(View.VISIBLE);
                }
            }

        });
        clr4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText18.getText().clear();
                editText19.getText().clear();
                editText20.getText().clear();
                editText21.getText().clear();
                editText22.getText().clear();
                textView56.setText("");
                textView57.setText("");
                button20.setVisibility(View.VISIBLE);
                save4.setVisibility(View.GONE);
                clr4.setVisibility(View.GONE);

            }
        });
        save4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dbmanager dm = new dbmanager(getApplicationContext());
                final SQLiteDatabase db = dm.getWritableDatabase();

                final EditText editText;

                final AlertDialog.Builder alert = new AlertDialog.Builder(cgpa5.this);
                alert.setMessage("Enter student Name");


                editText = new EditText(cgpa5.this);
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
                            Animation shake = AnimationUtils.loadAnimation(cgpa5.this, R.anim.shake);
                            editText.startAnimation(shake);
                            editText.setError("Please enter student name");

                        } else {
                            ContentValues cv = new ContentValues();
                            cv.put("cname", value);
                            cv.put("no_of_sems", no_of_sem);
                            cv.put("cgpa", textView56.getText().toString());
                            cv.put("percentage", textView57.getText().toString());
                            cv.put("schemec", scheme);
                            long i = db.insert("Cgpa", null, cv);
                            if (i == -1) {
                                editText.setError("This name already exists. Enter another name.");
                            } else {
                                Toast.makeText(cgpa5.this, "data inserted uccessfully", Toast.LENGTH_SHORT).show();
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


