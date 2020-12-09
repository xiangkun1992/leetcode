package leetcode;

import junit.framework.TestCase;

import java.util.Arrays;

public class TwoSumTest extends TestCase {

    public void testTwoSum() {
        int[] nums = {2,7,11,15};
        int target = 9;
        assertEquals(Arrays.toString(new int[]{0, 1}), Arrays.toString(new TwoSum().twoSum(nums, target)));
    }
}