package com.company;

public class Main {

    public static void main(String[] args) {
        new Main().go();

    }
    public void go(){
        executeTest();
    }

    public String alphabet = " ABCDEFGHIJKLMNOPQRSTUVXYZÆØÅ ABCDEFGHIJKLMNOPQRSTUVXYZÆØÅ";

    public int convertCharToInt(char character){
       return alphabet.indexOf(character);
    }

    public char convertIntTOChar(int integer){
        return alphabet.charAt(integer);
    }
    public int[] messageToInts(String message){
        int[] messageInt = new int[message.length()];
        for (int i = 0; i < message.length(); i++) {
            messageInt[i] += convertCharToInt(message.charAt(i));
        } return messageInt;
    }
    public int[] addShiftKey(int key, int[] messageInt){
        for (int i = 0; i < messageInt.length; i++) {
            messageInt[i] += key;
        }       return messageInt;
    }
    public String convertIntArrayToString(int[] encryptedInt){
        String encryptedMessage = "";
        for (int i = 0; i < encryptedInt.length; i++) {
            encryptedMessage += convertIntTOChar(encryptedInt[i]);
        }
        return encryptedMessage;
    }
    public void executeTest(){
        System.out.println(convertIntArrayToString(addShiftKey(28,messageToInts("HEJSA"))));

    }

}
