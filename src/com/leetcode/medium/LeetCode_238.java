package com.leetcode.medium;

/*
 * Created by Owen_Kris on 2016年4月6日 08:07:34
 * Copyright © 2015年 Nirvana. All rights reserved.
 * 
 */
/**
 * {@linkplain https://leetcode.com/problems/product-of-array-except-self/}
 * @author nirvana
 *
 */
//Product of Array Except Self
public class LeetCode_238 {
	public int[] productExceptSelf(int[] nums) {
		long before=System.currentTimeMillis();
		long product=1;
		int zeroCount=0;
		for (int num:nums){
			if (num==0){
				zeroCount++;
				continue;
			}
			product*=num;
		}
		int[] result=new int[nums.length];
		for (int index=0;index<nums.length;index++){
			if(nums[index]==0){
				if (zeroCount==1) result[index]=(int)product;
				else result[index]=0;
			}else{
			    if (zeroCount>0) result[index]=0;
			    else result[index]=(int)product/nums[index];
			}
		}
		long after=System.currentTimeMillis();
		System.out.println("time:"+(after-before));
		return result;
	}
	
	public int[] productExceptSelf2(int[] nums) {
		long before=System.currentTimeMillis();
		int[] result=new int[nums.length];
		for (int index=0;index<nums.length;index++) result[index]=1;
		int left=1;
		int right=1;
		for (int i=0,j=nums.length-1;i<nums.length-1;i++,j--){
			left*=nums[i];
			right*=nums[j];
			result[i+1]*=left;
			result[j-1]*=right;
		}
		long after=System.currentTimeMillis();
		System.out.println("time:"+(after-before));
		return result;
	}
}
