package com.Lessons4;

import jdk.dynalink.NoSuchDynamicMethodException;

public class Students {


    int number;
    String name;
    String fio;
    int year;
    int mafh1;
    int econom;
    int english;

   public Students(int getNumber, String getName, String getFio ){

   }

    public int getNumber(){
       if (getNumber() == 0){
           System.out.println("Error");
           getNumber();
       }
        return number;
    }
    public void setNumber(){
        this.number = number;
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

    public int getEconom() {
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
