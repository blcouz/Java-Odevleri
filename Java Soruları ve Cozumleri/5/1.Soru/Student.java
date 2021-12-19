package com.company;

public class Student {//1.soru
    private String name;    // öğr adı
    private String id;        // öğr no
    private double credits;    // AKTS toplamı

    public Student(String fullName, String studentID)  //constructor (burası default değerler için)
    {
        name = fullName;
        id = studentID;
        credits = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }
    public void AKTSArttir(int artisMiktari){
        this.credits+=artisMiktari;
    }
    public void PrintDetails(){
        System.out.println(name);
        System.out.println(id);
    }
    public void Mezunmu(){
        if(credits<240) System.out.println("Mezun değil.");
        else System.out.println("Mezun.");
    }
}

