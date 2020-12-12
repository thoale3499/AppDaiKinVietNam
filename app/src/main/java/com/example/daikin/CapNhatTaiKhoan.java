package com.example.daikin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CapNhatTaiKhoan extends AppCompatActivity {
    Button btt342;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cap_nhat_tai_khoan);
        btt342 = (Button) findViewById(R.id.btt342);
        btt342.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                openTrangChu();
            }
        });
    }
    public void openTrangChu () {
        Intent intent = new Intent(this, TrangChu.class);
        startActivity(intent);
    }
}