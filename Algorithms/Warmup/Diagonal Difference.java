import java.io.*;
import java.util.*;

public class Solution {
    static int mArrayLength;
    static int mSum;

    public static void main(String[] args) {
        mSum = 0;
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        mArrayLength = in.nextInt();
        
        
        for (int x = 0; x < mArrayLength; x++){
             for (int j= 0; j < mArrayLength; j++){
                 int number = in.nextInt();
                 
                 if (j == x){
                     mSum += number;
                 }
                 
                 if (j == (mArrayLength - 1 - x)){
                     mSum -= number;
                 }
                 
             }
        }
        System.out.println(Math.abs(mSum));
    }
}