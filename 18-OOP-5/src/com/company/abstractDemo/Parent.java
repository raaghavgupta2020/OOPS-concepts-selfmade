package com.company.abstractDemo;

public abstract class Parent {

    int age; // variables like this can be created normally
    //static and final variables can also be created, which can be accessed using the constructors
    final int VALUE = -1;


    //A constructor can be created in an abstract class but an abstract constructor cannot be created

    //also, this constructor doesn't make much sense as we cannot instantiate the "Parent" class which is abstract
    //hence, the constructor cannot be directly accessed
    //this constructor can only be accessed via a derived class
    public Parent(int age){
        this.age = age;
    }


    static int num = 10;
    public Parent(int age , int num){
        this.age = age;
        this.num = num;
    }


    //Static method can be created but a static abstract method cannot be created
    static void hello(){
        System.out.println("This is a static method inside an abstract class");
    }

    //we can also create a normal method
    public void greeting(){
        System.out.println("this is a normal greeting method");
    }

    //we can also override the normal greeting method in the child classes

    //we cannot make this Parent class as "final" as final means inheriting this class won't be possible and
    //abstract means we need to override the abstract methods in the child class
    //hence , final abstract classes doesn't make any sense

    abstract void career();
    abstract void partner();


}
