package com.company.exceptionHandling;

import java.util.Scanner;

public class MyException extends Exception{
    //Let's say I want to create my own exception now
    public MyException(String message){ //constructor *Important*
        super(message); //by this we are calling the constructor of the parent class ,i.e, Exception class
    }


    public static void main(String[] args) throws MyException { //this means that, there may be an exception or more of 'MyException' type thrown in this method
//        int a = 5;
//        int b = 0;
        try{
            Scanner in = new Scanner(System.in);
            String name = in.next();
            if(name.equals("Raghav")){
                throw new MyException("name is Raghav");
            }else{
                throw new Exception("general exception");
            }
        }catch(MyException e){
            System.out.println(e.getMessage());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("This will always execute");
        }
    }

}
