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


}
