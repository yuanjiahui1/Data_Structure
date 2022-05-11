package 数组;

/**
 *  基于数组的二分查找：  效率较高
 *  前提： 目标数组必须有序
 */
public class TestSearch_二分查找 {
    public static void main(String[] args) {
        //目标数组
        int[] arr = {1,2,3,4,5,6,7,8,9};
        //目标元素
        int target =  10;
        //变量min 记录初识开头索引
        int min = 0;
        //变量max 记录初始末尾索引
        int max = arr.length-1;
        //变量mid 记录初识中间索引
        int mid = (min+max)/2;
        //记录目标位置
        int index = -1;
        //循环查找
        while(true){
            //判断中间元素是否为目标元素
            if(arr[mid]==target){
                index = mid;
                break;
            }  else{
                //对比中间元素与目标元素大小

                //若中间位置元素小于目标元素值
                if(arr[mid]<target){
                    min = mid+1;
                } else{
                    max = mid-1;
                }
                mid = (min+max)/2;
            }

        }
        System.out.println("index : "+ index);
    }
}
