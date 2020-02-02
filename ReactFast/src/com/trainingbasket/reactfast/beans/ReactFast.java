package com.trainingbasket.reactfast.beans;

import java.util.Scanner;

public class ReactFast {
	public static void main(String[] args) throws InterruptedException {

		System.out.print("Tell to wait : ");

		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		System.out.println(num);

		for (int i = num - 1; i > 0; i--) {
			Thread.sleep(1000);
			System.out.println(i);
			Thread.sleep(500);
		}
		System.out.println("Go!!!");

		long startTime = System.currentTimeMillis();
		scan.next();
		long stopTime = System.currentTimeMillis();

		long reactionTime = stopTime - startTime;

		System.out.println(reactionTime + "ms");

	}
}
