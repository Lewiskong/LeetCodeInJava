package com.leetcode.easy;

import com.leetcode.mark.BetterWay;

/*
 * Created by Owen_Kris on 2016年4月4日 18:23:23
 * Copyright © 2015年 Nirvana. All rights reserved.
 * 
 */
/**
 * 
 * @author nirvana
 * {@linkplain https://leetcode.com/problems/add-digits/}
 */
//Add Digits
@BetterWay
public class LeetCode_258 {
	
	public int addDigits(int num) {
		int sum=num%10;
		num=num/10;
		while (num>0){
			int count=num%10;
			int temp=sum+count;
			sum=temp>9?(temp==10?1:temp%10+1):sum+count;
			num=num/10;
		}
		return sum;
    }
}
