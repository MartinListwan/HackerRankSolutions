import java.io.*;
import java.util.*;

public class Solution {
    static int mAmtOfNumbers;
    static int mCurrentSum;
    
    public static void main(String[] args) {
        mCurrentSum = 0;
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        mAmtOfNumbers = in.nextInt();
        for (int x = 0; x < mAmtOfNumbers; x++){
            mCurrentSum += in.nextInt();
        }
        
        System.out.println(mCurrentSum); 
    }
}