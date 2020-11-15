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

public class cgpa65 extends AppCompatActivity {

    private EditText editText2365;
    private EditText editText2465;
    private EditText editText2565;
    private EditText editText2665;
    private EditText editText2765;
    private EditText editText2865;
    private Button button2165;
    private TextView textView6965;
    private TextView textView7065;
    private Button clr65;
    private Button save65;
    private int no_of_sem = 6;
    private int scheme = 2015;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cgpa65);
        getSupportActionBar().setTitle(("CGPA"));

        editText2365 = (EditText) findViewById(R.id.editText2365);
        editText2465 = (EditText) findViewById(R.id.editText2465);
        editText2565 = (EditText) findViewById(R.id.editText2565);
        editText2665 = (EditText) findViewById(R.id.editText2665);
        editText2765 = (EditText) findViewById(R.id.editText2765);
        editText2865 = (EditText) findViewById(R.id.editText2865);
        textView6965 = (TextView) findViewById(R.id.textView6965);
        textView7065 = (TextView) findViewById(R.id.textView7065);
        button2165 = (Button) findViewById(R.id.button2165);
        clr65 = (Button) findViewById(R.id.clr65);
        save65 = (Button) findViewById(R.id.save65);

        editText2365.addTextChangedListener(new TextWatcher() {

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
                String strTest = editText2365.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 10) {
                        editText2365.setText(null);
                        Toast.makeText(cgpa65.this, "enter a value less than 10", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });
        editText2465.addTextChangedListener(new TextWatcher() {

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
                String strTest = editText2465.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 10) {
                        editText2465.setText(null);
                        Toast.makeText(cgpa65.this, "enter a value less than 10", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });
        editText2565.addTextChangedListener(new TextWatcher() {

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
                String strTest = editText2565.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 10) {
                        editText2565.setText(null);
                        Toast.makeText(cgpa65.this, "enter a value less than 10", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });
        editText2665.addTextChangedListener(new TextWatcher() {

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
                String strTest = editText2665.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 10) {
                        editText2665.setText(null);
                        Toast.makeText(cgpa65.this, "enter a value less than 10", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });

        editText2765.addTextChangedListener(new TextWatcher() {

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
                String strTest = editText2765.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 10) {
                        editText2765.setText(null);
                        Toast.makeText(cgpa65.this, "enter a value less than 10", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });

        editText2865.addTextChangedListener(new TextWatcher() {

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
                String strTest = editText2865.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 10) {
                        editText2865.setText(null);
                        Toast.makeText(cgpa65.this, "enter a value less than 10", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });


        button2165.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((editText2365.getText().toString().trim().length() <= 0) || (editText2465.getText().toString().trim().length() <= 0) || (editText2565.getText().toString().trim().length() <= 0) || (editText2665.getText().toString().trim().length() <= 0) || (editText2765.getText().toString().trim().length() <= 0) || (editText2865.getText().toString().trim().length() <= 0)) {
                    View layout = LayoutInflater.from(cgpa65.this).inflate(R.layout.custom_toast, (ViewGroup) findViewById(R.id.linlayContainer));
                    TextView tv = (TextView) layout.findViewById(R.id.txtMsg);
                    tv.setText("All fields are mandatory");
                    Toast toast = new Toast(cgpa65.this);
                    toast.setGravity(Gravity.CENTER_VERTICAL, 0, 100);
                    toast.setDuration(Toast.LENGTH_SHORT);
                    toast.setView(layout);
                    toast.show();
                } else {
                    float a = Float.parseFloat(editText2365.getText().toString());
                    float b = Float.parseFloat(editText2465.getText().toString());
                    float c = Float.parseFloat(editText2565.getText().toString());
                    float d = Float.parseFloat(editText2665.getText().toString());
                    float e = Float.parseFloat(editText2765.getText().toString());
                    float f = Float.parseFloat(editText2865.getText().toString());
                    double result = ((24 * a) + (24 * b) + (28 * c) + (28 * d) + (26 * e) + (26 * f)) / 156;
                    double per = (result - 0.75) * 10;
                    textView6965.setText(String.format("%.2f", result) + " /10");
                    textView7065.setText(String.format("%.2f", per) + "%");
                }
                if (!textView6965.getText().toString().equals("")) {
                    save65.setVisibility(View.VISIBLE);
                    clr65.setVisibility(View.VISIBLE);
                }
            }

        });
        clr65.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText2365.getText().clear();
                editText2465.getText().clear();
                editText2565.getText().clear();
                editText2665.getText().clear();
                editText2765.getText().clear();
                editText2865.getText().clear();
                textView6965.setText("");
                textView7065.setText("");
                button2165.setVisibility(View.VISIBLE);
                save65.setVisibility(View.GONE);
                clr65.setVisibility(View.GONE);

            }
        });
        save65.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                dbmanager dm = new dbmanager(getApplicationContext());
                final SQLiteDatabase db = dm.getWritableDatabase();

                final EditText editText;

                final AlertDialog.Builder alert = new AlertDialog.Builder(cgpa65.this);
                alert.setMessage("Enter student Name");


                editText = new EditText(cgpa65.this);
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
                            Animation shake = AnimationUtils.loadAnimation(cgpa65.this, R.anim.shake);
                            editText.startAnimation(shake);
                            editText.setError("Please enter student name");
                        } else {
                            ContentValues cv = new ContentValues();
                            cv.put("cname", value);
                            cv.put("no_of_sems", no_of_sem);
                            cv.put("cgpa", textView6965.getText().toString());
                            cv.put("percentage", textView7065.getText().toString());
                            cv.put("schemec", scheme);
                            long i = db.insert("Cgpa", null, cv);
                            if (i == -1) {
                                editText.setError("This name already exists. Enter another name.");
                            } else {
                                Toast.makeText(cgpa65.this, "data inserted successfully", Toast.LENGTH_SHORT).show();
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



