import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution {
 public static void main(String[] args) { /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
  Scanner scan = new Scanner(System.in);
  int amt = scan.nextInt();
  long[] array1 = new long[amt];
  long[] array2 = new long[amt];
  for (int x = 0; x < amt; x++) {
   array1[x] = scan.nextLong();
  }
  for (int x = 0; x < amt; x++) {
   array2[x] = scan.nextLong();
  }
  Arrays.sort(array1);
  Arrays.sort(array2);
  long[] array3 = new long[amt]; // keep a sum of differences and make sure that the amt you want to change         // is eequal to amt of diff for rest         
  long counter = 0;
  long negCounter = 0;
  long posCounter = 0;
  for (int x = 0; x < amt; x++) {
   long temp = Math.abs(array1[x] - array2[x]);
   array3[x] = temp;
   counter += temp;
   if (array1[x] - array2[x] <= 0) {
    negCounter += Math.abs(array1[x] - array2[x]);
   } else {
    posCounter += Math.abs(array1[x] - array2[x]);
   }
  }
  if (counter % 2 == 1) {
   System.out.println("-1");
  } else {
   long temp = counter;
   if (negCounter != posCounter) {
    System.out.println("-1");
    return;
   }
   System.out.println(temp / 2);
  }
 }
}