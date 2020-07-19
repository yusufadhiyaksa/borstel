package com.example.borstel;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {

    List<Produk> lstProduk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lstProduk = new ArrayList<>();

        lstProduk.add(new Produk("Borstel Shoe Cleaner",R.drawable.produk_a,"Formula yang kami miliki bertujuan tuk memberikan manfaat khususnya kebersihan pada sepatu. Dapat membuat sepatu milikmu menjadi bersih kembali tanpa merusak warna dari  sepatu. ","Rp. 30.000"));
        lstProduk.add(new Produk("Premium Horse Brush",R.drawable.produk_b,"Digunakan untuk menyikat sepatu bagian atas dengan bulu yang tidak keras sehingga membuat sepatu tidak rusak dan berubah warna","Rp. 16.000"));
        lstProduk.add(new Produk("Cleaner + Brush",R.drawable.produk_c,"Paket Brush+Cleaner terdiri dari 2 Borstel Cleaner Shoes dan 2 Premium Horse Brush. Dapat digunakan untuk langkah awal merawat sepatu dari rumah dalam jangka waktu yang lama","Rp. 85.000"));
        lstProduk.add(new Produk("Extra Packet",R.drawable.produk_d,"Extra Paket, terdiri dari 2 Briliant Cleaner Shoes, 1 Premium Horse Brush, dan 3 Nylon Brush","Rp. 90.0000"));
        lstProduk.add(new Produk("Starter Kit Pack",R.drawable.produk_f,"Lakukan aktivitas perawatan sepatumu di rumah aja dengan Stater Kit Bundle yang terdiri dari 1 Briliant Cleaner, 1 Glove, dan 1 Masker premium Borstel","Rp. 50.000"));
        lstProduk.add(new Produk("Briliat Shoe Cleaner",R.drawable.produk_e,"Produk lainnya dari kami yang dapat membantu kamu merawat sepatu. Pada Botol tertera cara pemakaian Shoe Cleaner, netto: 100ml","Rp. 30.0000"));

        RecyclerView myrv = (RecyclerView) findViewById(R.id.recyclerview_id);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this, lstProduk);
        myrv.setLayoutManager(new GridLayoutManager(this,3));
        myrv.setAdapter(myAdapter);
    }

}
