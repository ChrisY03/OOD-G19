package data;

import java.io.*;
import java.util.*;

/**
 * a class used to read data from CSV files
 * Each line of the CSV file is split into a String array and returned in a list.
 */
public class CSVReader {

    /**
     * Reads a CSV file from the given file path and returns its contents.
     *
     * @param filePath the path to the CSV file
     * @return a list of String arrays, where each array represents one row in the CSV
     */
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


