package com.example.daikin;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Fragment_thogbao_tt extends Fragment {
    ListView listview_342;
    String [] title_342 ={"Nhanh Tay Nhận Ngay Ưu Đãi Cuối Tháng 11","Tháng 11 Book Bảo Trì Có Ngay Qùa Hay","CÙNG DAIKIN VIETNAM HƯỚNG VỀ MIỀN TRUNG","Thời tiết nồm rồi, bật ngay chế độ Dry khử ẩm","CÙNG DAIKIN VIETNAM HƯỚNG VỀ MIỀN TRUNG","News","News"};
    String [] date_342 ={"1 tuần trước","3 tuần trước","1 tháng trước","1 tháng trước","1 tháng trước","1 tháng trước","1 tháng trước"};
    int[] img_342 = {R.drawable.ic_tron,R.drawable.ic_tron,R.drawable.ic_tron,R.drawable.ic_tron,R.drawable.ic_tron,R.drawable.ic_tron,R.drawable.ic_tron};
    int[] img2_342 = {R.drawable.ic_next,R.drawable.ic_next,R.drawable.ic_next,R.drawable.ic_next,R.drawable.ic_next,R.drawable.ic_next,R.drawable.ic_next};
    public Fragment_thogbao_tt() {
    }

    @Nullable
    @NonNull
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view_342 = inflater.inflate(R.layout.fragment_thongbao_tintuc,container,false);
        listview_342 = (ListView) view_342.findViewById(R.id.List_recentview_342);
        listview_342.setAdapter(new Recentview_Adapter(getActivity(),R.layout.row_data_thongbao_tintuc,title_342));
        return view_342;
    }
    class Recentview_Adapter extends ArrayAdapter {
        public Recentview_Adapter (Context context, int resource, String[] objects){
            super(context,resource,objects);
        }
        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            View view_342 =((Activity)getContext()).getLayoutInflater().inflate(R.layout.row_data_thongbao_tintuc,null);
            TextView txt1_342 = (TextView) view_342.findViewById(R.id.tv1_tintuc_342);
            txt1_342.setText(title_342[position]);
            TextView txt2_342 = (TextView) view_342.findViewById(R.id.tv2_tintuc_342);
            txt2_342.setText(date_342[position]);
            ImageView imgs_342 = (ImageView) view_342.findViewById(R.id.anh_tintuc_342);
            imgs_342.setBackgroundResource(img_342[position]);
            ImageView imgs2_342 = (ImageView) view_342.findViewById(R.id.anh2_tintuc_342);
            imgs2_342.setBackgroundResource(img2_342[position]);
            return view_342;
        }

    }
}
