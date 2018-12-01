package com.doude.advanced;

/**
 * 原地堆排序
 */
public class HeapSort {

    private HeapSort(){}
    public static void  sort(Integer [] arr ){
        int n = arr.length;
        for (int i = (n-1-1)/2;i >=0;i--){
            shiftDown2(arr,n,i);
        }
        for (int i = n-1; i >0; i--) {
            swap(arr,0,i);
            shiftDown2(arr,i,0);
        }
    }

    //交换堆中索引为i和j的索引
    private static void swap(Object[] arr, int i, int j) {

    }

    //
    private static void shiftDown2(Integer[] arr, int i, int j) {
        Integer e = arr[j];
        while ((j<<1)+1<i){
            int k =(j<<1)+1;
        }

    }
}
