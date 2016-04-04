package com.leetcode.easy;

/*
 * Created by Owen_Kris on 2016年4月4日 21:57:48
 * Copyright © 2015年 Nirvana. All rights reserved.
 * 
 */
/**
 * {@linkplain https://leetcode.com/problems/delete-node-in-a-linked-list/}
 * @author nirvana
 *
 */
//Delete Node in a Linked List
//fucking easy
public class LeetCode_237 {
	public void deleteNode(ListNode node) {
        node.val=node.next.val;
        node.next=node.next.next;
    }
}


//Definition for singly-linked list.
class ListNode {
	int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
 