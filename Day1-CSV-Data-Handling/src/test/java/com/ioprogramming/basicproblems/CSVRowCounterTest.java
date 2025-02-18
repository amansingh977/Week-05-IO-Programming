package com.ioprogramming.basicproblems;

import org.junit.Test;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.Assert.assertEquals;

public class CSVRowCounterTest {

    private static final String TEST_CSV_FILE = "D://Capgemini//Week05_No_Git//Day1-CSV-Data-Handling//src//test//java//com//ioprogramming//basicproblems//test_employees.csv";

    @Test
    public void testCountRecords() throws IOException {
        // Create a test CSV file
        createTestCSV();

        int count = CSVRowCounter.countRecords(TEST_CSV_FILE);
        assertEquals(5, count); // We wrote 5 records in the test file
    }

    private void createTestCSV() throws IOException {
        try (PrintWriter writer = new PrintWriter(new FileWriter(TEST_CSV_FILE))) {
            writer.println("ID,Name,Department,Salary");
            writer.println("101,Anand,HR,50000");
            writer.println("102,Avinash,IT,60000");
            writer.println("103,Ankit,Finance,55000");
            writer.println("104,Anshika,Marketing,58000");
            writer.println("105,Aakrati,Sales,62000");
        }
    }
}

