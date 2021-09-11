/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myassignment2;

import jdk.internal.org.objectweb.asm.tree.TableSwitchInsnNode;

/**
 *
 * @author XtarNodde
 */
public class assignment4 {

    public static void main(String[] args) {
//         we decleare a string variable to host the  selected names
// see any time you alter name the value stored in  name eg  you change member1  to  member2  the code for that case will be executed

//here we declare String variables to store  differnt names 
        String member1 = "onyeka";
        String member2 = "ada";
        String member3 = "daniel";
        String member4 = "angel";
        String member5 = "evelyn";
        String member6 = "favour";
        String name = member6;
        //     here we make use of switch statement

        switch (name) {
            case "favour":
                System.out.println(member6);
                break;
            case "onyeka":
                System.out.println(member1);
                break;
            case "ada":
                System.out.println(member2);
                break;
            case "daniel":
                System.out.println(member3);
                break;
            case "angel":
                System.out.println(member4);
                break;
            case "evelyn":
                System.out.println(member5);
                break;

            default:
                System.out.println("No such student  in class");

        }
    }

}
