package com.company;

public class Main {

    public static void main(String[] args) {
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
}
