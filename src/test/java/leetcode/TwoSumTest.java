package leetcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class TwoSumTest {

    @Test
    public void testTwoSum() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        Assert.assertEquals(Arrays.toString(new int[]{0, 1}), Arrays.toString(new TwoSum().twoSum(nums, target)));
    }
}