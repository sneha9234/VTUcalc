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

public class cgpa25 extends AppCompatActivity {

    private EditText editText925;
    private EditText editText1025;
    private Button button1725;
    private TextView textView2325;
    private TextView textView2425;
    private Button clr25;
    private Button button3625;
    private int no_of_sem = 2;
    private int scheme = 2015;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cgpa25);

        getSupportActionBar().setTitle(("CGPA"));


        editText925 = (EditText) findViewById(R.id.editText925);
        editText1025 = (EditText) findViewById(R.id.editText1025);
        textView2325 = (TextView) findViewById(R.id.textView2325);
        textView2425 = (TextView) findViewById(R.id.textView2425);
        button1725 = (Button) findViewById(R.id.button1725);
        button3625 = (Button) findViewById(R.id.button3625);
        clr25 = (Button) findViewById(R.id.clr25);

        editText925.addTextChangedListener(new TextWatcher() {

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
                String strTest = editText925.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 10) {
                        editText925.setText(null);
                        Toast.makeText(cgpa25.this, "Enter a value less than 10", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });

        editText1025.addTextChangedListener(new TextWatcher() {

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
                String strTest = editText1025.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 10) {
                        editText1025.setText(null);
                        Toast.makeText(cgpa25.this, "enter a value less than 10", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });


        button1725.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if ((editText925.getText().toString().trim().length() <= 0) || (editText1025.getText().toString().trim().length() <= 0)) {
                    View layout = LayoutInflater.from(cgpa25.this).inflate(R.layout.custom_toast, (ViewGroup) findViewById(R.id.linlayContainer));
                    TextView tv = (TextView) layout.findViewById(R.id.txtMsg);
                    tv.setText("All fields are mandatory");
                    Toast toast = new Toast(cgpa25.this);
                    toast.setGravity(Gravity.CENTER_VERTICAL, 0, 100);
                    toast.setDuration(Toast.LENGTH_SHORT);
                    toast.setView(layout);
                    toast.show();
                } else {
                    float a = Float.parseFloat(editText925.getText().toString());
                    float b = Float.parseFloat(editText1025.getText().toString());
                    double result = ((24 * a) + (24 * b)) / 48;
                    double per = (result - 0.75) * 10;
                    textView2325.setText(String.format("%.2f", result) + " /10");
                    textView2425.setText(String.format("%.2f", per) + " %");
                }
                if (!textView2325.getText().toString().equals("")) {
                    button3625.setVisibility(View.VISIBLE);
                    clr25.setVisibility(View.VISIBLE);
                }
            }


        });

        clr25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button1725.setVisibility(View.VISIBLE);
                button3625.setVisibility(View.GONE);
                clr25.setVisibility(View.GONE);
                editText925.getText().clear();
                editText1025.getText().clear();
                textView2325.setText("");
                textView2425.setText("");


            }
        });

        button3625.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {

                dbmanager dm = new dbmanager(getApplicationContext());
                final SQLiteDatabase db = dm.getWritableDatabase();

                final EditText editText;

                final AlertDialog.Builder alert = new AlertDialog.Builder(cgpa25.this);
                alert.setMessage("Enter student Name");


                editText = new EditText(cgpa25.this);
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
                            Animation shake = AnimationUtils.loadAnimation(cgpa25.this, R.anim.shake);
                            editText.startAnimation(shake);
                            editText.setError("Please enter student name");
                        } else {
                            ContentValues cv = new ContentValues();
                            cv.put("cname", value);
                            cv.put("no_of_sems", no_of_sem);
                            cv.put("cgpa", textView2325.getText().toString());
                            cv.put("percentage", textView2425.getText().toString());
                            cv.put("schemec", scheme);
                            long i = db.insert("Cgpa", null, cv);
                            if (i == -1) {
                                editText.setError("This name already exists. Enter another name.");
                            } else {
                                Toast.makeText(cgpa25.this, "data inserted successfully", Toast.LENGTH_SHORT).show();
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

