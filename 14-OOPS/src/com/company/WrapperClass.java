package com.company;

//here we have implemented the integers using Wrapper class hence tey are basically implemented as objects
//but still  , the value isn't swapped as the 'Integer' class is a 'final' class.

public class WrapperClass {
    public static void main(String[] args) {
        Integer a = 10;
        Integer b = 20;
        swap(a,b);
        System.out.println(a + " " + b);
    }

    static void swap(int a , int b){
        Integer temp = a;
        a = b;
        b = temp;
    }
}
