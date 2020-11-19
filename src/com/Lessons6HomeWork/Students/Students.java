package com.Lessons6HomeWork.Students;

public class Students {


    int number;
    String name;
    String fio;
    int year;
    int math1;
    int econom;
    int english;

    public Students(int number, String name, String fio, int year, int math1, int english, int econom) {
        this.number = number;
        this.name = name;
        this.fio = fio;
        this.year = year;
        this.math1 = math1;
        this.english = english;
        this.econom = econom;

    }

    public Students(int number, String name, String fio, int year) {
        this(number,  name,  fio, year, 0,  0,  0);


    }
    public Students(){

    }


    // я хочу использовать в методе переменные которые я объявил в конструкторе, как мне это реализовать правильно.
    public double sred(int mafh1, int english, int econom) {
        int sr = (mafh1 + econom + english) / 3;
        System.out.println(sr);
        return sr;
    }
}


