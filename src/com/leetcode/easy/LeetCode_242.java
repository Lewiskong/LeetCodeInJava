package com.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/*
 * Created by Owen_Kris on 2016年4月8日 17:03:15
 * Copyright © 2015年 Nirvana. All rights reserved.
 * 
 */
/**
 * {@linkplain https://leetcode.com/problems/valid-anagram/}
 * @author nirvana
 *
 */
//Valid Anagram
public class LeetCode_242 {
	public boolean isAnagram(String s, String t) {
        return getCount(s).equals(getCount(t));
    }
	
	public Map<Character,Integer> getCount(String str){
		Map<Character,Integer> map=new HashMap<>();
		for (int index=0;index<str.length();index++){
			Character c=str.charAt(index);
			map.put(c, map.get(c)==null?1:map.get(c)+1);
		}
		return map;
	}
}
