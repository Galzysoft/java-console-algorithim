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
public class assignment2 {
//   area =pi*radius*radius
    public static void main(String[] args) {
        //        we need to write these  program using the scanner  class which enables the user to enter a specific  value
Scanner scanner=new Scanner(System.in);
 double pi=3.14;
// let out put a prompt message
System.out.println("plese enter the radius of the circle");
// here let execute the code and allow the user input to be stored as an double vALUE
double radius=scanner.nextDouble();
double area= pi*radius*radius;
System.out.println("the area of the circle is "+area);
    }
    
}
