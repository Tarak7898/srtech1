package com.example;

import java.util.Scanner;

public class Login {

    // Hardcoded credentials (for demonstration only)
    private static final String USERNAME = "admin";
    private static final String PASSWORD = "password123";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Login System ===");

        // Prompt user for username
        System.out.print("Enter username: ");
        String inputUsername = scanner.nextLine();

        // Prompt user for password
        System.out.print("Enter password: ");
        String inputPassword = scanner.nextLine();

        // Validate credentials
        if (authenticate(inputUsername, inputPassword)) {
            System.out.println("Login successful! Welcome, " + inputUsername + ".");
        } else {
            System.out.println("Invalid username or password. Please try again.");
        }

        scanner.close();
    }

    /**
     * Authenticates the user based on input credentials.
     * 
     * @param username The entered username.
     * @param password The entered password.
     * @return True if credentials are valid; false otherwise.
     */
    private static boolean authenticate(String username, String password) {
        return USERNAME.equals(username) && PASSWORD.equals(password);
    }
}

