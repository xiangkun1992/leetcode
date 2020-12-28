package nowcoder;

import java.util.Arrays;

public class NC41 {
    /**
     * @param arr int整型一维数组 the array
     * @return int整型
     */
    public int maxLength(int[] arr) {
        int[] lastPos = new int[100005]; //记录每个元素的位置的数组,比如索引为0,那么这里记录的是1

        int start = 0; //记录不重复数组的起始索引
        int res = 0; //记录不重复数组的最大长度
        // 2345
        for(int i =0;i<arr.length;i++){
            int now = arr[i];
            //如果没有不重复元素,lastPos[now]这个值就一直是0,那么start不会改变
            //如果出现重复元素,就会取重复元素的索引的位置的值,作为索引值
            start = Math.max(start,lastPos[now]);
            res = Math.max(res,i-start+1);
            lastPos[now] = i+1;//记录这个元素的位置放在数组里
            System.out.println("i" +  i + "iarr[i]:" + arr[i] + "start:" + start + "res:" + res);
        }

        return res;
    }
}
