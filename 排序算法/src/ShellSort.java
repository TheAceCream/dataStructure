/**
 * Created by AceCream on 2017/3/22.
 * 希尔排序（ShellSort）
 * 希尔排序效率很高！所以也是很常用的一种排序。
 * 基于插入排序的思想：缩小增量排序
 * 步骤：
 * 1.将n个元素的数组分为n/2个数字序列：第一个数据和第n/2+1个数据为一对...
 * 2.一次循环使每个序列对排好
 * 3.变为n/4个序列，再次排序。
 * 4.不断重复，周而复始，随着序列变为1，排序完成
 *
 * 时间复杂度： 平均：O(n^1.3)   最佳：O(n)   最坏：O(n^2)
 * 空间复杂度： O(1)
 * 稳定性： 不稳定
 *
 */
public class ShellSort {

    public static void shellSort(int a[]){
        int gap;
        int lenth = a.length;
        for (gap=lenth/2;gap>0;gap/=2){ //从数组的第gap个元素开始  分出来循环几次
            for (int i=0;i<gap;i++){    //分出来有多少组
                //直接插入排序
                for (int j=i+gap;j<lenth;j+=gap){
                    if (a[j]<a[j-gap]){
                        int temp = a[j];
                        int k = j-gap;
                        while (k>=0&&temp<a[k]){
                            a[k+gap]=a[k];
                            k -= gap;
                        }
                        a[k+gap]=temp;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int value[] = {49,27,46,55,4,13,38,65,97,26};
        shellSort(value);
        System.out.print("最终结果 ");
        for (int result : value) {
            System.out.print(result+" ");
        }

    }
}
