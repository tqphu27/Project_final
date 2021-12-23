package com.example.project;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentInfor extends Fragment {

    TextView txtTen, txtNamThanhLap, txtLinhVuc, txtTruSo, txtFounder;
    View view;
    ImageView imgLogo;

    @Override
    public View onCreateView( LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_infor, container, false);
        AnhXa();
        return view;
    }

    public void SetInfor(SV sv) {
        txtTen.setText("Name : " + sv.getTen());

        txtNamThanhLap.setText("Founded : " + sv.getNamThanhLap());

        txtLinhVuc.setText("Industry : " + sv.getLinhVuc());

        txtTruSo.setText("Headquarters : " + sv.getTruSo());

        txtFounder.setText("Founder: "+ sv.getFounder());

        imgLogo.setImageResource(sv.getLogo());
    }

    private void AnhXa(){
        txtTen = (TextView) view.findViewById(R.id.textViewName);
        txtNamThanhLap = (TextView) view.findViewById(R.id.textViewNamThanhLap);
        txtLinhVuc = (TextView) view.findViewById(R.id.textViewLinhVuc);
        txtTruSo = (TextView) view.findViewById(R.id.textViewTruSo);
        txtFounder = (TextView) view.findViewById(R.id.textViewFounder);
        imgLogo = (ImageView) view.findViewById(R.id.imglogo);
    }
}
