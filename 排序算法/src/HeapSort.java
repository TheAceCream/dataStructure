import java.util.Arrays;

/**
 * 堆排序
 * 原理：完全二叉树
 * 时间复杂度： 平均：O(nlog2n)   最佳：O(nlog2n)   最坏：O(nlog2n)
 * 空间复杂度： O(1)
 * 稳定性： 不稳定
 *
 */
public class HeapSort {

    public static void main(String[] args) {
        int []arr = {9,8,7,6,5,4,3,2,1};
        heapSort(arr);
        System.out.println(Arrays.toString(arr));
    }


    public static void heapSort(int []arr) {
        //1.构建大顶堆
        for (int i=arr.length/2-1;i>=0;i--){
            //从第一个非叶子结点从下至上，从右至左调整结构
            adjustHeap(arr,i,arr.length);

        }
        //2.调整堆结构  堆顶元素与末尾元素进行交换
        for (int j=arr.length-1;j>0;j--){
            swap(arr,0,j);//将堆顶元素与末尾元素进行交换
            adjustHeap(arr,0,j);//重新对堆进行调整
        }
    }


    /**
     * 调整大顶堆
     * @param arr
     * @param i
     * @param length
     */
    public static void adjustHeap(int[] arr,int i,int length){
        int temp = arr[i];
        //从i结点的左子结点开始，也就是2i+1处开始
        for (int j=2*i+1;j<length;j=2*j+1){
            if (j+1<length && arr[j]<arr[j+1]){
                //如果左子结点小于右子结点，j指向右子结点
                j++;
            }
            //如果子节点大于父节点，将子节点值赋给父节点（不用进行交换）
            if (arr[j]>temp){
                arr[i]=arr[j];
                i=j;
            }else {
                break;
            }
        }
        arr[i] = temp;
    }


    /**
     * 元素交换
     * @param arr
     * @param a
     * @param b
     */
    public static void swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }




}
