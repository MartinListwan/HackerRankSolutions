import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        
        Arrays.sort(arr);
        int currentDecrement = 0;
        System.out.println(arr.length);
        for (int leftPtr = 0; leftPtr < arr.length - 1;){
            currentDecrement += arr[leftPtr] - currentDecrement;
            while (leftPtr < arr.length && arr[leftPtr] <= currentDecrement){
                leftPtr++;
            }
            int amtToCut = arr.length - leftPtr;
            if (amtToCut == 0){
                return;
            } else if (amtToCut < 0){
                System.out.println(0);
            }  else {
                System.out.println(arr.length - leftPtr);
            }
        }
    }
}
