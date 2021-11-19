/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package specialpattern;

/**
 *
 * @author shadab
 */
public class ZeroOneTriangle {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((i+j)%2 == 0 ? "1" + " " : "0" +" ");
            }
            System.out.println();
        }
    }
}
