package com.example.project;

import android.content.ClipData;
import android.os.Bundle;
import android.provider.Settings;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.ListFragment;
import android.view.Menu;

import java.util.ArrayList;

public class FragmentList extends ListFragment {
    ArrayList<SV> arrayCompany;
    CompanyAdapter adapter;
    Truyen truyen;

    @Nullable
    @Override

    /*  Khoi tao fragment list
        Hien thi danh sach cong ty
    */

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        truyen = (Truyen) getActivity();
        arrayCompany = new ArrayList<>();
        AddArraySV();
        adapter = new CompanyAdapter(R.layout.row_cty, getActivity(), arrayCompany);
        setListAdapter(adapter);

        return inflater.inflate(R.layout.fragment_list, container, false);
    }

    // Bat su kien khi click vao list
    @Override
    public void onListItemClick(@NonNull ListView l, @NonNull View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        truyen.DataCompany(arrayCompany.get(position)); //
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }


    private void AddArraySV(){
        arrayCompany.add(new SV("FPT", 1988, "Telecommunication", "Ha Noi", R.drawable.fpt_logo, R.drawable.fpt_logo, "Truong Gia Binh, Nguyen Van Khoa (CEO)"));
        arrayCompany.add(new SV("Viettel", 1989, "Telecommunication", "Ha Noi",R.drawable.viettel_logo,R.drawable.viettel_logo, "Le Dang Dung"));
        arrayCompany.add(new SV("Apple", 1976, "Smart-Phone", "California, US",R.drawable.apple_logo,R.drawable.apple_logo, "Steve Jobs, Steve Wozniak, Ronald Wayne"));
        arrayCompany.add(new SV("Microsoft", 1975, "Software development, Computer hardware", "Washington, Hoa Kỳ",R.drawable.microsoft_logo,R.drawable.microsoft_logo, "Bill Gates, Paul Allen"));
        arrayCompany.add(new SV("Samsung", 1938, "Conglomerate", "Seoul, Koera",R.drawable.samsung_logo,R.drawable.samsung_logo,"Lee Jae-young"));
        arrayCompany.add(new SV("Mobifone", 1993, "Telecommunication","Ha Noi", R.drawable.logo_mobifone,R.drawable.logo_mobifone, "Dinh Van Phuoc"));
        arrayCompany.add(new SV("Tencent",1998,"Internet","Tham Quyen, China", R.drawable.tencent_logo,R.drawable.tencent_logo,"Ma Hoa Dang"));
        arrayCompany.add(new SV("VNPT", 2006,"Telecommunications","Ha Noi", R.drawable.vnpt,R.drawable.vnpt, "To Dung Thai"));
        arrayCompany.add(new SV("Sony", 1946, "Conglomerate", "Tokyo, Japan",R.drawable.sony_logo,R.drawable.sony_logo, "Kenichiro Yoshida"));
        arrayCompany.add(new SV("Intel",1968,"Computer Hardware","California, US",R.drawable.intel_logo,R.drawable.intel_logo,"Gordon Moore, Robert Noyce"));
    }



}
