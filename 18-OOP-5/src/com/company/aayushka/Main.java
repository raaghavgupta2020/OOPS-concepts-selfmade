package com.company.aayushka;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter time for representing in first format");
        digital_clock obj1 = new digital_clock();
        obj1.set_time();
        obj1.display();
        System.out.println("After incrementing : ");
        obj1.increment();
        obj1.display();

        System.out.println();
        System.out.println("Enter time for representing in second format");
        minute_clock obj2 = new minute_clock();
        obj2.set_time();
        obj2.display();
        System.out.println("After incrementing : ");
        obj2.increment();
        obj2.display();
    }
}

interface time{
    void display();
    void increment();
}

interface setting_time{
    void set_time();
}

class digital_clock implements setting_time,time{
    int hour;
    int min;
    int second;


    @Override
    public void set_time() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter hour:");
        this.hour = in.nextInt();
        System.out.println("Enter minute:");
        this.min = in.nextInt();
        System.out.println("Enter second:");
        this.second = in.nextInt();
    }

    @Override
    public void display() {
        System.out.println(this.hour + ":" + this.min + ":" + this.second );
    }

    @Override
    public void increment() {
        this.hour++;
    }
}


class minute_clock implements setting_time,time{
    int hour;
    int min;
    @Override
    public void set_time() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter hour:");
        this.hour = in.nextInt();
        System.out.println("Enter minute:");
        this.min = in.nextInt();
    }

    @Override
    public void display() {
        System.out.println(this.hour + ":" + this.min);
    }

    @Override
    public void increment() {
        this.hour++;
    }
}