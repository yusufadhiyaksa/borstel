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
    private FragmentBors fragmentBors;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        viewPager = findViewById(R.id.view_pager);
        tabLayout = findViewById(R.id.tab_layout);

        fragmentHome = new FragmentHome();
        fragmentProduk = new FragmentProduk();
        fragmentBors = new FragmentBors();

        tabLayout.setupWithViewPager(viewPager);

        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager(), 0);
        viewPagerAdapter.addFragmet(fragmentBors, "Home");
        viewPagerAdapter.addFragmet(fragmentHome, "PriceList");
        viewPagerAdapter.addFragmet(fragmentProduk, "Shop");;
        viewPager.setAdapter(viewPagerAdapter);

        tabLayout.getTabAt(0).setIcon(R.drawable.ic_home_black_24dp);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_local_library_black_24dp);
        tabLayout.getTabAt(2).setIcon(R.drawable.ic_shopping_cart_black_24dp);

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
