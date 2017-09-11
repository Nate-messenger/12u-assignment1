/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment01.pkg12u;

/**
 *
 * @author nate
 */
public class A1Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        calculations that when the pop reaches the amount it stops and prints out year
        for (double i = 0; i < 1000; i++) {
        
        double p = Math.pow((1+.014),i);
        double total = 600*p;
            if (total >= 1000 ) {
                System.out.println("it would take " + i + " years");
               double year = 1999+i;
                System.out.println("therefore the year would be " + year);
                break;
            }
        }
        // 6 billion people in 1999 and was growing at the rate of 1.4 percent each year.
    }
    
}
