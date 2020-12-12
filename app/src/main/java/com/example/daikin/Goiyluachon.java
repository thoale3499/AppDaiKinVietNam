package com.example.daikin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;

public class Goiyluachon extends AppCompatActivity {
    private TabLayout tabLayout_342;
    private AppBarLayout appBarLayout_342;
    private ViewPager viewPager_342;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goiyluachon);
        tabLayout_342 = (TabLayout) findViewById(R.id.tablayout_id_342);
        appBarLayout_342 = (AppBarLayout) findViewById(R.id.appbar_342);
        viewPager_342 = (ViewPager) findViewById(R.id.viewpager_id_342) ;
        ViewPagerAdapter_goiyluachon adapter_342 = new ViewPagerAdapter_goiyluachon(getSupportFragmentManager());
        adapter_342.AddFragment(new Goiyluachon_Thietbi(),"Thiết Bị");
        adapter_342.AddFragment(new Goiyluachon_Dichvu(),"Dịch Vụ");
        viewPager_342.setAdapter(adapter_342);
        tabLayout_342.setupWithViewPager(viewPager_342);
    }
}