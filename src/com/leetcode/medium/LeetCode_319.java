package com.leetcode.medium;

import com.leetcode.mark.BetterWay;

/*
 * Created by Owen_Kris on 2016年4月9日 15:50:15
 * Copyright © 2015年 Nirvana. All rights reserved.
 * 
 */
/**
 * {@linkplain https://leetcode.com/problems/bulb-switcher/}
 * @author nirvana
 *
 */
// Bulb Switcher
@BetterWay
public class LeetCode_319 {
//	public int bulbSwitch(int n) {
//		int count=0;
//		for (int index=1;;index++){
//			if (Math.pow(index, 2)<=n) count++;
//			else break;
//		}
//		return count;
//    }
	public int bulbSwitch(int n) {
		return (int) Math.sqrt(n);
    }
}
