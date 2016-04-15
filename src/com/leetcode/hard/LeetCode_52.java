package com.leetcode.hard;

import java.util.Arrays;

/*
 * Created by Owen_Kris on 2016年4月14日 21:54:54
 * Copyright © 2015年 Nirvana. All rights reserved.
 * 
 */
/**
 * {@linkplain https://leetcode.com/problems/n-queens-ii/}
 * @author nirvana
 *
 */
// N-Queens II
public class LeetCode_52 {
	private int count=0;
	
	public int totalNQueens(int n) {
       boolean[] cols=new boolean[n];
       boolean[] llean=new boolean[2*n];
       boolean[] rlean=new boolean[2*n];
       backTrack(0,cols,llean,rlean,n);
       return count;
    }
	
	private void backTrack(int row,boolean[] cols,boolean[] llean,boolean[] rlean,int length){
		if (row==length) count++;
		for (int col=0;col<length;col++){
			if (cols[col]||llean[col-row+length]||rlean[col+row]) continue;
			cols[col]=true;llean[col-row+length]=true;rlean[col+row]=true;
			backTrack(row+1,cols,llean,rlean,length);
			cols[col]=false;llean[col-row+length]=false;rlean[col+row]=false;
		}
	}
	
}
