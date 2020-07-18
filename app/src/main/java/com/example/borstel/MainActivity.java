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

        lstProduk.add(new Produk("Produk A",R.drawable.produk_a,"aaaaaa"));
        lstProduk.add(new Produk("Produk B",R.drawable.produk_b,"aaaaaa"));
        lstProduk.add(new Produk("Produk C",R.drawable.produk_c,"aaaaaa"));
        lstProduk.add(new Produk("Produk D",R.drawable.produk_d,"aaaaaa"));
        lstProduk.add(new Produk("Produk E",R.drawable.produk_e,"aaaaaa"));
        lstProduk.add(new Produk("Produk F",R.drawable.produk_f,"aaaaaa"));

        RecyclerView myrv = (RecyclerView) findViewById(R.id.recyclerview_id);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this, lstProduk);
        myrv.setLayoutManager(new GridLayoutManager(this,3));
        myrv.setAdapter(myAdapter);
    }

}
