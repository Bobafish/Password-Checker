package com.company;
import java.util.ArrayList;
import java.util.Scanner;

import sun.security.util.Password;


public class PasswordAttempt {
    public String password;
    public char passwordLetter;

    public boolean checkPasswordLength(String passwordInput) {
        password = passwordInput;
        boolean lengthFlag = false;
        if (password.length() >= 9) {
            lengthFlag = true;

        }
        return lengthFlag;
    }
    public boolean checkForCapital(String passwordInput) {
        password = passwordInput;
        boolean capitalFlag = false;
        for(int i=0; i < password.length(); i++){
            passwordLetter=password.charAt(i);
                if(Character.isUpperCase(passwordLetter)){
                    capitalFlag = true;
                }
        }
        return capitalFlag;
    }
    public boolean checkForLowerCase(String passwordInput) {
        password = passwordInput;
        boolean lowerFlag = false;
        for(int i=0; i < password.length(); i++){
            passwordLetter=password.charAt(i);
            if(Character.isLowerCase(passwordLetter)){
                lowerFlag = true;
            }
        }
        return lowerFlag;
    }
    public boolean checkForSpecialChar(String passwordInput) {
        password = passwordInput;
        boolean specialChar = false;
        String specialChars = "~`!@#$%^&*()-_=+\\|[{]};:'\",<.>/?";
        for(int i=0; i < password.length(); i++) {
            passwordLetter=password.charAt(i);
                if(specialChars.contains(String.valueOf(passwordLetter))){
                    specialChar = true;
            }
        }
        return specialChar;
    }


    public static void main(String[] args) {
	// write your code here
        PasswordAttempt wrong = new PasswordAttempt();
        Scanner scan = new Scanner(System.in);


        System.out.println("Create your new password :");
        String enteredPassword = scan.nextLine();

        if (wrong.checkPasswordLength(enteredPassword) == false) {
            System.out.println("Password needs at least 10 characters");
        }
        if (wrong.checkForLowerCase(enteredPassword) == false) {
            System.out.println("Password needs at least one lowercase letter");
        }if (wrong.checkForCapital(enteredPassword) == false) {
            System.out.println("Password needs at least one capital letter");
        }if (wrong.checkForSpecialChar(enteredPassword) == false) {
            System.out.println("Password needs at least one special character");
        }if (wrong.checkPasswordLength(enteredPassword) == true && wrong.checkForLowerCase(enteredPassword) == true && wrong.checkForCapital(enteredPassword) == true && wrong.checkForSpecialChar(enteredPassword) == true) {
            System.out.println("Password is available");

        }if (wrong.checkPasswordLength(enteredPassword) == false || wrong.checkForLowerCase(enteredPassword) == false || wrong.checkForCapital(enteredPassword) == false || wrong.checkForSpecialChar(enteredPassword) == false) {
            System.out.println("Please try again");
        }
    }
}
