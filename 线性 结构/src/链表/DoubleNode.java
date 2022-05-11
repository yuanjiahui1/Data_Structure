package 链表;

//双向 链表

public class DoubleNode {

    int data;
    DoubleNode next;
    DoubleNode pre;

    public DoubleNode(int data){

        this.data = data;

    }

    //增加节点
    public void add(DoubleNode newNode){

        this.next = newNode;
        newNode.pre = this;

    }

    //插入新节点
    public void insert(DoubleNode newNode){

        this.next.pre = newNode;
        newNode.next = this.next;
        this.next = newNode;
        newNode.pre  = this;

    }

    //删除某一个节点
    public void delete(){
        if(this.pre==null){         //若为头节点
            this.next.pre = null;               //将当前节点的后一个节点的pre值置空
            this.next = null;                   //将当前节点的next值置空
        }else if(this.next==null){  //若为尾节点
            this.pre.next = null;               //将当前节点的前一个节点的next值置空
            this.pre = null;                    //将当前节点的pre值置空
        }else{                      //中间节点
            this.next.pre = this.pre;
            this.pre.next = this.next;

        }
    }




}
