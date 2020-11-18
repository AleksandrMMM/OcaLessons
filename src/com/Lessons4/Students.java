package com.Lessons4;

import jdk.dynalink.NoSuchDynamicMethodException;

public class Students {


   private int number;
    private String name;
    private String fio;
    private int year;
    private int mafh1;
    private int econom;
    private int english;

   public Students(int number, String name, String fio,  int year, int mafh1, int english,int econom   ){
       this.number = number;
       this.name = name;
       this.fio = fio;
       this.year = year;
       this.mafh1 = mafh1;
       this.english = english;
       this.econom = econom;

   }


    public int getNumber(){

        return number;
    }
    public void setNumber(int number){
       if(number == 0){
           System.out.println("error");

       }else {
           this.number = number;
       }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMafh1() {
        return mafh1;
    }

    public void setMafh1(int mafh1) {
        this.mafh1 = mafh1;
    }

    public int getEconomy() {
        return econom;
    }

    public void setEconom(int econom) {
        this.econom = econom;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }
}
