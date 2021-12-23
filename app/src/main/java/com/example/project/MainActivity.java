package com.example.project;

import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;


import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity implements Truyen {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void DataCompany(SV sv) {

        FragmentInfor fragmentInfor = (FragmentInfor) getSupportFragmentManager().findFragmentById(R.id.fragmentInfor);
        //tránh lỗi xoay dọc không có dữ liệu
        Configuration configuration = getResources().getConfiguration();
        if (fragmentInfor != null && configuration.orientation == Configuration.ORIENTATION_LANDSCAPE ){
            fragmentInfor.SetInfor(sv);
        }
        else {
            //nếu ở màn hình dọc sẽ chuyển sang activity khác
            Intent intent = new Intent(MainActivity.this,CompanyInformation.class);
            intent.putExtra("thongTinCongTy", sv);
            startActivity(intent);
        }
    }

    // Tao options menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu,menu);

        return super.onCreateOptionsMenu(menu);
    }

    // Bat su kien khi click vao item
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if(id == R.id.aboutus){
            Intent intent = new Intent(MainActivity.this,About.class);
            startActivity(intent);
            //return true;
        }
        else if(id == R.id.company){
            Intent intent = new Intent(MainActivity.this,InforCompany.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }


    // Tao nut double back khi muon thoat khoi app
    boolean doubleBackToExitPressedOnce = false;

    @Override
    public void onBackPressed() {
        if (doubleBackToExitPressedOnce) {
            super.onBackPressed();
            return;
        }

        this.doubleBackToExitPressedOnce = true;
        Toast.makeText(this, "Please click BACK again to exit", Toast.LENGTH_SHORT).show();

        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {

            @Override
            public void run() {
                doubleBackToExitPressedOnce=false;
            }
        }, 2000);
    }
}


