package nowcoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class NC41Test {
    private NC41 nc41;

    @Before
    public void init() {
        this.nc41 = new NC41();
    }

    @Test
    public void test1() {
        int[] arr = {2,3,4,5};
        int length = nc41.maxLength(arr);
        Assert.assertEquals(4, length);
    }

    @Test
    public void test2() {
        int[] arr = {2,2,3,4,3};
        int length = nc41.maxLength(arr);
        Assert.assertEquals(3, length);
    }

}