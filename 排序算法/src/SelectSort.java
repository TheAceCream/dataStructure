/**
 * Created by AceCream on 2017/3/20.
 * 选择排序（SelectionSort）
 * 通过选择和交换来实现排序
 * 1.首先从原始数组中选择最小的1个数据，将其和位于第一个位置的数据交换。
 * 2.接着从剩下的n-1个数据中选择里面最小的元素，和第二个位置数据进行交换。
 * 3.不断重复
 *
 * 时间复杂度： 平均：O(n^2)   最佳：O(n^2)   最坏：O(n^2)
 * 空间复杂度： O(1)
 * 稳定性： 不稳定
 *
 */
public class SelectSort {

    public static void selectSort(int value[]){
        int index;//最小值的脚标
        int temp;
        for (int i=0;i<value.length-1;i++){
            index = i;
            System.out.print("对比值："+value[index]+" ");
            //通过循环，寻找最小值，把最小值的脚标赋给index，不断更新，直到结束，value[index]是所有中最小的
            for (int j=i;j<value.length;j++){
                if (value[j]<value[index]){
                    index = j;
                }
            }

            if (index!=i){
                temp = value[i];
                value[i]=value[index];
                value[index]=temp;
            }
        }
    }

    public static void main(String[] args) {
        int value[] = {12,3,8,9,2,6,15,9,16,23};
        selectSort(value);
        System.out.print("最终结果 ");
        for (int result : value) {
            System.out.print(result+" ");
        }
    }
}
