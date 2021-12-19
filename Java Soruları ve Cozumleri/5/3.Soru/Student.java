package com.company;

public class Student extends Person {
    private String sinif;
    private int AKTS;

    Student(String ad, String yas, String sinif) {
        super(ad, yas);
        this.sinif = sinif;
        AKTS = 0;
    }
    public void AKTSArttir(int artisMiktari){
        AKTS+= artisMiktari;
    }

    public int getAKTS() {
        return AKTS;
    }

    public String getSinif() {
        return sinif;
    }
}
