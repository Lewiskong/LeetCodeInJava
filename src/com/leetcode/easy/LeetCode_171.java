package com.leetcode.easy;
/*
 * Created by Owen_Kris on 2016年4月8日 17:37:04
 * Copyright © 2015年 Nirvana. All rights reserved.
 * 
 */
/**
 * {@linkplain https://leetcode.com/problems/excel-sheet-column-number/}
 * @author nirvana
 *
 */
// Excel Sheet Column Number
public class LeetCode_171 {
	public static int titleToNumber(String s) {
		int result=0;
		for (int index=0;index<s.length();index++){
			int mi=s.length()-index-1;
			int num=s.charAt(index)-'A'+1;
			result+=num*Math.pow(26,mi);
		}
		return result;
    }
}
