package com.example.siaypiibungur;

import android.app.AlertDialog;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class DataBuku extends AppCompatActivity {
    String[] daftar;
    ListView ListView01;
    protected Cursor cursor;
    DataHelper dbcenter;
    public static DataBuku ma;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_guru);
        Button btn = findViewById(R.id.button2);
        btn.setOnClickListener(arg0 -> {
            // TODO Auto-generated method stub
            Intent inte = new Intent(DataBuku.this, BuatDataBuku.class);
            startActivity(inte);
        });
        ma = this;
        dbcenter = new DataHelper(this);
        RefreshList();
    }
    public void RefreshList(){
        SQLiteDatabase db = dbcenter.getReadableDatabase();
        cursor = db.rawQuery("SELECT * FROM perpustakaan",null);
        daftar = new String[cursor.getCount()];
        cursor.moveToFirst();
        for (int cc=0; cc < cursor.getCount(); cc++){
            cursor.moveToPosition(cc);
            daftar[cc] = cursor.getString(1);
        }
        ListView01 = findViewById(R.id.listView1);
        ListView01.setAdapter(new ArrayAdapter(this,
                android.R.layout.simple_list_item_1, daftar));
        ListView01.setSelected(true);
        ListView01.setOnItemClickListener((arg0, arg1, arg2, arg3) -> {
            final String selection = daftar[arg2];
//.getItemAtPosition(arg2).toString();
            final CharSequence[] dialogitem = {"Lihat Buku", "Update Buku", "Hapus Buku"};
            AlertDialog.Builder builder = new
                    AlertDialog.Builder(DataBuku.this);
            builder.setTitle("Pilihan");
            builder.setItems(dialogitem, (dialog, item) -> {
                switch(item){
                    case 0 :
                        Intent i = new Intent(getApplicationContext(),
                                LihatDataBuku.class);
                        i.putExtra("nama", selection);
                        startActivity(i);
                        break;
                    case 1 :
                        Intent in = new Intent(getApplicationContext(),
                                UpdateDataBuku.class);
                        in.putExtra("nama", selection);
                        startActivity(in);
                        break;
                    case 2 :
                        SQLiteDatabase db1 = dbcenter.getWritableDatabase();
                        db1.execSQL("delete from perpustakaan where nama = '"+selection+"'");
                        RefreshList();
                        Toast.makeText(ma, "Data Berhasil Dihapus!", Toast.LENGTH_SHORT).show();
                        break;
                }
            });
            builder.create().show();
        });
        ((ArrayAdapter)ListView01.getAdapter()).notifyDataSetInvalidated();
    }
}