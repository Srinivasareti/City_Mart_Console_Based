package main;

import java.util.Scanner;

public class RatingSection {
	public static void rat() {
		Scanner scanner = new Scanner(System.in);
		int rating = 0;

		System.out.println(C.pool + "\nRate our Servivces from 1 to 5:" + C.reset);
		while (true) {
			try {
				System.out.println();
				System.out.print(C.celadon + "Enter your rating: " + C.reset);
				rating = Integer.parseInt(scanner.nextLine());

				if (rating >= 1 && rating <= 5) {
					System.out.println();
					System.out
							.println(C.purple + C.blink + "Thank you for rating us " + rating + " star(s)!" + C.reset);
							System.exit(0);
					break;
				} else {
					System.out.println();
					System.out.println(
							C.red + C.blink + "Invalid input. Please enter a number between 1 and 5." + C.reset);
				}
			} catch (NumberFormatException e) {
				System.out.println();
				System.out.println(C.red + C.blink + "Invalid input. Please enter a valid number." + C.reset);
			}
		}

		scanner.close();
	}
}
