package starpattern;

/**
 * A Java based program to print the following pattern.
   
       *
      ***
     *****
    *******
   *********
    *******
     *****
      ***
       *

 * @author shadab
 */
public class Pattern7 {
    public static void main(String[] args) {
        int maxStars = 9;
        int starsInARow = 1;
        int whiteSpaces = 4;
        for (int i = 0; i < maxStars; i++) {
            for(int k = 0; k < whiteSpaces; k++) {
                System.out.print(" ");
            }
            
            for (int j = 1; j <= starsInARow; j++) {
                System.out.print("*");
            }
            
            if(i < maxStars/2) {
                starsInARow += 2;
                whiteSpaces--;
            } else {
                starsInARow -= 2;
                whiteSpaces++;
            }
            System.out.println();
        }
    }
}
