package com.company.abstractDemo;

public class Son extends Parent{

    public Son(int age){
        super(age);
    }

    public Son(int age , int num){
        super(age , num);
    }

    @Override
    public void greeting(){
        super.greeting();
        System.out.println("this is the overridden greeting method");

    }

    //all the abstract methods need to be overridden by the child class
    @Override
    void career() {
        System.out.println("i want to be a coder");
    }

    @Override
    void partner() {
        System.out.println("i like her");
    }
}
