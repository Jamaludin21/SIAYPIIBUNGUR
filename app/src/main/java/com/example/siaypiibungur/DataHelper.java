package com.example.siaypiibungur;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DataHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "Buku2.db";
    private static final int DATABASE_VERSION = 1;


    public DataHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        // TODO Auto-generated constructor stub
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        // TODO Auto-generated method stub
//        String sql = "create table biodata(no integer primary key, nama text null, tgl text null, jk text null, alamat text null);";
//        Log.d("Data", "onCreate: " + sql);
//        db.execSQL(sql);
//        sql = "INSERT INTO biodata (no, nama, tgl, jk, alamat) VALUES ('1', 'Ihsan Permadi, S,Pd', '1996', 'Laki-laki','Bekasi');";
//        db.execSQL(sql);

        String sql_buku = "create table perpustakaan(no integer primary key, nama text null, tahun_terbit text null, penerbit text null, kota text null, sumber text null,jumlah text null);";
        Log.d("Data", "onCreate: " + sql_buku);
        db.execSQL(sql_buku);
//        sql_buku = "INSERT INTO perpustakaan (no, nama, tahun_terbit, penerbit , kota, sumber, jumlah) VALUES ('1', 'The Pragmatic Programmer: Your Journey to Mastery', '1999', 'Addison Wesley','Amerika','Web','-'),('2', 'The Pragmatic Programmer', '1999', 'Addison Wesley','Amerika','Web','-');";
//        db.execSQL(sql_buku);
        sql_buku = "INSERT INTO perpustakaan (no, nama, tahun_terbit, penerbit , kota, sumber, jumlah) VALUES ('1', 'Me , My Family and Feeling', '-', 'Pustaka Lebah','Jakarta Selatan','Donasi','1')," +
                "('2', 'The Totally Brilliant Super Puzzle', '2013', 'Arcturus','London','Donasi','1')," +
                "('3', 'Kamus Lengkap Bahasa Indonesia', '-', 'CV.GIRI UTAMA','Surabaya','Donasi','1')," +
                "('4', 'WHY? Hewan dan Tumbuhan Beracun', '2010', 'PT Elex Media Komputindo','Jakarta','Donasi','1')," +
                "('5', 'WHY? Bencana Alam', '2010', 'PT Elex Media Komputindo','Jakarta','Donasi','1')," +
                "('6', 'WHY? Alat Transportasi', '2010', 'PT Elex Media Komputindo','Jakarta','Donasi','1')," +
                "('7', 'WHY? Sains Sehari-Hari', '2010', 'PT Elex Media Komputindo','Jakarta','Donasi','1')," +
                "('8', 'WHY? Sains Tradisional', '2011', 'PT Elex Media Komputindo','Jakarta','Donasi','1')," +
                "('9', 'WHY? Tubuh Kita', '2009', 'PT Elex Media Komputindo','Jakarta','Donasi','1')," +
                "('10', 'WHY? Pertolongan Pertama Pada Kecelakaan', '2010 & 2013', 'PT Elex Media Komputindo','Jakarta','Donasi','1')," +
                "('11', 'WHY? Listrik & Elektron', '2010', 'PT Elex Media Komputindo','Jakarta','Donasi','1')," +
                "('12', 'WHY? Musik', '2010', 'PT Elex Media Komputindo','Jakarta','Donasi','1')," +
                "('13', 'WHY? Reptilia & Amfibi', '2011', 'PT Elex Media Komputindo','Jakarta','Donasi','1')," +
                "('14', 'Super Minds (American English) Workbook 5', '2013-2016', 'Cambridge University Press','United Kingdom','Donasi','1')," +
                "('15', 'Super Minds (American English) Students Book 5', '2013-2015', 'Cambridge University Press','United Kingdom','Donasi','2')," +
                "('16', 'WOW! Comics - 11. The Ugly Duckling', '2012', 'PT Bhuana Ilmu Komputer','Jakarta','Donasi','1')," +
                "('17', 'WOW! Comics - 3.Aladdins Magic Lamp', '2011', 'PT Bhuana Ilmu Komputer','Jakarta','Donasi','1')," +
                "('18', 'Ensiklopedia Junior Peternakan dan Pertanian', '-', 'PT Bhuana Ilmu Komputer','Jakarta','Donasi','1')," +
                "('19', 'Ensiklopedia Junior Mesin Raksasa', '-', 'PT Bhuana Ilmu Komputer','Jakarta','Donasi','1')," +
                "('20', 'SCIENCE IS FUN', '2012', 'PT Grasindo','Jakarta','Donasi','1')," +
                "('21', 'Paramedis 5 : Kemarin Aku Sakit', '2014', 'PT Bhuana Ilmu Komputer','Jakarta','Donasi','1')," +
                "('22', 'Kisah 25 Nabi dan Rasul', '2014', 'PT Muzan Pustaka','Bandung','Donasi','1')," +
                "('23', 'Bee Magazine: Rahasia Para Tokoh Wayang', '-', 'Pustaka Lebah','Jakarta','Donasi','1')," +
                "('25', 'Bee Magazine: Apa Lagu Tertua Didunia ?', '-', 'Pustaka Lebah','Jakarta','Donasi','1')," +
                "('26', 'Bee Magazine: Apakah Ikan Makanan Pokok ?', '-', 'Pustaka Lebah','Jakarta','Donasi','1')," +
                "('27', 'Bee Magazine: Samakah Warna Cahaya Dengan Warna Cat ?', '-', 'Pustaka Lebah','Jakarta','Donasi','1')," +
                "('28', 'Bee Magazine: Bumi,Seperti Inikah Masa Depanmu?', '-', 'Pustaka Lebah','Jakarta','Donasi','1')," +
                "('29', 'Bee Magazine: Ternyata Rambutmu Berwarna Putih', '-', 'Pustaka Lebah','Jakarta','Donasi','1')," +
                "('30', 'Bee Magazine: Piano Persembahan Bartolomeo', '-', 'Pustaka Lebah','Jakarta','Donasi','1')," +
                "('31', 'Bee Magazine: Kenapa Bentuk Sepatuku Seperti itu?', '-', 'Pustaka Lebah','Jakarta','Donasi','1')," +
                "('32', 'Bee Magazine: Tanda Diri yang Selalu Berbeda', '-', 'Pustaka Lebah','Jakarta','Donasi','1')," +
                "('33', 'Treasure Island', '2007', 'Pustaka Lebah','Jakarta','Donasi','1')," +
                "('34', 'Aku Ingin Tahu Mengapa : Perutku Keroncongan', '2004-2012', 'PT. Pabrik Kertas Tjiwi Kimia','Indonesia','Donasi','1')," +
                "('35', 'Aku Ingin Tahu Mengapa : Sabun Menghasilkan Gelembung', '2004-2012', 'PT. Pabrik Kertas Tjiwi Kimia','Indonesia','Donasi','1')," +
                "('36', 'Aku Ingin Tahu Mengapa : Matahari Terbit', '2004-2012', 'PT. Pabrik Kertas Tjiwi Kimia','Indonesia','Donasi','1')," +
                "('37', 'GUDANG SOAL SEMUA MAPEL (SMP/MTs)', '-', 'Pustaka Lebah','Jakarta','Donasi','1');";
        db.execSQL(sql_buku);

//        String sql_sp = "create table sarana(no integer primary key, nama text null, tahun_pembelian text null, kategori text null, jumlah text null);";
//        Log.d("Data", "onCreate: " + sql_sp);
//        db.execSQL(sql_sp);
//        sql_sp = "INSERT INTO sarana (no, nama, tahun_pembelian, kategori, jumlah) VALUES ('1', 'Sapu', '2019', 'Alat Kebersihan','2');";
//        db.execSQL(sql_sp);
    }
    @Override
    public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2) {
        // TODO Auto-generated method stub
    }
}