package leetcode;

/**
 * @author kun.xiang
 */
public class Solution7 {
    // 123
    public int reverse(int x) {
        int a = 0; // 3
        while (x != 0) {
            int b = x % 10; // 3
            if (a > 214748364 || (a == 214748364 && b > 7)) {
                return 0;
            }
            if (a < -214748364 || (a == -214748364 && b < -8)) {
                return 0;
            }
            a = a * 10 + b;
            x = x / 10;
        }
        // System.out.println(Integer.MAX_VALUE); // 2147483647
        // System.out.println(Integer.MIN_VALUE); // -2147483648
        return a;
    }
}
