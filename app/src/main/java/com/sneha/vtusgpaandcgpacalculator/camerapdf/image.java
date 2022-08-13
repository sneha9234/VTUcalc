package com.sneha.vtusgpaandcgpacalculator.camerapdf;

import android.Manifest;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.ContentValues;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.sneha.vtusgpaandcgpacalculator.R;
import com.sneha.vtusgpaandcgpacalculator.cgpa2015.cgpa45;
import com.sneha.vtusgpaandcgpacalculator.cgpa2017.cgpa3;
import com.sneha.vtusgpaandcgpacalculator.sgpa.MainActivity;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;

public class image extends AppCompatActivity {

    GridView gridView;
    ArrayList<savedimages> list;
    imageslistadapter adapter = null;
    FloatingActionButton floatingActionButton1;
    final int REQUEST_CODE_GALLERY = 999;

    public static SQLiteHelperimg sqLiteHelperimg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle(R.string.images);

        gridView = (GridView) findViewById(R.id.gridView);
        list = new ArrayList<>();
        adapter = new imageslistadapter(this, R.layout.image_items, list);
        gridView.setAdapter(adapter);

        sqLiteHelperimg = new SQLiteHelperimg(this, "images.sqlite", null, 1);
        sqLiteHelperimg.queryData("CREATE TABLE IF NOT EXISTS IMAGES(id INTEGER PRIMARY KEY AUTOINCREMENT, name VARCHAR, image BLOB) ");

        floatingActionButton1 = findViewById(R.id.floatingActionButton1);

        floatingActionButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open_bottomsheet();
            }
        });

        // get all data from sqlite
        Cursor cursor = image.sqLiteHelperimg.getData("SELECT * FROM IMAGES");
        list.clear();
        while (cursor.moveToNext()) {
            int id = cursor.getInt(0);
            String name = cursor.getString(1);
            byte[] image = cursor.getBlob(2);

            list.add(new savedimages(id, name, image));
        }
        adapter.notifyDataSetChanged();

        gridView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, final int position, long id) {


                Cursor c = image.sqLiteHelperimg.getData("SELECT id FROM IMAGES");
                ArrayList<Integer> arrID = new ArrayList<Integer>();
                while (c.moveToNext()){
                    arrID.add(c.getInt(0));
                }
                showDialogDelete(arrID.get(position));

                return true;
            }
        });

    }

    public static byte[] imageViewToByte(ImageView image) {
        Bitmap bitmap = ((BitmapDrawable)image.getDrawable()).getBitmap();
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, stream);
        byte[] byteArray = stream.toByteArray();
        return byteArray;
    }

    public void open_bottomsheet() {

        View view = getLayoutInflater().inflate(R.layout.bottom_sheet, null);

        final BottomSheetDialog dialog = new BottomSheetDialog(this);
        dialog.setContentView(view);
        dialog.show();
        final ImageButton camerabtn = view.findViewById(R.id.camerabtn);
        final ImageButton gallerybtn = view.findViewById(R.id.gallerybtn);

        camerabtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(image.this,"This functionality is unavailable for now",Toast.LENGTH_SHORT).show();
            }
        });

        gallerybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                ActivityCompat.requestPermissions(
//                        image.this,
//                        new String[]{Manifest.permission.READ_EXTERNAL_STORAGE},
//                        REQUEST_CODE_GALLERY
//                );
//                dialog.dismiss();

                Toast.makeText(image.this,"This functionality is unavailable for now",Toast.LENGTH_SHORT).show();

            }
        });
    }



    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {

        if(requestCode == REQUEST_CODE_GALLERY){
            if(grantResults.length >0 && grantResults[0] == PackageManager.PERMISSION_GRANTED){
                Intent intent = new Intent(Intent.ACTION_PICK);
                intent.setType("image/*");
                startActivityForResult(intent, REQUEST_CODE_GALLERY);
            }
            else {
                Toast.makeText(getApplicationContext(), "You don't have permission to access file location!", Toast.LENGTH_SHORT).show();
            }
            return;
        }

        if(requestCode == 888){
            if(grantResults.length >0 && grantResults[0] == PackageManager.PERMISSION_GRANTED){
                Intent intent = new Intent(Intent.ACTION_PICK);
                intent.setType("image/*");
                startActivityForResult(intent, 888);
            }
            else {
                Toast.makeText(getApplicationContext(), "You don't have permission to access file location!", Toast.LENGTH_SHORT).show();
            }
            return;
        }
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        if(requestCode == REQUEST_CODE_GALLERY && resultCode == RESULT_OK && data != null){
            Uri uri = data.getData();

            try {
                InputStream inputStream = getContentResolver().openInputStream(uri);

                Bitmap bitmap = BitmapFactory.decodeStream(inputStream);

                final ImageView imgvw = new ImageView(this);
                AlertDialog.Builder ImageDialog = new AlertDialog.Builder(image.this);
                ImageDialog.setMessage("Image preview");
                imgvw.setImageBitmap(bitmap);
                ImageDialog.setView(imgvw);

                ImageDialog.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                    }
                });

                ImageDialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                    }
                });

                final AlertDialog dialogs1 = ImageDialog.create();
                dialogs1.show();

                dialogs1.getButton(androidx.appcompat.app.AlertDialog.BUTTON_POSITIVE).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        final androidx.appcompat.app.AlertDialog.Builder alert = new androidx.appcompat.app.AlertDialog.Builder(image.this);
                        alert.setMessage("Enter a name for the image");
                        final EditText editText;
                        editText = new EditText(image.this);
                        alert.setView(editText);
                        alert.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int whichButton) {

                            }
                        });

                        alert.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int whichButton) {

                            }
                        });

                        final androidx.appcompat.app.AlertDialog dialogs2 = alert.create();
                        dialogs2.show();

                        dialogs2.getButton(androidx.appcompat.app.AlertDialog.BUTTON_POSITIVE).setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {

                                String value = editText.getText().toString();
                                if (value.isEmpty()) {
                                    editText.setError("Please enter a name");
                                } else {
                                        try {
                                            sqLiteHelperimg.insertData(
                                                    editText.getText().toString().trim(),
                                                    imageViewToByte(imgvw)
                                            );
                                            Toast.makeText(getApplicationContext(), "Added successfully!", Toast.LENGTH_SHORT).show();
                                            dialogs2.dismiss();
                                            dialogs1.dismiss();
                                        } catch (Exception e) {
                                            e.printStackTrace();
                                        }

                                    }

                                }
                        });

                        dialogs2.getButton(androidx.appcompat.app.AlertDialog.BUTTON_NEGATIVE).setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {

                                dialogs2.dismiss();
                            }
                        });

                    }
                });

                dialogs1.getButton(androidx.appcompat.app.AlertDialog.BUTTON_NEGATIVE).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        dialogs1.dismiss();
                    }
                });

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        if(requestCode == 888 && resultCode == RESULT_OK && data != null){
            Uri uri = data.getData();
            try {
                InputStream inputStream = getContentResolver().openInputStream(uri);
                Bitmap bitmap = BitmapFactory.decodeStream(inputStream);
                imageVieww.setImageBitmap(bitmap);

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        super.onActivityResult(requestCode, resultCode, data);
    }

    ImageView imageVieww;

    private void showDialogDelete(final int idFood){
        final AlertDialog.Builder dialogDelete = new AlertDialog.Builder(image.this);

        dialogDelete.setTitle("Warning!!");
        dialogDelete.setMessage("Are you sure you want to this delete?");
        dialogDelete.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                try {
                    image.sqLiteHelperimg.deleteData(idFood);
                    Toast.makeText(getApplicationContext(), "Delete successfully!!!",Toast.LENGTH_SHORT).show();
                } catch (Exception e){
                    Log.e("error", e.getMessage());
                }
                updateList();
            }
        });

        dialogDelete.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
    }

    private void updateList(){
        // get all data from sqlite
        Cursor cursor = image.sqLiteHelperimg.getData("SELECT * FROM IMAGES");
        list.clear();
        while (cursor.moveToNext()) {
            int id = cursor.getInt(0);
            String name = cursor.getString(1);
            byte[] image = cursor.getBlob(3);

            list.add(new savedimages(id, name, image));
        }
        adapter.notifyDataSetChanged();
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        onBackPressed();
        return true;
    }


}
