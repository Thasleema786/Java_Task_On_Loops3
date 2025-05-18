package com.loops;

public class Numbers1to100DivisibleBy9 {
	public static void divisible(int num) {
		for(int i=1;i<=100;i++) {
			if(i%num==0) {
				System.out.println(i+" ");
			}
		}
	}

	public static void main(String[] args) {
		   divisible(9);  

	}

}
