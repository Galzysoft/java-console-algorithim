/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myassignment2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author XtarNodde
 */
public class assignment10 {
//     card game

    public static void main(String[] args) {
        System.out.println("-----------------------------WELCOME TO SIMPLE CARD GAME------------------------------------");
        System.out.println("*** Any wrong number ends the game ***");
//        here we decleare an array of ints that store the values of the cards
        int cards_decks[] = {23, 4, 56, 78, 90,0};
        int randompickedvalue = 0;
        int previous_randompickedvalue = 0;
        int score = 0;
        char yesorno = 'y';

        int range = 0;

        do {
            Scanner scanner = new Scanner(System.in);
            // let out put a prompt message
            System.out.println("The value of the previous selected card is " + previous_randompickedvalue);

            System.out.println("is the value of the next card greater than the previous card ? enter y or n");
            // here let execute the code and allow the user input to be stored as an char vALUE
            String str = scanner.next();
//  these code gets only the first caracter out of the string input
            yesorno = str.charAt(0);
// let check if the char value is Y or N
// if the user  enters y it means that the  tn next selcted card will be greater than the previous card
            if (yesorno == 'y') {
                // here we randomly picked a card out from the card deck  using the randomly generated  range
                previous_randompickedvalue = randompickedvalue;
                // let out put a prompt message
                //        here we declARE A RANDOM NUMBER FROM RANGE 0- THE LENGTH OF THE ARRAY ie cards_decks.length THAT WILL  USE 
                int min = 0;
                int max = cards_decks.length;

                range = (int) (Math.random() * (max - min) + min);
                randompickedvalue = cards_decks[range];
//                here we actually check the  value of the new selected card if it is greater  than the previous card
                if (randompickedvalue > previous_randompickedvalue) {
                    score += 1;
                    System.out.println("Correct Answer !!!!!!");
                    System.out.println("the previously picked card is card " + previous_randompickedvalue + " and the  curent picked  card ie card " + randompickedvalue);
                    System.out.println("**************************************************************************");
                    System.out.println("the  curent picked  card " + randompickedvalue + " is greater than or equals to  the previous card " + previous_randompickedvalue + "");
                    System.out.println("**************************************************************************");
                    System.out.println("************************************Answer!!*******************************");

                    System.out.println("your score  is " + score + " nice job continue.....");
                    System.out.println("**************************************************************************");
                    System.out.println("**************************************************************************");

                } else {
                    // let out put a prompt message
                    System.err.println("Sorry you Failed");
                    System.err.println("the  curent picked  card " + randompickedvalue + " is less than or equals to  the previous card " + previous_randompickedvalue + "");
             
                    System.err.println("-----------------------------GAME OVER------------------------------------");
                    System.out.println("your score  is " + score);
                    break;
                }

                continue;
            } 
//             we check if the user press n ie no that  means that the next  card ifs less than  previous card
            else if (yesorno == 'n') {
                // here we randomly picked a card out from the card deck  using the randomly generated  range
                previous_randompickedvalue = randompickedvalue;
                // let out put a prompt message
                randompickedvalue = cards_decks[range];
//                here we check if the currently picked is less than  the previous card 
                if (randompickedvalue < previous_randompickedvalue) {
//                    we increase the score values
                    score += 1;
                    System.out.println("Correct Answer !!!!!!");
                    System.out.println("the previously picked card is card " + previous_randompickedvalue + " and the  curent picked  card ie card " + randompickedvalue);
                    System.out.println("**************************************************************************");
                    System.out.println("the  curent picked  card " + randompickedvalue + "is less than or equals to  the previous card " + previous_randompickedvalue + "");
                    System.out.println("**************************************************************************");
                    System.out.println("************************************Answer!!*******************************");

                    System.out.println("your score  is " + score + " nice job continue.....");
                    System.out.println("**************************************************************************");
                    System.out.println("**************************************************************************");
  } else {
                    // let out put a prompt message
                    System.err.println("Sorry you Failed");
                    System.err.println("the previously picked card is card " + previous_randompickedvalue + " is greater or equals to the value of the  curent picked  card ie card " + randompickedvalue);

                    System.err.println("-----------------------------GAME OVER------------------------------------");
                    System.out.println("your score  is " + score);
                    break;
                }

            } else {
                System.out.println("---------invalid---------invalid--------invalid-------------");
                System.out.println("answer  corresponding  y or n to continue  make sure you use lower case pls");
            }

        } while (true);

    }
}
