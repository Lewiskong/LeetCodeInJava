package com.leetcode.medium;

/*
 * Created by Owen_Kris on 2016年4月6日 09:00:51
 * Copyright © 2015年 Nirvana. All rights reserved.
 * 
 */
/**
 * {@linkplain https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/}
 * @author nirvana
 *
 */
//best time to buy and sell stock II
public class LeetCode_122 {
	public int maxProfit(int[] prices) {
		int length=prices.length;
		if (length==0 || length==1) return 0;
		int profit=0;
		for (int index=0;index<length-1;index++){
			if (prices[index+1]>prices[index]) profit+=prices[index+1]-prices[index];
		}
		return profit;
    }
}
