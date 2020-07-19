package com.example.borstel;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Produk_Activity extends Activity {

    private TextView tvtitle, tvharga, tvdescription;
    private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produk_);

        tvtitle = (TextView) findViewById(R.id.produktitle);
        tvharga = (TextView) findViewById(R.id.produkharga);
        tvdescription = (TextView) findViewById(R.id.produkdesc);
        img = (ImageView) findViewById(R.id.produkthumbnail);

        //Menerima Data
        Intent intent = getIntent();
        String Title = intent.getExtras().getString("Title");
        String Harga = intent.getExtras().getString("Harga");
        String Description = intent.getExtras().getString("Description");
        int image = intent.getExtras().getInt("Thumbnail");

        //Setting Values

        tvtitle.setText(Title);
        tvharga.setText(Harga);
        tvdescription.setText(Description);
        img.setImageResource(image);
    }
}
