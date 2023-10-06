package com.gl.currencycounting.service;

public class CurrencyCounting {
	public void calculation(int bill, int notes[]) {

		// calculating how many notes required to pay the bill

		int[] Counter = new int[notes.length];
		try {
			for (int i = 0; i < notes.length; i++) {
				if (bill >= notes[i]) {
					Counter[i] = bill / notes[i];
					bill -= Counter[i] * notes[i];

					if (bill == 0)
						break;
				}
			}

			if (bill > 0)
				System.out.println("bill cannot be paid in this denomination");

			else {
				System.out.println("Your payment approach in order to give min no of notes will be");
				for (int i = 0; i < notes.length; i++) {
					if (Counter[i] != 0) {
						System.out.println(notes[i] + " : " + Counter[i]);
					}
				}
			}
		} catch (ArithmeticException e) {
			System.out.println(e + " notes of denomination 0 is invalid");
		}
	}

}
