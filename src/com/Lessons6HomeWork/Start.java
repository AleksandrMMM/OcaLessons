package com.Lessons6HomeWork;

public class Start {
    public static void main(String[] args) {
        Overloaad over = new Overloaad();
        System.out.println(over.sum());
        System.out.println(over.sum(1));
        System.out.println(over.sum(1,3));
        System.out.println(over.sum(1,2,3));
        System.out.println(over.sum(1,2,3,4));
    }
}
