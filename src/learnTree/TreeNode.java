package learnTree;

public class TreeNode {
    int key = 0; //key 为层序编码
    String data = null; //data 为数据域
    boolean isVisited = false;
    /*树的每一个节点的数据结构都是TreeNode类型，
    createBinTree里定义的root为TreeNode类型，所以左右孩子也为TreeNode类型，
    加上二叉树的递归思想，所以所有节点都是TreeNode类型
     */
    TreeNode leftChild = null;
    TreeNode rightChild = null;

    public TreeNode(int key,String data){
        this.key = key;
        this.data = data;
        this.isVisited = false;
        this.leftChild = null;
        this.rightChild = null;
    }

}
