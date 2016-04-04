package com.leetcode.easy;
/*
 * Created by Owen_Kris on 2016年4月4日 20:41:56
 * Copyright © 2015年 Nirvana. All rights reserved.
 * 
 */
/**
 * {@linkplain https://leetcode.com/problems/maximum-depth-of-binary-tree/}
 * @author nirvana
 * 
 */
//Maximum Depth of Binary Tree
//fucking easy
public class LeetCode_104 {
	
	public int maxDepth(TreeNode root) {
        if (root==null) return 0;
        if (root.left==null && root.right==null){
            return 1;
        }
        return max(maxDepth(root.left),maxDepth(root.right))+1;
        
    }
    
    public int max(int a,int b){
        return a>b?a:b;
    }
}



class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
}