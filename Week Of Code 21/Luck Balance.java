import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner in = new Scanner(System.in);
        int contest = in.nextInt();
        int totalLuck = 0;
        // only important ones considered
        int amtSheCanLose = in.nextInt();
        
        // starts as a max luck heap
        PriorityQueue<Integer> queue = new PriorityQueue<>(contest, Collections.reverseOrder());
        // keep min heap, pop the amtSheCanLose from the top and reduce luck, rest add their luck
        for (int x = 0; x < contest; x++){
            int contestLuck = in.nextInt();
            int contestImportance = in.nextInt();
            if (contestImportance == 0){
                totalLuck += contestLuck;
                continue;
            }
            queue.add(contestLuck);
        }
        
        for (int x = 0; x < queue.size() ;){
            // she looses as many games as she can afford to loose
            if (amtSheCanLose > 0){
                // gaines the most amount of luck
                totalLuck += queue.poll();
                // one less game she can loose
                amtSheCanLose--;
            }
            else{
                // the rest she needs to win
                totalLuck -= queue.poll();
            }
        }
        System.out.println(totalLuck);
    }
}
