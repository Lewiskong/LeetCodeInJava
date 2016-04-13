package com.leetcode.easy;
/*
 * Created by Owen_Kris on 2016年4月13日 12:59:20
 * Copyright © 2015年 Nirvana. All rights reserved.
 * 
 */
/**
 * {@linkplain https://leetcode.com/problems/reverse-linked-list/}
 * @author nirvana
 * 
 */
// Reverse Linked List
public class LeetCode_206 {
	public ListNode reverseList(ListNode head) {
		if (head==null) return null;
		ListNode result=new ListNode(head.val);
		for (ListNode temp=head.next;temp!=null;temp=temp.next){
			ListNode t=result;
			result=new ListNode(temp.val);
			result.next=t;
		}
		return result;
    }
}
