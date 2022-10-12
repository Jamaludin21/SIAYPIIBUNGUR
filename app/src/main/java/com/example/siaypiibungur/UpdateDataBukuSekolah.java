package com.example.siaypiibungur;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class UpdateDataBukuSekolah extends AppCompatActivity {

    protected Cursor cursor;
    DataHelper dbHelper;
    Button ton1, ton2;
    EditText text1, text2, text3, text4, text5, text6 , text7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_data_buku);
        dbHelper = new DataHelper(this);
        text1 = findViewById(R.id.editText1);
        text2 = findViewById(R.id.editText2);
        text3 = findViewById(R.id.editText3);
        text4 = findViewById(R.id.editText4);
        text5 = findViewById(R.id.editText5);
        text6 = findViewById(R.id.editText6);
        text7 = findViewById(R.id.editText7);
        SQLiteDatabase db = dbHelper.getReadableDatabase();
        cursor = db.rawQuery("SELECT * FROM buku WHERE nama = '" +
                getIntent().getStringExtra("nama") + "'", null);
        cursor.moveToFirst();
        if (cursor.getCount() > 0) {
            cursor.moveToPosition(0);
            text1.setText(cursor.getString(0));
            text2.setText(cursor.getString(1));
            text3.setText(cursor.getString(2));
            text4.setText(cursor.getString(3));
            text5.setText(cursor.getString(4));
            text6.setText(cursor.getString(5));
            text7.setText(cursor.getString(6));
        }
        ton1 = findViewById(R.id.button1);
        ton2 = findViewById(R.id.button2);
        // daftarkan even onClick pada btnSimpan
        ton1.setOnClickListener(arg0 -> {
            // TODO Auto-generated method stub
            SQLiteDatabase db1 = dbHelper.getWritableDatabase();
            db1.execSQL("update buku set nama='" +
                    text2.getText().toString() + "', tahun_terbit='" +
                    text3.getText().toString() + "', penerbit='" +
                    text4.getText().toString() + "', kota='" +
                    text5.getText().toString() + "', sumber='" +
                    text6.getText().toString() + "', jumlah='" +
                    text7.getText().toString() + "' where no='" +
                    text1.getText().toString() + "'");
            Toast.makeText(getApplicationContext(), "Berhasil Update Data!",
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