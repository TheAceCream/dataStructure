package test;

/**
 * Created by AceCream on 2017/3/24.
 * 汉诺塔问题！练习递归思想！JAVA编~
 */
public class Hanoi {
    /**
     * 汉诺塔步骤输出
     * @param n 表示3个柱子A、B、C中第1个柱子A的盘子数量
     * @param a A柱子名
     * @param b B柱子名
     * @param c C柱子名
     */
    public static void Hanoi(int n,String a,String b,String c){
        if (n==1){
            //如果是1个就直接从A拿到C
            System.out.println(a+"-->"+c);
        }else {
            //如果不是1个盘子
            //就先把A盘子上的除了大盘子以外的所有小盘拿到B
            Hanoi(n-1,a,c,b);
            //然后将A上最后的那个大盘子拿到C上去
            Hanoi(1, a, b, c);
            //最后把B上的所有盘子放到C上，因为总盘子数是n,C上有个最大的，那B上盘子数就为n-1
            Hanoi(n-1,b,a,c);
        }
    }

//    public static void main(String[] args) {
//        //输出测试
//        Hanoi(3,"A","B","C");
//    }
}
