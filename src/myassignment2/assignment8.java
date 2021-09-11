/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myassignment2;

/**
 *
 * @author XtarNodde
 */
public class assignment8 {

    public static void main(String[] args) {
        double height1 = 4;
        double height2 = 5;
        double height3 = 5.5;
        double height4 = 7;
        double height5 = 14.3;
        double height6 = 5.6;
        double height7 = 5.8;
        int totalno = 7;
        //     here we make use of switch statement
        double average = height1 + height2 + height3 + height4 + height5 + height6 + height7 / totalno;
        System.out.print(height1 + " average value is " + average+" ");
        if (height1 > average) {
            System.out.println(height1 + " ia above average");
        } else if (height2 > average) {
            System.out.println(height2 + " ia above average");
        } else if (height4 > average) {
            System.out.println(height4 + " ia above average");
        } else if (height5 > average) {
            System.out.println(height5 + " ia above average");
        } else if (height6 > average) {
            System.out.println(height7 + " ia above average");
        } else {
            System.out.println("None ia above average");
        }

    }
}
