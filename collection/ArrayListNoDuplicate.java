package org.example.collection;

import java.util.ArrayList;
import java.util.HashSet;

public class ArrayListNoDuplicate extends ArrayList {


    public boolean add(Object o){
        if(this.contains(o)){
            return true;
        }
        else {
            return super.add(o);
        }
    }
    public static void main(String[] args){
        ArrayListNoDuplicate arrayListNoDuplicate = new ArrayListNoDuplicate();
        arrayListNoDuplicate.add(1);
        arrayListNoDuplicate.add(2);
        arrayListNoDuplicate.add(1);

        System.out.println(arrayListNoDuplicate);

        // when we see add method of hashset, it implement the map put method
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(1);
        hashSet.add(2);

        //but if there is object instead of primitive type then duplicate are allowed
        // unless it has override the equals method and hashcode method

    }
}
