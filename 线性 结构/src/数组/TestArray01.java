package 数组;

/**
 *    数组的基本使用
 *
 */

import java.util.Arrays;

public class TestArray01 {

    public static void main(String[] args){
        //创建数组
        int[] arr1 = new int[3];
        //获取数组长度
        int length1 = arr1.length;
        System.out.println("arr1's length :"+length1);

        //访问数组中的元素：  数组名[下标]    注意： 下标从0开始，最大为取  长度-1
        int element0 = arr1[0];
        System.out.println("element0 :"+ " "+ arr1[0]);

        //初始化数组中的每个元素
        arr1[0] = 99;
        arr1[1] = 98;
        arr1[2] = 97;

        //遍历并输出数组中的每个元素的值
        for (int i = 0; i < 3; i++) {
            System.out.println(arr1[i]);
        }

        System.out.println("------------------------------------");

        //解决数组长度不可变问题
        int[] arr2 = new int[]{9,8,7};
        //快速查看数组中的元素值
        System.out.println(Arrays.toString(arr2));
        //要加入数组的目标元素
        int dst = 6;

        //创建一个新数组,长度是元素组的长度  +1
        int[] arr3 = new int[arr2.length+1];
        //将元素组中的所有元素值全部拷贝至新数组中
        for (int i = 0; i < arr2.length; i++) {
            arr3[i] = arr2[i];
        }
        //打印新数组中元素值
        System.out.println(Arrays.toString(arr3));
        //将目标元素放入新数组中的最后一个位置
        arr3[arr2.length] = dst;
        //新数组替换成原数组
        arr2 = arr3;
        System.out.println(Arrays.toString(arr2));


        System.out.println("----------------------------");

        //删除数组中某一个元素的值,例 ：  删除元素值为 4
        int[] arr4 = {1,2,3,4,5,6,7,8};
        int[] arr5 = new int[arr4.length-1];

        int dest = 4;

        for (int i = 0;i<arr5.length;i++){
            if (arr4[i]<dest){
                arr5[i] = arr4[i];
            } else {
                arr5[i] = arr4[i+1];
            }
        }

        arr4 = arr5;
        System.out.println(Arrays.toString(arr4));




    }

}
