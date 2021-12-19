package com.company;

public class Teacher extends Person{
    private String brans;
    private int baslangicYili;
    Teacher(String ad, String yas,String brans,int baslangicYili) {
        super(ad, yas);//super Person classı manasına gelir.
        this.baslangicYili = baslangicYili;
        this.brans = brans;
    }

    public int getBaslangicYili() {
        return baslangicYili;
    }

    public void setBaslangicYili(int baslangicYili) {
        this.baslangicYili = baslangicYili;
    }

    public String getBrans() {
        return brans;
    }

    public void setBrans(String brans) {
        this.brans = brans;
    }
}
