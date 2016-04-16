package com.leetcode.easy;

/*
 * Created by Owen_Kris on 2016年4月15日 09:34:15
 * Copyright © 2015年 Nirvana. All rights reserved.
 * 
 */
/**
 * {@linkplain https://leetcode.com/problems/roman-to-integer/}
 * @author nirvana
 *
 */
// roman to integer
// I（1）、V（5）、X（10）、L（50）、C（100）、D（500）和M（1000）
public class LeetCode_13 {
	public int romanToInt(String s) {
		int result=0;
		int left=0;
		for (int index=0;index<s.length();){
			int pos=checkMax(s,index);
			result+=getResult(s,pos,left);
			index=pos+1;
			left=index;
		}
		return result;
	}
	
	private int checkMax(String str,int index){
		String temp=str.substring(index);
		int result;
		if ((result=temp.indexOf('M'))!=-1) return result+index;
		else if((result=temp.indexOf('D'))!=-1) return result+index;
		else if ((result=temp.indexOf('C'))!=-1) return result+index;
		else if ((result=temp.indexOf('L'))!=-1) return result+index;
		else if ((result=temp.indexOf('X'))!=-1) return result+index;
		else if ((result=temp.indexOf('V'))!=-1) return result+index;
		else if ((result=temp.indexOf('I'))!=-1) return result+index;
		return -1;
	}
	
	private int revertState(char c){
		switch(c){
		case('M'):
			return 1000;
		case('D'):
			return 500;
		case('C'):
			return 100;
		case('L'):
			return 50;
		case('X'):
			return 10;
		case('V'):
			return 5;
		case('I'):
			return 1;
		default:
			throw new RuntimeException("wrong revert number"+c);
		}
	}
	
	private int getResult(String str,int rightIndex,int leftIndex){
		int result=revertState(str.charAt(rightIndex));
		for (int index=rightIndex-1;index>=leftIndex;index--){
			result-=revertState(str.charAt(index));
		}
		return result;
	}
	
	public static void main(String[] args){
		LeetCode_13 l=new LeetCode_13();
		int result=l.romanToInt("IX");
		System.out.println(result);
	}
	
}
