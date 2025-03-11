package main;

import java.util.Random;
import java.util.*;

class Payment1 {
	public static Scanner sc = new Scanner(System.in);
	static Random random = new Random();

	// Thread class for handling each payment option concurrently
	public static class PaymentThread extends Thread {
		private String paymentMethod;
		private double amount;

		PaymentThread(String paymentMethod, double amount) {
			this.paymentMethod = paymentMethod;
			this.amount = amount;
		}

		@Override
		public void run() {
			switch (paymentMethod) {
			case "PhonePe":
				handlePhonePe(amount);
				break;
			case "Paytm":
				handlePaytm(amount);
				break;
			case "Google Pay":
				handleGooglePay(amount);
				break;
			case "Cash":
				handleCash(amount);
				break;
			default:
				System.out.println("Invalid payment method.");
			}
		}
	}

	public void payment(double finalAmount) {
		boolean validChoice = false;
		while (!validChoice) {
			System.out.println(C.seafoam + "Select a Payment Method:" + C.reset);
			System.out.println(C.purple + "1. PhonePe" + C.reset);
			System.out.println(C.blue + "2. Paytm" + C.reset);
			System.out.println(C.tan + "3. Google Pay" + C.reset);
			System.out.println(C.emerald + "4. Cash" + C.reset);

			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				if (verifyPin("PhonePe")) {
					PaymentThread phonePeThread = new PaymentThread("PhonePe", finalAmount);
					phonePeThread.start();
					validChoice = true;
				}
				break;
			case 2:
				if (verifyPin("Paytm")) {
					PaymentThread paytmThread = new PaymentThread("Paytm", finalAmount);
					paytmThread.start();
					validChoice = true;
				}
				break;
			case 3:
				if (verifyPin("Google Pay")) {
					PaymentThread googlePayThread = new PaymentThread("Google Pay", finalAmount);
					googlePayThread.start();
					validChoice = true;
				}
				break;
			case 4:
				handleCash(finalAmount);
				validChoice = true;
				break;
			default:
				System.out.println(C.red + C.blink + "Invalid payment method selected. Please try again." + C.reset);
			}
		}
	}

	public static boolean verifyPin(String paymentMethod) {
		boolean validPin = false;
		while (!validPin) {
			System.out.println(C.plum + "Enter your Phone Number..." + C.reset);
			String Id = sc.next();
			int otp = 1000 + random.nextInt(9999);
			System.out.println(C.beet + "Enter the OTP ..." + C.reset);
			System.out.println(C.lime + otp + C.reset);
			// System.out.println(C.apricot+"Enter your PIN for " + paymentMethod + ":
			// "+C.reset);
			// int pin = sc.nextInt();
			// int correctPin = 1234; // Example PIN (you can change this logic)
			if (otp > 0) {
				System.out.println(C.green + "OTP verified successfully!" + C.reset);
				validPin = true;
			} else {
				System.out.println(C.red + C.blink + "Incorrect PIN. Please try again." + C.reset);
			}
		}
		return true;
	}

	public static void handlePhonePe(double amount) {
		System.out.println(C.macha + "Proceeding with PhonePe payment..." + C.reset);
		System.out.println(C.emerald + "Amount to be paid: " + amount + C.reset);
		System.out.println(C.green + "Payment successful through PhonePe!" + C.reset);
		System.out.println(
				C.pool + "                        *****************************************************" + C.reset);
		System.out.println(
				C.seafoam + "                        *           Thank You for Shopping with Us!         *" + C.reset);
		System.out.println(
				C.pool + "                        *****************************************************" + C.reset);
		RatingSection.rat();
	}

	public static void handlePaytm(double amount) {
		System.out.println(C.macha + "Proceeding with Paytm payment..." + C.reset);
		System.out.println(C.emerald + "Amount to be paid: " + amount + C.reset);
		System.out.println(C.green + "Payment successful through Paytm!" + C.reset);
		System.out.println(
				C.pool + "                        *****************************************************" + C.reset);
		System.out.println(
				C.seafoam + "                        *           Thank You for Shopping with Us!         *" + C.reset);
		System.out.println(
				C.pool + "                        *****************************************************" + C.reset);
		RatingSection.rat();

	}

	public static void handleGooglePay(double amount) {
		System.out.println(C.macha + "Proceeding with Google Pay payment..." + C.reset);
		System.out.println(C.emerald + "Amount to be paid: " + amount + C.reset);
		System.out.println(C.green + "Payment successful through Google Pay!" + C.reset);
		System.out.println(
				C.pool + "                        *****************************************************" + C.reset);
		System.out.println(
				C.seafoam + "                        *           Thank You for Shopping with Us!         *" + C.reset);
		System.out.println(
				C.pool + "                        *****************************************************" + C.reset);
		RatingSection.rat();

	}

	public static void handleCash(double amt) {
		float amount = (float) amt;
		boolean validCash = false;
		while (!validCash) {
			System.out.println(C.turquoise + "Proceeding with Cash payment..." + C.reset);
			// System.out.print(C.armygreen+"Amount to be paid: " + amount+C.reset);
			System.out.printf(C.armygreen + "Amount to be paid: %.2f" + C.reset, amount);
			System.out.println();
			System.out.println(C.macha + "Enter cash amount: " + C.reset);
			double cashAmount = sc.nextDouble();

			if (cashAmount >= amount) {
				double change = cashAmount - amount;
				System.out.println(C.olive + "Payment successful! Change to return: " + change + C.reset);
				validCash = true;
				System.out.println(C.pool
						+ "                        *****************************************************" + C.reset);
				System.out.println(C.seafoam
						+ "                        *           Thank You for Shopping with Us!         *" + C.reset);
				System.out.println(C.pool
						+ "                        *****************************************************" + C.reset);
				RatingSection.rat();

			} else {
				System.out.println(C.red + C.blink + "Insufficient cash. Please provide a valid amount." + C.reset);
			}
		}
	}

}
