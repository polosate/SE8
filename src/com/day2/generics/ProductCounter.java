package com.day2.generics;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class ProductCounter {

    // Create a Counting Map
    private Map<String, Long> productCountMap = new HashMap<>();
    private Map<String, String> productNames = new TreeMap<>();

    public ProductCounter(Map productNames) {
        this.productNames = productNames;
    }

    // Create a Name Mapping Map
    public static void main(String[] args) {

        // List of part data
        String[] parts = new String[]{"1S01", "1S01", "1S01", "1S01", "1S01", "1S02", "1S02", "1S02", "1H01", "1H01", "1S02", "1S01", "1S01", "1H01", "1H01", "1H01", "1S02", "1S02", "1M02", "1M02", "1M02"};

        // Create Product Name Part Number map
        Map<String, String> productNames = new TreeMap<>();
        productNames.put("Blue Polo Shirt", "1S01");
        productNames.put("Black Polo Shirt", "1S02");
        productNames.put("Red Ball Cap", "1H01");
        productNames.put("Duke Mug   ", "1M02");

        ProductCounter pc1 = new ProductCounter(productNames);
        pc1.processList(parts);
        pc1.printReport();

        // Create Product Counter Object and process data
    }

    public void processList(String[] list) {
        long curVal = 0;
        for (String item : list) {
            if (this.productCountMap.containsKey(item)) {
                curVal = this.productCountMap.get(item);
                curVal++;
                this.productCountMap.put(item, curVal);
            } else {
                this.productCountMap.put(item, new Long(0));
            }
        }
    }

    public void printReport() {
        System.out.println("=== Product Report ===");
        for (String key : this.productNames.keySet()) {
            System.out.print("Name: " + this.productNames.get(key));
            System.out.println("\t\tCount: " + this.productCountMap.get(this.productNames.get(key)));
        }
    }
}
