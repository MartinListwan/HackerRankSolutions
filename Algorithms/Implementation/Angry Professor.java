import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int classes = in.nextInt();
        
        for (int x = 0; x < classes; x++){
             int studentToClass = in.nextInt();
             int studentsNeeded = in.nextInt();
             String ans = "YES";
           for (int j = 0; j < studentToClass; j++){
               if (in.nextInt() <= 0){
                   studentsNeeded--;
                   if (studentsNeeded <= 0){
                       ans = "NO";
                       in.nextLine();
                       break;
                   }
                }         
           }
            System.out.println(ans);
        }
    }
}