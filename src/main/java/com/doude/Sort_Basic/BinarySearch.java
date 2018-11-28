package com.doude.Sort_Basic;

public class BinarySearch {
    int binarySearch(int [] arr,int n,int target){
        //在arr[l....r]之中查找target
        int l =0,r=n-1;
        while (l<=r){
    //            int mid = (l+r)/2;
            int mid =l+(r-l)/2;
            if (arr[mid]==target)
                return mid;
            if (target< arr[mid])
                r=mid-1;
            else
                l=mid+1;
        }
        return -1;
    }
}
