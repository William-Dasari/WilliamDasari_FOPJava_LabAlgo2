package com.gl.paymoney.service;

import java.util.Scanner;

public class PayMoneyService {
	Scanner scanner = new Scanner(System.in);

	public void transaction(int totaltarget, int[] amount) {

		// Check if total target is more than 0

		while (totaltarget-- != 0) {
			System.out.println("Enter the value of target ");
			int target = scanner.nextInt();

			// calculation to check when can we achieve our target

			int i, sum = 0, flag = 0;
			for (i = 0; i < amount.length; i++) {
				sum += amount[i];
				if (target <= sum) {
					System.out.println("Target achieved after " + (i + 1) + " transactions");
					flag = 1;
					break;
				}

			}

			if (flag == 0)
				System.out.println("Given target is not achieved ");

		}
		scanner.close();

	}

}
