package com.java.integertoroman;

import java.util.Scanner;

public class IntegerToRoman {
	public static void main(String[] args) {
		System.out.println("Enter A Number B/w 1-500: ");
		Scanner sc = new Scanner(System.in);
		intToRoman(sc.nextInt());

		sc.close();
	}

	public static void intToRoman(int num) {

		// usually starts storing from higher to lower values
		int[] intcode = { 500, 100, 50, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		String[] code = { "D", "C", "L", "X", "IX", "VIII", "VII", "VI", "V", "IV", "III", "II", "I" };

		// for store Roman numeral string
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < intcode.length; i++) {
			while (num >= intcode[i]) {
				sb.append(code[i]);
				num -= intcode[i];
			}

		}

		System.out.println("Entered Number In Roman is:" + "\n" + sb.toString());

	}
}