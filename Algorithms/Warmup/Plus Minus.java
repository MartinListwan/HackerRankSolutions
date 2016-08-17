import java.io.*;
import java.util.*;

public class Solution {
    static float mTotalNumbers;
    static float mPositives;
    static float mNegatives;
    static float mZeros;
    
    public static void main(String[] args) {
        mTotalNumbers = mPositives = mNegatives = 0;
        Scanner in = new Scanner(System.in);
        
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        mTotalNumbers = in.nextInt();
        
        for (int x = 0; x < mTotalNumbers; x++){
            
            double currentNumber = in.nextInt();
            if (currentNumber == 0){
                mZeros++;
            }
            else if(currentNumber > 0){
                mPositives++;
            }
            else {
                mNegatives++;
            }
        }
        if (mPositives != 0){
            mPositives = mPositives / mTotalNumbers;
        }
        if (mNegatives != 0){
            mNegatives = mNegatives / mTotalNumbers;
        }
        if (mZeros != 0){
            mZeros = mZeros / mTotalNumbers;
        }
        System.out.println(mPositives);
        System.out.println(mNegatives);
       System.out.println(mZeros);
        
    }
}