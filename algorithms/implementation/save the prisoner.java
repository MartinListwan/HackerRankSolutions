import java.io.*;
import java.util.*;
public class Solution {
 public static void main(String[] args) { /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
  Scanner in = new Scanner(System.in);
  int tests = in .nextInt();
  for (int x = 0; x < tests; x++) {
   int numOfPris = in .nextInt();
   int numOfSweets = in .nextInt() - 2;
   int prisID = in .nextInt();
   numOfSweets = numOfSweets % numOfPris + 1;
   if (numOfSweets + prisID > numOfPris) {
    numOfSweets -= numOfPris;
   }
   System.out.println(prisID + numOfSweets);
  }
 }
}