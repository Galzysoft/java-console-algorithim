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
public class assignment9 {
    public static void main(String[] args) {
      
int n=10;  
double average = 0;
double gradesum = 0;
Scanner sc=new Scanner(System.in);  

//creates an array in the memory of length 10  
int[] grade = new int[10];  
String[] name = new String[10];  
System.out.println("Enter the elements of the array: ");  
for(int i=0; i<n; i++)  
{  
//reading array elements from the user input  
    System.out.println("enter student name");
name[i]=sc.next();  
    System.out.println("enter "+name[i]+"'s score");
grade[i]=sc.nextInt(); 
}  
System.out.println("Array elements are: ");  
// accessing array elements using the for loop  
for (int i=0; i<n; i++)   
{  
//     here we  sum up the array grade elemnt using pre increment 
    gradesum+=grade[i];
            
System.out.println(name[i]+" scores "+grade[i]);  
}  
average=gradesum/n;
        System.out.println("the total average is "+average);
}  
}  