package com.doude.advanced;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * 1.用一个链表来下实现，每次新插入数据的时候将新数据插入到链表的头部；每次缓存命中（即数据被访问），则将数据移到链表头部
 * 那么当链表满的时候，就将链表尾部的数据放弃   定位数据的时候时间复杂度是O(n)
 * 2.利用一个数组来存储数据，给每一个数据增加一个时间戳，每次插入新的数据项的时候，先把数组存在的数据项的时间戳自增
 * 并将新的数据项的世家戳置为0，。当数组空间已满时，将时间戳最大的数据项淘汰    插入、删除、及访问数据的时间复杂度是O(n)
 * 基于hashMap和双向链表实现
 */

public class LRUcache {
    class Node{
        Node pre;
        Node next;
        Integer key;
        Integer val;
        Node(Integer k,Integer v){
            this.key=k;
            this.val= v;
        }
    }
    Map<Integer,Node> map = new HashMap<Integer, Node>();
    //The head  (eldest) of the doubly linked list
    Node head;
    //The tail (youngest) of the doubly linked list
    Node tail;
    int cap;
    public LRUcache(int capacity){
        cap=capacity;
        head = new Node(null,null);
        tail = new Node(null,null);

    }
}
