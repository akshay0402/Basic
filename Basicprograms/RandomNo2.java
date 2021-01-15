package com.raystech.Basicprograms;

import java.util.Random;

public class RandomNo2 {

	public static void main(String[] args) {
		int a=500;
		int b=100;
		for(int i=0;i<5;i++) {
		Random c = new Random();
		//int d = b+c.nextInt()+a;
		System.out.println(b+c.nextInt(a));
	}
	}
}
