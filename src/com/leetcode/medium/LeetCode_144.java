package com.leetcode.medium;

import java.util.ArrayList;
import java.util.List;



/*
 * Created by Owen_Kris on 2016年4月12日 17:14:33
 * Copyright © 2015年 Nirvana. All rights reserved.
 * 
 */
/**
 * {@linkplain https://leetcode.com/problems/binary-tree-preorder-traversal/}
 * @author nirvana
 *
 */
//Binary Tree Preorder Traversal
public class LeetCode_144 {
	public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result=new ArrayList<Integer>();
        pre(root,result);
        return result;
    }
	
	private void pre(TreeNode root,List<Integer> result){
		if (root==null) return ;
		else result.add(root.val);
		pre(root.left,result);
		pre(root.right,result);
	}
	
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
