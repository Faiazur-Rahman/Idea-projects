package org.example;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            CSVPrinter printer = new CSVPrinter(System.out, CSVFormat.EXCEL);
            printer.printRecord("Zaiaf", "Rahman", 5, "(!Hates) it!!");
            printer.printRecord("Jubi","do",6,"do");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}