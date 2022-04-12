package com.company;

public class A {
    private int num; //we can use this num via getters and setters
    String name;
    int[] arr;

    public int getNum(){
        return this.num;
    }

    public void setNum(int num){
        this.num=num;
    }

    A(int num , String name){
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }
}
