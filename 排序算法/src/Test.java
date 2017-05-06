/**
 * Created by AceCream on 2017/3/22.
 * 二分查找
 */
public class Test{

    public static int binary_search(int a[],int goal){
        int low = 0;
        int high = a.length-1;
        while (low <= high){
            int temp = (high+low)/2+low;
//            System.out.println(a[temp]);
            if (a[temp]==goal){
                return temp;
            }else if (a[temp]>goal){
                //左半边
                high = temp-1;
            }else {
                //右半边
                low = temp+1;
            }
        }

        return -1;
    }

    public static void main(String args[]) {
        int[] a = new int[]{1,3,2,8,52,99,21,43,55};
        //需要先经历排序

        //冒泡排序
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.bubbleSort(a);

        System.out.println("重排后：");
        for (int value : a) {
            System.out.print(value+" ");
        }
        System.out.println();
        int goal = 2;
        int result = binary_search(a,goal);
        System.out.println(goal+"在排序后的数组中的位置为："+result);


    }
}