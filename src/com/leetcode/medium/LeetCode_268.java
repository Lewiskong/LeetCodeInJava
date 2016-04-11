package com.leetcode.medium;

import java.util.Arrays;

/*
 * Created by Owen_Kris on 2016年4月10日 13:41:09
 * Copyright © 2015年 Nirvana. All rights reserved.
 * 
 */
/**
 * {@linkplain https://leetcode.com/problems/missing-number/}
 * @author nirvana
 *
 */
//  Missing Number
public class LeetCode_268 {
	public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        for (int index=0;index<nums.length;index++){
        	if (nums[index]!=index) return index;
        }
        return nums.length;
    }
}
