package 数组;

/**
 *  基于数组上的线性查找：  效率低下
 *
 */
public class TestSearch_线性查找 {

    public static void main(String[] args) {

        //目标数组
        int[] arr = new int[]{2,3,4,5,6,7,8};
        //目标元素
        int target = 1;
        //目标元素所在的下标
        int index = -1;
        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target){
                index = i;
                break;
            }
        }
        //打印目标元素的下标
        System.out.println("index: "+index);

    }
}
