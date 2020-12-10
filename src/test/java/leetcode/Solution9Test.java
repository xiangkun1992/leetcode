package leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution9Test {

    private Solution9 solution9;

    @Before
    public void setUp() {
        this.solution9 = new Solution9();
    }

    @Test
    public void testIsPalindrome1() {
        assertTrue(solution9.isPalindrome(121));
    }

    @Test
    public void testIsPalindrome2() {
        assertFalse(solution9.isPalindrome(120));
    }

    @Test
    public void testIsPalindrome3() {
        assertFalse(solution9.isPalindrome(-121));
    }

}