package com.example.registerproject;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class RegisterApplicationTest {

    @ParameterizedTest
    @ValueSource(strings = {"", "calliope", "@yahoo.com", "peko ra@gmail.com"})
    public void rejectInvalidEmail(String emailTest) {
        UserRegistrar testUser = new UserRegistrar(emailTest, "Matsu123456");
        assertFalse(testUser.isAnEmail());
    }

    @ParameterizedTest
    @ValueSource(strings = {"calliopechan@yahoo.ie", "pekorapeko@gmail.com"})
    public void acceptValidEmail(String emailTest) {
        UserRegistrar testUser = new UserRegistrar(emailTest, "Matsu123456");
        assertTrue(testUser.isAnEmail());
    }

    @ParameterizedTest
    @ValueSource(strings = {"", "m@tsu7", "ca!10"})
    public void rejectPasswordLength(String passwordTest) {
        UserRegistrar testUser = new UserRegistrar("pekorapeko@gmail.com", passwordTest);
        assertFalse(testUser.isValidLength());
    }

    @ParameterizedTest
    @ValueSource(strings = {"kikkeriki&1", "42pekora!peko"})
    public void acceptPasswordLength(String passwordTest) {
        UserRegistrar testUser = new UserRegistrar("pekorapeko@gmail.com", passwordTest);
        assertTrue(testUser.isValidLength());
    }
    
     @ParameterizedTest
    @ValueSource(strings = {"^@1164@8&!", "@^097613@!!$"})
    public void hasNoLetters(String passwordTest) {
        UserRegistrar testUser = new UserRegistrar("pekorapeko@gmail.com", passwordTest);
        assertFalse(testUser.hasLetter());
    }

    @ParameterizedTest
    @ValueSource(strings = {"kikkeriki&1", "42pekora!peko"})
    public void hasLetters(String passwordTest) {
        UserRegistrar testUser = new UserRegistrar("pekorapeko@gmail.com", passwordTest);
        assertTrue(testUser.hasLetter());
    }

    @ParameterizedTest
    @ValueSource(strings = {"kikkeriki&!", "@^pekora!peko"})
    public void hasNoDigits(String passwordTest) {
        UserRegistrar testUser = new UserRegistrar("pekorapeko@gmail.com", passwordTest);
        assertFalse(testUser.hasDigit());
    }

    @ParameterizedTest
    @ValueSource(strings = {"kikkeriki&1", "42pekora!peko"})
    public void hasDigits(String passwordTest) {
        UserRegistrar testUser = new UserRegistrar("pekorapeko@gmail.com", passwordTest);
        assertTrue(testUser.hasDigit());
    }

    @ParameterizedTest
    @ValueSource(strings = {"kikkeriki11", "42pekora2peko"})
    public void hasNoSymbols(String passwordTest) {
        UserRegistrar testUser = new UserRegistrar("pekorapeko@gmail.com", passwordTest);
        assertFalse(testUser.hasSymbol());
    }

    @ParameterizedTest
    @ValueSource(strings = {"kikkeriki&1", "42pekora!peko"})
    public void hasSymbols(String passwordTest) {
        UserRegistrar testUser = new UserRegistrar("pekorapeko@gmail.com", passwordTest);
        assertTrue(testUser.hasSymbol());
}
