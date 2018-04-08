import java.util.Arrays;

/**
 * Created by AceCream on 2017/3/19.
 * 快速排序QuickSort （属于交换排序）
 * 原理：
 * 一次循环：从后往前比较，用基准值和最后一个值比较，
 * 如果比基准值小的交换位置，如果没有继续比较下一个，
 * 直到找到第一个比基准值小的值才交换。
 * 找到这个值之后，又从前往后开始比较，如果有比基准值大的，交换位置，
 * 如果没有继续比较下一个，直到找到第一个比基准值大的值才交换。
 * 直到从前往后的比较索引>从后往前比较的索引，结束第一次循环。
 * 此时，对于基准值来说，左右两边就是有序的了。
 * 接着分别比较左右两边的序列，重复上述的循环。
 *
 * 时间复杂度： 平均：O(nlog2n)   最佳：O(nlog2n)   最坏：O(n^2)
 * 空间复杂度： O(1)
 * 稳定性： 不稳定
 *
 */
public class QuickSort {

    private static void quickSort(int[] value, int start, int end) {
        int left = start;
        int right = end;
        int key = value[start];
        while (left<right){
            while (left<right&&value[right]>=key){
                right--;
            }

            if (left<right){
                value[left]=value[right];
                left++;
            }

            while (left<right&&value[left]<key){
                left++;
            }

            if (left<right){
                value[right]=value[left];
                right--;
            }

            value[left] = key;

            if (left>start) quickSort(value,start,left-1);
            if (right<end) quickSort(value,right+1,end);
        }
    }

    public static void main(String[] args) {
        int[] value = {49,3,65,97,76,13,27,49};
        int start = 0;
        int end = value.length-1;
        quickSort(value,start,end);

        //打印出来
        for (int result : value) {
            System.out.print(result+" ");
        }
    }



}
