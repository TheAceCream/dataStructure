package LinkList;

/**
 * Created by AceCream on 2017/3/17.
 */
//定义结点：
class Node{
    Node next; //地址部分：保存下一个结点的地址
    int data; //数据部分：存放的是该结点的数据。

    public Node(int data) {
        this.data = data;
    }

    public String toString(){
        return data + " ";
    }

}

//定义链表结构
public class MyLinkList {
    public Node head; //头结点
    public Node current; //当前索引

    //方法：向链表中添加数据
    public void addNode(int data) {
        if (head==null){
            head = new Node(data);
            current = head;
        }else {
            current.next = new Node(data);
            current = current.next;
        }
    }

    //方法：遍历链表（打印输出链表。方法的参数表示从节点node开始进行遍历
    public void print(Node node) {
        if (head==null){
            return;
        }else{
            current = node;
            while (current!=null){
                System.out.print(current.toString());
                current = current.next;
            }

        }
    }

    //方法：求结点个数
    public int getLength(Node head){
        if (head==null){
            return 0;
        }else {
            int length = 0;
            current = head;
            while (current!=null){
                length++;
                current = current.next;
            }
            return length;
        }
    }

    //获得某个位置的数据
    public int get(int index,MyLinkList list){
        if (head == null){
            return 0;
        }else {
            Node node = list.head;
            current = head;
            for (int i=0;i<list.getLength(list.head);i++){
                if (i==index){
                    return node.data;
                }
                node = node.next;
            }
            return 0;
        }
    }

    // 方法：在任意位置插入节点 插index之后
    public void add(int index, int data ,MyLinkList list) {
        if (list.head == null){
            return;
        }else {
            Node node = new Node(data);
            Node current = list.head;

            for (int i=0;i<list.getLength(list.head);i++){
                if (i == index){
                    node.next = current.next;
                    current.next = node;
                }
                current = current.next;
            }
        }
    }





    }
