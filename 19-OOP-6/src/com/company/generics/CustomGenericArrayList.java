//https://docs.oracle.com/javase/tutorial/java/generics/erasure.html
package com.company.generics;

import java.util.Arrays;

public class CustomGenericArrayList<T>{ //this is just a template , T is the parameterised type

    @Override
    public String toString(){
        return("CustomArrayList = " + Arrays.toString(data) + " and size = " + index);
    }

    private Object[] data; //creating an array
    private static int DEFAULT_SIZE = 10;
    private int index = 0;

    public CustomGenericArrayList(){
        this.data = new Object[DEFAULT_SIZE];
    }

    public void add (T num){
        if(isFull()){
            resize();
        }
        data[index++] = num;
    }

    public boolean isFull(){
        return (index == data.length);
    }

    public void resize(){

        Object[] temp = new Object[data.length * 2];
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    public T remove(){
        T removed = (T)(data[--index]); //here CASTING IS REQUIRED AS OBJECT IS A BIGGER DATA TYPE AND T COMES UNDER IT , NOT VICE VERSA
        return removed;
    }

    public T get (int index){
        return (T)data[index];
    }

    public int size(){
        return index;
    }

    public void set(int Index , T Value ){
        data[Index] = Value;
    }


    public void show_list(){
        System.out.println(Arrays.toString(data));
    }

    public static void main(String[] args) {

        //Integer
        CustomGenericArrayList<Integer> list2 = new CustomGenericArrayList<>();
        list2.add(3);
        for (int i = 0; i < 15; i++) {
            list2.add(i*2);
        }
        System.out.println(list2);


        //String
        CustomGenericArrayList<String> list3 = new CustomGenericArrayList<>();
        list3.add("R");
        System.out.println(list3);
    }


}
