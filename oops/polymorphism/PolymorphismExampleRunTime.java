package org.example.oops.polymorphism;

public class PolymorphismExampleRunTime extends Bike{

    public void run(){
        System.out.println("In derived class run");
    }

    public static void main(String[] args){
        PolymorphismExampleRunTime polymorphismExampleRunTime = new PolymorphismExampleRunTime();
        //bike is reference type variable and we are creating instance of Poly
        //so, run method of poly will be called
        Bike bike = new PolymorphismExampleRunTime(); // here we are doing upcasting
        bike.run();

        // here we are creating the instance of bike so run of bike will be called
        Bike bike1 = new Bike();
        bike1.run();


    }
}
