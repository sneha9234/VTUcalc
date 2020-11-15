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

public class cgpa45 extends AppCompatActivity {

    private EditText editText1445;
    private EditText editText1545;
    private EditText editText1645;
    private EditText editText1745;
    private Button button1945;
    private Button clr45;
    private TextView textView4745;
    private TextView textView4845;
    private Button save45;
    private int no_of_sem = 4;
    private int scheme = 2015;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cgpa45);
        getSupportActionBar().setTitle(("CGPA"));

        editText1445 = (EditText) findViewById(R.id.editText1445);
        editText1545 = (EditText) findViewById(R.id.editText1545);
        editText1645 = (EditText) findViewById(R.id.editText1645);
        editText1745 = (EditText) findViewById(R.id.editText1745);
        textView4745 = (TextView) findViewById(R.id.textView4745);
        textView4845 = (TextView) findViewById(R.id.textView4845);
        button1945 = (Button) findViewById(R.id.button1945);
        clr45 = (Button) findViewById(R.id.clr45);
        save45 = (Button) findViewById(R.id.save45);


        editText1445.addTextChangedListener(new TextWatcher() {

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
                String strTest = editText1445.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 10) {
                        editText1445.setText(null);
                        Toast.makeText(cgpa45.this, "enter a value less than 10", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });
        editText1545.addTextChangedListener(new TextWatcher() {

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
                String strTest = editText1545.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 10) {
                        editText1545.setText(null);
                        Toast.makeText(cgpa45.this, "enter a value less than 10", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });
        editText1645.addTextChangedListener(new TextWatcher() {

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
                String strTest = editText1645.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 10) {
                        editText1645.setText(null);
                        Toast.makeText(cgpa45.this, "enter a value less than 10", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });

        editText1745.addTextChangedListener(new TextWatcher() {

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
                String strTest = editText1745.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 10) {
                        editText1745.setText(null);
                        Toast.makeText(cgpa45.this, "enter a value less than 10", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });


        button1945.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((editText1445.getText().toString().trim().length() <= 0) || (editText1545.getText().toString().trim().length() <= 0) || (editText1645.getText().toString().trim().length() <= 0) || (editText1745.getText().toString().trim().length() <= 0)) {
                    View layout = LayoutInflater.from(cgpa45.this).inflate(R.layout.custom_toast, (ViewGroup) findViewById(R.id.linlayContainer));
                    TextView tv = (TextView) layout.findViewById(R.id.txtMsg);
                    tv.setText("All fields are mandatory");
                    Toast toast = new Toast(cgpa45.this);
                    toast.setGravity(Gravity.CENTER_VERTICAL, 0, 100);
                    toast.setDuration(Toast.LENGTH_SHORT);
                    toast.setView(layout);
                    toast.show();
                } else {
                    float a = Float.parseFloat(editText1445.getText().toString());
                    float b = Float.parseFloat(editText1545.getText().toString());
                    float c = Float.parseFloat(editText1645.getText().toString());
                    float d = Float.parseFloat(editText1745.getText().toString());
                    double result = ((24 * a) + (24 * b) + (28 * c) + (28 * d)) / 104;
                    double per = (result - 0.75) * 10;
                    textView4745.setText(String.format("%.2f", result) + " /10");
                    textView4845.setText(String.format("%.2f", per) + "%");
                }

                if (!textView4745.getText().toString().equals("")) {
                    save45.setVisibility(View.VISIBLE);
                    clr45.setVisibility(View.VISIBLE);
                }
            }

        });

        clr45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText1445.getText().clear();
                editText1545.getText().clear();
                editText1645.getText().clear();
                editText1745.getText().clear();
                textView4745.setText("");
                textView4845.setText("");
                button1945.setVisibility(View.VISIBLE);
                save45.setVisibility(View.GONE);
                clr45.setVisibility(View.GONE);


            }
        });
        save45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dbmanager dm = new dbmanager(getApplicationContext());
                final SQLiteDatabase db = dm.getWritableDatabase();

                final EditText editText;

                final AlertDialog.Builder alert = new AlertDialog.Builder(cgpa45.this);
                alert.setMessage("Enter student Name");


                editText = new EditText(cgpa45.this);
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
                            Animation shake = AnimationUtils.loadAnimation(cgpa45.this, R.anim.shake);
                            editText.startAnimation(shake);
                            editText.setError("Please enter student name");
                        } else {
                            ContentValues cv = new ContentValues();
                            cv.put("cname", value);
                            cv.put("no_of_sems", no_of_sem);
                            cv.put("cgpa", textView4745.getText().toString());
                            cv.put("percentage", textView4845.getText().toString());
                            cv.put("schemec", scheme);
                            long i = db.insert("Cgpa", null, cv);
                            if (i == -1) {
                                editText.setError("This name already exists. Enter another name.");
                            } else {
                                Toast.makeText(cgpa45.this, "data inserted successfully", Toast.LENGTH_SHORT).show();
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

        });

    }

}





