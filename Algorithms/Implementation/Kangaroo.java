import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        
        int speed = v1 - v2;
        int distance = x2 - x1;
        
        if (speed >= 1){
            int hops = distance / speed;
            x1 = hops * v1+ x1;
            x2 = hops * v2 + x2;
            if (x1 == x2){
                System.out.println("YES");
                return;
            }
        }
            System.out.println("NO");
    }
}
