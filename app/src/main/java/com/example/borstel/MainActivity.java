package com.example.borstel;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private  Toolbar toolbar;
    private ViewPager viewPager;
    private TabLayout tabLayout;

    private FragmentHome fragmentHome;
    private FragmentProduk fragmentProduk;
    private FragmentTips fragmentTips;
    private FragmentBors fragmentBors;

    List<Produk> lstProduk;
    List<Jasa> lstJasa;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        viewPager = findViewById(R.id.view_pager);
        tabLayout = findViewById(R.id.tab_layout);

        fragmentHome = new FragmentHome();
        fragmentProduk = new FragmentProduk();
        fragmentTips = new FragmentTips();
        fragmentBors = new FragmentBors();

        tabLayout.setupWithViewPager(viewPager);

        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager(), 0);
        viewPagerAdapter.addFragmet(fragmentHome, "Home");
        viewPagerAdapter.addFragmet(fragmentProduk, "Shop");
        viewPagerAdapter.addFragmet(fragmentTips, "Tips");
        viewPagerAdapter.addFragmet(fragmentBors, "About Us");
        viewPager.setAdapter(viewPagerAdapter);

        tabLayout.getTabAt(0).setIcon(R.drawable.ic_home_black_24dp);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_shopping_cart_black_24dp);
        tabLayout.getTabAt(2).setIcon(R.drawable.ic_local_library_black_24dp);
        tabLayout.getTabAt(3).setIcon(R.drawable.ic_sentiment_very_satisfied_black_24dp);

        lstProduk = new ArrayList<>();


        lstProduk.add(new Produk("Borstel Shoe Cleaner",R.drawable.produk_a,"Formula yang kami miliki bertujuan tuk memberikan manfaat khususnya kebersihan pada sepatu. Dapat membuat sepatu milikmu menjadi bersih kembali tanpa merusak warna dari  sepatu. ","Rp. 30.000"));
        lstProduk.add(new Produk("Premium Horse Brush",R.drawable.produk_b,"Digunakan untuk menyikat sepatu bagian atas dengan bulu yang tidak keras sehingga membuat sepatu tidak rusak dan berubah warna","Rp. 16.000"));
        lstProduk.add(new Produk("Cleaner + Brush",R.drawable.produk_c,"Paket Brush+Cleaner terdiri dari 2 Borstel Cleaner Shoes dan 2 Premium Horse Brush. Dapat digunakan untuk langkah awal merawat sepatu dari rumah dalam jangka waktu yang lama","Rp. 85.000"));
        lstProduk.add(new Produk("Extra Packet",R.drawable.produk_d,"Extra Paket, terdiri dari 2 Briliant Cleaner Shoes, 1 Premium Horse Brush, dan 3 Nylon Brush","Rp. 90.0000"));
        lstProduk.add(new Produk("Starter Kit Pack",R.drawable.produk_f,"Lakukan aktivitas perawatan sepatumu di rumah aja dengan Stater Kit Bundle yang terdiri dari 1 Briliant Cleaner, 1 Glove, dan 1 Masker premium Borstel","Rp. 50.000"));
        lstProduk.add(new Produk("Briliat Shoe Cleaner",R.drawable.produk_e,"Produk lainnya dari kami yang dapat membantu kamu merawat sepatu. Pada Botol tertera cara pemakaian Shoe Cleaner, netto: 100ml","Rp. 30.0000"));




    }

    private class ViewPagerAdapter extends FragmentPagerAdapter {

        private List<Fragment> fragments = new ArrayList<>();
        private List<String> framentTitle = new ArrayList<>();

        public ViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
            super(fm, behavior);
        }

        public void addFragmet(Fragment fragment, String title){
            fragments.add(fragment);
            framentTitle.add(title);
        }

        @NonNull
        @Override
        public Fragment getItem(int position) {
            return fragments.get(position);
        }

        @Override
        public int getCount() {
            return fragments.size();
        }

        @Nullable
        @Override
        public CharSequence getPageTitle(int position) {
            return framentTitle.get(position);
        }
    }
}
