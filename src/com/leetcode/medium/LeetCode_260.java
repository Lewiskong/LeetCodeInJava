package com.leetcode.medium;

import com.leetcode.mark.BetterWay;
/*
 * Created by Owen_Kris on 2016年4月5日 13:18:03
 * Copyright © 2015年 Nirvana. All rights reserved.
 * 
 */
/**
 * {@linkplain https://leetcode.com/problems/single-number-iii/}
 * @author nirvana
 *
 */
//Single Number III
@BetterWay
public class LeetCode_260 {
	
	public int[] singleNumber(int[] nums) {
		int sum1=0;
		int sum2=0;
		for (int i:nums){
			sum1^=i;
			sum2^=i*i;
		}
		int[] result=new int[2];
		//a^b=c <-> b^c=a
		for (int i:nums){
			int x=i;
			int y=x^sum1;
			if ((x*x^y*y)==sum2){
				result[0]=x;
				result[1]=y;
				break;
			}
		}
		return result;
    }
}
