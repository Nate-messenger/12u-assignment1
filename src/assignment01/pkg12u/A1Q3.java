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
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[] cost = new double[6];
        //gets user imput for costs
        System.out.println("please enter the cost of food");
        cost[0] = in.nextDouble();
        System.out.println("please enter the cost of the D.j.");
        cost[1] = in.nextDouble();
        System.out.println("please enter the cost of the hall");
        cost[2] = in.nextDouble();
        System.out.println("please enter the cost of the decorations");
        cost[3] = in.nextDouble();
        System.out.println("please enter the cost of the wait staff ");
        cost[4] = in.nextDouble();
        System.out.println("please enter the cost of any miscellaneous expenses");
        cost[5] = in.nextDouble();
        double total = 0;
//        adding up total cost
        for (int i = 0; i < cost.length; i++) {
            total = total + cost[i];
        }
        double ticket = 0;
        ticket = total / 35;
        System.out.println("the total cost is " + total);
        System.out.println("you would need to sell " + ticket + " tickets to break even");

    }

}
