package com.example.java;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] arr1 = {"1", "2", "3", "4", "5", "6", "7"};
        String[] arr2 = {"Book1", "Book2", "Book3", "Book4", "Book5", "Book6", "Book7", "Book8"};
        Integer arr3[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Integer arr4[] = {100, 200, 300, 400, 500, 600, 700, 800};
        ArrayList<String> list1 = new ArrayList<>(Arrays.asList(arr1));
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList(arr2));
        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(arr3));
        ArrayList<Integer> list4 = new ArrayList<>(Arrays.asList(arr4));

        System.out.println("Array 1:" + list1);
        System.out.println("Array 2:" + list2);
        System.out.println("Array 3:" + list3);
        System.out.println("Array 4:" + list4);

        Convert conv = new Convert();
        //variant 1: if K > V -  write null to the value,if K < V  - do not process extra values
        Map<String, String> newmap1 = conv.convertb(arr1, arr2);
        System.out.println("==Variant 1==");
        System.out.println("Map 1 (arr1 as keys and arr2 as values) :" + newmap1);
        //variant 2: if K > V - "Value is not enough for map" error; if K < V - "Key is not enough for map" error
        System.out.println("==Variant 2==");
        Map<String, String> newmap2 = conv.converta(arr1, arr2);
        System.out.println("Map 2 (arr1 as keys and arr2 as values):" + newmap2);
        Map<Integer, Integer> newmap3 = conv.converta(arr3, arr4);
        System.out.println("Map 3 (arr3 as keys and arr4 as values):" + newmap3);
        Map<Integer, String> newmap4 = conv.converta(arr3, arr2);
        System.out.println("Map 4 (arr3 as keys and arr2 as values):" + newmap4);

    }

}
