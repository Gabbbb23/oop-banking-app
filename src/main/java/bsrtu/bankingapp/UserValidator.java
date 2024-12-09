/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bsrtu.bankingapp;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

import java.io.InputStreamReader;
import java.io.InputStream;
import java.io.IOException;
import java.util.List;
/**
 *
 * @author Gab
 */

public class UserValidator {
    public static boolean validateLogin(String username, String password) throws IOException, CsvException {
        
        InputStream inputStream = UserValidator.class.getResourceAsStream("/users.csv");
        if (inputStream == null) {
            throw new IOException("CSV file not found");
        }
        
        try (CSVReader reader = new CSVReader(new InputStreamReader(inputStream))) {
            List<String[]> records = reader.readAll();
            for (String[] record : records) {
                if (record[0].equals(username) && record[1].equals(password)) {
                    
                    return true;
                }
            }
        }
        return false;
    }
    
    public static boolean validatePin(String PIN) throws IOException, CsvException {
        InputStream inputStream = UserValidator.class.getResourceAsStream("/users.csv");
        if (inputStream == null) {
            throw new IOException("CSV file not found");
        }
        
        try (CSVReader reader = new CSVReader(new InputStreamReader(inputStream))) {
            List<String[]> records = reader.readAll();
            for (String[] record : records) {
                if (record[10].equals(PIN)) {
                    return true;
                }
            }
        }
        return false;
    }
}
