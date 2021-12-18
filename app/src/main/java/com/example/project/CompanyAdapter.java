package com.example.project;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class CompanyAdapter extends BaseAdapter  {
    private int layout;
    private Context context;
    private List<SV> companyList;

    public CompanyAdapter(int layout, Context context, List<SV> companyList) {
        this.layout = layout;
        this.context = context;
        this.companyList = companyList;
    }

    @Override
    public int getCount() {
        return companyList.size();
    }
    @Override
    public Object getItem(int position) {
        return null;
    }
    @Override
    public long getItemId(int position) {
        return position;
    }

    private class ViewHolder{
        TextView txtTen;
        ImageView imgHinh;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        ViewHolder holder;
        if(view == null){
            holder = new ViewHolder();
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(layout, null);
            holder.txtTen = (TextView) view.findViewById(R.id.textviewTen);
            holder.imgHinh = (ImageView) view.findViewById(R.id.imageviewHinh);
            view.setTag(holder);
        }else {
            holder = (ViewHolder) view.getTag();
        }
        SV company = companyList.get(position);
        holder.txtTen.setText(company.getTen());
        holder.imgHinh.setImageResource(company.getHinh());

        // Tao Animation cho listview
        Animation animation = AnimationUtils.loadAnimation(context,R.anim.scale_list);
        view.startAnimation(animation);
        return view;
    }
}