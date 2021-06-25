package com.company;

public class CreditCard {
    Money balance;
    Person owner;

    public CreditCard(Person owner,Money balance){
        this.owner = owner;
        this.balance = balance;
    }

    public String toString(){
        String x = balance.toString();
        String y = owner.toString();
        return x +"\n" + y;
    }
}
