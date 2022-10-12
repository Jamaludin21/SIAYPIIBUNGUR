package com.example.siaypiibungur;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DataHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "perpustakaan.db";
    private static final int DATABASE_VERSION = 1;


    public DataHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        // TODO Auto-generated constructor stub
    }
    @Override
    public void onCreate(SQLiteDatabase db) {

        String sql_donasi = "create table donasi (no integer primary key, nama text null, tahun_terbit text null, penerbit text null, kota text null, sumber text null,jumlah text null);";
        Log.d("Data", "onCreate: " + sql_donasi);
        db.execSQL(sql_donasi);
        sql_donasi = "INSERT INTO donasi (no, nama, tahun_terbit, penerbit , kota, sumber, jumlah) VALUES ('1', 'Kamus Lengkap Bahasa Indonesia', '-', 'CV.GIRI UTAMA','Surabaya','Donasi','1')," +
                "('2', 'WHY? Hewan dan Tumbuhan Beracun', '2010', 'PT Elex Media Komputindo','Jakarta','Donasi','1')," +
                "('3', 'WHY? Bencana Alam', '2010', 'PT Elex Media Komputindo','Jakarta','Donasi','1')," +
                "('4', 'WHY? Alat Transportasi', '2010', 'PT Elex Media Komputindo','Jakarta','Donasi','1')," +
                "('5', 'WHY? Sains Sehari-Hari', '2010', 'PT Elex Media Komputindo','Jakarta','Donasi','1')," +
                "('6', 'WHY? Sains Tradisional', '2011', 'PT Elex Media Komputindo','Jakarta','Donasi','1')," +
                "('7', 'WHY? Tubuh Kita', '2009', 'PT Elex Media Komputindo','Jakarta','Donasi','1')," +
                "('8', 'WHY? Pertolongan Pertama Pada Kecelakaan', '2010 & 2013', 'PT Elex Media Komputindo','Jakarta','Donasi','1')," +
                "('9', 'WHY? Listrik & Elektron', '2010', 'PT Elex Media Komputindo','Jakarta','Donasi','1')," +
                "('10', 'WHY? Musik', '2010', 'PT Elex Media Komputindo','Jakarta','Donasi','1')," +
                "('11', 'WHY? Reptilia & Amfibi', '2011', 'PT Elex Media Komputindo','Jakarta','Donasi','1')," +
                "('12', 'Super Minds (American English) Workbook 5', '2013-2016', 'Cambridge University Press','United Kingdom','Donasi','1')," +
                "('13', 'Super Minds (American English) Students Book 5', '2013-2015', 'Cambridge University Press','United Kingdom','Donasi','2')," +
                "('14', 'WOW! Comics - 11. The Ugly Duckling', '2012', 'PT Bhuana Ilmu Komputer','Jakarta','Donasi','1')," +
                "('15', 'WOW! Comics - 3.Aladdins Magic Lamp', '2011', 'PT Bhuana Ilmu Komputer','Jakarta','Donasi','1')," +
                "('16', 'Ensiklopedia Junior Peternakan dan Pertanian', '-', 'PT Bhuana Ilmu Komputer','Jakarta','Donasi','1')," +
                "('17', 'Ensiklopedia Junior Mesin Raksasa', '-', 'PT Bhuana Ilmu Komputer','Jakarta','Donasi','1')," +
                "('18', 'SCIENCE IS FUN', '2012', 'PT Grasindo','Jakarta','Donasi','1')," +
                "('19', 'Paramedis 5 : Kemarin Aku Sakit', '2014', 'PT Bhuana Ilmu Komputer','Jakarta','Donasi','1')," +
                "('20', 'Kisah 25 Nabi dan Rasul', '2014', 'PT Muzan Pustaka','Bandung','Donasi','1')," +
                "('21', 'Bee Magazine: Rahasia Para Tokoh Wayang', '-', 'Pustaka Lebah','Jakarta','Donasi','1')," +
                "('22', 'Bee Magazine: Apa Lagu Tertua Didunia ?', '-', 'Pustaka Lebah','Jakarta','Donasi','1')," +
                "('23', 'Bee Magazine: Apakah Ikan Makanan Pokok ?', '-', 'Pustaka Lebah','Jakarta','Donasi','1')," +
                "('24', 'Bee Magazine: Samakah Warna Cahaya Dengan Warna Cat ?', '-', 'Pustaka Lebah','Jakarta','Donasi','1')," +
                "('25', 'Bee Magazine: Bumi,Seperti Inikah Masa Depanmu?', '-', 'Pustaka Lebah','Jakarta','Donasi','1')," +
                "('26', 'Bee Magazine: Ternyata Rambutmu Berwarna Putih', '-', 'Pustaka Lebah','Jakarta','Donasi','1')," +
                "('27', 'Bee Magazine: Piano Persembahan Bartolomeo', '-', 'Pustaka Lebah','Jakarta','Donasi','1')," +
                "('28', 'Bee Magazine: Kenapa Bentuk Sepatuku Seperti itu?', '-', 'Pustaka Lebah','Jakarta','Donasi','1')," +
                "('29', 'Bee Magazine: Tanda Diri yang Selalu Berbeda', '-', 'Pustaka Lebah','Jakarta','Donasi','1')," +
                "('30', 'Treasure Island', '2007', 'Pustaka Lebah','Jakarta','Donasi','1')," +
                "('31', 'Aku Ingin Tahu Mengapa : Perutku Keroncongan', '2004-2012', 'PT. Pabrik Kertas Tjiwi Kimia','Indonesia','Donasi','1')," +
                "('32', 'Aku Ingin Tahu Mengapa : Sabun Menghasilkan Gelembung', '2004-2012', 'PT. Pabrik Kertas Tjiwi Kimia','Indonesia','Donasi','1')," +
                "('33', 'Aku Ingin Tahu Mengapa : Matahari Terbit', '2004-2012', 'PT. Pabrik Kertas Tjiwi Kimia','Indonesia','Donasi','1')," +
                "('34', 'GUDANG SOAL SEMUA MAPEL (SMP/MTs)', '-', 'Pustaka Lebah','Jakarta','Donasi','1');";
        db.execSQL(sql_donasi);

        String sql_buku = "create table buku (no integer primary key, nama text null, tahun_terbit text null, penerbit text null, kota text null, sumber text null,jumlah text null);";
        Log.d("Data", "onCreate: " + sql_buku);
        db.execSQL(sql_buku);
        sql_buku = "INSERT INTO buku (no, nama, tahun_terbit, penerbit , kota, sumber, jumlah) VALUES ('1', 'Me , My Family and Feeling', '-', 'Pustaka Lebah','Jakarta Selatan','Sekolah','1')," +
                "('2', 'The Totally Brilliant Super Puzzle', '2013', 'Arcturus','London','Sekolah','1')," +
                "('3', 'ILMU PENGETAHUAN ALAM (VIII)', '2017', 'KEMENTERIAN PENDIDIKAN DAN KEBUDAYAAN RI','Jakarta','Sekolah','5')," +
                "('4', 'MATEMATIKA (VIII)', '2017', 'KEMENTERIAN PENDIDIKAN DAN KEBUDAYAAN RI','Jakarta','Sekolah','18')," +
                "('5', 'MATEMATIKA (IX)', '2018', 'KEMENTERIAN PENDIDIKAN DAN KEBUDAYAAN RI','Jakarta','Sekolah','18')," +
                "('6', 'Pendidikan Agama Islam dan Budi Pekerti (IX)', '2018', 'KEMENTERIAN PENDIDIKAN DAN KEBUDAYAAN RI','Jakarta','Sekolah','15')," +
                "('7', 'Pendidikan Pancasila dan Kewarganegaraan (IX)', '2018', 'KEMENTERIAN PENDIDIKAN DAN KEBUDAYAAN RI','Jakarta','Sekolah','20')," +
                "('8', 'Bahasa Inggris (VIII)', '2017', 'KEMENTERIAN PENDIDIKAN DAN KEBUDAYAAN RI','Jakarta','Sekolah','40')," +
                "('9', 'Bahasa Indonesia (VIII)', '2017', 'KEMENTERIAN PENDIDIKAN DAN KEBUDAYAAN RI','Jakarta','Sekolah','1')," +
                "('10', 'ILMU PENGETAHUAN ALAM (VII)', '2017', 'KEMENTERIAN PENDIDIKAN DAN KEBUDAYAAN RI','Jakarta','Sekolah','1')," +
                "('11', 'Princess Academy', '2009', 'Bloomsburry Publishing','London','Sekolah','1')," +
                "('12', 'Daya Tarik Laki-Laki Dimata Wanita', '1998 (I) & 1999 (III)', 'Daar Al-Tharabisyi','London','Sekolah','1')," +
                "('13', 'PETUALANGAN-DAHSYAT : MISTERI DI GUNUNG TEULABONARI', '2006', 'MLC','Bandung','Sekolah','1')," +
                "('14', 'PETUALANGAN-DAHSYAT : MELACAK JEJAK KOTA KUNO', '2006', 'MLC','Bandung','Sekolah','1')," +
                "('15', 'Perpajakan (Revisi 2009)', '2009', 'CV ANDI OFFSET','Yogyakarta','Sekolah','1')," +
                "('17', 'The Science Of Luck', '2011', 'PT Elex Media Komputindo','Jakarta','Sekolah','1')," +
                "('18', 'Pelestarian Hutan MANGROVE', '2008-2015', 'PT Intan Sejati','Klaten','Sekolah','1')," +
                "('19', 'Umar Bin Khatab', '2009', 'CV WACANA PRIMA','Bandung','Sekolah','1')," +
                "('20', 'KOMPUTER AKUNTANSI dengan Microsoft Excel', '2006', 'PT Elex Media Komputindo','Jakarta','Sekolah','1')," +
                "('21', 'AKUNTANSI PAJAK', '1997-2005', 'PT Grasindo','Jakarta','Sekolah','1');";
        db.execSQL(sql_buku);
    }
    @Override
    public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2) {
        // TODO Auto-generated method stub
    }
}