package com.example.siaypiibungur;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DataHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "SIAYPII.db";
    private static final int DATABASE_VERSION = 1;


    public DataHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        // TODO Auto-generated constructor stub
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        // TODO Auto-generated method stub
        String sql = "create table biodata(no integer primary key, nama text null, tgl text null, jk text null, alamat text null);";
        Log.d("Data", "onCreate: " + sql);
        db.execSQL(sql);
        sql = "INSERT INTO biodata (no, nama, tgl, jk, alamat) VALUES ('1', 'Ihsan Permadi, S,Pd', '1996', 'Laki-laki','Bekasi');";
        db.execSQL(sql);

        String sql_buku = "create table perpustakaan(no integer primary key, nama text null, tahun_terbit text null, penerbit text null, kota text null);";
        Log.d("Data", "onCreate: " + sql_buku);
        db.execSQL(sql_buku);
        sql_buku = "INSERT INTO perpustakaan (no, nama, tahun_terbit, penerbit , kota) VALUES ('1', 'The Pragmatic Programmer: Your Journey to Mastery', '1999', 'Addison Wesley','Amerika');";
        db.execSQL(sql_buku);
    }
    @Override
    public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2) {
        // TODO Auto-generated method stub
    }
}