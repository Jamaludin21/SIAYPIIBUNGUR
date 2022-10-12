package com.example.siaypiibungur;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class Manajerial extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manajerial);

        Button btn_data_buku_donasi = findViewById(R.id.btn_start_donasi);
        Button btn_data_buku_sekolah = findViewById(R.id.btn_start_sekolah);
//        Button btn_absensi_guru = findViewById(R.id.btn_start_absensi);
//        Button btn_sarana_prasarana = findViewById(R.id.btn_start_sarana_prasarana);

        btn_data_buku_donasi.setOnClickListener(view -> {
            Intent intent = new Intent(this,DataBuku.class);
            startActivity(intent);
        });
        btn_data_buku_sekolah.setOnClickListener(view -> {
            Intent intent = new Intent(this,DataBukuSekolah.class);
            startActivity(intent);
        });
//        btn_absensi_guru.setOnClickListener(view -> {
//            Intent intent = new Intent(this,AbsensiGuru.class);
//            startActivity(intent);
//        });
//        btn_sarana_prasarana.setOnClickListener(view -> {
//            Intent intent = new Intent(this,SaranaPrasarana.class);
//            startActivity(intent);
//        });
    }
}