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
public class A1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter 3 numbers");
        //creating an array to store numbers
        int[] num = new int[3];
        //filling the array
        for (int i = 0; i < num.length; i++) {
            num[i] = in.nextInt();
        }
        
        double multiply = num[0] * num[1] * num[2];
        System.out.println(multiply);

        //math for squaring and exponent 
        double power = Math.pow(multiply, 2);
        double square = Math.sqrt(multiply);
        //prints out answers to the equations
        System.out.println(power);
        System.out.println(square);
    }
}
