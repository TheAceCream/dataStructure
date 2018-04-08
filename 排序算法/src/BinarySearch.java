/**
 * Author:Cream
 * Date:2018/4/5
 * Description:
 * 折半查找
 * 二分法
 */
public class BinarySearch {

    public static int binarySearch(int[] array,int target){
        int low = 0;
        int high = array.length-1;
        while (low<=high){
            int mid = low + (high-low)/2;
            if (array[mid]<target){
                low = mid + 1;
            }
            if (array[mid]>=target){
                high = mid - 1;
            }
        }
        return low;
    }

    /**
     * 递归二分查找
     * @param nums
     * @param target
     * @param low
     * @param high
     * @return
     */
    public static int binarySearchRecur(int[] nums,int target,int low,int high) {
        while (low>high){
            return low;
        }
        int mid = low + (high-low)/2;
        if (nums[mid]<target){
            return binarySearchRecur(nums,target,mid+1,high);
        }else {
            return binarySearchRecur(nums,target,low,mid-1);
        }
    }



    public static void main(String[] args) {
        int[] arr = new int[]{5,2,6,1,7,8,65};
        HeapSort.heapSort(arr);
        System.out.println("重排后：");
        for (int value : arr) {
            System.out.print(value+" ");
        }
        System.out.println();
        int goal = 8;
        int result = binarySearch(arr,8);
        int result2 = binarySearchRecur(arr,8,0,arr.length);
        System.out.println(goal+"（迭代）在排序后的数组中为："+result);
        System.out.println(goal+"（递归）在排序后的数组中为："+result2);

    }

}
