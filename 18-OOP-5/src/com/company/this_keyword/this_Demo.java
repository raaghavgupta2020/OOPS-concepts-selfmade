package com.company.this_keyword;

public class this_Demo {
    int number;
    String name;
    this_Demo(int number , String name ){
        this.number = number;
        this.name =name;
    }

    public static void main(String[] args) {
        this_Demo t = new this_Demo(10 , "Raghav");
        System.out.println(t.name);
        System.out.println(t.number);
    }
}
