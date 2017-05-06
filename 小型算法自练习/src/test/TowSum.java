package test;

import java.util.List;
import java.util.Scanner;

/**
 * 在一个N*N的数组中寻找所有横，竖，左上到右下，右上到左下，四种方向的直线连续D个数字的和里面最大的值
 输入描述:
 每个测试输入包含1个测试用例，第一行包括两个整数 N 和 D :
 3 <= N <= 100
 1 <= D <= N
 接下来有N行，每行N个数字d:
 0 <= d <= 100


 输出描述:
 输出一个整数，表示找到的和的最大值

 输入例子:
 4 2
 87 98 79 61
 10 27 95 70
 20 64 73 29
 71 65 15 0

 输出例子:
 193
 */

public class TowSum {
    public static void main(String args[]) {
        /*
        测试用例：
        87 98 79 61
        10 27 95 70
        20 64 73 29
        71 65 15 0
         */
        Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            int d = in.nextInt();
            // 初始化数组
            int[][] array = new int[n][n];
            for (int y = 0; y < n; y++) {
                for (int x = 0; x < n; x++) {
                    array[x][y] = in.nextInt();
                }
            }
            //把数组和d值 拿去算
            System.out.println(test(d, array));

    }

    //得到部分的长度
    public static int getPartMax(int x,int y,int length,int[][] array){
        int max = 0;
        for (int i = x; i < x + length; i++) {
            int local_vertical = 0;
            for (int j = y; j < y + length; j++) {
                local_vertical += array[i][j];

            }
            max = Math.max(local_vertical, max);
        }
        return max;
    }

    public static int getMax(int startX, int startY, int length, int[][] array) {
        //输出的结果
        int result = 0;
        //左上右下 加和
        int left_top = 0;
        //左下右上 加和
        int right_top = 0;
        //竖线 加和
        int horizon = 0;
        //横线 加和
        int vertical = 0;
        for (int x = startX, y = startY, y2 = startY + length - 1; x < startX + length; x++, y++,y2--) {
            left_top += array[x][y];
//            System.out.println(left_top);
            right_top += array[x][y2];
//            System.out.println(right_top);
        }
//        System.out.println();
        //竖线
        vertical = getPartMax(startX,startY,length,array);
//        for (int i = startX; i < startX + length; i++) {
//            int local_vertical = 0;
//            for (int j = startY; j < startY + length; j++) {
//                local_vertical += array[i][j];
//            }
//            //竖线
//            vertical = Math.max(local_vertical, vertical);
//        }
        //横线
        horizon = getPartMax(startY,startX,length,array);
//        for (int y = startY; y < startY + length; y++) {
//            int local_honrizon = 0;
//            for (int x = startX; x < startX + length; x++) {
//                local_honrizon += array[x][y];
//            }
//            //横线
//            horizon = Math.max(local_honrizon, horizon);
//        }
        //结果取四个里面最大的那个！
        result = Math.max(Math.max(left_top, right_top), Math.max(vertical, horizon));
        return result;
    }

    //
    public static int test(int D, int[][] array) {
        int result = 0;
        for (int i = 0; i <=array.length - D; i++) {
            for (int j = 0; j <= array.length - D; j++) {
                //数组中的部分数据，一个一个的传过去，横轴x，纵轴y，连续D个,数组本身是array
                /*
                    87 98 79
                    10 27 95
                    20 64 73
                 */
                result = Math.max(result, getMax(j, i, D, array));
//                System.out.print(array[j][i]+" ");
            }
//            System.out.println();
        }
        return result;

    }

}