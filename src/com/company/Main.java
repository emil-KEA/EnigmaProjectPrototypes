package com.company;

public class Main {

    public static void main(String[] args) {
        new Main().go();

    }
    public void go(){
        System.out.println(messageToInts("HELLO"));
    }

    public String alphabet = " ABCDEFGHIJKLMNOPQRSTUVXYZÆØÅ";

    public int convertCharToInt(char character){
        for(int i = 0; i < alphabet.length(); i++){
            if(character == alphabet.charAt(i)){
                return i;
            }
        } return -1;
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
    public int[] cryptWithShift(int key, int[] messageInt){
        for (int i = 0; i < messageInt.length; i++) {
            messageInt[i] += key;
        }       return messageInt;
    }
}
