package com.company;

import java.util.Scanner;

public class Main {
    Scanner in = new Scanner(System.in);
    String message;
    String ciphertext;
    int shiftKey;

    public static void main(String[] args) {
        new Main().go();
    }
    public void go() {
        printMainMenu();
        chooseCipher();
    }
    public void runCaesarCipher(){
        printEncryptOrDecrypt();
        chooseEncryptOrDecryptCaesar();
    }
    public void runCaesarEncryption(){
        getEncryptionMessage();
        getShiftKey();
        encrypt(shiftKey, message);
        printCiphertext();
        runCaesarCipher();
    }
    public void runCaesarDecryption(){
        System.out.println("TBA");
    }
    public void encrypt(int key, String message) {
        ciphertext = convertIntArrayToString(addShiftKey(key, messageToInts(message)));
    }
    public void printCiphertext(){
        System.out.println(ciphertext);
    }
    public void exit(){
        System.out.println("Goodbye!");
    }
    public void runVigenereCipher(){
        System.out.println("sorry, not implemented yet");
        exit();
    }


    public void printMainMenu() {
        System.out.println("""
                Welcome to EMIL'S ENIGMA MACHINE\s
                 What do you want to do?\s
                1. enter "1" to use CAESAR CIPHER\s
                2. enter "2" to use VIGENÈRE CIPHER\s
                3. enter "3" to EXIT\s
                """);
    }

    public void chooseCipher() {
        int choice = in.nextInt();
        switch (choice) {
            case 1 -> runCaesarCipher();
            case 2 -> runVigenereCipher();
            case 3 -> exit();
            default -> go();
        }
    }
    public void printEncryptOrDecrypt(){
        System.out.println("""
                Do you want to encrypt or decrypt a message or exit to main menu?\s
                1. enter "1" to ENCRYPT\s
                "2. enter "2" to DECRYPT\s
                "3. enter "3" to EXIT TO MAIN MENU
                """);
    }
    public void chooseEncryptOrDecryptCaesar(){
        int choice = in.nextInt();
        switch (choice) {
            case 1 -> runCaesarEncryption();
            case 2 -> runCaesarDecryption();
            default -> go();
        }
    }
    public void getEncryptionMessage(){
        System.out.print("Enter the message you want to encrypt: ");
        message = getMessage();
    }
    public String getMessage(){
        message = in.nextLine().toUpperCase();
        return in.nextLine();
    }
    public void getShiftKey(){
        System.out.print("Enter shift key (between 1 and 29) : ");
        shiftKey = in.nextInt();
    }

    public String alphabet = " ABCDEFGHIJKLMNOPQRSTUVXYZÆØÅ ABCDEFGHIJKLMNOPQRSTUVXYZÆØÅ";

    public int convertCharToInt(char character) {
        return alphabet.indexOf(character);
    }

    public char convertIntToChar(int integer) {
        return alphabet.charAt(integer);
    }

    public int[] messageToInts(String message) {
        int[] messageInt = new int[message.length()];
        for (int i = 0; i < message.length(); i++) {
            messageInt[i] += convertCharToInt(message.charAt(i));
        }
        return messageInt;
    }

    public int[] addShiftKey(int key, int[] messageInt) {
        for (int i = 0; i < messageInt.length; i++) {
            messageInt[i] += key;
        }
        return messageInt;
    }


    public String convertIntArrayToString(int[] encryptedInt) {
        String encryptedMessage = "";
        for (int i = 0; i < encryptedInt.length; i++) {
            encryptedMessage += convertIntToChar(encryptedInt[i]);
        } return encryptedMessage;
    }

}
