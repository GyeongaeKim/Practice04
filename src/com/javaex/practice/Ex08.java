package com.javaex.practice;

public class Ex08 {

	public static void main(String[] args) {
				
		int[] lotto = new int[6];
		
		for(int i=0; i<lotto.length; i++) {
			lotto[i] = (int)(Math.random()*45)+1;
			
			boolean isDuplicated = false;
			
			//System.out.print(lotto[i]+"\t");
			
			for(int j=0; j<i; j++) {
				if(lotto[i]==lotto[j]) {
					isDuplicated = true;
					System.out.println(lotto[i]+" 중복됨");
				}
			}
		
			if(isDuplicated == true) {
				i--;
				continue; //중복된 수 제외, 조건식 다시 증감,.
			}
		
		}
		//재출력
		for(int i=0; i<lotto.length; i++) {
			System.out.print(lotto[i]+" ");
		}

		
		
	
	
	}
	

}
