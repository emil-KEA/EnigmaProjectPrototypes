package com.company;

public class Main {

    public static void main(String[] args) {
    new Main().go();
    }
    public void go(){
        System.out.println(convertCharToInt('G'));
        System.out.println(convertIntTOChar(convertCharToInt('B')));
    }
    public char[] charArray = {' ','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','X','Y','Z','Æ','Ø','Å'};

    public int convertCharToInt(char character){
        for(int i = 0; i < charArray.length; i++){
            if(character == charArray[i]){
                return i;
            }
        } return -1;
    }

    public char convertIntTOChar(int integer){
        return charArray[integer];
    }
}
