package com.doude.Sort_Basic;


/**
 * 插入排序
 * 把排序序列看成是两组序列、一组是排好序的、一组是待排序的
 */
public class InsertSortion {

    public  static  void insertSortion(int [] arr){
        //起始i就是待插入的值
        for (int i = 1; i <arr.length ; i++) {
            //保存当前i的元素,其中[0,i-1]已经排好序
                int index = arr[i];
                int j;
            for (j = i; j >0 && arr[j-1]<arr[i]; j--) {
                // 后移一位
                arr[j]=arr[j-1];
            }
            arr[j]=index;
        }
    }
}
