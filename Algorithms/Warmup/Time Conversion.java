import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        String input = in.next();
        String temp;
        
        if (input.charAt(8) == 'P'){
            if (input.charAt(0) == '1' && input.charAt(1) == '2'){
               System.out.println(input.substring(0,input.length() - 2));  
            }
            else{
            temp = input.substring(0,2);           
            int number = Integer.parseInt(temp);
            number = number + 12;
            temp = Integer.toString(number);
            input = temp + input.substring(2,input.length() - 2);
            System.out.println(input);
            }
        }
        else{
            if (input.charAt(0) == '1' && input.charAt(1) == '2'){
                System.out.println("00" + input.substring(2,input.length() - 2)); 
            }
            else{
            System.out.println(input.substring(0,input.length() - 2));    
            }
            
        }
       
    }
}