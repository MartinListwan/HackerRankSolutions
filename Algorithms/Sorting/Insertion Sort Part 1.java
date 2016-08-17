import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution {
 public static void insertIntoSorted(int[] ar) { // Fill up this function  
  if (ar.length <= 1) {
   printArray(ar);
   return;
  }
  int elementToSort = ar[ar.length - 1];
  int indexToReplace = 0;
  for (int x = ar.length - 1; x > 0; x--) {
   if (elementToSort > ar[x - 1]) {
    indexToReplace = x;
    break;
   } else {
    ar[x] = ar[x - 1];
    printArray(ar);
   }
  }
  ar[indexToReplace + 1] = ar[indexToReplace];
  ar[indexToReplace] = elementToSort;
  printArray(ar); // remember to remove the index of repeat and print     }  /* Tail starts here */  
  public static void main(String[] args) {
   Scanner in = new Scanner(System.in);
   int s = in .nextInt();
   int[] ar = new int[s];
   for (int i = 0; i < s; i++) {
    ar[i] = in .nextInt();
   }
   insertIntoSorted(ar);
  }
  private static void printArray(int[] ar) {
   for (int n: ar) {
    System.out.print(n + " ");
   }
   System.out.println("");
  }
 }