package leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution7Test {

    private Solution7 solution7;

    @Before
    public void setUp() {
        this.solution7 = new Solution7();
    }

    @Test
    public void testReverse1() {
        assertEquals(321, solution7.reverse(123));
    }

    @Test
    public void testReverse2() {
        assertEquals(-321, solution7.reverse(-123));
    }

    @Test
    public void testReverse3() {
        assertEquals(0, solution7.reverse(2147483647));
    }

    @Test
    public void testReverse4() {
        assertEquals(0, solution7.reverse(-2147483648));
    }

    @Test
    public void testReverse5() {
        assertEquals(21, solution7.reverse(120));
    }

}