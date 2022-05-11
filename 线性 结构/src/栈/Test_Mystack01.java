package 栈;

public class Test_Mystack01 {
    public static void main(String[] args) {
        //创建一个栈
        Mystack01 ms1 = new Mystack01();
        //压入数组
        ms1.push(9);
        ms1.push(8);
        ms1.push(7);
        System.out.println(ms1.pop());
        System.out.println(ms1.pop());
        System.out.println(ms1.pop());
        //查看栈顶元素
        System.out.println(ms1.isEmpty());
    }
}
