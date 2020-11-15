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

public class cgpa3 extends AppCompatActivity {
    private EditText editText11;
    private EditText editText12;
    private EditText editText13;
    private Button button18;
    private TextView textView39;
    private TextView textView40;
    private Button clr2;
    private Button save2;
    private int no_of_sem = 3;
    private int scheme = 2017;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cgpa3);

        getSupportActionBar().setTitle(("CGPA"));

        editText11 = (EditText) findViewById(R.id.editText11);
        editText12 = (EditText) findViewById(R.id.editText12);
        editText13 = (EditText) findViewById(R.id.editText13);
        textView39 = (TextView) findViewById(R.id.textView39);
        textView40 = (TextView) findViewById(R.id.textView40);
        button18 = (Button) findViewById(R.id.button18);
        clr2 = (Button) findViewById(R.id.clr2);
        save2 = (Button) findViewById(R.id.save2);


        editText11.addTextChangedListener(new TextWatcher() {

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
                String strTest = editText11.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 10) {
                        editText11.setText(null);
                        Toast.makeText(cgpa3.this, "Value should not be greater than 10", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });

        editText12.addTextChangedListener(new TextWatcher() {

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
                String strTest = editText12.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 10) {
                        editText12.setText(null);
                        Toast.makeText(cgpa3.this, "enter a value less than 10", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });

        editText13.addTextChangedListener(new TextWatcher() {

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
                String strTest = editText13.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 10) {
                        editText13.setText(null);
                        Toast.makeText(cgpa3.this, "enter a value less than 10", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });


        button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if ((editText11.getText().toString().trim().length() <= 0) || (editText12.getText().toString().trim().length() <= 0) || (editText13.getText().toString().trim().length() <= 0)) {
                    View layout = LayoutInflater.from(cgpa3.this).inflate(R.layout.custom_toast, (ViewGroup) findViewById(R.id.linlayContainer));
                    TextView tv = (TextView) layout.findViewById(R.id.txtMsg);
                    tv.setText("All fields are mandatory");
                    Toast toast = new Toast(cgpa3.this);
                    toast.setGravity(Gravity.CENTER_VERTICAL, 0, 100);
                    toast.setDuration(Toast.LENGTH_SHORT);
                    toast.setView(layout);
                    toast.show();
                } else {
                    float a = Float.parseFloat(editText11.getText().toString());
                    float b = Float.parseFloat(editText12.getText().toString());
                    float c = Float.parseFloat(editText13.getText().toString());
                    double result = ((24 * a) + (24 * b) + (28 * c)) / 76;
                    double per = (result - 0.75) * 10;
                    textView39.setText(String.format("%.2f", result) + " /10");
                    textView40.setText(String.format("%.2f", per) + "%");
                }
                if (!textView39.getText().toString().equals("")) {
                    save2.setVisibility(View.VISIBLE);
                    clr2.setVisibility(View.VISIBLE);
                }

            }

        });

        clr2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button18.setVisibility(View.VISIBLE);
                save2.setVisibility(View.GONE);
                clr2.setVisibility(View.GONE);
                editText11.getText().clear();
                editText12.getText().clear();
                editText13.getText().clear();
                textView39.setText("");
                textView40.setText("");


            }
        });
        save2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dbmanager dm = new dbmanager(getApplicationContext());
                final SQLiteDatabase db = dm.getWritableDatabase();

                final EditText editText;

                final AlertDialog.Builder alert = new AlertDialog.Builder(cgpa3.this);
                alert.setMessage("Enter student Name");


                editText = new EditText(cgpa3.this);
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
                            Animation shake = AnimationUtils.loadAnimation(cgpa3.this, R.anim.shake);
                            editText.startAnimation(shake);
                            editText.setError("Please enter student name");

                        } else {
                            ContentValues cv = new ContentValues();
                            cv.put("cname", value);
                            cv.put("no_of_sems", no_of_sem);
                            cv.put("cgpa", textView39.getText().toString());
                            cv.put("percentage", textView40.getText().toString());
                            cv.put("schemec", scheme);
                            long i = db.insert("Cgpa", null, cv);
                            if (i == -1) {
                                editText.setError("This name already exists. Enter another name.");
                            } else {
                                Toast.makeText(cgpa3.this, "data inserted successfully", Toast.LENGTH_SHORT).show();
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


