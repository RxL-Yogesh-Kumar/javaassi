package com.company;
import java.net.StandardSocketOptions;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer>list1 = new ArrayList<Integer>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);

        System.out.println("list 1:"+list1);

        ArrayList<Integer>list2= new ArrayList<Integer>();
        list2.add(5);
        list2.add(16);
        list2.add(7);
        list2.add(1);

        System.out.println("list 2:"+list2);

        list1.retainAll(list2);

        System.out.println("common element :" +list1);

    }
}
