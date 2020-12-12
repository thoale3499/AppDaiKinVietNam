package com.example.daikin;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Fragment_TaiKhoan extends Fragment {

    TextView tv_thht_342,tv_cd_342,tv_cauhoi_342;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v_342 = inflater.inflate(R.layout.fragment_user, container, false);

        tv_thht_342 = (TextView) v_342.findViewById(R.id.thongtinhotro_342);
        tv_cd_342 = (TextView) v_342.findViewById(R.id.Caidat_342);
        tv_cauhoi_342 = (TextView) v_342.findViewById(R.id.Cauhoi_342);
        tv_thht_342.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i_342 = new Intent(getActivity(), ThongtinhotroActivity.class);
                getActivity().startActivity(i_342);
            }
        });
        tv_cd_342.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i_342 = new Intent(getActivity(), CaiDatActivity.class);
                getActivity().startActivity(i_342);
            }
        });
        tv_cauhoi_342.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i_342 = new Intent(getActivity(), CauhoiActivity.class);
                getActivity().startActivity(i_342);
            }
        });
        return v_342;
    }
}