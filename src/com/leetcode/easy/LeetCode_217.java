package com.leetcode.easy;

import java.util.HashSet;
import java.util.Set;

/*
 * Created by Owen_Kris on 2016年4月9日 15:15:17
 * Copyright © 2015年 Nirvana. All rights reserved.
 * 
 */
/**
 * {@linkplain https://leetcode.com/problems/contains-duplicate/}
 * @author nirvana
 *
 */
// Contains Duplicate
public class LeetCode_217 {
	
	public boolean containsDuplicate(int[] nums) {
		Set<Integer> set=new HashSet<>();
		for (int index=0;index<nums.length;index++){
			if (set.contains(new Integer(nums[index]))) return true;
			set.add(new Integer(nums[index]));
		}
		return false;
    }

}
