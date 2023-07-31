package org.example.interfacelearning;

//Any service requirement specification
// we cant create of the interface
// we can do it using anonymous class

//in java 8 we can have default as well as static method
//suppose i have 1 interface and it has 100 of
// implementation class , now i have to implement all the method defined in the interface
//static method provides way to add utility methods or helper method for default method
interface InterfaceExample {
    void test(); // methods are public and abstract by default

    int a=5; //variables  are public static and final by default

    default void demo(){

    }

    static void staticMethod(){

    }
}



public class InterfaceDemo {
    public static void main(String[] args){
        InterfaceExample ie = new InterfaceExample() {
            @Override
            public void test() {
                System.out.println("In test");
            }
        };

        ie.test();
        InterfaceExample.staticMethod();
        ie.demo();
    }


}
