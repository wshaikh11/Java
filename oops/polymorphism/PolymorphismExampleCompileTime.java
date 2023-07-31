package org.example.oops.polymorphism;


//Polymorphism means many forms
//real life example human
//compile poly
//runtime poly

//compile time: same name function but different params (Function Overloading)
public class PolymorphismExampleCompileTime {

    int age;
    String name;

    public void getInfo(String name){
        this.name = name;
        System.out.println(name);
    }

    public void getInfo(int age){
        this.age=age;
        System.out.println(age);
    }

    public void getInfo(String name,int age){
        this.name = name;
        this.age=age;
        System.out.println(name + " " + age );
    }

    public static void main(String[] args){
        PolymorphismExampleCompileTime polymorphismExample = new PolymorphismExampleCompileTime();
        polymorphismExample.getInfo("Wasim");
        polymorphismExample.getInfo(30);
        polymorphismExample.getInfo("Wasim",30);
    }

}
