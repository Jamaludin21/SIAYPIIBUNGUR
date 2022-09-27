package com.example.siaypiibungur;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;
import java.util.Objects;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        TextInputLayout Username = findViewById(R.id.textInputLayout);
        TextInputLayout Password = findViewById(R.id.textInputLayout2);
        Button btn_login = findViewById(R.id.button);

        btn_login.setOnClickListener(view -> {
//            if ((Objects.requireNonNull(Username.getEditText()).getText().toString().equals("siswaYPII") &&
//                    Objects.requireNonNull(Password.getEditText()).getText().toString().equals("bungurbekasi"))) {
//                Toast.makeText(this, "Mengalihkan.....", Toast.LENGTH_SHORT).show();
//                Intent intent = new Intent(this,MenuGame.class);
//                startActivity(intent);
//                if (Username.getEditText().getText().toString().equals("")){
//                    Toast.makeText(this, "Nama Pengguna tidak boleh kosong!", Toast.LENGTH_SHORT).show();
//                }else if (!Username.getEditText().getText().toString().equals("siswaYPII")) {
//                    Toast.makeText(this, "Nama Pengguna Salah!", Toast.LENGTH_SHORT).show();
//                }
//                if (Password.getEditText().getText().toString().equals("")) {
//                    Toast.makeText(this, "Kata Sandi tidak boleh kosong!", Toast.LENGTH_SHORT).show();
//                }else if (!Password.getEditText().getText().toString().equals("bungurbekasi")){
//                    Toast.makeText(this, "Kata Sandi Salah!", Toast.LENGTH_SHORT).show();
//                }
//            }


            if ((Objects.requireNonNull(Username.getEditText()).getText().toString().equals("guruYPII") &&
                    Objects.requireNonNull(Password.getEditText()).getText().toString().equals("bungurbekasi"))) {
                Toast.makeText(this, "Mengalihkan.....", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(this,DataBuku.class);
                startActivity(intent);
                if (Username.getEditText().getText().toString().equals("")){
                    Toast.makeText(this, "Nama Pengguna tidak boleh kosong!", Toast.LENGTH_SHORT).show();
                }else if (!Username.getEditText().getText().toString().equals("guruYPII")) {
                    Toast.makeText(this, "Nama Pengguna Salah!", Toast.LENGTH_SHORT).show();
                }

                if (Password.getEditText().getText().toString().equals("")) {
                    Toast.makeText(this, "Kata Sandi tidak boleh kosong!", Toast.LENGTH_SHORT).show();
                }else if (!Password.getEditText().getText().toString().equals("bungurbekasi")){
                    Toast.makeText(this, "Kata Sandi Salah!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}