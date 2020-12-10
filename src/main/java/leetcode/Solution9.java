package leetcode;

/**
 * @author kun.xiang
 */
public class Solution9 {

    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        return x == cover(x);
    }

    private int cover(int num) {
        int a = 0;
        while (num != 0) {
            int b = num % 10;
            a = a * 10 + b;
            num = num / 10;
        }
        return a;
    }
}
