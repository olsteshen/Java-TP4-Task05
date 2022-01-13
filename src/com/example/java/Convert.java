package com.example.java;

import java.util.Map;
import java.util.TreeMap;

public class Convert {
    int n1, n2;
    public <K, V> Map<K, V> convertVarA(K[] x, V[] y) {
        n1 = x.length;
        n2 = y.length;
        TreeMap<K, V> map = new TreeMap<>();
        if (n1 >= n2) {
            try {
                for (int i = 0; i < n1; i++) {
                    map.put(x[i], y[i]);
                }
            } catch (Exception e) {
                System.out.println("Value is not enough for map");
            }
        } else {
            try {
                for (int i = 0; i < n2; i++) {
                    map.put(x[i], y[i]);
                }
            } catch (Exception e) {
                System.out.println("Key is not enough for map");
            }
        }
        return map;
    }

    public <K, V> Map<K, V> convertVarB(K[] x, V[] y) {
      n1 = x.length;
      n2 = y.length;
        TreeMap<K, V> map = new TreeMap<>();
        if (n1 >= n2) {
                for (int i = 0; i < n2; i++) {
                    map.put(x[i], y[i]);
                }
                for (int i = n2; i < n1; i++) {
                    map.put(x[i], null);
                }
        } else {
            for (int i = 0; i < n1; i++) {
                map.put(x[i], y[i]);
            }
        }
        return map;
    }
}