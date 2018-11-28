package com.doude.Sort_Basic;

/**
 * 冒泡排序的思想：
 * 比较相邻的两个元素、如果第一个比第二个大、就交换他们
 * 对每一对相邻的元素做同样的操作、从开始第一队到最后结尾一对。这步做完后、结尾的元素将会是最大的元素
 */
public class BubbleSort {
    /**
     * 冒泡循环需要两个嵌套的循环，其中、外层移动游标、内层循环遍历游标及游标之前的元素
     * 通过两辆交换的方式、每次只确保该内循环结束的位置排序正确
     * 然后内循环执行周期结束、交由外循环来往后移动游标、随机开始下一轮循环
     * 以此类推、直至循环结束
     * @param arr
     */
    public static  void  bubbleSort(int [] arr){
        //外层循环移动游标
        for (int i = arr.length; i >0 ; i--) {
            for (int j = 0; j <i && (j+1)<i; j++) {
                //内层循环遍历游标及之前的元素
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}
