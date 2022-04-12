package com.company.exceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;

        try{
//            int c = a/b;
            divide(a,b);
//            throw new Exception("hey now the ArithmeticException catch won't run");
            //if there are more exceptions here , all of those are avoided
            //and just after handling the first exception , our program control goes
            //out of these try-catch blocks and starts executing the remaining code
            //this means , at a time only one exception is occurred and only one catch block is executed
            //all catch blocks must be ordered from most specific to most general (Exception e) exception


        }catch (ArithmeticException obj ){ // Exception e = new ArithmeticException(); , the method will run according to the object type only
            System.out.println(obj.getMessage());
            //we can also put less restrictive calls below this call in a catch block itself
        }catch(Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("This will always execute ");
        }
    }

    static int divide(int a , int b)  throws ArithmeticException{
//        return (a/b);
        if(b==0){
            throw new ArithmeticException("error message : Please do not divide by 0");
            //whenever we throw a new Exception we have to declare it above as well
        }
        return a/b;
    }
}
