package com.example.daikin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Grid_GoiYLuaChon_ThietBi extends AppCompatActivity {
    TextView name_342,tv_link_342;
    ImageView imageView_342;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid__goi_y_lua_chon__thiet_bi);
        name_342 = findViewById(R.id.tv_dieuhoa_342);
        tv_link_342 = (TextView) findViewById(R.id.tv_link_342);
        tv_link_342.setPaintFlags(tv_link_342.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
       // imageView_342 = findViewById(R.id.img_chitietdieuhoa_342);

        Intent intent_342 = getIntent();
        name_342.setText(intent_342.getStringExtra("name"));
        //imageView_342.setImageResource(intent_342.getIntExtra("image",0));
    }
}