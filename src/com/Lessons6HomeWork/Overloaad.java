package com.Lessons6HomeWork;

public class Overloaad {
    int one;
    int two;
    int three;
    int four;
    public int sum(){
        return 0;
    }
    public int sum(int one){
        return one;
    }
    public int sum(int one, int two){
        return one + two;

    }
    public int sum(int one, int two, int three){

        return sum(one, two) + three;
    }
    public int sum(int one, int two, int three, int four){
        return sum(one, two, three) + four;
    }
}
