package com.company;

public class Meeting {//2.soru
    private String time;
    private String location;
    private String subject;
    Meeting(String subject,String location,String time){
        this.subject = subject;
        this.location = location;
        this.time = time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getSubject() {
        return subject;
    }

    public String getLocation() {
        return location;
    }

    public String getTime() {
        return time;
    }
    public void PrintDetails(){
        System.out.println("\nKonu : "+subject+"\nTarih : "+time+"\nKonum : "+location);
    }
}
