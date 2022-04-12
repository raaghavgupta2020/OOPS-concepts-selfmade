package com.company.raghav;

import java.util.Scanner;

public class mmain {
    static int n=1;
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);

        String regno;

        while(n==1)
        {
            System.out.println("Enter regno: ");
            regno=s.nextLine();
            try
            {
                checkreg(regno);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
        int arr[]=new int[5];
        System.out.println("ENTER 5 MARKS");
        for (int i=0;i<5;i++)
        {
            arr[i]=s.nextInt();
            try
            {
                checkMarkNeg(arr[i]);
            }
            catch(Exception e)
            {
                System.out.println(e.getMessage());
            }
            try
            {
                checkMark100(arr[i]);
            }
            catch(Exception e)
            {
                System.out.print(e.getMessage());
            }
        }
    }
    static void checkreg(String reg) throws invalidReg
    {

        System.out.println( "Branch - " + reg.substring(2,5));

        if( ((Integer.parseInt(reg.substring(0,2)))>9 && (Integer.parseInt(reg.substring(0,2)))<=99 && (reg.substring(2,5).equals("BIT")) && (Integer.parseInt(reg.substring(5,9)))>999 && (Integer.parseInt(reg.substring(5,9)))<=9999 ) || ((Integer.parseInt(reg.substring(0,2)))>9 && (Integer.parseInt(reg.substring(0,2)))<=99 && (reg.substring(2,5).equals("BCE")) && (Integer.parseInt(reg.substring(5,9)))>999 && (Integer.parseInt(reg.substring(5,9)))<=9999))//end index is exclusive
        {
            System.out.print("VALID REGNO\n");
            n=0;
        }
        else
        {
            throw new invalidReg("INVALID REGNO\n");
        }
    }
    static void checkMarkNeg(int a) throws Negative
    {
        if(a<0)
        {
            throw new Negative("NegativeMarkException\n");
        }
    }
    static void checkMark100(int a) throws greater100
    {
        if(a>100)
        {
            throw new greater100("outOfRangeException\n");
        }
    }
}
class invalidReg extends Exception
{
    invalidReg(String s)
    {
        super(s);
    }
}
class Negative extends Exception
{
    Negative(String s)
    {
        super(s);
    }
}
class greater100 extends Exception
{
    greater100(String s)
    {
        super(s);
    }
}

