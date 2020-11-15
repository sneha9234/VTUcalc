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

public class cgpa4 extends AppCompatActivity {

    private EditText editText14;
    private EditText editText15;
    private EditText editText16;
    private EditText editText17;
    private Button button19;
    private Button clr3;
    private TextView textView47;
    private TextView textView48;
    private Button save3;
    private int no_of_sem = 4;
    private int scheme = 2017;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cgpa4);

        getSupportActionBar().setTitle(("CGPA"));

        editText14 = (EditText) findViewById(R.id.editText14);
        editText15 = (EditText) findViewById(R.id.editText15);
        editText16 = (EditText) findViewById(R.id.editText16);
        editText17 = (EditText) findViewById(R.id.editText17);
        textView47 = (TextView) findViewById(R.id.textView47);
        textView48 = (TextView) findViewById(R.id.textView48);
        button19 = (Button) findViewById(R.id.button19);
        clr3 = (Button) findViewById(R.id.clr3);
        save3 = (Button) findViewById(R.id.save3);


        editText14.addTextChangedListener(new TextWatcher() {

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
                String strTest = editText14.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 10) {
                        editText14.setText(null);
                        Toast.makeText(cgpa4.this, "enter a value less than 10", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });
        editText15.addTextChangedListener(new TextWatcher() {

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
                String strTest = editText15.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 10) {
                        editText15.setText(null);
                        Toast.makeText(cgpa4.this, "enter a value less than 10", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });
        editText16.addTextChangedListener(new TextWatcher() {

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
                String strTest = editText16.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 10) {
                        editText16.setText(null);
                        Toast.makeText(cgpa4.this, "enter a value less than 10", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });

        editText17.addTextChangedListener(new TextWatcher() {

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
                String strTest = editText17.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 10) {
                        editText17.setText(null);
                        Toast.makeText(cgpa4.this, "enter a value less than 10", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });


        button19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((editText14.getText().toString().trim().length() <= 0) || (editText15.getText().toString().trim().length() <= 0) || (editText16.getText().toString().trim().length() <= 0) || (editText17.getText().toString().trim().length() <= 0)) {
                    View layout = LayoutInflater.from(cgpa4.this).inflate(R.layout.custom_toast, (ViewGroup) findViewById(R.id.linlayContainer));
                    TextView tv = (TextView) layout.findViewById(R.id.txtMsg);
                    tv.setText("All fields are mandatory");
                    Toast toast = new Toast(cgpa4.this);
                    toast.setGravity(Gravity.CENTER_VERTICAL, 0, 100);
                    toast.setDuration(Toast.LENGTH_SHORT);
                    toast.setView(layout);
                    toast.show();
                } else {
                    float a = Float.parseFloat(editText14.getText().toString());
                    float b = Float.parseFloat(editText15.getText().toString());
                    float c = Float.parseFloat(editText16.getText().toString());
                    float d = Float.parseFloat(editText17.getText().toString());
                    double result = ((24 * a) + (24 * b) + (28 * c) + (28 * d)) / 104;
                    double per = (result - 0.75) * 10;
                    textView47.setText(String.format("%.2f", result) + " /10");
                    textView48.setText(String.format("%.2f", per) + "%");
                }

                if (!textView47.getText().toString().equals("")) {
                    save3.setVisibility(View.VISIBLE);
                    clr3.setVisibility(View.VISIBLE);
                }
            }

        });

        clr3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText14.getText().clear();
                editText15.getText().clear();
                editText16.getText().clear();
                editText17.getText().clear();
                textView47.setText("");
                textView48.setText("");
                button19.setVisibility(View.VISIBLE);
                save3.setVisibility(View.GONE);
                clr3.setVisibility(View.GONE);


            }
        });
        save3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dbmanager dm = new dbmanager(getApplicationContext());
                final SQLiteDatabase db = dm.getWritableDatabase();

                final EditText editText;

                final AlertDialog.Builder alert = new AlertDialog.Builder(cgpa4.this);
                alert.setMessage("Enter student Name");


                editText = new EditText(cgpa4.this);
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
                            Animation shake = AnimationUtils.loadAnimation(cgpa4.this, R.anim.shake);
                            editText.startAnimation(shake);
                            editText.setError("Please enter student name");

                        } else {
                            ContentValues cv = new ContentValues();
                            cv.put("cname", value);
                            cv.put("no_of_sems", no_of_sem);
                            cv.put("cgpa", textView47.getText().toString());
                            cv.put("percentage", textView48.getText().toString());
                            cv.put("schemec", scheme);
                            long i = db.insert("Cgpa", null, cv);
                            if (i == -1) {
                                editText.setError("This name already exists. Enter another name.");
                            } else {
                                Toast.makeText(cgpa4.this, "data inserted successfully", Toast.LENGTH_SHORT).show();
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




