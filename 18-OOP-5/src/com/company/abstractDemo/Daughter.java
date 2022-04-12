package com.company.abstractDemo;

public class Daughter extends Parent{

    public Daughter(int age)
    {
        super(age);
    }
    //all the abstract methods need to be overridden by the child class
    @Override
    void career() {
        System.out.println("i want to be a doctor");
    }

    @Override
    void partner() {
        System.out.println("i like him");
    }
}
