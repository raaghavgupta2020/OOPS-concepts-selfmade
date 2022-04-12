package com.company.inheritance;

//box with weight will have all the properties of box and it
// also has the property "weight"

public class box_with_weight extends Box{
    double weight;

    public box_with_weight(){ //making a constructor
        this.weight = -1;
    }

    public box_with_weight(double side , double weight){
        super(side);
        this.weight=weight;
    }


    //we want to use the properties present in the parent class
    public box_with_weight(double l , double h , double w , double weight){
        super(l,h,w); //call the parent class constructor
        //(these values are from the parent class)
        this.weight = weight;
        //here the super and this.weight statements can't be interchanged as constructor of the
        //superclass has to be initialized first , then we can access the members of the child
    }

    public box_with_weight(double weight){
        //here im not giving the super keyword hence the default constructor of the super class
        //will be called internally and l,h,w will become -1.0
        this.weight = weight;
    }

    public box_with_weight(box_with_weight box4){
        super(box4);
        this.weight = box4.weight;
        //this refers to box7
    }

}
