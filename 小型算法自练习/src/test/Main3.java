package test;

import java.util.Scanner;

/**
 * Created by AceCream on 2017/3/31.
 * 去哪儿 第三题
 */
public class Main3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String string = sc.next();
            if (string.length()!=18){
                System.out.println("ERROR");
            }else {
                System.out.println(string.substring(6,14));
            }


        }
    }

}
