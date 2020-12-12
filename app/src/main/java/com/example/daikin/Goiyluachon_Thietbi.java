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

public class Goiyluachon_Thietbi extends Fragment {
    GridView gridView_342;
    String[] title_342 = {"Máy điều hòa treo tường","Máy điều hòa Sky Airs","Máy điều hòa VRV","Máy điều hòa Multi","Máy lọc không khí","Máy điều hòa Packaged"};
    int [] img_342 = {R.drawable.maydieuhoa, R.drawable.skyair, R.drawable.vrv,R.drawable.daikinmulti,R.drawable.lockhongkhi,R.drawable.packaged};
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v_342 =  inflater.inflate(R.layout.fragment_goiyluachon_thietbi,container,false);
        gridView_342 = (GridView) v_342.findViewById(R.id.gridview_thietbi_342);
        CustomAdapter customAdapter_342 = new CustomAdapter();
        gridView_342.setAdapter(customAdapter_342);
        gridView_342.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getActivity(), Grid_GoiYLuaChon_ThietBi.class);
                intent.putExtra("name",title_342[position]);
                //intent.putExtra("image",img_342[position]);
                startActivity(intent);
            }
        });
        return v_342;
    }
    private class CustomAdapter extends BaseAdapter{
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
            View view_342 = getLayoutInflater().inflate(R.layout.rowdata_goiyluachon_thietbi,null);
            TextView name_342 = view_342.findViewById(R.id.tv_item_moiday);
            ImageView image_342 = view_342.findViewById(R.id.img_item_moiday);

            name_342.setText(title_342[position]);
            image_342.setImageResource(img_342[position]);
            return  view_342;
        }
    }
}
