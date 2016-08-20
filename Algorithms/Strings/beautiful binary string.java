import java.io.*;
import java.util.*;
public class Solution {
 public static void main(String[] args) { /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
  Scanner scan = new Scanner(System.in);
  scan.next();
  String str = scan.next();
  int counter = 0;
  for (int x = 0; x < str.length() - 2; x++) {
   if (str.charAt(x) == '0' && str.charAt(x + 1) == '1' && str.charAt(x + 2) == '0') {
    counter++;
    x += 2;
   }
  }
  System.out.println(counter);
 }
}