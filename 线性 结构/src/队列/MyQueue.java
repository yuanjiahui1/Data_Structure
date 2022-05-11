package 队列;

/**
 * 底层基于数组模拟队列的工作原理；
 *
 */
public class MyQueue {

    int[] elements;

    public MyQueue(){
        elements = new int[0];
    }

    //进入队列
    public void add(int element){
        //创建一个新的数组
        int[] newArr = new int[elements.length+1];
        //将原数组的所有元素拷贝至新数组中
        for (int i = 0; i < elements.length; i++) {
            newArr[i] = elements[i];
        }
        //将目标元素添加到新数组最后一个位置
        newArr[elements.length] = element;
        //替换数组
        elements = newArr;

    }

    //出队
    public int poll(){
        //将数组索引为0的元素值取出
        int element = elements[0];
        //创建一个新数组
        int[] newArr = new int[elements.length-1];
        //将原数组除索引为0位置的元素值以外的其他元素全部复制到新数组中
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = elements[i+1];
        }
        //替换数组
        elements = newArr;
        //返回取出的元素值
        return element;
    }

    public boolean isEmpty(){
        return elements.length == 0;
    }
}
