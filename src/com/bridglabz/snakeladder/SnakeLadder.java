package com.bridglabz.snakeladder;
//player roll the die to get a number between 1 to 6,finda safe place ,
//ladder or snake keeps doing till winning spot 100 is achieved

public class SnakeLadder {
    //uc1-snake ladder game played with single player at start position
    static int playerPosition=0; // snake and ladder game played with single player at start position
    //UC2-player roll the dice to get a number between  1 and 6
    private static int dieRoll() {
        int dieValue=(int)(Math.random() * 6) + 1;;
        return dieValue;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to snake ladder simulator");
    }
}






