package org.example.oops.inheritance;

//inheritance means inheriting the properties from parent to child
//derived class will have functionality of base class
// single : derived class extend base class
// multilevel : derived class extend base class, derived1 class extend derived class
// hierarchical : derived class extends  base, derived class1 extends base class

// multiple inheritance is not allowed in java becoz of ambiguity
// like class a extends class b, class c
// if class b and c have same function, and if we create obj of class a
// then we dont know whos function to call of class b or class c

// inorder to solve this issue in java we have came with default method in interface
public class MultipleInheritanceExample implements Interface1,Interface2 {
    public static void main(String[] args) {
        MultipleInheritanceExample inheritanceExample = new MultipleInheritanceExample();
        inheritanceExample.demo();

    }

    @Override
    public void demo() {
        Interface1.super.demo();
    }
}
