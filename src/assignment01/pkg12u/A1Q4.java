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
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //ask for a number between 1 and 10
        System.out.println("please enter a number between 1 and 10");
        int dots = in.nextInt();
        //output the number of dots
        for (int i = 0; i < dots; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }

}
