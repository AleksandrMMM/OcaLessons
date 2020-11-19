package com.Lessons5;

public class BankAccount {
    int balance = 32;

    public void popolnenieSchta(int sum){
          this.balance = balance + sum;
        System.out.println(balance);
    }
    public int snatiescheta(int sum){
        return this.balance = balance - sum;

    }

}
