package starpattern;

/**
 * A Java based program to print the following pattern.
 
     *
     **
     ***
     ****
     *****
    
 * @author shadab
 */
public class Pattern1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
