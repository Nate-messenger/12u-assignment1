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
public class A1Q9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
      
        String[] words = new String[10];
        System.out.println("please enter 10 words on seperate lines");
        for (int i = 0; i < 10; i++) {
            words[i] = in.nextLine();
        }
        int characters = 0;
        //get the number of letters in a each spot of the array and add them up
        for (int i = 0; i < words.length; i++) {
            characters += words[i].length();
        }
        //get the average
        int average = characters / 10;
        System.out.println("the average number of characters are " + average);
    }

}
