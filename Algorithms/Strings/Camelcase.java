import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution {
 public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  String s = in .next();
  if (s == "") {
   System.out.println(0);
   return;
  }
  int counter = 1;
  for (char letter: s.toCharArray()) {
   if (letter < 91) {
    counter++;
   }
  }
  System.out.println(counter);
 }
}