package com.example.registerproject;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrar {
    private final String password;
    private final String email;

    private static final Pattern letterPatterns = Pattern.compile("[a-zA-Z]");
    private static final Pattern digitPatterns = Pattern.compile("[\\d]");
    private static final Pattern symbolPatterns = Pattern.compile("[*^&@!]");

    private static Matcher matches;
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

    public boolean isValidLength() {
        return this.password.length() > 6;
    }

    public boolean hasLetter() {
        return letterPatterns.matcher(this.password).find();
    }

    public boolean hasDigit() {
        return digitPatterns.matcher(this.password).find();
    }

    public boolean hasSymbol() {
        return symbolPatterns.matcher(this.password).find();
    }

    public boolean isAnEmail() {
        return Pattern.matches("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", this.email);
    }
}
