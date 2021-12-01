package com.example.registerproject;

public class UserRegistrar {
    private final String password;
    private final String email;

    public UserRegistrar(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public void printAll() {
        System.out.println(email);
        System.out.println(password);
    }

    public String getEmail() {
        return this.email;
    }
    public String getPassword() {
        return this.password;
    }
}
