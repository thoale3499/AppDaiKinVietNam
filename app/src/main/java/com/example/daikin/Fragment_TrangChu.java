package com.example.daikin;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

public class Fragment_TrangChu extends Fragment {
    ImageView imageView_342,image_tc1_342;
    ViewPager viewPager_342;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view_342 = inflater.inflate(R.layout.fragment_trangchu,container,false);
        imageView_342 = (ImageView) view_342.findViewById(R.id.icon_next_342);
        imageView_342.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getActivity(),Goiyluachon.class);
                startActivity(in);
            }
        });

        image_tc1_342 = (ImageView) view_342.findViewById(R.id.img1_tc_342);
        image_tc1_342.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getActivity(),Detailtrangchu.class);
                startActivity(in);
            }
        });

        viewPager_342 = (ViewPager) view_342.findViewById(R.id.view_pager_slide_342);
        ImageAdapter imageAdapter_342 = new ImageAdapter (getContext());
        viewPager_342.setAdapter(imageAdapter_342);
        return view_342;
    }

}
