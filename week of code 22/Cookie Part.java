import java.io.*; import java.util.*; import java.text.*; import java.math.*; import java.util.regex.*;  public class Solution {      public static void main(String[] args) {         Scanner in = new Scanner(System.in);         int n = in.nextInt();         int m = in.nextInt();          // more people than cookies         if (n > m){             System.out.println(n - (m % n));         } else {             m %= n;             while (m >= n){                 m -= n;             }             if (m != 0){                 System.out.println(n - (m % n));             } else {                 System.out.println(0);             }         }      } }
