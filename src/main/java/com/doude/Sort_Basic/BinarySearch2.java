package com.doude.Sort_Basic;

/**
 * 二分法的递归写法
 */
public class BinarySearch2 {

    public int binarySearch2(int[] arr,int low,int high,int target){
        if (low<high){
            int mid=low+(high-low)/2;
            if (target==arr[mid])
                return mid;
            if (target<arr[mid])
                binarySearch2(arr,low,mid-1,target);
            if (target>arr[mid])
                binarySearch2(arr,mid+1,high,target);
        }
    return -1;
    }
    public int binarySearch2(int[] arr,int target){

        return 1;
    }
}
