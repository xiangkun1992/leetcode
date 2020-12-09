import leetcode.TwoSum;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(new TwoSum().twoSum(nums, target)));
    }
}
