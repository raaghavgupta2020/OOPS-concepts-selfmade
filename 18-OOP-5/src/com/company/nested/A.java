package com.company.nested;

public class A {
    public interface Nested_interface{
        boolean isOdd(int num);
    }
}
//i have to implement the interface like this
class B implements A.Nested_interface{
    @Override
    public boolean isOdd(int num){
        return (num & 1) == 1;
    }
}

//The only difference in a top level interface and a nested interface
//is , that a top level interface has to be public or the default one , but
//a nested interface can be of any access modifier type
