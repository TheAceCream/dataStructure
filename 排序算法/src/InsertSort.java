/**
 * Created by AceCream on 2017/3/20.
 *
 * 插入排序（Insertion Sort）
 * 原理：通过对未排序的数据执行逐个插入到合适的位置完成排序工作。
 * 1.首先对数组前两个数据进行从小到大排序
 * 2.将第三个数据与排好序的两个数据比较，插入合适的位置。
 * 3.第四个同样方式插入到他们三个中。
 * 4.不断重复，直到结束。
 *
 * 时间复杂度： 平均：O(n^2)   最佳：O(n)   最坏：O(n^2)
 * 空间复杂度： O(1)
 * 稳定性： 稳定
 *
 */
public class InsertSort {
    public static void main(String[] args) {
            int value[] = {12,3,8,9,2,6,15,9,16,23};
            InsertSort insertSort = new InsertSort();
            insertSort.insertSort(value);
            System.out.print("最终结果 ");
            for (int result : value) {
                System.out.print(result+" ");
            }

    }

    private void insertSort(int[] value) {
        //temp值待命
        int temp;
        for (int i=1;i<value.length;i++){
            //从第二个数据开始取 每轮的检测数据都先放temp里
            temp = value[i];
            int j = i-1;
            while (j>=0 && temp<value[j]){
                //如果比较的值，比temp大，就让这个值往后去。temp继续比较。。。碰到比它小的，就在其后面落下（后面这句是循环外放下的）
                value[j+1]=value[j];
                j--;
            }
            //没有比它小的就放回去，有的话就放到应该在的位置
            value[j+1]=temp;
        }

    }
}
