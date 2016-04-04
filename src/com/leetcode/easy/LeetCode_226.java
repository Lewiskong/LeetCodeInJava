package com.leetcode.easy;

/*
 * Created by Owen_Kris on 2016年4月4日 20:51:10
 * Copyright © 2015年 Nirvana. All rights reserved.
 * 
 */

//Invert Binary Tree
/**
 * {@linkplain https://leetcode.com/problems/invert-binary-tree/}
 * @author nirvana
 * 
 */
public class LeetCode_226 {
	//easy recur
	public TreeNode invertTree(TreeNode root) {
        if (root==null) return root;
        if (root.left==null && root.right==null) return root;
        TreeNode temp=root.left;
        root.left=root.right;
        root.right=temp;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
	
}
