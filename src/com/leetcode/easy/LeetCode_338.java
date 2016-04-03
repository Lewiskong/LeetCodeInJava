package com.leetcode.easy;

public class LeetCode_338 {
	/**
	 * Optimized O(n) complexity
	 * @param num
	 * @return
	 */
	public int[] countBits(int num){
		int[] result=new int[num+1];
		for (int index=1;index<=num;index++){
			result[index]=result[index%Integer.highestOneBit(index)]+1;
		}
		return result;
	}
	
	/**
	 * the implement of highestOneBit
	 */
	/**
	public static int highestOneBit(int i) {
        i |= (i >>  1);
        i |= (i >>  2);
        i |= (i >>  4);
        i |= (i >>  8);
        i |= (i >> 16);
        return i - (i >>> 1);
    }
    */
	
	
/**
 * Normal Solution With O(n^2) complexity
 */
//	public int[] countBits(int num) {
//        int[] result=new int[num+1];
//        for (int index=0;index<=num;index++){
//            result[index]=countBit(index);
//        }
//        return result;
//    }
//    
//    public int countBit(int num){
//        int count=0;
//        while (num!=0){
//            if (num%2==1) count++;
//            num/=2;
//        }
//        return count;
//    }
}
