package leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution860Test {

    private Solution860 solution;

    @Before
    public void init() {
        this.solution = new Solution860();
    }

    @Test
    public void test1() {
        int[] balls = {5, 5, 5, 10, 20};
        assertTrue(solution.lemonadeChange(balls));
    }

    @Test
    public void test2() {
        int[] balls = {5, 5, 10};
        assertTrue(solution.lemonadeChange(balls));
    }

    @Test
    public void test3() {
        int[] balls = {10, 10};
        assertFalse(solution.lemonadeChange(balls));
    }

    @Test
    public void test4() {
        int[] balls = {5, 5, 10, 10, 20};
        assertFalse(solution.lemonadeChange(balls));
    }

}