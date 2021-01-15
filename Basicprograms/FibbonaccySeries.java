package com.raystech.Basicprograms;

import java.util.Scanner;

public class FibbonaccySeries {

	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		int c = 1;
		Scanner s = new Scanner(System.in);
		System.out.println(" enter your number is  ");
		int d = s.nextInt();
		for (int i = 0; i <= d; i++) {
			a = b;
			b = c;
			c = a + b;

			System.out.println(a);
		}

	}
}