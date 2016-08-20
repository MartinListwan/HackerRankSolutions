vimport java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        double numbersToSort = in.nextInt();
        double sum = 0;
        double chance = 1.0 / numbersToSort;
        int [] array = new int [101];
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int x = 0; x < numbersToSort ;x++){
            array[in.nextInt()]++;
        }
        
        for (int x = 0; x < 101; x++){
            if (array[x] > 1){
                list.add(array[x]);
            }
        }
        int bottom = 1;
        for (int number : list){
            bottom *= factorial(number);
        }
        double top = factorial(numbersToSort);
        
        System.out.printf("%.6f",top/bottom); 
    }
    
    public static double factorial(double n){
        int x = 1;
        for (int i = 1; i <= n; i++) {
           x *= i;
       }
        return x;
    }
}

