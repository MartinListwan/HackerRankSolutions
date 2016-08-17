import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution {
 public static void main(String[] args) { /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
  Scanner scan = new Scanner(System.in);
  int arrayLength = scan.nextInt();
  int rotateAmt = scan.nextInt();
  int checkAmt = scan.nextInt();
  int[] array = new int[arrayLength]; // Grabbing   
  for (int x = 0; x < arrayLength; x++) {
   array[x] = scan.nextInt();
  } //rotate  
  int currentIndex = 0;
  int temp[] = new int[arrayLength];
  for (int x = 0; x < arrayLength; x++) { // this is the new shifted index 
   currentIndex = (x + rotateAmt) % arrayLength; // store old value        
   temp[currentIndex] = array[x];
  }
  for (int x = 0; x < checkAmt; x++) {
   System.out.println(temp[scan.nextInt()]);
  } // return amounts  
 }
}