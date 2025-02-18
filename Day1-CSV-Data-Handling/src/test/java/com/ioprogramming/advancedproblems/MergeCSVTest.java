package com.ioprogramming.advancedproblems;


import com.ioprogramming.advancedproblems.mergecsv.MergeCSV;
import org.junit.Test;
import java.io.File;
import java.io.IOException;
import java.util.List;
import static org.junit.Assert.*;

public class MergeCSVTest {

    private static final String OUTPUT_FILE = "src/test/resources/merged_students.csv";

    @Test
    public void testMergeCSVFiles() throws IOException {
        String file1Path = "D://Capgemini//Week05_No_Git//Day1-CSV-Data-Handling//src//test//java//com//ioprogramming//advancedproblems//students1.csv";
        String file2Path = "D://Capgemini//Week05_No_Git//Day1-CSV-Data-Handling//src//test//java//com//ioprogramming//advancedproblems//students2.csv";

        MergeCSV.mergeCSVFiles(file1Path, file2Path, OUTPUT_FILE);


        File outputFile = new File(OUTPUT_FILE);
        assertTrue(outputFile.exists());


        List<String> lines = java.nio.file.Files.readAllLines(outputFile.toPath());
        assertEquals(6, lines.size());
        assertTrue(lines.get(1).contains("101,Anand,21,85.5,A"));
        assertTrue(lines.get(2).contains("102,Ankit,22,78.0,B"));
    }
}
