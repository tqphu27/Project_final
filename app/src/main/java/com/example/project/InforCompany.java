package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class InforCompany extends AppCompatActivity {
    ImageView imgFPT;
    ImageView imgViettel;
    ImageView imgApple;
    ImageView imgMicrosoft;
    ImageView imgSamsung;
    ImageView imgMobiphone;
    ImageView imgTencent;
    ImageView imgVNPT;
    ImageView imgSony;
    ImageView imgIntel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infor_company);

        imgFPT = (ImageView) findViewById(R.id.imageViewfpt);
        imgFPT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/"));
                //or
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://fpt.vn/vi"));
                startActivity(intent);
            }
        });

        imgViettel = (ImageView) findViewById(R.id.imageViewviettel);
        imgViettel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/"));
                //or
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://vietteltelecom.vn/"));
                startActivity(intent);
            }
        });

        imgApple = (ImageView) findViewById(R.id.imageViewApple);
        imgApple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/"));
                //or
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.apple.com/"));
                startActivity(intent);
            }
        });

        imgMicrosoft = (ImageView) findViewById(R.id.imageViewMicrosoft);
        imgMicrosoft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/"));
                //or
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.microsoft.com/en-us"));
                startActivity(intent);
            }
        });

        imgSamsung = (ImageView) findViewById(R.id.imageViewSS);
        imgSamsung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/"));
                //or
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.samsung.com/vn/"));
                startActivity(intent);
            }
        });

        imgMobiphone = (ImageView) findViewById(R.id.imageViewMb);
        imgMobiphone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/"));
                //or
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.mobifone.vn/"));
                startActivity(intent);
            }
        });

        imgTencent = (ImageView) findViewById(R.id.imageViewTencent);
        imgTencent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/"));
                //or
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.tencent.com/en-us"));
                startActivity(intent);
            }
        });

        imgVNPT = (ImageView) findViewById(R.id.imageViewvnpt);
        imgVNPT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://vnpt.com.vn/"));
                startActivity(intent);
            }
        });

        imgSony = (ImageView) findViewById(R.id.imageViewsony);
        imgSony.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/"));
                //or
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.sony.com.vn/"));
                startActivity(intent);
            }
        });

        imgSony = (ImageView) findViewById(R.id.imageViewsony);
        imgSony.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/"));
                //or
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.sony.com.vn/"));
                startActivity(intent);
            }
        });

        imgIntel = (ImageView) findViewById(R.id.imageViewIntel);
        imgIntel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/"));
                //or
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.intel.vn/content/www/vn/vi/homepage.html"));
                startActivity(intent);
            }
        });


    }
}