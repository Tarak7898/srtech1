package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LoginTest {

    @Test
    public void testAuthenticateWithValidCredentials() {
        // Arrange
        String username = "admin";
        String password = "password123";

        // Act
        boolean result = Login.authenticate(username, password);

        // Assert
        assertTrue(result, "The authenticate method should return true for valid credentials.");
    }

    @Test
    public void testAuthenticateWithInvalidUsername() {
        // Arrange
        String username = "wrongUser";
        String password = "password123";

        // Act
        boolean result = Login.authenticate(username, password);

        // Assert
        assertFalse(result, "The authenticate method should return false for an invalid username.");
    }

    @Test
    public void testAuthenticateWithInvalidPassword() {
        // Arrange
        String username = "admin";
        String password = "wrongPass";

        // Act
        boolean result = Login.authenticate(username, password);

        // Assert
        assertFalse(result, "The authenticate method should return false for an invalid password.");
    }

    @Test
    public void testAuthenticateWithInvalidUsernameAndPassword() {
        // Arrange
        String username = "wrongUser";
        String password = "wrongPass";

        // Act
        boolean result = Login.authenticate(username, password);

        // Assert
        assertFalse(result, "The authenticate method should return false for both invalid username and password.");
    }
}

