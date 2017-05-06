package learnTree;

/**
 * Created by AceCream on 2017/3/14.
 */
public class Main {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        BinaryTree bt2 = new BinaryTree();
        /*
            由初始化的时候可知：我创建了一个这样的树,供查看写的方法是否正确
            这棵树起名为bt:           这棵树起名为bt2 供比较
                      A                 A
                    /  \               / \
                   B   C              B  C
                  /\  /              /\
                 D E F              D E
        */
        bt.createBinTree(bt.root);
        bt2.createBinTree2(bt2.root);

        //1.看结点数
        System.out.println("1.树的结点个数为：" + bt.size(bt.root));
        //2.看深度
        System.out.println("2.树的深度为："+bt.getDepth(bt.root));
        //3. 前序遍历，中序遍历，后序遍历
        System.out.print("3-1.先序遍历：");
        bt.preOrderTraverse(bt.root);
        System.out.println();

        System.out.print("3-2.中序遍历：");
        bt.inOrderTraverse(bt.root);
        System.out.println();

        System.out.print("3-3.后序遍历：");
        bt.postOrderTraverse(bt.root);
        System.out.println();

        //4.将二叉树用层次遍历
        System.out.print("4.二叉树层次遍历：");
        bt.levelTraverse(bt.root);
        System.out.println();

        //5.二叉树K层有多少个结点：由上图绘制可知：0层没有，1层有一个根节点，第二层有俩，第三次有仨
        System.out.println("5.二叉树K层结点个数：");
        System.out.println("    当K=0时有"+bt.getNodeNumKthLevel(bt.root,0)+"个结点");
        System.out.println("    当K=1时有"+bt.getNodeNumKthLevel(bt.root,1)+"个结点");
        System.out.println("    当K=2时有"+bt.getNodeNumKthLevel(bt.root,2)+"个结点");
        System.out.println("    当K=3时有"+bt.getNodeNumKthLevel(bt.root,3)+"个结点");

        //6.求二叉树中叶子节点的个数
        System.out.print("6.二叉树叶子节点个数：");
        System.out.println(bt.getLeafNodeNum(bt.root));

        //7.比较两个二叉树相不相同
        System.out.println("7.测试两树结构是否相同：");
        System.out.println("    b1和b1："+bt.StructureCmp(bt.root,bt.root));
        System.out.println("    b1和b2："+bt.StructureCmp(bt.root,bt2.root));

        //8.清空二叉树
        System.out.println("8.清除二叉树：");
        bt.clearTree(bt.root);
        System.out.println("8.2.树的深度为："+bt.getDepth(bt.root));


    }

}
