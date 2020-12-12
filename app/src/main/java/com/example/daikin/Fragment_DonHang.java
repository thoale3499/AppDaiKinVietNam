package com.example.daikin;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;

public class Fragment_DonHang extends Fragment {
    private TabLayout tabLayout_342;
    private AppBarLayout appBarLayout_342;
    private ViewPager viewPager_342;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v_342 =  inflater.inflate(R.layout.fragment_donhang,container,false);
        tabLayout_342 = (TabLayout) v_342.findViewById(R.id.tablayout_donhang_342);
        appBarLayout_342 = (AppBarLayout) v_342.findViewById(R.id.appbar_donhang_342);
        viewPager_342 = (ViewPager) v_342.findViewById(R.id.viewpager_donhang_342);
        ViewPagerAdapter_Thongbao adapter_342 = new ViewPagerAdapter_Thongbao (getChildFragmentManager(),tabLayout_342.getTabCount());
        adapter_342.AddFragment(new Fragment_donhang_dvkythuat(),"Dịch vụ kỹ thuật");
        adapter_342.AddFragment(new Fragment_donhang_phukien(),"Phụ kiện");
        //add Setup
        viewPager_342.setAdapter(adapter_342);
        tabLayout_342.setupWithViewPager(viewPager_342);
        return v_342;
    }
}