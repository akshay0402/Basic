package com.raystech.Basicprograms;

public class Palindrome {

	
	public static void main(String[] args) {
		int no,ri = 0,n,r;
		n=123456;
		no= n;
		for (; n!=0;n/=10) {
			r=n%10;
			ri=ri*10+r;
		}
		if (no==ri) {
			System.out.println(no + "is palimdrome no");
			
		}	else{
			System.out.println(no + " is not palindrome no");
			
		}
	}
}
