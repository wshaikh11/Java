package org.example.oops.abstraction;

//On focusing on the important stuff and ignoring the unimportant one
//like if you need to call someone, and someone has an apple or samsung phone
//for calling you just need a phone, irrespective of the company
//for eg you need a chair/table to sit, you will ot look if the table/chair has four corner
//support or in the middle
//we are focusing on the main thing and not on the implementation of it

//for eg, if i had repair shop class and in it  has repair function
//now i have two separate class, samsung , apple,
//now if i want to repair iphone, then iphone should be pass in repair function,
//but what if i had an abstract class of phone and apple and samsung extends it
//now only phone will be passed to repair


//We cannot create object of abstract class, we can create object of derived class it is extending

// abstract method can have non-abstract as well as abstract method
abstract class Bike{
    abstract void run();

    public void demo(){
        System.out.println("In demo");
    }
}

class Honda extends Bike{
    public void run(){
        System.out.println("Running");
    }
}
public abstract class AbstractionExample {
    public static void main(String[] args){
        Bike bike = new Honda();
        bike.run();
    }

}
