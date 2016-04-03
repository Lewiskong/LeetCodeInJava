package com.leetcode.medium;

import java.math.BigInteger;

//Additive Number
/*
 * Created by Owen_Kris on 2016年4月3日 17:08:21
 * Copyright © 2015年 Nirvana. All rights reserved.
 * 
 */
public class LeetCode_306 {
	public boolean isAdditiveNumber(String num) {
        int length=num.length();
        for (int i=0;i<length/2+1;i++){
            for (int j=i+1;j<length-1;j++){
                for (int k=j+1;k<length;k++){
                    String a=num.substring(0,i+1);
                    String b=num.substring(i+1,j+1);
                    String c=num.substring(j+1,k+1);
                    if (a.startsWith("0")&&!a.equals("0")||
                    		b.startsWith("0")&&!b.equals("0")||
                    		c.startsWith("0")&&!c.equals("0")) 
                    	continue;
                    if (additive(a,b,c)){
                        if (k+1==length) return true;
                        if (isAdditiveNumber(num.substring(i+1))) return true;
                    }
                }
            }
        }
        return false;
    }
    
    public boolean additive(String a,String b,String c){
        return (new BigInteger(a).add(new BigInteger(b)).compareTo(new BigInteger(c))==0?true:false);
    }
}
