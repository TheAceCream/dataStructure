/**
 * Created by AceCream on 2017/3/19.
 * 冒泡排序BubbleSort（属于交换排序）
 * 时间复杂度： 平均：O(n^2)   最佳：O(n)   最坏：O(n^2)
 * 空间复杂度： O(1)
 * 稳定性： 稳定
 *
 * 优点：
 * 缺点：
 */
public class BubbleSort {

    public static void bubbleSort(int[] values){
        for (int i=0;i<values.length;i++){
            for (int j=i;j<values.length;j++){
                if (values[i]>values[j]){
                    int temp = values[i];
                    values[i] = values[j];
                    values[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int value[] = {1,7,5,8,3};
        bubbleSort(value);
        for (int result : value) {
            System.out.print(result+" ");
        }

    }
}
