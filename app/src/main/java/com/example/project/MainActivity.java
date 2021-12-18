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
        Configuration configuration = getResources().getConfiguration();
        if (fragmentInfor != null && configuration.orientation == Configuration.ORIENTATION_LANDSCAPE ){
            fragmentInfor.SetInfor(sv);
        }
        else {
            Intent intent = new Intent(MainActivity.this,CompanyInformation.class);
            intent.putExtra("thongTinCongTy", sv);
            startActivity(intent);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu,menu);

        return super.onCreateOptionsMenu(menu);
    }

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
}


