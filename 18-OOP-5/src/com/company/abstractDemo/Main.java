package com.company.abstractDemo;

public class Main {
    public static void main(String[] args) {
//        Son son = new Son(30);
//        son.career();
//        son.partner();
//
//        Daughter daughter = new Daughter(23);
//        daughter.career();
//        daughter.partner();
//
//        Parent.hello(); //calling the static method won't require any object to be created
//
//        son.greeting();//calling the normal greeting method


        //even though we cannot create an object of the abstract class Parent , but we can still use it as reference variable
        Parent son2 = new Son(55,100);
        System.out.println(son2.num);
        System.out.println(Parent.num);
        //that static variable num has been modified


        //constructor cannot be called for abstract classes as we cannot create objects for abstract classes
//        Parent mom = new Parent(10); //we cannot create objects of an abstract class
    }
}
