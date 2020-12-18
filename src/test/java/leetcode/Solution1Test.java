package leetcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class Solution1Test {

    private Solution1 solution1;

    @Before
    public void init() {
        this.solution1 = new Solution1();
    }

    @Test
    public void testTwoSum1() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        String expected = Arrays.toString(new int[]{0, 1});
        String actual = Arrays.toString(solution1.twoSum(nums, target));
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testTwoSum2() {
        int[] nums = {11, 2, 7, 15};
        int target = 9;
        String expected = Arrays.toString(new int[]{1, 2});
        String actual = Arrays.toString(solution1.twoSum(nums, target));
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testTwoSum3() {
        int[] nums = {11, 15, 2, 7};
        int target = 9;
        String expected = Arrays.toString(new int[]{2, 3});
        String actual = Arrays.toString(solution1.twoSum(nums, target));
        Assert.assertEquals(expected, actual);
    }

}