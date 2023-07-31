package org.example.oops.encapsulation;

//Encapsulation in Java is a process of wrapping code and data together into a single unit,
// for example, a capsule which is mixed of several medicines.

//We can create a fully encapsulated class in Java by making all the data members of the
// class private. Now we can use setter and getter methods to set and get the data in it

//By providing only a setter or getter method, you can make the class read-only
// or write-only. In other words, you can skip the getter or setter methods.

// in encapsulation we can achieve  data hiding

// access modifiers:
// public : Available everywhere
// private: with the class
// protected : with the package and the class it has been inherited
// default: within the package and if no access modifiers is defined and it is default
class Student{
    protected String collegeName="MIT";
    private String name;

    public String getName() {
        return name;
    }

    public String getCollegeName() {
        return collegeName;
    }


    public void setName(String name) {
        this.name = name;
    }
}
public class EncapsulationExample {
    public static void main(String[] arg){
        Student student = new Student();
        student.setName("Wasim");

    }
}
