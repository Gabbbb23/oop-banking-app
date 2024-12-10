/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bsrtu.bankingapp;

/**
 *
 * @author Temporary User
 */
import java.io.*;
import java.net.URL;
import java.util.*;
import javax.crypto.*;
import javax.crypto.spec.*;
import java.nio.file.*;

public class FileEncryptionManager {

    public static List<String> readDecryptedFile(URL fileURL) throws Exception {
        List<String> decryptedRecords = new ArrayList<>();
        
        try (InputStream inputStream = fileURL.openStream();
             BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {

            String line;
            while ((line = reader.readLine()) != null) {
                String decryptedRecord = EncryptionUtil.decrypt(line);
                decryptedRecords.add(decryptedRecord);
            }
        }
        return decryptedRecords;
    }

    public static void writeEncryptedFile(URL fileURL, List<String> data) throws Exception {
        // Convert URL to a File object for writing
        File file = new File(fileURL.toURI());
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            for (String record : data) {
                String encryptedRecord = EncryptionUtil.encrypt(record);
                writer.write(encryptedRecord);
                writer.newLine();
            }
        }
    }

    public static List<String[]> loadUserData(URL fileURL) throws Exception {
        List<String> decryptedRecords = readDecryptedFile(fileURL);
        List<String[]> userData = new ArrayList<>();

        for (String record : decryptedRecords) {
            String[] fields = record.split(",");
            userData.add(fields);
        }

        return userData;
    }

    public static void saveUserData(URL fileURL, List<String[]> userData) throws Exception {
        List<String> records = new ArrayList<>();

        for (String[] user : userData) {
            String record = String.join(",", user);
            records.add(record);
        }

        writeEncryptedFile(fileURL, records);
    }
}
