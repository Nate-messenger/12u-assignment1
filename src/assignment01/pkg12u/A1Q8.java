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
public class A1Q8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//getting all of the numbers needed to do calculations
        boolean doubles = false;
        System.out.println("enter in the initial amount");
        double initial = in.nextDouble();
        System.out.println("enter the intrest rate as a decimal");
        double rate = in.nextDouble();
        double doubled = initial * 2;
        double balance = initial;
        //calculations checking for desired amounts and printing out when it happens
        for (int i = 1; i < 100000; i++) {
            balance = balance * (1 + rate);
            if (balance >= doubled && !doubles) {
                System.out.println(balance);
                System.out.println("the number of years it takes to double is " + i);
                doubles = true;
            }
            if (balance >= 1000000) {
                System.out.println("it will take " + i + " years to become one million");
                break;
            }
        }

    }

}
