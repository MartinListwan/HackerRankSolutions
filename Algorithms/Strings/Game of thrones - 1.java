import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        int [] array = new int [256];
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        for (char letter : word.toCharArray()){
            array[letter]++;
        }
        boolean flag = false;
        boolean result = false;
        for (int x = 0; x < array.length;x++){
            if (array[x] % 2 != 0){
                if (flag == true){
                    result = true;
                    break;
                }
                else{
                    flag = true;
                }
            }
            else{
                continue;
            }
        }
        if (result){
            System.out.println("NO");
        }
        else{
            System.out.println("YES");
        }
    }
}
