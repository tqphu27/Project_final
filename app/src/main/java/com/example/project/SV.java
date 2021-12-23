package com.example.project;

import java.io.Serializable;


public class SV  implements Serializable{
    private String Ten;
    private int NamThanhLap;
    private String LinhVuc;
    private String TruSo;
    private int Hinh;
    private int Logo;
    private String Founder;
    public SV(String ten, int namThanhLap, String linhVuc, String truSo, int hinh, int logo, String founder) {
        Ten = ten;
        NamThanhLap = namThanhLap;
        LinhVuc = linhVuc;
        TruSo = truSo;
        Hinh = hinh;
        Logo = logo;
        Founder = founder;
    }
    public int getHinh() {
        return Hinh;
    }
    public void setHinh(int hinh) {
        Hinh = hinh;
    }
    public String getTen() {
        return Ten;
    }
    public void setTen(String ten) {
        Ten = ten;
    }
    public int getNamThanhLap() {
        return NamThanhLap;
    }
    public void setNamThanhLap(int namThanhLap) {
        NamThanhLap = namThanhLap;
    }
    public String getLinhVuc() {
        return LinhVuc;
    }
    public void setLinhVuc(String linhVuc) {
        LinhVuc = linhVuc;
    }
    public String getTruSo() {
        return TruSo;
    }
    public void setTruSo(String truSo) {
        TruSo = truSo;
    }
    public int getLogo() {
        return Logo;
    }
    public void setLogo(int logo) {
        Logo = logo;
    }
    public String getFounder() {
        return Founder;
    }
    public void setFounder(String founder) {
        Founder = founder;
    }
}
