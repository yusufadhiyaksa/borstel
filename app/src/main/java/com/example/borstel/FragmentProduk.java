package com.example.borstel;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class FragmentProduk extends Fragment {

    View view;

    private RecyclerView mrv;
    private RecyclerView.Adapter mAdapter;
    private List<ModelProduk> ProdukList;
    Context mContext2;
    ApiInterface mApiIn;

    public FragmentProduk() {

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ProdukList = new ArrayList<>();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_produk,container,false);
        mrv = (RecyclerView) view.findViewById(R.id.recyclerview_id);
        mApiIn = ApiClient.getClient().create(ApiInterface.class);
        refresh();
        return view;
   }

    public void refresh() {
        Call<GetJasaProduk> wisataCall = mApiIn.getProduk();
        wisataCall.enqueue(new Callback<GetJasaProduk>() {
            @Override
            public void onResponse(Call<GetJasaProduk> call, Response<GetJasaProduk>
                    response) {
                List<ModelProduk> ProdukList = response.body().getProduk();
                Log.d("Retrofit Get", "Jumlah data Kontak: " +
                        String.valueOf(ProdukList.size()));
                mAdapter = new RecyclerViewAdapter(getContext(),ProdukList);
                mrv.setLayoutManager(new LinearLayoutManager(getActivity()));
                mrv.setLayoutManager(new GridLayoutManager(getContext(),3));
                mrv.setAdapter(mAdapter);
            }

            @Override
            public void onFailure(Call<GetJasaProduk> call, Throwable t) {
                Log.e("Retrofit Get", t.toString());
            }
        });
    }

}
