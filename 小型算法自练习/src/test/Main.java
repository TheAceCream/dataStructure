package test;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by AceCream on 2017/3/30.
 * 去哪儿 第一题
 */
public class Main {

    public static void main ( String arg[] ) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            boolean result = false;
            Set<Character> stringSet = new HashSet<>();
            Set<Character> stringSet2 = new HashSet<>();

            String str1 = sc.next();
            String str2 = sc.next();

            for (int i=0;i<str1.length();i++){
                stringSet.add(str1.charAt(i));
            }
            int temp1 = stringSet.size();

            for (int i=0;i<str2.length();i++){
                stringSet2.add(str2.charAt(i));
            }
            int temp2 = stringSet2.size();

            if (temp1!=temp2){
                System.out.println(result);
                return;
            }

            for (char theChar : stringSet2) {
                stringSet.add(theChar);
            }
            int temp3 = stringSet.size();

            if (temp1==temp3){
                result = true;
                System.out.println(result);
                return;
            }else {
                System.out.println(result);
                return;
            }
        }
    }

}
