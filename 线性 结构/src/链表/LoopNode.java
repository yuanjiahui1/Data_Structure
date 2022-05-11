package 链表;

//循环链表

public class LoopNode {

    int data;

    LoopNode next = this;       //如果仅有一个节点，则该节点的next值应为当前节点

    public LoopNode(int data){

        this.data = data;

    }

    //插入一个节点作为当前节点的next值
    public void after(LoopNode newNode){

        newNode.next = this.next;
        this.next = newNode;

    }


}
