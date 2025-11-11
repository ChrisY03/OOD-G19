package data;

import java.io.*;
import java.util.*;

public class CSVReader {
    public static List<String[]> readCSV(String filePath) {
        List<String[]> data = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] row = line.split(",");
                data.add(row);
            }
    } catch (IOException e) {
        System.err.println("Error reading CSV file: " + filePath);
        e.printStackTrace();
    }
    return data;
    }
}


