package com.doude.Sort_Basic;

/**
 * 在堆相关的操作中、需比较堆中的元素大小、所以需要extends Comparable
 * @param <T>
 */
public class MaxHeap<T extends  Comparable>{

    protected T[] data;
    protected  int count;
    protected  int capacity;

    //构造函数、构造一个空堆、可容纳capacity个元素
    public MaxHeap(int capacity){
        data = (T[])new Comparable[capacity+1];
        count = 0 ;
        this.capacity = capacity;
    }
    //构造函数、通过一个给定数组创建一个最大堆
    //该构造堆的过程、时间复杂度为O(n)
    public MaxHeap(T[] arr){
        int n = arr.length;
        data= (T[])new Comparable[n+1];
        capacity= n;
        for (int i = 0; i <n ; i++) {
            data[i]=arr[i];
        }
        count = n;
        for (int i = count/2; i >1; i--) {
            shiftDown(i);
        }
    }

    //返回堆中个数
    public int size(){
        return  count;
    }

    //返回一个Boolean值，表示堆中是否为空
    public boolean isEmpty(){
        return count==0;
    }

    //向最大堆中插入一个元素
    public void insert(T item){
        assert count+1<=capacity;
        data[count+1]=item;
        count++;
        shiftUp(count);
    }

    //从最大堆中取出堆顶元素
    public T extractMax(){
        assert count >0;
        T item = data[1];
        swap(1,count);
        count--;
        shiftDown(1);
        return item;
    }

    //交换堆中索引为i、count的两个元素
    private void swap(int i, int count) {
        T t = data[i];
        data[i]=data[count];
        data[count]= t;
    }

    /**
     * 堆中的关键操作
     * @param k
     */
    private void shiftUp(int k) {

        while(k/2>0 &&data[k/2].compareTo(data[k])<0){
            swap(k,k/2);
            k/=2;
        }
    }

    /**
     * 堆中的关键操作
     * @param i
     */
    private void shiftDown(int i) {
        while (i<<1 <=count){
            int j = i<<1; // 在此轮循环中,data[k]和data[j]交换位置
            if (j+1<=count &&data[j].compareTo(data[j+1])<0){
                j++;
            }
            if (data[j].compareTo(data[i])<=0){
                break;
            }
            swap(i,j);
            i=j;
        }
    }



}
