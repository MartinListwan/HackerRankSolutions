import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scan = new Scanner(System.in);
        int rocks = scan.nextInt();
        int count  = 0;
        int [] array = new int [26];
        for (int x  = 0; x < rocks; x++){
            String word = scan.next();
            LinkedHashSet<Integer> hs = new LinkedHashSet();
            for (char letter : word.toCharArray()){
                hs.add(letter - 97);
            }
            
            for (Integer letter: hs){
                array[letter]++;
            } 
        }
        
        for (int num : array){
            if (num == rocks){
                count++;
            }
        }
             System.out.println(count);
        
    }
}