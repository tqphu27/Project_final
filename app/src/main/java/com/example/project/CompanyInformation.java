package com.example.project;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class CompanyInformation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_company_information);
        Intent intent = getIntent();
        SV sv = (SV) intent.getSerializableExtra("thongTinCongTy");
        FragmentInfor fragmentInfor = (FragmentInfor) getSupportFragmentManager().findFragmentById(R.id.fragmentChiTiet);
            fragmentInfor.SetInfor(sv);
    }
}