package com.example.java;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        String[] arr1 = {"1", "2", "3", "4", "5", "6", "7"};
        String[] arr2= {"Book1", "Book2", "Book3", "Book4", "Book5", "Book6"};
        ArrayList<String> list1 = new ArrayList<String>(Arrays.asList(arr1));
        ArrayList<String> list2 = new ArrayList<String>(Arrays.asList(arr2));
        TreeMap<String, String> map = new TreeMap<>();
        System.out.println("Array 1 of keys:" + list1);
        System.out.println("Array 2 of values:" + list2);
        int n1 = list1.size();
        int n2 = list2.size();
            if(n1 >=n2){
                try {
                    for (int i = 0; i < n1; i++) {
                        map.put(list1.get(i), list2.get(i));
                    }
                }
                catch(Exception e){
                    System.out.println("\nValue is not enough for map");
                }
        }
            else {
                try {
                    for (int i = 0; i < n2; i++) {
                        map.put(list1.get(i), list2.get(i));
                    }
                }
                catch(Exception e){
                    System.out.println("\nKey is not enough for map");
                }
            }
        System.out.println("Map:" + map);
        }

    }
