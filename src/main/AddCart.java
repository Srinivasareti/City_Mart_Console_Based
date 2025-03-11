package main;

import java.util.HashMap;
import java.util.Scanner;

public class AddCart {
	static double bal = 0;
	static double bal1 = 0;
	static Scanner sc = new Scanner(System.in);
	static HashMap<String, Integer> m1 = new HashMap<>();// this is for billing

	public void mt(HashMap<String, Integer> hms) {
		AddCart r = new AddCart();
		r.removeItams(hms);
	}

	public void nN(HashMap<String, Integer> ma1) {
		m1.putAll(ma1);
	}

	public static HashMap<String, Integer> pALL(HashMap<String, Integer> alm) {
		m1.putAll(alm);
		return m1;
	}

	public static void printCart(HashMap<String, Integer> map) {
		double temp = 0;
		System.out.println();
		System.out.println();
		System.out.println(C.charteuse + "------------------CART------------------" + C.reset);
		
		for (HashMap.Entry<String, Integer> entry : map.entrySet()) {
			// Use String.format to align text properly
			System.out.printf(
					C.plum + "Item:" + C.turquoise + " %-20s" + C.plum + " Price:" + C.turquoise + " %d%n" + C.reset,
					entry.getKey(), entry.getValue());
			bal = (double) bal + entry.getValue();
		}

		System.out.print(C.charteuse + "-----------------------------------------" + C.reset);
		System.out.println();
		System.out.println();
		for (int i = 1; i <= 5; i++) {
			if (i == 1)
				System.out.print(C.Orange + "        Looding" + C.reset);
			try {
				Thread.sleep(1000);
				System.out.print(C.Orange + "." + C.reset);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println();
		System.out.println();
		System.out.println(C.magent + "Total Cart Amount:" + C.cyan + bal + C.reset);
		temp = temp + bal;
		bal = 0;
		System.out.println();
		System.out.println();
		System.out.println(C.lightpink + "Coupons are:" + C.reset);
		System.out.println(C.ruby + C.blink + "Shop 500 to get 5% Discount" + C.reset);
		System.out.println(C.yellow + C.blink + "Shop 1000 to get 10% Discount" + C.reset);
		System.out.println(C.celadon + C.blink + "Shop above 1499 to get 25% Discount" + C.reset);
		System.out.println();
		System.out.println();
		// m1.putAll(map);
		AddCart ac = new AddCart();
		ac.nN(map);
		map.remove("");
		rbm(map, temp);
	}

	public static void rbm(HashMap<String, Integer> map, double temp) {
		System.out.println(C.cyan + "Enter 1.Remove   2.Bill    3.Menu" + C.reset);
		int nb = sc.nextInt();
		if (nb == 1) {
			
			AddCart soj = new AddCart();
			soj.mt(map);
			System.out.println(C.cyan + "Enter 1.Menu   2.Bill" + C.reset);
			int m1 = sc.nextInt();
			if (m1 == 1) {
				Cart1 c1 = new Cart1();
				c1.cart();
			} else if (m1 == 2) {
				AddCart ac1 = new AddCart();
				ac1.bill(bal1, map);
			} else {
				System.out.println();
				System.out.println(C.red + C.blink + "Inavlid Option...! Choose a Valid Option:" + C.reset);
				System.out.println();
				rbm(map, temp);
			}

		} else if (nb == 3) {
			Cart1 c = new Cart1();
			c.cart();
		} else if (nb == 2) {
			AddCart ac1 = new AddCart();
			ac1.bill(temp, pALL(map));
		} else {
			System.out.println();
			System.out.println(C.red + C.blink + "Inavlid Option...! Choose a Valid Option:" + C.reset);
			System.out.println();
			rbm(map, temp);
		}

	}

	public void removeItams(HashMap<String, Integer> mas)// removing items and price
	{
		double tp = 0;
		System.out.println(C.rosewood + "Enter remove item:  " + C.reset);
		String im = sc.next();
		mas.remove(im);
		System.out.println(C.lightpink + "after remove items cart:" + C.reset);
		// for (HashMap.Entry<String, Integer> entry : mas.entrySet())
		// {
		// System.out.println("Item: "+entry.getKey()+" "+" Price: " +
		// entry.getValue());
		// bal1=(double)bal1+entry.getValue();
		// }
		System.out.println();
		System.out.println();
		System.out.println(C.charteuse + "------------------CART------------------" + C.reset);
		for (HashMap.Entry<String, Integer> entry : mas.entrySet()) {
			// Format the output for alignment
			System.out.printf(
					C.plum + "Item:" + C.turquoise + " %-20s" + C.plum + " Price:" + C.turquoise + " %d%n" + C.reset,
					entry.getKey(), entry.getValue());
			bal1 = bal1 + entry.getValue(); // Update the balance
		}
		tp = tp + bal1; // tp is temp amount
		bal1 = 0; // reset bal1
		System.out.println(C.charteuse + "-----------------------------------------" + C.reset);
		System.out.println();
		for (int i = 1; i <= 6; i++) {
			if (i == 1)
				System.out.print(C.yellow + "            Looding" + C.reset);
			try {
				System.out.print(C.yellow + "." + C.reset);
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println();
		System.out.println();
		System.out.println(C.magent + "Total Cart Amount: " + C.cyan + tp + C.reset);
		bal = 0;
		System.out.println(C.lightpink + "Coupons are:" + C.reset);
		System.out.println(C.ruby + C.blink + "Shop 500 to get 5% Discount" + C.reset);
		System.out.println(C.yellow + C.blink + "Shop 1000 to get 10% Discount" + C.reset);
		System.out.println(C.celadon + C.blink + "Shop above 1499 to get 25% Discount" + C.reset);
		System.out.println();
		System.out.println();

	}

	public void bill(Double bal, HashMap<String, Integer> mh) {

		Coupons cp = new Coupons();
		cp.coup(bal, mh);
	}
}
