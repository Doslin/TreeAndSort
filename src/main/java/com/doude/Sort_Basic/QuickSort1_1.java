package com.doude.Sort_Basic;

public class QuickSort1_1 {



    public static int partition(int [] arr,int l ,int r){


            int v =arr[l];
            int j = l;
        for (int i = l+1; i <= r ; i++) {
            if (arr[i]<v){
                j++;
                swap(arr,j,i);
            }
        }
        swap(arr,l,j);
        /**
         * 为什么？？？？？
         *
         */
        return l;
    }

    private static void swap(int[] arr, int j, int i) {
    }
}
