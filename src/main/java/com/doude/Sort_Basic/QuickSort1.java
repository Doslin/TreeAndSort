package com.doude.Sort_Basic;

import java.util.Random;

public class QuickSort1 {
    public  static void quickSort(int[] arr){
        quickSort(arr,0,arr.length-1);
    }

    private static void quickSort(int[] arr, int left, int right) {
        if (left<=right)
            return;
        //分组排序
        int p = partition(arr,left,right);
        quickSort(arr,left,p-1);//左分组
        quickSort(arr, p+1, right);//右分组
    }

    private static int partition(int[] arr, int left, int right) {
        Random random = new Random();
        int t = (int) random.nextInt(right)%(right-left+1)+left;
        return 1;
    }
}
