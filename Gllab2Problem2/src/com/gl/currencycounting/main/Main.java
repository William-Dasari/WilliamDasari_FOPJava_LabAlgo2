package com.gl.currencycounting.main;

import java.util.Scanner;

import com.gl.currencycounting.service.CurrencyCounting;
import com.gl.currencycounting.service.MergeSort;

public class Main {

	public static void main(String[] args) {
		// Declaring and initialising the currency denominations

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of currency denominations");
		int currencysize = scanner.nextInt();

		// Entering the denominations values

		int[] denominations = new int[currencysize];
		System.out.println("Enter the currency denominations value");
		for (int i = 0; i < denominations.length; i++) {
			denominations[i] = scanner.nextInt();
		}

		System.out.println("Enter the amount you want to pay");
		int bill = scanner.nextInt();

		// creating an object for calling the method for sorting and counting

		MergeSort merge = new MergeSort();
		merge.sorting(denominations, 0, denominations.length - 1);

		CurrencyCounting currencycounting = new CurrencyCounting();
		currencycounting.calculation(bill, denominations);

		scanner.close();

	}

}
