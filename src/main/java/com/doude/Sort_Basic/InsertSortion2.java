package com.doude.Sort_Basic;

public class InsertSortion2 {

    public   void insertSortion(int [] arr){
        for (int i = 1; i <arr.length ; i++) {
            //选定一个值进行插入
            int index = i;
            int j;
            for ( j = i; j >0 ; j--) {
                if (arr[j-1]>arr[index]){
                    //后移一位
                    arr[j]=arr[j-1];
                }
            }
            arr[j]=index;
        }
    }
}
