package com.javaex.practice;

public class Ex06 {

	public static void main(String[] args) {
		
		char c1[] = {'T', 'h', 'i', 's', ' ', 'i', 's', ' ', 'a', ' ', 'p', 'e', 'n', 'c', 'i', 'l'};
		
		for(int i=0; i<c1.length; i++) {
			}
		System.out.println(c1);
		
		
		
		System.out.println("============================");
		
		
		char c2[] = {'T', 'h', 'i', 's', ' ', 'i', 's', ' ', 'a', ' ', 'p', 'e', 'n', 'c', 'i', 'l'};
	
		
		for(int i=0; i<c2.length; i++) {
			if(c2[i]==' ') {
				c2[i] = ',';
			}
		}
		System.out.println(c2);
		

	}

}


