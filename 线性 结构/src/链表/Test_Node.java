package 链表;

public class Test_Node {

    public static void main(String[] args) {

        /*单链表测试*/
 /*

        //创建节点
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);

        //追加节点
        n1.append(n2).append(n3);
        //取出下一个节点的数据
        System.out.println(n1.next.append(new Node(4)).getData());

        System.out.println("节点是否为尾节点："+n3.next.isLast());       //判断节点n3的下一个节点是否为尾节点

        System.out.println("节点是否删除成功："+n1.delete());            //打印节点是否删除成功
        System.out.println("删除某节点后，当前节点的下一个节点的数据为："+n1.next.getData());
*/


        /*循环链表测试*/
//        LoopNode n1 = new LoopNode(1);
//        LoopNode n2 = new LoopNode(2);
//        LoopNode n3 = new LoopNode(3);
//        LoopNode n4 = new LoopNode(4);
//
//        n1.after(n2);
//        n2.after(n3);
//        n3.after(n4);
//        //n4.after(n1);
//
//        System.out.println(n1.next.data);
//        System.out.println(n2.next.data);
//        System.out.println(n3.next.data);
//        System.out.println(n4.next.data);

        /*双向链表测试*/

        DoubleNode n1 = new DoubleNode(1);
        DoubleNode n2 = new DoubleNode(2);
        DoubleNode n3 = new DoubleNode(3);
        DoubleNode n4 = new DoubleNode(4);
        DoubleNode nn = new DoubleNode(10);

        n1.add(n2);
        n2.add(n3);
        n3.add(n4);

        System.out.println(n1.next.data);           //打印当前节点的下一个节点的data值
        System.out.println(n2.pre.data);            //打印当前节点的上一个节点的dta值

        System.out.println(n2.next.data);
        System.out.println(n3.pre.data);

        System.out.println(n3.next.data);
        System.out.println(n4.pre.data);

        System.out.println("----------------------");

        n2.insert(nn);                              //在n2节点后（n3节点前）插入新的节点nn
        System.out.println(n2.next.data);
        System.out.println(nn.pre.data);
        System.out.println(nn.next.data);
        System.out.println(n3.pre.data);

        System.out.println("----------------------");

        nn.delete();                                //将nn节点删除
        System.out.println(n2.next.data);
        System.out.println(n3.pre.data);





    }
}
