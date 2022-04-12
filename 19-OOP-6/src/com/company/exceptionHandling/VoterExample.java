package com.company.exceptionHandling;

import java.util.Scanner;
import java.util.*;

public class  VoterExample extends Exception{
    VoterExample(String s) {
        super(s);
    }
}

class voter {

    static void check(int age) throws VoterExample{
        if(age<18)
            throw new VoterExample("you are not eligible for voting");
        else
            System.out.println("kindly vote to select a good leader");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int age = in.nextInt();
        try{
            check(age);
        }catch(Exception e){
            System.out.println("Exception caught : " + e);
        }
        System.out.println("success...");//error is handled hence this will also run
    }
}

