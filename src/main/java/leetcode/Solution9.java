package leetcode;

/**
 * @author kun.xiang
 */
public class Solution9 {

    public boolean isPalindrome(int x) {
        if (x < 0 || (x != 0 && x % 10 == 0)) {
            return false;
        }

        int a = 0;
        while (x > a) {
            int b = x % 10;
            a = a * 10 + b;
            x = x / 10;
        }

        return x == a || x == a / 10;
    }

}
