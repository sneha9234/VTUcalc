package com.sneha.vtusgpaandcgpacalculator.sqlitepackage;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class dbmanager extends SQLiteOpenHelper {

    String sgpa_table="create table Sgpa (sname text, semester text, sgpa  text,percent text, schemes text, primary key(sname,semester,schemes))";
    String cgpa_table="create table Cgpa (cname text, no_of_sems int, cgpa text, percentage text, schemec text, primary key(cname,no_of_sems,schemec))";

    public dbmanager(@Nullable Context context) {
        super(context, "Student", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(sgpa_table);
        db.execSQL(cgpa_table);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }



    public Cursor fetch_data1() {
        SQLiteDatabase db = this.getWritableDatabase();
        String query = "Select*FROM Sgpa" ;
        Cursor cursor = db.rawQuery(query,null);

        return cursor;
    }

    public Cursor fetch_data2() {
        SQLiteDatabase db = this.getWritableDatabase();
        String query = "Select*FROM Cgpa" ;
        Cursor cursor = db.rawQuery(query,null);
//        if (cursor != null) {
//            cursor.moveToFirst();
//        }
        return cursor;

    }

    public boolean delete1(String sns, String semrs, String schs){
        SQLiteDatabase db=this.getWritableDatabase();
        int result = db.delete("Sgpa", "sname= ? and semester = ? and schemes = ?", new String[] {sns, semrs, schs});
        return result > 0;
    }

    public boolean delete2(String snc, String semrc, String schc){
        SQLiteDatabase db=this.getWritableDatabase();
        int result = db.delete("Cgpa", "cname= ? and no_of_sems = ? and schemec = ?", new String[] {snc, semrc, schc});
        return result > 0;
    }

}
