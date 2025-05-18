package com.loops;

public class NumbersBetween1And50DivisibleBy4Or6 {
	public static void divisible(int num1,int num2) {
		for(int i=1;i<50;i++) {
			if(i%num1==0||i%num2==0) {
				System.out.println(i+" ");
			}
		}
	}

	public static void main(String[] args) {
	        divisible(4,6);
	}

}
