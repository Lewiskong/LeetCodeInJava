package com.leetcode.easy;

import java.util.Arrays;

/*
 * Created by Owen_Kris on 2016年4月9日 16:47:32
 * Copyright © 2015年 Nirvana. All rights reserved.
 * 
 */
/**
 * {@linkplain https://leetcode.com/problems/two-sum/}
 * @author nirvana
 *
 */
//Two Sum
public class LeetCode_1 {
	public int[] twoSum(int[] nums, int target) {
        for (int index=0;index<nums.length-1;index++){
        	int first=nums[index];
        	int i=findIndex(nums, index+1, target-first);
        	if (i!=-1) return new int[]{index,i};
        }
        return null;
    }
	
	public int findIndex(int[] nums,int startIndex, int target){
		for (int index=startIndex;index<nums.length;index++){
			if (nums[index]==target) return index;
		}
		return -1;
	}
}	
