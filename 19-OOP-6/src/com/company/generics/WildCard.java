//https://docs.oracle.com/javase/tutorial/java/generics/erasure.html
package com.company.generics;

import java.security.PublicKey;
import java.util.Arrays;
import java.util.List;

//NOW WE WANT THAT ONLY DATA TYPES UNDER THE NUMBER CLASS CAN BE USED IN <T>
//HERE , T COULD EITHER BE NUMBER CLASS OR SUBCLASSES OF NUMBER CLASS
public class WildCard <T extends Number> {

    @Override
    public String toString(){
        return("CustomArrayList = " + Arrays.toString(data) + " and size = " + index);
    }

    private Object[] data; //creating an array
    private static int DEFAULT_SIZE = 10;
    private int index = 0;

    public WildCard(){
        this.data = new Object[DEFAULT_SIZE];
    }

    //WILDCARD EXAMPLE
//    public void getList(List<Number> list){
//        //HERE WE CAN ONLY PASS NUMBER TYPE BUT NOT THE SUBCLASSES OF NUMBER
//        //IF WE WANT TO PASS THE SUBCLASSES OF NUMBER AS WELL ,WE HAVE TO DO LIKE
//    }
    public void getList(List<? extends Number> list){
        //do something with the list now
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
        T removed = (T)(data[--index]);
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

        WildCard<Integer> list2 = new WildCard<>();
        list2.add(3);
        for (int i = 0; i < 15; i++) {
            list2.add(i*2);
        }
        System.out.println(list2);


//        WildCard<String> list3 = new WildCard<>();
//        list3.add("R");
//        System.out.println(list3);

        //THIS WILL GIVE ERROR NOW AS STRING CLASS DOESN'T EXTEND THE NUMBER CLASS
        //i.e, String is not a subclass of Number class
    }


}
