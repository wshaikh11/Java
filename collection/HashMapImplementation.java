package org.example.collection;

import java.util.HashMap;
import java.util.Map;

// implement the map interface
public class HashMapImplementation {

    public static void main(String[] args){
        //in map we store key value pair
        HashMap<String,Integer> hashMap = new HashMap<>();

        //as soon as call put method
        //internally bucket of size 16 will be created(0 to 15 )
        //threshold value is 12, as soon as the 12 buckets are filled,
        // then bucket size is increased

        //in buckets we have nodes hash-key-value-next (linked-list)
        hashMap.put("MIT",1);

        //this method will give us the hash, and then we are calculating the index of bucket
        //put(k,v){
        // hash = hashCode(k)
        // index = hash & n-1
        // }

        //suppose we got the index as 4
        //so at index 4 of the bucket, we store hash-MIT-1-null

        //suppose now the index return of below put is 4
        // we already have data stored on the 4th index
        // now next of the 4 th index will store the address of new node
        // hash-MIT-1-address-hash-VIT-2-null

        //now the hash is matching,
        //then it will apply equals() to the kay, as the key are different,
        //next will store the address of the new node
        hashMap.put("VIT",2);

        // next scenario is we put duplicate key
        //it will calculate the hash(it will be same), index(same),
        // equals(key) will be called,it will be replaced
        hashMap.put("VIT",3);

        for(Map.Entry abc : hashMap.entrySet()){
            System.out.println(abc.getKey() + " " + abc.getValue());
        }

        // we we pass the null key, it will be stored at the 0th position;

    }


}
