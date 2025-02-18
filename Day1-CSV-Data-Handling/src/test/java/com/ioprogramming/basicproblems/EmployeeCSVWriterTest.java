package com.ioprogramming.basicproblems;
import org.junit.Test;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class EmployeeCSVWriterTest {

    private static final String TEST_CSV_FILE = "D://Capgemini//Week05_No_Git//Day1-CSV-Data-Handling//src//test//java//com//ioprogramming//basicproblems//test_employees.csv";

    @Test
    public void testWriteCSV() throws IOException {
        EmployeeCSVWriter.writeCSV(TEST_CSV_FILE);

        assertTrue(Files.exists(Paths.get(TEST_CSV_FILE))); // Check if file exists

        List<String> lines = Files.readAllLines(Paths.get(TEST_CSV_FILE));
        assertEquals(6, lines.size()); // Header + 5 records
        assertEquals("ID,Name,Department,Salary", lines.get(0));
    }
}
