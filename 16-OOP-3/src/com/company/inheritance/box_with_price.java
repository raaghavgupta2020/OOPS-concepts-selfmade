package com.company.inheritance;

public class box_with_price extends box_with_weight{

    double price;

    public box_with_price(){
        super();
        this.price = -1;
    }

    public box_with_price(double price){
        super();
        this.price=price;
    }

    public box_with_price(double l,double h,double w,double weight,double price){
        super(l,h,w,weight);
        this.price=price;
    }

    public box_with_price(double side , double weight , double cost){
        super(side,weight);
        this.price = cost;
    }

    public box_with_price( box_with_price other){
        super(other);
        this.price = other.price;
    }

}
