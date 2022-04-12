package com.company.extend_Demo2;

public interface A {
//    void greet();

    void meet();
    default void greet(){
        System.out.println("Im in the default greet method in interface A");
    }

    //even tho this is an abstract method , even if I don't override this in the main class
    //still , it won't show any error as this is a default method now
}
