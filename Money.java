package com.company;

public class Money {
    double money;

    public Money (double money){
        this.money = money;
    }

    public void depositMoney(double x){
        money += x;
        System.out.println("your account now have: $"+money);
    }
    public void withdrawMoney(double x){
        if(money >= x){
            money -= x;
            System.out.println("$"+money + "dollar left in your account after withdraw $"+x);
        }else {
            System.out.println("not enough cash in your account to withdraw "+x+", you only have: $"+money);
        }

    }

    public double getMoney(){
        return money;
    }

    public String toString(){
        return "The current amount is: " + money;
    }

}
