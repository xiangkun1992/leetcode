package superLottoCalculator;

import java.util.Arrays;

public class SuperLottoCalculator {
    /**
     * 前区号码位数
     */
    private static final int FRONT_AREA_SIZE = 5;

    /**
     * 前区号码
     */
    private static final String[] FRONT_AREA_NUMBER = {"01", "02", "03", "04", "05",
            "06", "07", "08", "09", "10", "11", "12", "13", "14", "15",
            "16", "17", "18", "19", "20", "21", "22", "23", "24", "25",
            "26", "27", "28", "29", "30", "31", "32", "33", "34", "35"};

    /**
     * 后区号码位数
     */
    private static final int BACK_ZONE_SIZE = 2;

    /**
     * 后区号码
     */
    private static final String[] BACK_ZONE_NUMBER = {"01", "02", "03", "04", "05",
            "06", "07", "08", "09", "10", "11", "12"};

    public static void main(String[] args) {
        String frontAreaArr = String.join(",", get(FRONT_AREA_NUMBER, FRONT_AREA_SIZE));
        String backZoneArr = String.join(",", get(BACK_ZONE_NUMBER, BACK_ZONE_SIZE));
        System.out.println(frontAreaArr + " | " + backZoneArr);
    }

    private static String[] get(String[] arr, int size) {
        String[] results = new String[size];

        int n = arr.length;
        for (int i = 0; i < size; i++) {
            // 取出一个随机数
            int r = (int) (Math.random() * n);
            results[i] = arr[r];
            // 排除已经取过的值
            arr[r] = arr[n - 1];
            n--;
        }

        Arrays.sort(results);
        return results;
    }

}
