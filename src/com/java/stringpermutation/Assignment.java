package com.java.stringpermutation;

import java.util.Scanner;

public class Assignment {
	public static void main(String[] args) {
		
		//Using Scanner by which we can take String Input from user
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A String: ");
		String str = sc.next();
		int length = str.length();
		Assignment at = new Assignment();
		at.permute(str, 0, length - 1);
		sc.close();
	}

	
	// str String to calculate permutation, b starting index, c end index
	private void permute(String str, int b, int c) {
		if (b == c)
			
			System.out.println(str);
		else {
			for (int i = b; i <= c; i++) {
				str = swap(str, b, i);
				permute(str, b + 1, c);
				str = swap(str, b, i);
			}
		}
	}

	//a String value, i position 1 & j position 2
	public String swap(String a, int i, int j) { 
		char temp;
		char[] charArray = a.toCharArray();
		temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;
		return String.valueOf(charArray); //swapped string
	}

}
