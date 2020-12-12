package com.example.daikin;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class ViewPagerAdapter_goiyluachon extends FragmentPagerAdapter {
    private final List<Fragment> fragmentList_342 = new ArrayList<>();
    private final List<String> fragmentListTitles_342 = new ArrayList<>();

    public ViewPagerAdapter_goiyluachon(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return fragmentList_342.get(position);
    }

    @Override
    public int getCount() {
        return fragmentListTitles_342.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return fragmentListTitles_342.get(position);
    }

    public void AddFragment (Fragment fragment, String title) {
        fragmentList_342.add(fragment);
        fragmentListTitles_342.add(title);
    }
}
