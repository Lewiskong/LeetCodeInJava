package com.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/*
 * Created by Owen_Kris on 2016年4月9日 15:25:49
 * Copyright © 2015年 Nirvana. All rights reserved.
 * 
 */
/**
 * {@linkplain https://leetcode.com/problems/majority-element/}
 * @author nirvana
 *
 */
// Majority Element 
public class LeetCode_169 {
	public int majorityElement(int[] nums) {
		Map<Integer,Integer> map=new HashMap<>();
		for (int index=0;index<nums.length;index++){
			Integer value=map.get(nums[index]);
			if (value==null) map.put(nums[index], 1);
			else{
				map.put(nums[index], value+1);
				int len=nums.length%2==0?nums.length/2:nums.length/2+1;
				if (value+1>=len) return nums[index];
			}
		}
		return nums[0];
    }
}
