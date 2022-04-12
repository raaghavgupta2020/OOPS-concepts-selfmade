package com.company.static_keyword;

public class Human {
    int age;
    String name;
    boolean married;
    int salary;

    static long population;
    //here I've created a static variable
    //also it is of type long hence it will be 0 by default


    public Human(int age, String name, boolean married, int salary) {
        this.age = age;
        this.name = name;
        this.married = married;
        this.salary = salary;

        //as population is a static variable hence , by convention we'll access it using the class name
        Human.population +=1;
    }



}
