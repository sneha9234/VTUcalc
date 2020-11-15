package com.sneha.vtusgpaandcgpacalculator.cgpa2015;

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

public class cgpa55 extends AppCompatActivity {

    private EditText editText1855;
    private EditText editText1955;
    private EditText editText2055;
    private EditText editText2155;
    private EditText editText2255;
    private TextView textView5655;
    private TextView textView5755;
    private Button button2055;
    private Button clr55;
    private Button save55;
    private int no_of_sem = 5;
    private int scheme = 2015;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cgpa55);
        getSupportActionBar().setTitle(("CGPA"));

        editText1855 = (EditText) findViewById(R.id.editText1855);
        editText1955 = (EditText) findViewById(R.id.editText1955);
        editText2055 = (EditText) findViewById(R.id.editText2055);
        editText2155 = (EditText) findViewById(R.id.editText2155);
        editText2255 = (EditText) findViewById(R.id.editText2255);
        textView5655 = (TextView) findViewById(R.id.textView5655);
        textView5755 = (TextView) findViewById(R.id.textView5755);
        button2055 = (Button) findViewById(R.id.button2055);
        clr55 = (Button) findViewById(R.id.clr55);
        save55 = (Button) findViewById(R.id.save55);

        editText1855.addTextChangedListener(new TextWatcher() {

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
                String strTest = editText1855.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 10) {
                        editText1855.setText(null);
                        Toast.makeText(cgpa55.this, "enter a value less than 10", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });
        editText1955.addTextChangedListener(new TextWatcher() {

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
                String strTest = editText1955.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 10) {
                        editText1955.setText(null);
                        Toast.makeText(cgpa55.this, "enter a value less than 10", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });
        editText2055.addTextChangedListener(new TextWatcher() {

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
                String strTest = editText2055.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 10) {
                        editText2055.setText(null);
                        Toast.makeText(cgpa55.this, "enter a value less than 10", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });
        editText2155.addTextChangedListener(new TextWatcher() {

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
                String strTest = editText2155.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 10) {
                        editText2155.setText(null);
                        Toast.makeText(cgpa55.this, "enter a value less than 10", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });


        editText2255.addTextChangedListener(new TextWatcher() {

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
                String strTest = editText2255.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 10) {
                        editText2255.setText(null);
                        Toast.makeText(cgpa55.this, "enter a value less than 10", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });


        button2055.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((editText1855.getText().toString().trim().length() <= 0) || (editText1955.getText().toString().trim().length() <= 0) || (editText2055.getText().toString().trim().length() <= 0) || (editText2155.getText().toString().trim().length() <= 0) || (editText2255.getText().toString().trim().length() <= 0)) {
                    View layout = LayoutInflater.from(cgpa55.this).inflate(R.layout.custom_toast, (ViewGroup) findViewById(R.id.linlayContainer));
                    TextView tv = (TextView) layout.findViewById(R.id.txtMsg);
                    tv.setText("All fields are mandatory");
                    Toast toast = new Toast(cgpa55.this);
                    toast.setGravity(Gravity.CENTER_VERTICAL, 0, 100);
                    toast.setDuration(Toast.LENGTH_SHORT);
                    toast.setView(layout);
                    toast.show();
                } else {
                    float a = Float.parseFloat(editText1855.getText().toString());
                    float b = Float.parseFloat(editText1955.getText().toString());
                    float c = Float.parseFloat(editText2055.getText().toString());
                    float d = Float.parseFloat(editText2155.getText().toString());
                    float e = Float.parseFloat(editText2255.getText().toString());
                    double result = ((24 * a) + (24 * b) + (28 * c) + (28 * d) + (26 * e)) / 130;
                    double per = (result - 0.75) * 10;
                    textView5655.setText(String.format("%.2f", result) + " /10");
                    textView5755.setText(String.format("%.2f", per) + "%");
                }

                if (!textView5655.getText().toString().equals("")) {
                    save55.setVisibility(View.VISIBLE);
                    clr55.setVisibility(View.VISIBLE);
                }
            }

        });
        clr55.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText1855.getText().clear();
                editText1955.getText().clear();
                editText2055.getText().clear();
                editText2155.getText().clear();
                editText2255.getText().clear();
                textView5655.setText("");
                textView5755.setText("");
                button2055.setVisibility(View.VISIBLE);
                save55.setVisibility(View.GONE);
                clr55.setVisibility(View.GONE);

            }
        });
        save55.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dbmanager dm = new dbmanager(getApplicationContext());
                final SQLiteDatabase db = dm.getWritableDatabase();

                final EditText editText;

                final AlertDialog.Builder alert = new AlertDialog.Builder(cgpa55.this);
                alert.setMessage("Enter student Name");


                editText = new EditText(cgpa55.this);
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
                            Animation shake = AnimationUtils.loadAnimation(cgpa55.this, R.anim.shake);
                            editText.startAnimation(shake);
                            editText.setError("Please enter student name");
                        } else {
                            ContentValues cv = new ContentValues();
                            cv.put("cname", value);
                            cv.put("no_of_sems", no_of_sem);
                            cv.put("cgpa", textView5655.getText().toString());
                            cv.put("percentage", textView5755.getText().toString());
                            cv.put("schemec", scheme);
                            long i = db.insert("Cgpa", null, cv);
                            if (i == -1) {
                                editText.setError("This name already exists. Enter another name.");
                            } else {
                                Toast.makeText(cgpa55.this, "data inserted uccessfully", Toast.LENGTH_SHORT).show();
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



