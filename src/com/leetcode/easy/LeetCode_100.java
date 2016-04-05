package com.leetcode.easy;

/*
 * Created by Owen_Kris on 2016年4月5日 14:07:14
 * Copyright © 2015年 Nirvana. All rights reserved.
 * 
 */
/**
 * {@linkplain https://leetcode.com/problems/same-tree/}
 * @author nirvana
 *
 */
//same tree
public class LeetCode_100 {
	public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p==null && q!=null || p!=null & q==null) return false;
        if (p==null && q==null) return true;
        if (p.val!=q.val) return false;
        return isSameTree(p.left, q.left)&&isSameTree(p.right, q.right);
    }
}
