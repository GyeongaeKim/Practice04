package com.javaex.practice;

public class Ex03 {

	public static void main(String[] args) {

		int[] intA = {3, 6, 9};
		
		int[] intB;
		intB = intA;
		intB[0] = 20; //여기서 0번째 값이 변경됨
		intB[2] = 10; //여기서 2번째 값이 변경됨
		
		for(int i=0; i<intA.length; i++) {
			System.out.println(intA[i]);
		}

	}

}
