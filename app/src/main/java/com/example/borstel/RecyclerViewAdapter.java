package com.example.borstel;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {
    Context mContext2 ;
    private List<ModelProduk> mData2;

    public RecyclerViewAdapter(Context mContext2, List<ModelProduk> mData2) {
        this.mContext2 = mContext2;
        this.mData2 = mData2;
    }

    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view ;

        view = LayoutInflater.from(mContext2).inflate(R.layout.cardview_produk,parent,false);
        MyViewHolder vHld = new MyViewHolder(view);

        return vHld;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.tv_produk_title.setText(mData2.get(position).getProdukNama());
        ImageView img = ((MyViewHolder) holder).img_produk_thumbnail;

        Glide.with(holder.itemView.getContext())
                // LOAD URL DARI INTERNET
                .load(mData2.get(position).getProdukGambar())
                // LOAD GAMBAR AWAL SEBELUM GAMBAR UTAMA MUNCUL, BISA DARI LOKAL DAN INTERNET
                .placeholder(R.drawable.bors_logo)
                //. LOAD GAMBAR SAAT TERJADI KESALAHAN MEMUAT GMBR UTAMA
                .error(R.drawable.ic_error_black_24dp)
                .into(holder.img_produk_thumbnail);

    }

    @Override
    public int getItemCount() {
        return mData2.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        private TextView tv_produk_title;
        private ImageView img_produk_thumbnail;
        private CardView cardView;
        public MyViewHolder(View itemView) {
            super(itemView);
            tv_produk_title = (TextView) itemView.findViewById(R.id.produk_title);
            img_produk_thumbnail = (ImageView) itemView.findViewById((R.id.produk_img));
            cardView = (CardView) itemView.findViewById(R.id.cardview_id);
        }
    }

}
