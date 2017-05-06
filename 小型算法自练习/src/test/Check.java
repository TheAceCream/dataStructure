package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by AceCream on 2017/3/25.
 * 给定一个字符串，请你将字符串重新编码，将连续的字符替换成“连续出现的个数+字符”。
 * 比如字符串AAAABCCDAA会被编码成4A1B2C1D2A。
     输入描述:
     每个测试输入包含1个测试用例
     每个测试用例输入只有一行字符串，字符串只包括大写英文字母，长度不超过10000。
 */
public class Check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        List list = new ArrayList();
        int count=0;
        for (int i=0;i<str.length();i++){

            if (list.size()==0){
                list.add(str.charAt(i));
            }
            if (list.get(0).equals(str.charAt(i))){
                count++;
            }else if (!list.get(0).equals(str.charAt(i))||(i==str.length()-1)){
                System.out.print(count+""+list.get(0)+"");
                list.clear();
                count=0;
                i--;
            }
        }
        if (!list.isEmpty()){
            System.out.print(count+""+list.get(0));
        }
    }
}
