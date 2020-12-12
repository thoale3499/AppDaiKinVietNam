package com.example.daikin;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;

public class Goiyluachon_Dichvu extends Fragment {
    GridView gridView_342;
    String[] title_342 = {"Bảo trì","Sửa chữa","E-Shop","Phụ kiện","Zalo Us"};
    int [] img_342 = {R.drawable.baotri,R.drawable.suachua,R.drawable.eshop,R.drawable.phukien,R.drawable.zalo};
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v_342 =  inflater.inflate(R.layout.fragment_goiyluachon_dichvu,container,false);
        gridView_342 = (GridView) v_342.findViewById(R.id.gridview_thietbi_342);
        Goiyluachon_Dichvu.CustomAdapter customAdapter_342 = new Goiyluachon_Dichvu.CustomAdapter();
        gridView_342.setAdapter(customAdapter_342);
        gridView_342.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent1 = new Intent(getActivity(), Grid_Goiyluachon_Dichvu.class);
                intent1.putExtra("name",title_342[position]);
                //intent.putExtra("image",img_342[position]);
                startActivity(intent1);
            }
        });
        return v_342;
    }
    private class CustomAdapter extends BaseAdapter {
        @Override
        public int getCount() {
            return img_342.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View view_342 = getLayoutInflater().inflate(R.layout.rowdata_goiyluachon_dichvu,null);
            TextView name_342 = view_342.findViewById(R.id.tv_item_dichvu_342);
            ImageView image_342 = view_342.findViewById(R.id.img_item_dichvu_342);

            name_342.setText(title_342[position]);
            image_342.setImageResource(img_342[position]);
            return  view_342;
        }
    }
}
