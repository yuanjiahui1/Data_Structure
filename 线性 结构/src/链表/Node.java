package 链表;

/**
 *    节点
 */
public class Node {

    //节点内容
    int data;
    //下一个节点
    Node next;

    public Node(int data){
        this.data = data;
    }

    //为节点追加节点
    public Node append(Node node){
        //当前节点
        Node CurrentNode = this;
        //循环向后找
        while(true){
            //取出下一个节点
            Node NextNode = CurrentNode.next;
            //如果下一个节点为null，则意味着到了最后一个节点
            if(NextNode==null) {
                break;
            }
             CurrentNode = NextNode;
        }

        //将传进来的节点追加到当前节点的下一个节点变量上
        CurrentNode.next = node;

        return this;

    }

    //获取下一个节点
    public Node getNext(){
        return this.next;
    }

    //获取节点中的数据
    public int getData(){
        return this.data;
    }


    //判断当前节点是否是最后一个节点
    public boolean isLast(){

        return this.next==null;

    }

    //删除节点
    public boolean delete(){
        //当前节点为尾节点
        if(this.next==null) {
            System.out.println("当前为尾节点！ 无法删除！");
            return false;
        }else{
            this.next = this.next.next;
            return true;
        }

    }

    //插入节点
    public boolean insert(Node newNode){
        if(this.next==null){
            this.next = newNode;
            return true;
        }else{
            newNode.next = this.next;
            this.next = newNode;
            return true;
        }


    }


}