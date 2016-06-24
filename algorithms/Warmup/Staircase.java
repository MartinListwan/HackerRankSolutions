import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int height = in.nextInt();
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        for (int j = 0; j < height; j++){
            for (int space = j; space < height - 1; space++){
               System.out.print(" ");
            }
            for (int pound = -1;pound < j;pound++){
                System.out.print("#");
            }
            System.out.println();
        }
            
        
    }
}