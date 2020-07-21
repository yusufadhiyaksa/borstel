package com.example.borstel;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Jasa_Activity extends Activity {

    private TextView tvtitle, tvharga, tvdescription, tvdurasi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jasa_);

        tvtitle = (TextView) findViewById(R.id.jasatitle);
        tvharga = (TextView) findViewById(R.id.jasaharga);
        tvdescription = (TextView) findViewById(R.id.jasadesc);
        tvdurasi = (TextView) findViewById(R.id.jasadurasi);

        //Menerima Data
        Intent intent = getIntent();
        String Title = intent.getExtras().getString("Title");
        String Harga = intent.getExtras().getString("Harga");
        String Description = intent.getExtras().getString("Description");
        String Durasi = intent.getExtras().getString("Durasi");

        //Setting Values

        tvtitle.setText(Title);
        tvharga.setText(Harga);
        tvdescription.setText(Description);
        tvdescription.setText(Description);
    }
}
