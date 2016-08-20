import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int amtOfWords = in.nextInt();
        in.nextLine();
       
        while (in.hasNextLine()){
             String word = in.nextLine();
             int counter = 0;
            for (int j = 0; j < word.length() - 1; j++){
                    if (word.charAt(j) == word.charAt(j + 1)){
                        counter++;
                    }
            }
            System.out.println(counter);
            
        }
        
        
    }
}