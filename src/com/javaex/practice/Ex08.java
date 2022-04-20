package com.javaex.practice;

public class Ex08 {

	public static void main(String[] args) {
				
		int[] lotto1 = new int[6];
		int[] lotto2 = new int[6];
		
		if(lotto1.length == lotto2.length) {
			//두 배열의 갯수가 같니?
			for(int i=0; i<lotto1.length; i++) {
			lotto1[i] = (int)(Math.random()*45)+1;
				
			if(lotto1[i] != lotto2[i]) {
			//각방의 데이터가 다르니?
			//다르면,
			System.out.print(lotto1[i] + "\t");
				}	
			}
		}
	
	
	}
	

}
