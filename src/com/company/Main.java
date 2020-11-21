package com.company;

import java.util.Scanner;

public class Main {

    public static final int PASSWORD_LENGTH = 8;
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print(
                "Enter a password that meet the requirements below.\n" +
                "1. A password must have at least eight characters.\n" +
                "2. A password consists of only letters and digits.\n" +
                "3. A password must contain at least two digits. \n\n" +
                "Input password: "
        );

        String entry = input.nextLine();
        if(is_valid_password(entry)){
            System.out.println("Password is valid.\n" +
                    "Entered password is: " + entry);
        }else{
            System.out.println("Invalid password! \n" +
                    "Entered password is: "+ entry);
        }
    }
    public static boolean is_valid_password (String password) {
        if(password.length()<PASSWORD_LENGTH)
            return false;

        int charCount = 0;
        int numCount = 0;
        for (int i = 0; i<password.length(); i++){
            char ch = password.charAt(i);
            if (is_numeric(ch))
                numCount++;
            else if(is_Letter(ch))
                charCount++;
            else
                return false;
        }
        return (charCount >= 2 && numCount >= 2);
    }
    public static boolean is_Letter(char ch){
        ch = Character.toUpperCase(ch);
        return (ch >= 'A' && ch <= 'Z');
    }
    public static boolean is_numeric(char ch){
        return (ch >= '0' && ch <= '9');
    }
}
