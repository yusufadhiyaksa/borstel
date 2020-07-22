package com.example.borstel;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    Context mContext ;
    private List<Produk> mData ;

    public RecyclerViewAdapter(Context mContext, List<Produk> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view ;
        view = LayoutInflater.from(mContext).inflate(R.layout.cardview_produk,parent,false);
        MyViewHolder vHld = new MyViewHolder(view);
        return vHld;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {

        holder.tv_produk_title.setText(mData.get(position).getTitle());
        holder.img_produk_thumbnail.setImageResource(mData.get(position).getThumbnail());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Lempar data ke Jasa activity
                Intent intent = new Intent(mContext, Produk_Activity.class);
                intent.putExtra("Title",mData.get(position).getTitle());
                intent.putExtra("Description",mData.get(position).getDescription());
                intent.putExtra("Harga",mData.get(position).getHarga());
                intent.putExtra("Thumbnail",mData.get(position).getThumbnail());
                //Memulai activity
                mContext.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return mData.size();
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
