package com.company.Matrix;

public class Matrix implements Manipulation{
    public void Addition() {
        System.out.println("Addition = " + (a+b));
    }
    public void Subtraction() {
        System.out.println("Subtraction = " + (a-b));
    }
    public void Multiplication() {
        System.out.println("Multiplication = " + (a*b));
    }
    public void Division() {
        System.out.println("Division = " + (a/b));
    }
    public static void main(String[] args) {
        Matrix m = new Matrix();
        m.Addition();
        m.Subtraction();
        m.Multiplication();
        m.Division();
    }
}
