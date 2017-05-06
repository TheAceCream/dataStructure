package test;

import java.util.Scanner;

/**
 * Created by AceCream on 2017/3/31.
 * 去哪儿 第二题
 */
public class Main2 {

    //字符串是否对称
    public static boolean judgeStr(int string){
        String str = string+"";
        int start = 0;
        int end = str.length()-1;
        while (end!=start&&end>start){
            if (str.charAt(start)==str.charAt(end)){
                start++;
                end--;
            }else {
                return false;
            }
        }
        return true;
    }

    public static int checkAndAdd(int num){
        num++;
        boolean result = judgeStr(num);
        while (result==false){
            num++;
            result = judgeStr(num);
        }
        return num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int num = sc.nextInt();
            System.out.println(checkAndAdd(num));
        }
    }
}
