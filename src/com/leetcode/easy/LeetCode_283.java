package com.leetcode.easy;

import java.util.Arrays;

/*
 * Created by Owen_Kris on 2016年4月4日 21:04:28
 * Copyright © 2015年 Nirvana. All rights reserved.
 * 
 */

//Move Zeroes
/**
 * {@linkplain https://leetcode.com/problems/move-zeroes/}
 * @author nirvana
 *
 */
public class LeetCode_283 {
	public void moveZeroes(int[] nums) {
		int zero = 0, l = 0, r = nums.length;
	    while (l < r) {
	        if (nums[l] != 0) {
	            int tmp = nums[zero];
	            nums[zero++] = nums[l];
	            nums[l] = tmp;
	        }
	        l++;
	    }
    }
	
}
