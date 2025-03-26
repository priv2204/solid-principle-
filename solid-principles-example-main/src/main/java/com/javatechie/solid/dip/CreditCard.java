package com.javatechie.solid.dip;

public class CreditCard implements BankCard{

    public void doTransaction(long amount){
        System.out.println("running in dev branch");
        System.out.println("payment using Credit card");
    }
}
