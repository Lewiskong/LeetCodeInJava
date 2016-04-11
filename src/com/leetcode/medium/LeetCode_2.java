package com.leetcode.medium;
/*
 * Created by Owen_Kris on 2016年4月11日 10:27:52
 * Copyright © 2015年 Nirvana. All rights reserved.
 * 
 */
/**
 * {@linkplain https://leetcode.com/problems/add-two-numbers/}
 * @author nirvana
 *
 */
//add two numbers
public class LeetCode_2 {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ln=new ListNode(0);
        ListNode cur=ln;
        int carry=0;
        while (l1!=null || l2!=null){
        	if (l1==null){
        		int val=l2.val+carry;
        		if (val>=10) {carry=1;val-=10;}else carry=0;
        		cur=new ListNode(val);
        	}else if (l2==null){
        		int val=l1.val+carry;
        		if (val>10) {carry=1;val-=10;}else carry=0;
        		cur=new ListNode(val);
        	}else{
        		int val=l1.val+l2.val+carry;
        		if (val>=10) {carry=1;val-=10;}else carry=0;
        		cur=new ListNode(val);
        	}
        }
        return ln.next;
    }
}



class ListNode {
	int val;
	ListNode next;
	ListNode(int x) { val = x; }
}
 