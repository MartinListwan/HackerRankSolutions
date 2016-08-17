import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution {
 public static void main(String[] args) { /* Enter your code here. */
  Scanner scan = new Scanner(System.in);
  int tests = scan.nextInt();
  for (int x = 0; x < tests; x++) {
   checkPrime(scan.nextInt());
  }
 }
 public static void checkPrime(int n) {
  if (n == 1) {
   System.out.println("Not prime");
   return;
  }
  if (n == 2) {
   System.out.println("Prime");
   return;
  }
  if (n % 2 == 0 || n % 3 == 0) {
   System.out.println("Not prime");
   return;
  } else {
   for (int div = 4; div < Math.sqrt(n); div++) {
    if (n % div == 0) {
     System.out.println("Not prime");
     return;
    }
   }
   System.out.println("Prime");
   return;
  }
 }
}