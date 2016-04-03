package com.leetcode.medium;

import com.leetcode.mark.BetterWay;

/*
 * Created by Owen_Kris on 2016年4月3日 17:44:33
 * Copyright © 2015年 Nirvana. All rights reserved.
 * 
 */

/**
 * SingleNum
 * @author nirvana
 * {@linkplain https://leetcode.com/problems/single-number/}
 * 
 */
@BetterWay
public class LeetCode_136 {
	
	//the fabulous solution with only O(1) extra memory using XOR operation
	public int singleNumber(int[] nums) {
	     int res=0;
	     for (int num:nums){
	    	 res^=num;
	     }
	     return res;
    }
	
	
	//normal solution with extra memory
//	public int singleNumber(int[] nums) {
//		Map<Integer,Integer> map=new HashMap<>();
//		for (int index=0;index<nums.length;index++){
//			map.put(nums[index], map.get(nums[index])==null?0:1);
//		}
//		Set<Integer> set=map.keySet();
//		for (Integer i:set){
//			if (map.get(i)==0) return i;
//		}
//		return 0;
//    }
}
