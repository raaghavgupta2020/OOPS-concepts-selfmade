package com.company.extend_Demo2;

public interface B {
    void meet();
    void fun();
//    default void greet(){
//        System.out.println("Im in A");
//    }
    //now this same method cannot be used in this interface too, which means the problem for which we were
    //using the interfaces still remains if we use this default implementation
}
