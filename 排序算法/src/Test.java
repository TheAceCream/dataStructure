/**
 * Author:Cream
 * Date:2018/4/6
 * Description:
 */
public class Test {

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

    private static int binarySearch(int[] arr,int target){
        int low = 0;
        int high = arr.length-1;
        while (low<=high){
            int mid = low +(high-low)/2;
            if (arr[mid]<target){
                low = mid + 1;
            }else {
                high = mid - 1;
            }
        }
        return low;
    }

    private static int binarySearchRecur(int[] arr,int target,int low,int high){
        if (low > high){
            return low;
        }
        int mid = low + (high-low)/2;
        if (arr[mid]<target){
            return binarySearchRecur(arr, target, mid+1, high);
        }else {
            return binarySearchRecur(arr, target, low, mid-1);
        }
    }


}
