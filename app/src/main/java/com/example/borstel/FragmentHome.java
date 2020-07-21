package com.example.borstel;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class FragmentHome extends Fragment {

    View v;

    private RecyclerView mrv2;
    private List<Jasa> lstJasa;

    public FragmentHome() {

    }



    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        lstJasa = new ArrayList<>();

        lstJasa.add(new Jasa("Deep Cleaning", "Mencuci Seluruh Bagian Sepatu dari Outsol Sampai Insol","35K", "2-3 Hari Pengerjaan"));
        lstJasa.add(new Jasa("Deep Cleaning", "Mencuci Seluruh Bagian Sepatu dari Outsol Sampai Insol","35K", "2-3 Hari Pengerjaan"));
        lstJasa.add(new Jasa("Deep Cleaning", "Mencuci Seluruh Bagian Sepatu dari Outsol Sampai Insol","35K", "2-3 Hari Pengerjaan"));
        lstJasa.add(new Jasa("Deep Cleaning", "Mencuci Seluruh Bagian Sepatu dari Outsol Sampai Insol","35K", "2-3 Hari Pengerjaan"));
        lstJasa.add(new Jasa("Deep Cleaning", "Mencuci Seluruh Bagian Sepatu dari Outsol Sampai Insol","35K", "2-3 Hari Pengerjaan"));
        lstJasa.add(new Jasa("Deep Cleaning", "Mencuci Seluruh Bagian Sepatu dari Outsol Sampai Insol","35K", "2-3 Hari Pengerjaan"));


    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_home,container,false);
        RecyclerView mrv2 = (RecyclerView) v.findViewById(R.id.recyclerview_id2);
        RecyclerViewAdapterJasa myAdapterJasa = new RecyclerViewAdapterJasa(getContext(), lstJasa);
        mrv2.setLayoutManager(new LinearLayoutManager(getActivity()));
        mrv2.setAdapter(myAdapterJasa);
        return v;
    }
}
