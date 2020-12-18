package leetcode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author kun.xiang
 */
public class Solution649 {

    // Dota2 的世界里有两个阵营：Radiant(天辉)和 Dire(夜魇)
    // RD -> Radiant  RDD -> Dire

    public String predictPartyVictory(String senate) {
        Queue<Integer> rad = new LinkedList<Integer>();
        Queue<Integer> dir = new LinkedList<Integer>();

        for (int i = 0; i < senate.length(); i++) {
            if (senate.charAt(i) == 'R') {
                rad.offer(i);
            }

            if (senate.charAt(i) == 'D') {
                dir.offer(i);
            }
        }
        System.out.println(Arrays.toString(rad.toArray()));
        System.out.println(Arrays.toString(dir.toArray()));

        while (!rad.isEmpty() && !dir.isEmpty()) {
            int radiantIndex = rad.poll(), direIndex = dir.poll();
            if (radiantIndex < direIndex) {
                rad.offer(radiantIndex + senate.length());
            } else {
                dir.offer(direIndex + senate.length());
            }
        }
        return !rad.isEmpty() ? "Radiant" : "Dire";
    }

}
