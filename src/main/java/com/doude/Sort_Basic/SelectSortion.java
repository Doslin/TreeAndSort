package com.doude.Sort_Basic;

/**
 * 选择排序是在一趟待排序的数组中选出最小的数
 */
public class SelectSortion {

    public  static  void  selectSortion(int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    min = j;
                }
            }
            if (min != i) {
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
    }

}