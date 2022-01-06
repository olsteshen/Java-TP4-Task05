package com.example.java;

import java.util.Map;
import java.util.TreeMap;

public class Convert {
    public <K, V> Map<K, V> converta(K[] x, V[] y) {
        int n1 = x.length;
        int n2 = y.length;
        TreeMap<K, V> map = new TreeMap<>();
        if (n1 >= n2) {
            try {
                for (int i = 0; i < n1; i++) {
                    map.put(x[i], y[i]);
                }
            } catch (Exception e) {
                System.out.println("\nValue is not enough for map");
            }
        } else {
            try {
                for (int i = 0; i < n2; i++) {
                    map.put(x[i], y[i]);
                }
            } catch (Exception e) {
                System.out.println("\nKey is not enough for map");
            }
        }
        return map;
    }

    public <K, V> Map<K, V> convertb(K[] x, V[] y) {
        int n1 = x.length;
        int n2 = y.length;
        TreeMap<K, V> map = new TreeMap<>();
        if (n1 >= n2) {
            try {
                for (int i = 0; i < n1; i++) {
                    map.put(x[i], y[i]);
                }
            } catch (Exception e) {
                for (int i = n2; i < n1; i++) {
                    map.put(x[i], null);
                }
            }
        } else {
            for (int i = 0; i < n1; i++) {
                map.put(x[i], y[i]);
            }
        }
        return map;
    }
}