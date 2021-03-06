package com.day3.lambda.lambdaOperations;

import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author oracle
 */
public class JoinTest {

    public static void main(String[] args) {

        List<SalesTxn> tList = SalesTxn.createTxnList();

        // Print out a sorted list of unique buyer names
        System.out.println("=== Sorted Buyer's List ===");
        String result = ""; //Replace with your stream
        result = tList.stream()
            .map(SalesTxn::getBuyerName)
            .distinct()
            .sorted()
            .collect(Collectors.joining(", "));

        System.out.println("Buyer list: " + result);

    }
}
