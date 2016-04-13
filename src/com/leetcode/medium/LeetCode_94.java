package com.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

/*
 * Created by Owen_Kris on 2016年4月13日 12:53:32
 * Copyright © 2015年 Nirvana. All rights reserved.
 * 
 */
/**
 * {@linkplain https://leetcode.com/problems/binary-tree-inorder-traversal/}
 * @author nirvana
 *
 */
// binary tree in order
public class LeetCode_94 {
	 public List<Integer> inorderTraversal(TreeNode root) {
	     List<Integer> result=new ArrayList<Integer>();   
		 inOrder(root,result);
		 return result;
	 }
	 
	 private void inOrder(TreeNode root,List<Integer> result){
		 if (root==null) return;
		 inOrder(root.left,result);
		 result.add(root.val);
		 inOrder(root.right,result);
	 }
}
