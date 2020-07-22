package com.example.borstel;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdapterJasa extends RecyclerView.Adapter<RecyclerViewAdapterJasa.MyViewHolder> {

    Context mContext ;
    private List<Jasa> mData ;

    public RecyclerViewAdapterJasa(Context mContext, List<Jasa> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v ;
        v = LayoutInflater.from(mContext).inflate(R.layout.cardview_jasa,parent,false);
        MyViewHolder vHolder = new MyViewHolder(v);
        return vHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {

        holder.tv_jasa_title.setText(mData.get(position).getTitle_Jasa());
        holder.tv_jasa_desc.setText(mData.get(position).getDescription_Jasa());
        holder.tv_jasa_harga.setText(mData.get(position).getHarga_Jasa());
        holder.tv_jasa_durasi.setText(mData.get(position).getDurasi_Jasa());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Lempar data ke jasa activity
                Intent intent = new Intent(mContext, Jasa_Activity.class);
                intent.putExtra("Title",mData.get(position).getTitle_Jasa());
                intent.putExtra("Description",mData.get(position).getDescription_Jasa());
                intent.putExtra("Harga",mData.get(position).getHarga_Jasa());
                intent.putExtra("Durasi",mData.get(position).getDurasi_Jasa());
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

        private TextView tv_jasa_title;
        private TextView tv_jasa_desc;
        private TextView tv_jasa_harga;
        private TextView tv_jasa_durasi;
        private CardView cardView;

        public MyViewHolder(View itemView) {
            super(itemView);
            tv_jasa_title = (TextView) itemView.findViewById(R.id.jasa_title);
            tv_jasa_desc = (TextView) itemView.findViewById(R.id.jasa_desc);
            tv_jasa_harga = (TextView) itemView.findViewById(R.id.jasa_harga);
            tv_jasa_durasi = (TextView) itemView.findViewById(R.id.jasa_durasi);
            cardView = (CardView) itemView.findViewById(R.id.cardviewjasa_id);
        }
    }

}
