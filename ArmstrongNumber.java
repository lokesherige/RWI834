package com;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the number");
		int num = scanner.nextInt();
		String count = "" + num;
		int noOfDigits = count.length();
		System.out.println(noOfDigits);
		int temp = num;
		int sum = 0;
		while (temp > 0) {
			int digit = temp % 10;
			sum = (int) (sum + Math.pow(digit, noOfDigits));
			temp /= 10;
		}
		if (sum == num) {
			System.out.println("armstrong number " + num);
		} else {
			System.out.println(" NOt armstrong number " + num);
		}
	}
}
