package com.example.siaypiibungur;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class BuatDataBukuSekolah extends AppCompatActivity {
    DataHelper dbHelper;
    Button ton1, ton2;
    EditText text1, text2, text3, text4, text5,text6, text7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buat_data_buku_sekolah);
        dbHelper = new DataHelper(this);
        text1 = findViewById(R.id.editText1);
        text2 = findViewById(R.id.editText2);
        text3 = findViewById(R.id.editText3);
        text4 = findViewById(R.id.editText4);
        text5 = findViewById(R.id.editText5);
        text6 = findViewById(R.id.editText6);
        text7 = findViewById(R.id.editText7);
        ton1 = findViewById(R.id.button1);
        ton2 = findViewById(R.id.button2);
        ton1.setOnClickListener(arg0 -> {
            // TODO Auto-generated method stub
            SQLiteDatabase db = dbHelper.getWritableDatabase();
            db.execSQL("insert into buku (no, nama, tahun_terbit, penerbit, kota, sumber, jumlah) values('" +
                    text1.getText().toString() + "','" +
                    text2.getText().toString() + "','" +
                    text3.getText().toString() + "','" +
                    text4.getText().toString() + "','" +
                    text5.getText().toString() + "','" +
                    text6.getText().toString() + "','" +
                    text7.getText().toString() + "')");
            Toast.makeText(getApplicationContext(), "Berhasil",
                    Toast.LENGTH_LONG).show();
            DataBukuSekolah.ma.RefreshList();
            finish();
        });
        ton2.setOnClickListener(arg0 -> {
            // TODO Auto-generated method stub
            finish();
        });
    }
}