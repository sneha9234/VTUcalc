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

public class cgpa2 extends AppCompatActivity {

    private EditText editText9;
    private EditText editText10;
    private Button button17;
    private TextView textView23;
    private TextView textView24;
    private Button clr1;
    private Button button36;
    private int no_of_sem = 2;
    private int scheme = 2017;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cgpa2);

        getSupportActionBar().setTitle(("CGPA"));

        editText9 = (EditText) findViewById(R.id.editText9);
        editText10 = (EditText) findViewById(R.id.editText10);
        textView23 = (TextView) findViewById(R.id.textView23);
        textView24 = (TextView) findViewById(R.id.textView24);
        button17 = (Button) findViewById(R.id.button17);
        button36 = (Button) findViewById(R.id.button36);
        clr1 = (Button) findViewById(R.id.clr1);

        editText9.addTextChangedListener(new TextWatcher() {

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
                String strTest = editText9.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 10) {
                        editText9.setText(null);
                        Toast.makeText(cgpa2.this, "Enter a value less than 10", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });

        editText10.addTextChangedListener(new TextWatcher() {

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
                String strTest = editText10.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 10) {
                        editText10.setText(null);
                        Toast.makeText(cgpa2.this, "enter a value less than 10", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });


        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if ((editText9.getText().toString().trim().length() <= 0) || (editText10.getText().toString().trim().length() <= 0)) {
                    View layout = LayoutInflater.from(cgpa2.this).inflate(R.layout.custom_toast, (ViewGroup) findViewById(R.id.linlayContainer));
                    TextView tv = (TextView) layout.findViewById(R.id.txtMsg);
                    tv.setText("All fields are mandatory");
                    Toast toast = new Toast(cgpa2.this);
                    toast.setGravity(Gravity.CENTER_VERTICAL, 0, 100);
                    toast.setDuration(Toast.LENGTH_SHORT);
                    toast.setView(layout);
                    toast.show();
                } else {
                    float a = Float.parseFloat(editText9.getText().toString());
                    float b = Float.parseFloat(editText10.getText().toString());
                    double result = ((24 * a) + (24 * b)) / 48;
                    double per = (result - 0.75) * 10;
                    textView23.setText(String.format("%.2f", result) + " /10");
                    textView24.setText(String.format("%.2f", per) + " %");
                }
                if (!textView23.getText().toString().equals("")) {
                    button36.setVisibility(View.VISIBLE);
                    clr1.setVisibility(View.VISIBLE);
                }
            }


        });

        clr1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button17.setVisibility(View.VISIBLE);
                button36.setVisibility(View.GONE);
                clr1.setVisibility(View.GONE);
                editText9.getText().clear();
                editText10.getText().clear();
                textView23.setText("");
                textView24.setText("");


            }
        });

        button36.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {

                dbmanager dm = new dbmanager(getApplicationContext());
                final SQLiteDatabase db = dm.getWritableDatabase();

                final EditText editText;

                final AlertDialog.Builder alert = new AlertDialog.Builder(cgpa2.this);
                alert.setMessage("Enter student Name");


                editText = new EditText(cgpa2.this);
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
                            Animation shake = AnimationUtils.loadAnimation(cgpa2.this, R.anim.shake);
                            editText.startAnimation(shake);
                            editText.setError("Please enter student name");

                        } else {
                            ContentValues cv = new ContentValues();
                            cv.put("cname", value);
                            cv.put("no_of_sems", no_of_sem);
                            cv.put("cgpa", textView23.getText().toString());
                            cv.put("percentage", textView24.getText().toString());
                            cv.put("schemec", scheme);
                            long i = db.insert("Cgpa", null, cv);
                            if (i == -1) {
                                editText.setError("This name already exists. Enter another name.");
                            } else {
                                Toast.makeText(cgpa2.this, "data inserted successfully", Toast.LENGTH_SHORT).show();
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
