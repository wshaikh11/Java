package org.example.collection;

import java.util.Comparator;

public class Student implements Comparable<Student>, Comparator<Student> {
    private int age;
    private String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Student(){

    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student student) {
        if(age == student.age){
            return 0;
        } else if (age > student.age) {
            return 1;
        }
        else {
            return -1;
        }
    }

    @Override
    public int compare(Student student1, Student student2) {
        if(student1.age == student2.age){
            return 0;
        } else if (student1.age > student2.age) {
            return 1;
        }
        else {
            return -1;
        }
    }
}
