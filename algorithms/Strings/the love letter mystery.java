import java.io.*;
import java.util.*;
public class Solution {
 public static void main(String[] args) { /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
  Scanner scan = new Scanner(System.in);
  int tests = scan.nextInt();
  for (int x = 0; x < tests; x++) {
   String word = scan.next();
   int counter = 0;
   for (int j = 0; j < word.length() / 2; j++) {
    if (word.charAt(j) != word.charAt(word.length() - 1 - j)) {
     counter += Math.abs(word.charAt(j) - word.charAt(word.length() - 1 - j));
    }
   }
   System.out.println(counter);
  }
 }
}