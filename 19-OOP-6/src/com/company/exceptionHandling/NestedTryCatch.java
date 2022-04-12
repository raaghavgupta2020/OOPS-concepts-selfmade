package com.company.exceptionHandling;

public class NestedTryCatch {
    public static void main(String[] args) {
        try {

//            int b = 40/0; //none of the nested try-catch blocks will run if this is handled

            try {
                String s = "hello";
                int a = Integer.parseInt(s); //This integer parse int has to be put in try catch block always.
            } catch (NumberFormatException e) {
                System.out.println(e);
            }

            try{
                int[] a = new int[5];
                a[5] = 100;
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println(e);
            }

        }
        catch(Exception e){
            System.out.println("General Exception"); //this will be printed if exception is not handled by the main try block
        }
        finally {
            System.out.println("This will print anyway");
        }

        System.out.println("program continues");

    }
}
