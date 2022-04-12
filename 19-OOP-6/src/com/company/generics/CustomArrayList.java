package com.company.generics;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomArrayList {

    public static void main(String[] args) {

//        ArrayList list = new ArrayList();

        //methods provided by java
//        list.add(45);
//        list.remove(0);
//        list.get(0);
//        list.set(1,3487);
//        list.size();
//        list.isEmpty();
        //now lets try to create methods on our own in this code

        CustomArrayList list = new CustomArrayList();
        list.add(55);
        list.add(7);
        list.add(65);
        list.add(5);
        list.show_list();
        System.out.println(list);
    }

    //we also have to override the toString method to directly print the array using the object itself and without creating a method
    @Override
    public String toString(){
        return("CustomArrayList = " + Arrays.toString(data) + " and size = " + index);
    }

    //internally we want to save the data in an array only, and we don't want people to make changes to it hence it should be private
    private int[] data; //creating an array
    private static int DEFAULT_SIZE = 10;
    private int index = 0; //internal size for the array is also defined by this variable

    public CustomArrayList(){
        this.data = new int[DEFAULT_SIZE]; //as soon as we create an object for our custom array list , the array will have a default size = 10
    }

    //now let's create our own add method , this has to be public as we have to use it everywhere
    public void add (int num){
        if(isFull()){
            resize();
        }
        data[index++] = num;
    }

    public boolean isFull(){
        return (index == data.length); //if length of our array =10 and we have filled till 9th index and now index value is also 10 which isn't available in
        //our array , this means that our array is full.
    }

    public void resize(){

        int[] temp = new int[data.length * 2];
        //copy the current items into the temporary array
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp; //the previous array to which data (reference variable was pointing to is now out of scope or it is taken by the garbage collection)
    }

    public int remove(){
        int removed = data[--index];
        return removed;
        //we are just reducing the index by 1 instead of deleting anything , the index will be on the element to be removed
        //and when we will add a new element , then the removed element will be over-written by this new added element
    }

    public int get (int index){
        return data[index];
    }

    public int size(){
        return index; //basically the current size of the array
    }

    public void set(int Index , int Value ){
        data[Index] = Value;
    }

    //we can also print string like this
    public void show_list(){
        System.out.println(Arrays.toString(data));
    }


}
