package 栈;

/**
 *  利用数组模拟“栈”的工作原理， 最先压入栈中的数据最后才能取出
 *
 */
public class Mystack01 {

    //栈 的底层我们使用数组来存储数据
    int[] elements;

    public Mystack01(){
        elements = new int[0];
    }

    //压入元素的方法
    public void push(int element){
        //创建一个新的数组
        int[] newArr = new int[elements.length+1];
        //将原数组中的元素复制到新数组中
        for (int i = 0; i < elements.length; i++) {
            newArr[i] = elements[i];
        }
        //将添加的元素放入新数组中
        newArr[elements.length] = element;
        //使用新数组替换旧数组
        elements = newArr;
    }

    //取出栈顶元素
    public int pop(){
        //若栈中没有元素
        if (elements.length==0){
            throw new RuntimeException("stack is empty");
        }
        //取出数组的最后一个元素
        int element = elements[elements.length-1];
        //创建一个新数组
        int[] newArr = new int[elements.length-1];
        //原数组中除了最后一个元素的其他元素都放入新的数组中
        for (int i = 0; i < elements.length - 1; i++) {
            newArr[i] = elements[i];
        }
        //替换数组
        elements = newArr;
        //返回栈顶元素
        return element;
    }

    //查看栈顶元素
    public int peek(){
        //若栈中没有元素
        if (elements.length==0){
            throw new RuntimeException("stack is empty");
        }
        return elements[elements.length-1];
    }

    //判断栈是否为空
    public boolean isEmpty(){
        return elements.length==0;
    }


}
