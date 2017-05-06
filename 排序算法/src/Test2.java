/**
 * Created by AceCream on 2017/4/3.
 */
public class Test2 {
    private int a;
    public int x;
    protected int y;

}

class Test3{
    public static void main(String[] args) {
        Test2 test2 = new Test2();
        test2.y = 2;
        int a = test2.x;
        System.out.println(a);

    }
}