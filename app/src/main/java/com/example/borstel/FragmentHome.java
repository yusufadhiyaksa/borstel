package com.example.borstel;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class FragmentHome extends Fragment{

    View v;

    private RecyclerView mrv2;
    private RecyclerView.Adapter mAdapter;
    private List<ModelJasa> JasaList;
    private Button bn;
    Context mContext;
    ApiInterface mApiIn;

    public FragmentHome() {
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        JasaList = new ArrayList<>();
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_home,container,false);
        mrv2 = (RecyclerView) v.findViewById(R.id.recyclerview_id2);
        mApiIn = ApiClient.getClient().create(ApiInterface.class);
        refresh();
        return v;
    }
     public void refresh() {
         Call<GetJasaProduk> wisataCall = mApiIn.getJasa();
         wisataCall.enqueue(new Callback<GetJasaProduk>() {
             @Override
             public void onResponse(Call<GetJasaProduk> call, Response<GetJasaProduk>
                     response) {
                 List<ModelJasa> JasaList = response.body().getJasa();
                 Log.d("Retrofit Get", "Jumlah data Kontak: " +
                         String.valueOf(JasaList.size()));
                 mAdapter = new RecyclerViewAdapterJasa(getContext(),JasaList);
                 mrv2.setLayoutManager(new LinearLayoutManager(getActivity()));
                 mrv2.setAdapter(mAdapter);
             }

             @Override
             public void onFailure(Call<GetJasaProduk> call, Throwable t) {
                 Log.e("Retrofit Get", t.toString());
             }
         });
     }




}
