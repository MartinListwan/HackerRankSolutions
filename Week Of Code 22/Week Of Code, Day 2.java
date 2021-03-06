import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution {
 public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  int n = in .nextInt();
  int a[] = new int[n];
  for (int a_i = 0; a_i < n; a_i++) {
   a[a_i] = in .nextInt();
  }
  int length = getLengthOfAllSides(a);
  if (n == 3) {
   System.out.println(triangle(a, length));
  } else {
   System.out.println(total(a, length));
  }
 }
 public static int triangle(int[] a, int length) {
  int totalBreaks = 0;
  for (double side: a) {
   int currentSideBreaks = 0;
   double total = (length - side);
   while (side >= total) {
    side /= 2;
    if (currentSideBreaks == 0) {
     currentSideBreaks = 1;
    } else {
     currentSideBreaks *= 2;
    }
   }
   totalBreaks += currentSideBreaks;
  }
  return totalBreaks;
 }
 public static int total(int[] a, int length) {
  int totalBreaks = 0;
  for (double side: a) {
   int currentSideBreaks = 0;
   double total = (length) / 2.0;
   while (side >= total) {
    side /= 2;
    if (currentSideBreaks == 0) {
     currentSideBreaks = 1;
    } else {
     currentSideBreaks *= 2;
    }
   }
   totalBreaks += currentSideBreaks;
  }
  return totalBreaks;
 }
 public static int getLengthOfAllSides(int[] a) {
  int counter = 0;
  for (int index: a) {
   counter += index;
  }
  return counter;
 }
}