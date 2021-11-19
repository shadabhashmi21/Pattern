/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package specialpattern;

/**
 * A Java based program to print the following pattern.
 * 1 
   2 3 
   4 5 6 
   7 8 9 10 
   11 12 13 14 15 
 * @author shada
 */
public class FloydsTriangle {
    public static void main(String[] args) {
        int c = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(c + " ");
                c++;
            }
            System.out.println();
        }
    }
}
