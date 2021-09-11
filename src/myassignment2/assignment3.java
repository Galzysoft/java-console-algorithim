/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myassignment2;

import java.util.Scanner;

/**
 *
 * @author XtarNodde
 */
public class assignment3 {
    public static void main(String[] args) {
//        we need to write these  program using the scanner  class which enables the user to enter a specific  value
Scanner scanner=new Scanner(System.in);

// let out put a prompt message
System.out.println("plese enter an integer value between 1 and 100");
// here let execute the code and allow the user input to be stored as an integer vALUE
int number=scanner.nextInt();

//let use if statement to check if the number are  between 1 and 100
if (number<1||number>100) {
    System.out.println("the inputed number is  invalid");
            
        } else {
    
    if (number>50) {System.out.println("the inputed number is greater than 50");}

    else if(number<50){System.out.println("the inputed number is less than 50");}
      else if(number==50){System.out.println("the inputed number is equal to 50");}

        }

    }
}
