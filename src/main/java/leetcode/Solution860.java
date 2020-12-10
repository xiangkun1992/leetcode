package leetcode;

/**
 * @author kun.xiang
 */
public class Solution860 {
    public boolean lemonadeChange(int[] bills) {

        if (bills.length <= 0) {
            return false;
        }
        int count5 = 0;
        int count10 = 0;

        for (int i = 0; i < bills.length; i++) {
            if (bills[i] == 5) {
                count5++;
            } else if (bills[i] == 10) {
                count5--;
                count10++;
            } else if (count10 > 0) {
                count10--;
                count5--;
            } else {
                count5 = count5 - 3;
            }

            if (count5 < 0) {
                return false;
            }
        }
        return true;
    }
}
