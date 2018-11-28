package com.doude.Sort_Basic;

/**
 * 最大堆的实现
 */
public class HeapSort {

    //算法不允许产生实例
    private  HeapSort(){

    }
    public static void  sort(Comparable[] arr){
        int n = arr.length;
        //我们的堆是从0开始索引的
        //从（最后一个元素-1）/2开始
        //最后一个元素的索引=n-1
        /**
         * 先转成最大堆
         */
        for (int i=( n-1-1)/2 ;i>=0;i++){
            shiftDown2(arr,n,i);
        }
        /**
         * 原地排序、不需要开辟新空间、不需要往新空间里赋值、这个时间上来说很快
         */
        for (int i = n-1;i>0;i--){
            swap(arr,0,i);
            shiftDown2(arr,i,0);
        }
    }
    //交换堆中的元素
    private static void swap(Object[] arr, int i, int n) {
        Object temp = arr[i];
        arr[i] = arr[n];
        arr[n]=  temp;
    }
    private static void shiftDown(Comparable[] arr, int n, int i) {
        Comparable e = arr[i];
        while (i*2+1<n){
            int j = i*2+1;
            if (j+1<n && arr[j+1].compareTo(arr[j])>0)
                j+=1;
            if (e.compareTo(arr[j])>0)
                break;
            swap(arr,i,j);
            i=j;
        }
    }
    //优化shiftDown
    //优化的shiftDown过程, 使用赋值的方式取代不断的swap,因为swap需要开辟一个新的空间和多次赋值
    // 比较父节点和子节点，如果违背了最大堆的定义、则交换
    private static void shiftDown2(Comparable[] arr, int n, int i) {
        Comparable e = arr[i];
        while ((i<<2)+1<n){
            int j = (i<<2)+1;
            if (j+1<n && arr[j+1].compareTo(arr[j])>0)
                j+=1;
            if (e.compareTo(arr[j])>0)
                break;
            arr[i]= arr[j];
            i=j;
        }
        arr[i]=e;
    }
}
