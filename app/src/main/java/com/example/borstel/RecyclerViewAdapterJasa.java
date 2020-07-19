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

public class RecyclerViewAdapterJasa extends RecyclerView.Adapter<RecyclerViewAdapterJasa.MyViewHolder> {

    private Context mContext ;
    private List<Jasa> mData ;

    public RecyclerViewAdapterJasa(Context mContext, List<Jasa> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view ;
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.cardview_jasa,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {

        holder.tv_jasa_title.setText(mData.get(position).getTitle_Jasa());
        holder.img_jasa_thumbnail.setImageResource(mData.get(position).getThumbnail_Jasa());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Lempar data ke produk activity
                Intent intent = new Intent(mContext, Jasa_Activity.class);
                intent.putExtra("Title",mData.get(position).getTitle_Jasa());
                intent.putExtra("Description",mData.get(position).getDescription_Jasa());
                intent.putExtra("Harga",mData.get(position).getHarga_Jasa());
                intent.putExtra("Thumbnail",mData.get(position).getThumbnail_Jasa());
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

        TextView tv_jasa_title;
        ImageView img_jasa_thumbnail;
        CardView cardView;

        public MyViewHolder(View itemView) {
            super(itemView);
            tv_jasa_title = (TextView) itemView.findViewById(R.id.jasa_title);
            img_jasa_thumbnail = (ImageView) itemView.findViewById((R.id.jasa_img));
            cardView = (CardView) itemView.findViewById(R.id.cardviewjasa_id);
        }
    }

}
