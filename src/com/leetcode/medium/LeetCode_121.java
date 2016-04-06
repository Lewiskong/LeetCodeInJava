package com.leetcode.medium;

/*
 * Created by Owen_Kris on 2016年4月6日 10:15:37
 * Copyright © 2015年 Nirvana. All rights reserved.
 * 
 */
/**
 * 
 * {@linkplain https://leetcode.com/problems/best-time-to-buy-and-sell-stock/}
 * @author nirvana
 *
 */
//Best Time to Buy and Sell Stock
public class LeetCode_121 {
	public int maxProfit(int[] prices) {
        int[] gross=new int[prices.length];
        for (int index=1;index<gross.length;index++){
        	gross[index]=prices[index]-prices[index-1];
        }
        int profit = 0,maxProfit=0;
        for (int index=1;index<prices.length;index++){
        	profit+=gross[index];
        	if (profit<0){
        		profit=0;
        	}else{
        		maxProfit=maxProfit>profit?maxProfit:profit;
        	}
        }
        return maxProfit;
    }
	
}
