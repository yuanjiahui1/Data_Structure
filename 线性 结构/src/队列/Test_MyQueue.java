package 队列;

public class Test_MyQueue {

    public static void main(String[] args) {

        //创建一个队列
        MyQueue mq =  new MyQueue();
        //入队
        mq.add(1);
        mq.add(2);
        mq.add(3);
        mq.add(4);
        mq.add(5);
        //出队
        System.out.println(mq.poll());
        mq.add(9);
        System.out.println(mq.poll());
        System.out.println(mq.poll());
        System.out.println(mq.poll());
        System.out.println(mq.poll());
        System.out.println(mq.poll());

        System.out.println(mq.isEmpty());
    }

}
