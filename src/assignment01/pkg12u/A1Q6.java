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
public class A1Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number between 50 and 100 to stop at");
        int stop = in.nextInt();
        int num = 100;
        System.out.println("");
//counts back from 5 from 100 until desired number
        while (num > stop) {
            System.out.println(num);
            num -= 5;
//when it does stop
            if (num <= stop) {
                break;
            }
        }

    }

}
