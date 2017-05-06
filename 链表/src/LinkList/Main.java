package LinkList;

import java.util.Scanner;

/**
 * Created by AceCream on 2017/3/18.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MyLinkList myLinkList = new MyLinkList();
        System.out.println("想输入多少结点：");
        int count = scanner.nextInt();
        System.out.println("请依次输入结点数据(int类型)：");
        for (int i=0;i<count;i++){
            myLinkList.addNode(scanner.nextInt());
        }
        //输入测试
        System.out.println("生成你的链表：");
        myLinkList.print(myLinkList.head);

//        System.out.println();
//        System.out.println("链表长度：");
//        System.out.println(myLinkList.getLength(myLinkList.head));

//        System.out.println("获取第几个？");
//        System.out.println(myLinkList.get(scanner.nextInt()-1,myLinkList));

        System.out.println();
        System.out.println("在那个位置插入数据？");
        int pos = scanner.nextInt()-1;
        System.out.println("插入的数据（int）");
        int temp = scanner.nextInt();
        myLinkList.add(pos,temp,myLinkList);
        System.out.println("新链表：");
        myLinkList.print(myLinkList.head);

    }
}
