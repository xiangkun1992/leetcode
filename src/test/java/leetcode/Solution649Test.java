package leetcode;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution649Test {

    private Solution649 solution649;

    @Before
    public void setUp() throws Exception {
        this.solution649 = new Solution649();
    }

    @Test
    public void testPredictPartyVictory1() {
        solution649.predictPartyVictory("RDD");
    }

    @Test
    public void testPredictPartyVictory2() {
        solution649.predictPartyVictory("RD");
    }

}