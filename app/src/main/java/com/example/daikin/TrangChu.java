package com.example.daikin;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class TrangChu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trang_chu);
        BottomNavigationView bottomNav_342 = findViewById(R.id.bottom_navigation_342);
        bottomNav_342.setOnNavigationItemSelectedListener(navListener_342);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container_342,
                    new Fragment_TrangChu()).commit();
        }
    }
    private BottomNavigationView.OnNavigationItemSelectedListener navListener_342 =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item_342) {
                    Fragment selectedFragment_342 = null;
                    switch (item_342.getItemId()) {
                        case R.id.nav_home_342:
                            selectedFragment_342 = new Fragment_TrangChu();
                            break;
                        case R.id.nav_donhang_342:
                            selectedFragment_342 = new Fragment_DonHang();
                            break;
                        case R.id.nav_thietbi_342:
                            selectedFragment_342 = new Fragment_ThietBi();
                            break;
                        case R.id.nav_thongbao_342:
                            selectedFragment_342 = new Fragment_Thongbao();
                            break;
                        case R.id.nav_user_342:
                            selectedFragment_342 = new Fragment_TaiKhoan();
                            break;
                    }
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container_342,
                            selectedFragment_342).commit();
                    return true;
                }
            };
}