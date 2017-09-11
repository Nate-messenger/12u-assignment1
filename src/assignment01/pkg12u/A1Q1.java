/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment01.pkg12u;

import java.util.Scanner;

/**
 *
 * @author nate
 */
public class A1Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //ask for user imput
        System.out.println("Please enter your name");
        String name = in.nextLine();
        //print out given information
        System.out.println("Hello " + name);
    }

}
