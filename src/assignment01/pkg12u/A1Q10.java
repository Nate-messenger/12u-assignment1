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
public class A1Q10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int counter = 0;

        for (;;) {
            //start counting words 
            System.out.println("please enter a word if you would like to stop entering words enter exit");
            String words = in.next();
//checks if the word is exit if not increase counter
            if (words.matches("exit")) {
                System.out.println("you have enterd " + counter + " words before entering exit");
                break;
            }
            if (!(words.matches("exit"))) {
                counter +=  1;
                System.out.println("you have enterd " + counter + " words");
                
            }

        }
    }

}
