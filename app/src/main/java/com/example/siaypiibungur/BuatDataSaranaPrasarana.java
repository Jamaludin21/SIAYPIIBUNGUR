package com.example.siaypiibungur;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class BuatDataSaranaPrasarana extends AppCompatActivity {
    DataHelper dbHelper;
    Button ton1,ton2;
    EditText text1,text2,text3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buat_data_sarana_prasarana);
        dbHelper = new DataHelper(this);
//        text1 = findViewById(R.id.editText1);
//        text2 = findViewById(R.id.editText2);
//        text3 = findViewById(R.id.editText3);
//        ton1 = findViewById(R.id.button1);
//        ton2 = findViewById(R.id.button2);
    }
}