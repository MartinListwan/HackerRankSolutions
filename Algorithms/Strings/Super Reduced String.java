import java.io.*;
import java.util.*;
public class Solution {
 public static void main(String[] args) { /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
  StringBuilder sb = new StringBuilder();
  Scanner scan = new Scanner(System.in);
  sb.append(scan.nextLine());
  for (int x = 0; x < sb.length() - 1; x++) {
   if (sb.charAt(x) == sb.charAt(x + 1)) {
    sb.deleteCharAt(x);
    sb.deleteCharAt(x);
    if (x >= 1) {
     x--;
     x--;
    } else {
     x--;
    }
   }
  }
  if (sb.length() == 0) {
   System.out.println("Empty String");
  } else {
   System.out.println(sb.toString());
  }
 }
}