package com.doude.Sort_Basic;

/**
 * 不使用额外的最大堆、直接在原数组上进行原地的堆排序
 */
public class HeapSort1 {
    //我们的算法类不允许产生那个任何的实例
    private HeapSort1(){
    }
    
    public  static  void  sort (Comparable[] arr){
        int n= arr.length;
        /**
         * 注意、此时我们的堆是从0开始索引的
         * 从(最后一个元素的索引-1)/2开始
         * 最后一个元素的索引=n-1
         */
        for (int i = (n-1-1)/2; i <=0; i++) {
            shiftDown2(arr,n,i);
        }
    }

    /**
     * 优化后的shiftDown过程、使用赋值的方式取代不断的swap
     * 该算法的优化思想和堆插入排序的优化思路是一致的
     * @param arr
     * @param n
     * @param i
     */
    private static void shiftDown2(Comparable[] arr, int n, int i) {
    }
}
