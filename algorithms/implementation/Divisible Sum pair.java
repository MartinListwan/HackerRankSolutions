        // O(n + k) solution 
        import java.io.*;
        import java.util.*;
        import java.text.*;
        import java.math.*;
        import java.util.regex.*;
        public class Solution {
         public static void main(String[] args) {
          Scanner in = new Scanner(System.in);
          int n = in .nextInt();
          int k = in .nextInt();
          int a[] = new int[n];
          for (int a_i = 0; a_i < n; a_i++) {
           a[a_i] = in .nextInt();
          }
          int[] remainder = new int[k];
          for (int x = 0; x < a.length; x++) {
           remainder[a[x] % k]++;
          }
          int total = helper(remainder[0]);
          for (int x = 0; x < ((k - 1) / 2); x++) {
           total += (remainder[x + 1]) * remainder[k - x - 1];
          }
          if (k % 2 == 0) {
           total += helper(remainder[k / 2]);
          }
          System.out.println(total);
         }
         public static int helper(int x) {
          return (x * (x - 1)) / 2;
         }
        }