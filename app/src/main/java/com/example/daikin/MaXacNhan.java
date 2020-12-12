package com.example.daikin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MaXacNhan extends AppCompatActivity {
    Button but342;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ma_xac_nhan);

        but342 = (Button) findViewById(R.id.but342);
        but342.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                openCapNhatTaiKhoan();
            }
        });
    }
    public void openCapNhatTaiKhoan () {
        Intent intent = new Intent(this, CapNhatTaiKhoan.class);
        startActivity(intent);
    }
}