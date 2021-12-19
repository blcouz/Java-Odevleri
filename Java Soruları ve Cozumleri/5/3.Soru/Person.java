package com.company;

public class Person {//3.soru
    private String ad;
    private String yas;

    Person(String ad, String yas) {
        this.ad = ad;
        this.yas = yas;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public void setYas(String yas) {
        this.yas = yas;
    }

    public String getYas() {
        return yas;
    }
}
