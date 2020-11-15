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

public class cgpa35 extends AppCompatActivity {

    private EditText editText1135;
    private EditText editText1235;
    private EditText editText1335;
    private Button button1835;
    private TextView textView3935;
    private TextView textView4035;
    private Button clr35;
    private Button save35;
    private int no_of_sem = 3;
    private int scheme = 2015;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cgpa35);

        getSupportActionBar().setTitle(("CGPA"));

        editText1135 = (EditText) findViewById(R.id.editText1135);
        editText1235 = (EditText) findViewById(R.id.editText1235);
        editText1335 = (EditText) findViewById(R.id.editText1335);
        textView3935 = (TextView) findViewById(R.id.textView3935);
        textView4035 = (TextView) findViewById(R.id.textView4035);
        button1835 = (Button) findViewById(R.id.button1835);
        clr35 = (Button) findViewById(R.id.clr35);
        save35 = (Button) findViewById(R.id.save35);


        editText1135.addTextChangedListener(new TextWatcher() {

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
                String strTest = editText1135.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 10) {
                        editText1135.setText(null);
                        Toast.makeText(cgpa35.this, "Value should not be greater than 10", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });

        editText1235.addTextChangedListener(new TextWatcher() {

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
                String strTest = editText1235.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 10) {
                        editText1235.setText(null);
                        Toast.makeText(cgpa35.this, "enter a value less than 10", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });

        editText1335.addTextChangedListener(new TextWatcher() {

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
                String strTest = editText1335.getText().toString().trim();
                if (!strTest.equals("")) {

                    float no = Float.parseFloat(strTest);
                    if (no > 10) {
                        editText1335.setText(null);
                        Toast.makeText(cgpa35.this, "enter a value less than 10", Toast.LENGTH_SHORT).show();

                    }

                }

            }
        });


        button1835.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if ((editText1135.getText().toString().trim().length() <= 0) || (editText1235.getText().toString().trim().length() <= 0) || (editText1335.getText().toString().trim().length() <= 0)) {
                    View layout = LayoutInflater.from(cgpa35.this).inflate(R.layout.custom_toast, (ViewGroup) findViewById(R.id.linlayContainer));
                    TextView tv = (TextView) layout.findViewById(R.id.txtMsg);
                    tv.setText("All fields are mandatory");
                    Toast toast = new Toast(cgpa35.this);
                    toast.setGravity(Gravity.CENTER_VERTICAL, 0, 100);
                    toast.setDuration(Toast.LENGTH_SHORT);
                    toast.setView(layout);
                    toast.show();
                } else {
                    float a = Float.parseFloat(editText1135.getText().toString());
                    float b = Float.parseFloat(editText1235.getText().toString());
                    float c = Float.parseFloat(editText1335.getText().toString());
                    double result = ((24 * a) + (24 * b) + (28 * c)) / 76;
                    double per = (result - 0.75) * 10;
                    textView3935.setText(String.format("%.2f", result) + " /10");
                    textView4035.setText(String.format("%.2f", per) + "%");
                }
                if (!textView3935.getText().toString().equals("")) {
                    save35.setVisibility(View.VISIBLE);
                    clr35.setVisibility(View.VISIBLE);
                }

            }

        });

        clr35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button1835.setVisibility(View.VISIBLE);
                save35.setVisibility(View.GONE);
                clr35.setVisibility(View.GONE);
                editText1135.getText().clear();
                editText1235.getText().clear();
                editText1335.getText().clear();
                textView3935.setText("");
                textView4035.setText("");


            }
        });
        save35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dbmanager dm = new dbmanager(getApplicationContext());
                final SQLiteDatabase db = dm.getWritableDatabase();

                final EditText editText;

                final AlertDialog.Builder alert = new AlertDialog.Builder(cgpa35.this);
                alert.setMessage("Enter student Name");


                editText = new EditText(cgpa35.this);
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
                            Animation shake = AnimationUtils.loadAnimation(cgpa35.this, R.anim.shake);
                            editText.startAnimation(shake);
                            editText.setError("Please enter student name");
                        } else {
                            ContentValues cv = new ContentValues();
                            cv.put("cname", value);
                            cv.put("no_of_sems", no_of_sem);
                            cv.put("cgpa", textView3935.getText().toString());
                            cv.put("percentage", textView4035.getText().toString());
                            cv.put("schemec", scheme);
                            long i = db.insert("Cgpa", null, cv);
                            if (i == -1) {
                                editText.setError("This name already exists. Enter another name.");
                            } else {
                                Toast.makeText(cgpa35.this, "data inserted successfully", Toast.LENGTH_SHORT).show();
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


