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
public class assignment7 {
    public static void main(String[] args) {
        char yesorno='y';
        int number = 0;
        do {            
          //        we need to write these  program using the scanner  class which enables the user to enter a specific  value
Scanner scanner=new Scanner(System.in);
            System.out.println("Do You want to continue enter y or n");
            // here let execute the code and allow the user input to be stored as an char vALUE
 String str=scanner.next();
//  these code gets only the first caracter out of the string input
 yesorno=str.charAt(0);// let check if the char value is Y or N
            if (yesorno=='y') {
                // let out put a prompt message
System.out.println("plese enter an integer value");
// here let execute the code and allow the user input to be stored as an integer vALUE
 number+=scanner.nextInt();
continue;            } else {
                // let out put a prompt message
System.out.println("our  sum is "+number);

                break;
            }

        } while (yesorno=='y');
    }
    
}
