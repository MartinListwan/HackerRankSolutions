import java.io.*;
import java.util.*;
public class Solution {
 public static void main(String[] args) { /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
  Scanner scan = new Scanner(System.in);
  int trips = scan.nextInt();
  for (int x = 0; x < trips; x++) {
   int dollars = scan.nextInt();
   int costOfCandy = scan.nextInt();
   int wrapNeedForCandy = scan.nextInt(); // return, the amount of candies he can buy    // buy with money i have  
   int totalCandy = dollars / costOfCandy; // these bcomes the wrapper/ currency that I'll be using  
   int wraperFromMostRecent = totalCandy;
   while (wrapNeedForCandy <= wraperFromMostRecent) {
    int spareCandy = wraperFromMostRecent % wrapNeedForCandy;
    wraperFromMostRecent = wraperFromMostRecent / wrapNeedForCandy;
    totalCandy += wraperFromMostRecent;
    wraperFromMostRecent += spareCandy;
   }
   System.out.println(totalCandy);
  }
 }
}