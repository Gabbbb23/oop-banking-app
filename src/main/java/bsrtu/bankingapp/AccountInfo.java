package bsrtu.bankingapp;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Temporary User
 */
public class AccountInfo {
    private String username;
    private String age;
    private String birthday;
    private String nationality;
    private String phoneNumber;
    private String email;
    private String homeAddress;
    private String maritalStatus;

    // Constructor
    public AccountInfo(String username, String age, String birthday, String nationality,
                       String phoneNumber, String email, String homeAddress, String maritalStatus) {
        this.username = username;
        this.age = age;
        this.birthday = birthday;
        this.nationality = nationality;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.homeAddress = homeAddress;
        this.maritalStatus = maritalStatus;
    }

    // Getters
    public String getUsername() {
        return username;
    }

    public String getAge() {
        return age;
    }
    
    public String getBirthday() {
        return birthday;
    }

    public String getNationality() {
        return nationality;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }
}

