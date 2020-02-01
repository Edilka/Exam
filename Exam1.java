package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Exam11 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<Integer> ();
        HashSet<Integer> integers= new HashSet<Integer> (  );
        for (int i = 0; i < 100; i++) {
            linkedList.add(i);
            if(i%2==0 && i%5==0){
                integers.add ( i );
            }
            else {
            }
        }
        for (int i = 0; i <linkedList.size (); i++) {
            if(i%2==0 && i%5!=0){
                integers.add ( i );
            }
        }
    }
}
