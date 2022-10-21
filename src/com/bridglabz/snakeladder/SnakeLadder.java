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
    // UC3-player check for a option AMONG 3 OPTION - NO PLAY,LADDER AND SNAKE
    static final int NO_PLAY=1;

    static final int Ladder=2;

    static final int Snake=3;
    private static int getOption() {
        int option =(int)(Math.random()*3)+1;
        return option;
    }
    private static void playGame(int option,int dieValue) {

        switch(option) {

            case NO_PLAY:
                System.out.println("No Play");
                break;

            case Ladder:
                playerPosition=playerPosition + dieValue;
                break;

            case Snake:
                playerPosition=playerPosition-dieValue;
                break;

            default:

        }
    }
    //UC4-REPEAT TILL PLAYER REACHES POSITION 100
    //IN CASE PLAYER REACHES BELOW 0, PLAYER RESTART FROM 0
    static final int WIN_POSITION=100;

    public static void main(String[] args) {
        System.out.println("Welcome to snake ladder simulator");
        while(playerPosition<=WIN_POSITION) {


            int dieValue=dieRoll();
            System.out.println("Die:" + dieValue);

            int option =getOption();
            System.out.println("Option" + option);
            playGame(option,dieValue);

        }


    }
}






