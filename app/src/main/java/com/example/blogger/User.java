package com.example.blogger;

import java.util.ArrayList;

public class User {

    public static  String name;


    private   String nameUser;
    private  String emailUser;
    private String passwordUser;

    public static  ArrayList<User> userArrayList = new ArrayList<>();

    public User(String nameUser, String emailUser, String passwordUser) {
        this.nameUser = nameUser;
        this.emailUser = emailUser;
        this.passwordUser = passwordUser;
    }

    public String getNameUser() {
        return nameUser;
    }

    public String getEmailUser() {
        return emailUser;
    }

    public String getPasswordUser() {
        return passwordUser;
    }
}
