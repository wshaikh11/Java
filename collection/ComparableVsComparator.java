package org.example.collection;

//comparable single sorting sequence like id OR name etc
//comparator is multi sorting sequence like id,name etc

//comparable affects the original class
//comparator dose not affects the original class

//comparable provide compareTo() method
//comparator provides compare() method

//comparable present in java,lan
//comparator present in java,util

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//comparable : collections,sort(list)
//comparator: collections,sort(list,comparator)
public class ComparableVsComparator {
    public static void main(String[] args){
        List<Student> studentList = new ArrayList<>();
        Student s1= new Student(22,"wasim");
        Student s2= new Student(24,"wasim");
        Student s3= new Student(21,"wasim");
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        //Collections.sort(studentList);

        Collections.sort(studentList, new Student());
        System.out.println(studentList);


    }
}
