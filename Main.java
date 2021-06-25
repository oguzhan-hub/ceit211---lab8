package com.company;

public class Main {

    public static void main(String[] args) {
	//creating my account
    Address home1 = new Address("1516. sokak","Ankara","Turkey","06800");
	Person ozu = new Person("KUS","Oguzhan",home1);
	Money ozumoney = new Money(500);
	CreditCard ozuCC = new CreditCard(ozu, ozumoney);

	//functions
    System.out.println(ozuCC.toString());
    System.out.println();
    ozumoney.depositMoney(500);
    System.out.println();
    ozumoney.withdrawMoney(1200);
    System.out.println();
    ozumoney.withdrawMoney(700);
    System.out.println("----------------------------");
    System.out.println("finally:");
    System.out.println(ozuCC.toString());


    }
}
