package main;

import java.util.HashMap;
import java.util.Scanner;

public class Coupons {
	static Scanner sc = new Scanner(System.in);
	double amt = 0;
	HashMap<String, Integer> km;

	public void coup(double bal, HashMap<String, Integer> sm) {
		this.km = sm;
		cp();
		// System.out.println("Total bill is: "+bal);
	}

	public void cp() {
		double dp = 0;
		System.out.println();
		System.out.println();
		// double bal=0;
		// double lp=0;
		// for (HashMap.Entry<String, Integer> entry : km.entrySet())
		// {
		// System.out.println("Item: "+entry.getKey()+" "+" Price: " +
		// entry.getValue());
		// bal=(double)bal+entry.getValue();
		// }
		// System.out.println("Your total bill is : "+bal);
		// System.out.println();
		// System.out.println("Coupss are :");
		// System.out.println("Shop 500 to get 5% Discount");
		// System.out.println("Shop 1000 to get 10% Discount");
		// System.out.println("Shop above 1499 to get 25% Discount");
		// if(bal>=500 && bal<=1000)
		// {
		// lp=(double)bal*5/100;
		// System.out.println("After Coupon Apply your total amount: "+lp);
		// }
		// else if(bal>1000 && bal<=1499)
		// {
		// lp=(double)bal*10/100;
		// System.out.println("After Coupon Apply your total amount: "+lp);
		// }
		// else if(bal>1499)
		// {
		// lp=(double)bal*25/100;
		// System.out.println("After Coupon Apply your total amount: "+lp);
		// }
		// else
		// {
		// lp=(double)bal;
		// System.out.println("No Coupons Are Applied ");
		// System.out.println("Total amount : "+lp);
		// }
		// System.out.println("Enter 1.Print Bill 2.Add More items 3.Remove Items ");
		// int n=sc.nextInt();
		// if(n==1)
		// {
		// System.out.println("bill printed");
		// }
		// else if(n==2)
		// {
		// Cart1 c=new Cart1();
		// c.cart();
		// System.out.print("go for cart to bill");
		// }
		// else if(n==3)
		// {
		// AddCart ct=new AddCart();

		// ct.removeItams(km);
		// System.out.print("after remove print bill");
		// }
		double totalAmount = 0;
		double lp = 0;
		double gstRate = 0.18; // 18% GST
		double cgstRate = 0.09; // 9% CGST
		double sgstRate = 0.09; // 9% SGST

		// Print date and time (for bill)
		String date_Time = java.time.LocalDateTime.now().toString(); // now date and time
		System.out.println(C.pool + "*****************************************************" + C.reset);
		System.out.println(C.seafoam + "                  CityMart Receipt               " + C.reset);
		System.out.println(C.emerald + "Date & Time: " + C.reset + C.yellow + date_Time + C.reset);
		System.out.println(C.pool + "*****************************************************" + C.reset);

		// Print bill header
		// System.out.printf("%-20s %-10s%n", "Item", "Price");
		System.out.println(C.lime + "------------------------------------------" + C.reset);
		System.out.printf(C.ruby + "%-20s %-10s%n", "Item", "Price" + C.reset);

		// Iterate through items and calculate totals
		for (HashMap.Entry<String, Integer> entry : km.entrySet()) {
			String itemName = entry.getKey();
			int price = entry.getValue();

			// Print item details
			System.out.printf(C.yellow + "%-20s %-10d%n", itemName, price);

			// Add to total amount
			totalAmount += price;
		}
		System.out.println(C.purple + "Total Amount: " + totalAmount);
		// Apply discount based on total bill amount
		if (totalAmount >= 500 && totalAmount <= 1000) {

			lp = totalAmount * 5 / 100;
			System.out.println(C.lightpink + "Yoho!..You got 5% of Coupon" + C.reset);
			System.out.println(C.charteuse + "After Coupon Apply your total amount: " + totalAmount);
			dp = totalAmount;
		} else if (totalAmount > 1000 && totalAmount <= 1499) {
			lp = totalAmount * 10 / 100;
			System.out.println(C.lightpink + "Yoho!..You got 10% of Coupon" + C.reset);
			dp = (totalAmount - lp);
			System.out.println(C.macha + "After Coupon Apply your total amount: " + (totalAmount - lp));
		} else if (totalAmount > 1499) {
			lp = totalAmount * 25 / 100;
			System.out.println(C.lightpink + "Yoho!..You got 25% of Coupon" + C.reset);
			dp = (totalAmount - lp);
			System.out.println(C.carrot + "After Coupon Apply your total amount: " + (totalAmount - lp));
		} else {
			lp = totalAmount;
			dp = lp;
			System.out.println(C.plum + "No Coupons Are Applied " + C.reset);
			System.out.println(C.purple + "Total amount: " + lp);
		}

		// Tax calculations (CGST & SGST)
		double gstAmount = totalAmount * gstRate;
		double cgstAmount = totalAmount * cgstRate;
		double sgstAmount = totalAmount * sgstRate;
		double finalAmount = totalAmount - lp + gstAmount; // Apply GST on discounted total
		// Print footer with tax details and total
		System.out.println(C.lime + "------------------------------------------" + C.reset);
		System.out.printf(C.turquoise + "%-30s %-10.2f%n" + C.reset, "Subtotal:", dp);
		System.out.printf(C.cyan + "%-30s %-10.2f%n" + C.reset, "CGST (9%):", cgstAmount);
		finalAmount = dp + sgstAmount + cgstAmount;
		System.out.printf(C.plum + "%-30s %-10.2f%n" + C.reset, "SGST (9%):", sgstAmount);
		System.out.printf(C.apricot + "%-30s %-10.2f%n" + C.reset, "Total (Incl. GST):", finalAmount);
		System.out.println(C.lime + "------------------------------------------" + C.reset);
		System.out.println();
		System.out.println();
		System.out.println(C.blue + "Enter Your Address: " + C.reset);
		String ad = sc.nextLine();
		// for entrd addres
		// System.out.println("*****************************************************");
		// System.out.println(" Thank You for Shopping with Us! ");
		// System.out.println("*****************************************************");
		System.out.println();
		System.out.println();
		System.out.println(C.apricot + C.blink + "Oreder Confirmed Do Payment" + C.reset);
		System.out.println();
		// Ask for further actions
		par(finalAmount, km, ad);
	}

	public void par(double finalAmount, HashMap<String, Integer> km, String ad) {
		System.out.println();
		System.out.println(C.cyan + "Enter 1. Payment 2. Add More items  3. Remove Items " + C.reset);
		System.out.println();
		int n = sc.nextInt();
		if (n == 1) {
			// System.out.println("Payment");
			Payment1 pay = new Payment1();
			pay.payment(finalAmount);
		} else if (n == 2) {
			Cart1 c = new Cart1();
			c.cart();
			System.out.print(C.hotpink + "Go for cart to bill" + C.reset);
			cp();
		} else if (n == 3) {
			AddCart ct = new AddCart();
			ct.removeItams(km);
			System.out.print(C.celadon + "After removing, print bill" + C.reset);
			cp();
		} else {
			System.out.println();
			System.out.println(C.red + C.blink + "In-Valid Option Please Choose Currect Option...!" + C.reset);
			par(finalAmount, km, ad);
			System.out.println();
		}
	}

}
