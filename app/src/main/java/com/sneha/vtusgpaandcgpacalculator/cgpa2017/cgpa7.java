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

public class cgpa7 extends AppCompatActivity {

    private EditText editText29;
    private EditText editText30;
    private EditText editText31;
    private EditText editText32;
    private EditText editText33;
    private EditText editText34;
    private EditText editText35;
    private Button button22;
    private TextView textView80;
    private TextView textView81;
    private Button clr6;
    private Button save6;
    private int no_of_sem=7;
    private int scheme=2017;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cgpa7);

        getSupportActionBar().setTitle(("CGPA"));

        editText29=(EditText)findViewById(R.id.editText29);
        editText30=(EditText)findViewById(R.id.editText30);
        editText31=(EditText)findViewById(R.id.editText31);
        editText32=(EditText)findViewById(R.id.editText32);
        editText33=(EditText)findViewById(R.id.editText33);
        editText34=(EditText)findViewById(R.id.editText34);
        editText35=(EditText)findViewById(R.id.editText35);
        textView80=(TextView) findViewById(R.id.textView80);
        textView81=(TextView)findViewById(R.id.textView81);
        button22=(Button)findViewById(R.id.button22);
        clr6=(Button)findViewById(R.id.clr6);
        save6=(Button)findViewById(R.id.save6);

        editText29.addTextChangedListener(new TextWatcher(){

            @Override
            public void afterTextChanged(Editable s) {}

            @Override
            public void beforeTextChanged(CharSequence s, int start,
                                          int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start,
                                      int before, int count) {
                String strTest = editText29.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 10) {
                        editText29.setText(null);
                        Toast.makeText(cgpa7.this, "enter a value less than 10", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });

        editText30.addTextChangedListener(new TextWatcher(){

            @Override
            public void afterTextChanged(Editable s) {}

            @Override
            public void beforeTextChanged(CharSequence s, int start,
                                          int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start,
                                      int before, int count) {
                String strTest = editText30.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 10) {
                        editText30.setText(null);
                        Toast.makeText(cgpa7.this, "enter a value less than 10", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });
        editText31.addTextChangedListener(new TextWatcher(){

            @Override
            public void afterTextChanged(Editable s) {}

            @Override
            public void beforeTextChanged(CharSequence s, int start,
                                          int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start,
                                      int before, int count) {
                String strTest = editText31.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 10) {
                        editText31.setText(null);
                        Toast.makeText(cgpa7.this, "enter a value less than 10", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });

        editText32.addTextChangedListener(new TextWatcher(){

            @Override
            public void afterTextChanged(Editable s) {}

            @Override
            public void beforeTextChanged(CharSequence s, int start,
                                          int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start,
                                      int before, int count) {
                String strTest = editText32.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 10) {
                        editText32.setText(null);
                        Toast.makeText(cgpa7.this, "enter a value less than 10", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });

        editText33.addTextChangedListener(new TextWatcher(){

            @Override
            public void afterTextChanged(Editable s) {}

            @Override
            public void beforeTextChanged(CharSequence s, int start,
                                          int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start,
                                      int before, int count) {
                String strTest = editText33.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 10) {
                        editText33.setText(null);
                        Toast.makeText(cgpa7.this, "enter a value less than 10", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });

        editText34.addTextChangedListener(new TextWatcher(){

            @Override
            public void afterTextChanged(Editable s) {}

            @Override
            public void beforeTextChanged(CharSequence s, int start,
                                          int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start,
                                      int before, int count) {
                String strTest = editText34.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 10) {
                        editText34.setText(null);
                        Toast.makeText(cgpa7.this, "enter a value less than 10", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });

        editText35.addTextChangedListener(new TextWatcher(){

            @Override
            public void afterTextChanged(Editable s) {}

            @Override
            public void beforeTextChanged(CharSequence s, int start,
                                          int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start,
                                      int before, int count) {
                String strTest = editText35.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 10) {
                        editText35.setText(null);
                        Toast.makeText(cgpa7.this, "enter a value less than 10", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });

        button22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((editText29.getText().toString().trim().length() <= 0) || (editText30.getText().toString().trim().length()<=0) || (editText31.getText().toString().trim().length()<=0)|| (editText32.getText().toString().trim().length()<=0)|| (editText33.getText().toString().trim().length()<=0)|| (editText34.getText().toString().trim().length()<=0)|| (editText35.getText().toString().trim().length()<=0)){
                    View layout = LayoutInflater.from(cgpa7.this).inflate(R.layout.custom_toast, (ViewGroup) findViewById(R.id.linlayContainer));
                    TextView tv = (TextView) layout.findViewById(R.id.txtMsg);
                    tv.setText("All fields are mandatory");
                    Toast toast = new Toast(cgpa7.this);
                    toast.setGravity(Gravity.CENTER_VERTICAL, 0, 100);
                    toast.setDuration(Toast.LENGTH_SHORT);
                    toast.setView(layout);
                    toast.show();
                }
                else {
                    float a = Float.parseFloat(editText29.getText().toString());
                    float b = Float.parseFloat(editText30.getText().toString());
                    float c = Float.parseFloat(editText31.getText().toString());
                    float d = Float.parseFloat(editText32.getText().toString());
                    float e = Float.parseFloat(editText33.getText().toString());
                    float f = Float.parseFloat(editText34.getText().toString());
                    float g = Float.parseFloat(editText35.getText().toString());
                    double result = ((24 * a) + (24 * b) + (28 * c) + (28 * d) + (26 * e) + (26 * f) + (24 * g)) / 180;
                    double per = (result - 0.75) * 10;
                    textView80.setText(String.format("%.2f", result) + " /10");
                    textView81.setText(String.format("%.2f", per) + "%");
                }
                if (!textView80.getText().toString().equals("")) {
                    save6.setVisibility(View.VISIBLE);
                    clr6.setVisibility(View.VISIBLE);
                }
            }

        });
        clr6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText29.getText().clear();
                editText30.getText().clear();
                editText31.getText().clear();
                editText32.getText().clear();
                editText33.getText().clear();
                editText34.getText().clear();
                editText35.getText().clear();
                textView80.setText("");
                textView81.setText("");
                button22.setVisibility(View.VISIBLE);
                save6.setVisibility(View.GONE);
                clr6.setVisibility(View.GONE);


            }
        });
        save6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dbmanager dm= new dbmanager(getApplicationContext());
                final SQLiteDatabase db=dm.getWritableDatabase();

                final EditText editText;

                final AlertDialog.Builder alert = new AlertDialog.Builder(cgpa7.this);
                alert.setMessage("Enter student Name");


                editText = new EditText(cgpa7.this);
                alert.setView(editText);
                alert.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {

                    }
                });

                alert.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {

                    }
                });

                final AlertDialog dialogs  = alert.create();
                dialogs.show();

                dialogs.getButton(AlertDialog.BUTTON_POSITIVE).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String value = editText.getText().toString();
                        if (value.isEmpty()) {
                            Animation shake = AnimationUtils.loadAnimation(cgpa7.this, R.anim.shake);
                            editText.startAnimation(shake);
                            editText.setError("Please enter student name");

                        }
                        else{
                            ContentValues cv= new ContentValues();
                            cv.put("cname",value);
                            cv.put("no_of_sems",no_of_sem);
                            cv.put("cgpa", textView80.getText().toString());
                            cv.put("percentage", textView81.getText().toString());
                            cv.put("schemec", scheme);
                            long i=db.insert("Cgpa",null,cv);
                            if(i==-1)
                            {
                                editText.setError("This name already exists. Enter another name.");
                            }
                            else{
                                Toast.makeText(cgpa7.this, "data inserted successfully", Toast.LENGTH_SHORT).show();
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

            };

        });

    }

}

