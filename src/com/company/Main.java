package com.company;

import java.util.Scanner;

public class Main {
    Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().go();

    }

    public void go() {
        executeTest();
    }

    public void printMainMenu() {
        System.out.println("Welcome to EMIL'S ENIGMA MACHINE \n " +
                "What do you want to do? \n" +
                "1. enter \"1\" to use CAESAR CIPHER \n" +
                "2. enter \"2\" to use VIGENÈRE CIPHER \n" +
                "3. enter \"3\" to EXIT \n");
    }

    public void chooseCipher() {
        int choice = in.nextInt();
        switch (choice) {
            case 1:
                runCaesarCiper();
                break;
            case 2:
                runVigenèreCipher();
                break;
            case 3:
                exit();
                break;
            default:
                go();
        }
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
            if (messageInt[i] > 29) {
                messageInt[i] -= 29;
            }
        }
        return messageInt;
    }

    public String convertIntArrayToString(int[] encryptedInt) {
        StringBuilder encryptedMessage = new StringBuilder();
        for (int i = 0; i < encryptedInt.length; i++) {
            encryptedMessage.append(convertIntToChar(encryptedInt[i]));
        }
        return encryptedMessage.toString();
    }

    public void executeTest() {
        System.out.println(convertIntArrayToString(addShiftKey(28, messageToInts("HEJSA"))));

    }

}
