
package com.gl.paymoney.main;

import com.gl.paymoney.service.PayMoneyService;
import java.util.Scanner;

public class PayMoneyMain {

	public static void main(String[] args) {

		// Declaring and initialising the transaction size of the array

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of transaction array");
		int transactionsize = scanner.nextInt();

		// Entering the values into the array

		int[] amount = new int[transactionsize];
		System.out.println("Enter the values into array : ");
		for (int i = 0; i < amount.length; i++) {
			amount[i] = scanner.nextInt();
		}

		System.out.println("Enter the total no of targets that needs to be achieved");
		int totaltarget = scanner.nextInt();

		// creating an object for calling the transaction method

		PayMoneyService paymoneyservice = new PayMoneyService();
		paymoneyservice.transaction(totaltarget, amount);

		scanner.close();

	}

}
