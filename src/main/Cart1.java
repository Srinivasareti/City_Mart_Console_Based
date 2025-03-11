package main;

import java.util.HashMap;
import java.util.Scanner;

public class Cart1 {
	double dmt = 0;
	HashMap<String, Integer> m = new HashMap<>();
	HashMap<String, Integer> mp = new HashMap<>();
	static Scanner sc = new Scanner(System.in);
	static Cart1 s1 = new Cart1();

	public void cart() {
		System.out.println();
		System.out.println();
		System.out.println(
				C.green + "------------------------------------------------------------------------" + C.reset);
		System.out.println(C.Orange + C.blink
				+ "                             M E N U                                    " + C.reset);
		System.out.println(
				C.green + "------------------------------------------------------------------------" + C.reset);
		System.out.println();
		System.out.println(C.cyan + "	" + "Enter 1: Vegetables" + "		        " + "Enter 11: Dry Fruits");
		System.out.println("	" + "Enter 2: Fruits" + "		      	        " + "Enter 12: Kitchenware");
		System.out.println("	" + "Enter 3: Grains" + "		                " + "Enter 13: Stationery");
		System.out.println("	" + "Enter 4: Snacks" + "		                " + "Enter 14: Toys");
		System.out.println("	" + "Enter 5: Frozen & Dairy Products" + " 	" + "Enter 15: Sports Equipment");
		System.out.println("	" + "Enter 6: Personal Care" + "                  " + "Enter 16: Home Furnishings");
		System.out.println("	" + "Enter 8: Grocery" + "                    	" + "Enter 18: Electrical Items");
		System.out.println("	" + "Enter 9: Cleaning Products" + "          	" + "Enter 19: Party Supplies");
		System.out.println("	" + "Enter 7: Drinks" + " 			" + "Enter 17: Travel Accessories");
		System.out
				.println("	" + "Enter 10: Baby Products" + "            	" + "Enter 20: Medical Needs" + C.reset);
		System.out.println();
		System.out.println(
				C.green + "------------------------------------------------------------------------" + C.reset);
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.print(C.beet + C.blink + "           Choose a Category by Enterning the Corresponding Number:     "
				+ C.reset);
		System.out.println();
		System.out.println();
		int input = sc.nextInt();
		switch (input) {

		case 1:
			s1.Vg();
			break;
		case 2:
			s1.fr();
			break;
		case 3:
			s1.Gr();
			break;
		case 4:
			s1.Sn();
			break;
		case 5:
			s1.Fdp();
			break;
		case 6:
			s1.Pc();
			break;
		case 7:
			s1.Dr();
			break;
		case 8:
			s1.Grocery();
			break;
		case 9:
			s1.Cp();
			break;
		case 10:
			s1.Bp();
			break;
		case 11:
			s1.Df();
			break;
		case 12:
			s1.Kw();
			break;
		case 13:
			s1.St();
			break;
		case 14:
			s1.T();
			break;
		case 15:
			s1.Se();
			break;
		case 16:
			s1.Hf();
			break;
		case 17:
			s1.Ta();
			break;
		case 18:
			s1.Ei();
			break;
		case 19:
			s1.Ps();
			break;
		case 20:
			s1.Mn();
			break;
		default:
			System.out.println(C.red + "Invalid option. Please select a valid option." + C.reset);
			cart();
			break;
		}
	}

	public void dup() {
		Vg();
	}

	public void dup1() {
		fr();
	}

	public void dup2() {
		Gr();
	}

	public void dup3() {
		Sn();
	}

	public void dup4() {
		Fdp();
	}

	public void dup5() {
		Pc();
	}

	public void dup6() {
		Dr();
	}

	public void dup7() {
		Grocery();
	}

	public void dup8() {
		Cp();
	}

	public void dup9() {
		Bp();
	}

	public void dup10() {
		Df();
	}

	public void dup11() {
		Kw();
	}

	public void dup12() {
		St();
	}

	public void dup13() {
		T();
	}

	public void dup14() {
		Se();
	}

	public void dup15() {
		Hf();
	}

	public void dup16() {
		Ta();
	}

	public void dup17() {
		Ei();
	}

	public void dup18() {
		Ps();
	}

	public void dup19() {
		Mn();
	}

	public void Vg() {
		System.out.println(C.emerald + "Vegetables...!" + C.reset);
		System.out.println();
		System.out.println(C.ruby + "Enter 1: Carrot per kg Rs:40 ");
		System.out.println("Enter 2: Tomato per kg Rs:30");
		System.out.println("Enter 3: Chill per kg Rs:15");
		System.out.println("Enter 4: Onion per kg Rs:50");
		System.out.println("Enter 5: Potato per kg Rs:35");
		System.out.println("Enter 6: Brinjal per kg Rs:20");
		System.out.println("Enter 7: Cabagge per kg Rs:45");
		System.out.println("Enter 8: Capsicum per kg Rs:70");
		System.out.println("Enter 9: Cucumber per kg Rs:25");
		System.out.println("Enter 10: Drumstick per kg Rs:10" + C.reset);
		String[] a = { "Carrot", "Tomato", "Chill", "Onion", "Potato", "Brinjal", "Cabagge", "Capsicum", "Cucumber",
				"Drumstick" };
		int a1[] = { 40, 30, 15, 50, 35, 20, 45, 70, 25, 10 };
		System.out.println();
		System.out.println(C.emerald + "Select a Vegetable:" + C.reset);
		System.out.println();
		int n = sc.nextInt();
		if (n < 1 || n > 10) {
			System.out.println(C.red + C.blink + "Invalid option. Please select a valid option." + C.reset);
			s1.Vg();

		} else {
			n = n - 1;
			String it = "";
			int p = 0;
			for (int i = 0; i <= 10; i++) {
				if (i == n) {
					p = a1[i];
					it = a[i];
				}

				m.put(it, p);
			}
			ait();
		}
	}

	public void ait() {
		System.out.println(C.yellow + "\nIf you want more: 1.Vegetable 2.Menu   3.View Cart " + C.reset);
		System.out.println();
		System.out.println(C.magent + C.blink + "Choose One Option........." + C.reset);
		System.out.println();
		int i1 = sc.nextInt();
		if (i1 == 1) {
			dup();
		} else if (i1 == 2) {
			mp.putAll(m);
			m.clear();
			cart();
		} else if (i1 == 3) {
			mp.putAll(m);
			m.clear();
			AddCart.printCart(mp); // printCart is static method and pass hashmap
		} else {
			System.out.println(C.red + C.blink + "Inavlid Option...! Choose a Valid Option:" + C.reset);
			ait();
		}
	}

	public void fr() {
		System.out.println(C.tan + "Select a Fruit:" + C.reset);
		System.out.println();
		System.out.println(C.lightpink + "Enter 1: Apple Rs:50");
		System.out.println("Enter 2: Banana Rs:40");
		System.out.println("Enter 3: Graphes Rs:30");
		System.out.println("Enter 4: Oranges Rs:45");
		System.out.println("Enter 5: Pine Apple Rs:70");
		System.out.println("Enter 6: Mangoe Rs:150");
		System.out.println("Enter 7: Watermelon Rs:100");
		System.out.println("Enter 8: Kiwi Rs:30");
		System.out.println("Enter 9: Custard Apple Rs:60");
		System.out.println("Enter 10: Dragon Fruit Rs:80" + C.reset);
		String[] b = { "Apple", "Banana", "Graphes", "Oranges", "PineApple", "Mangoe", "Watermelon", "Kiwi", "Custard",
				"DragonFruit" };
		int b1[] = { 50, 40, 30, 45, 70, 150, 100, 30, 60, 80 };
		System.out.println();
		System.out.println(C.tan + "Select fruit:" + C.reset);
		int n1 = sc.nextInt();
		if (n1 < 1 || n1 > 10) {
			System.out.println(C.red + C.blink + "Invalid option. Please select a valid option." + C.reset);
			s1.fr();

		} else {
			n1 = n1 - 1;
			String it1 = "";
			int pr = 0;
			for (int i = 0; i <= 10; i++) {
				if (i == n1) {
					pr = b1[i];
					it1 = b[i];
				}
				m.put(it1, pr);
			}
			ait1();
		}
	}

	public void ait1() {
		System.out.println(C.yellow + "If you want more: 1.Fruits 2.Menu   3.View Cart " + C.reset);
		System.out.println();
		System.out.println(C.magent + C.blink + "Choose One Option........." + C.reset);
		int i1 = sc.nextInt();
		if (i1 == 1) {
			dup1();
		} else if (i1 == 2) {
			mp.putAll(m);
			m.clear();
			cart();
		} else if (i1 == 3) {
			mp.putAll(m);
			m.clear();
			AddCart.printCart(mp); // printCart is static method and pass hashmap
		} else {
			System.out.println(C.red + C.blink + "Inavlid Option...! Choose a Valid Option:" + C.reset);
			ait1();
		}
	}

	public void Gr() {
		System.out.println(C.armygreen + "Select a Grains:" + C.reset);
		System.out.println();
		System.out.println(C.tan + "Enter 1: Wheat Rs:110");
		System.out.println("Enter 2: Maida Rs:72");
		System.out.println("Enter 3: Greean Gram Rs:100");
		System.out.println("Enter 4: Black Gram Rs:150");
		System.out.println("Enter 5: Brown Rice Rs:120");
		System.out.println("Enter 6: Ragi Rs:80");
		System.out.println("Enter 7: Wild Rice Rs:200");
		System.out.println("Enter 8: Millet Rs:100");
		System.out.println("Enter 9: Oats Rs:126");
		System.out.println("Enter 10: Bengal Gram Rs:130" + C.reset);
		String[] b = { "Wheat", "Maida", "GreenGram", "BlackGram", "BrownRice", "Ragi", "WildRice", "Millet", "Oats",
				"BengalGram" };
		int b1[] = { 110, 72, 100, 150, 120, 80, 200, 100, 126, 130 };
		System.out.println();
		System.out.println(C.armygreen + "Select Grains:" + C.reset);
		int n1 = sc.nextInt();
		if (n1 < 1 || n1 > 10) {
			System.out.println(C.red + C.blink + "Inavlid Option...! Choose a Valid Option:" + C.reset);
			s1.Gr();

		} else {

			n1 = n1 - 1;
			String it1 = "";
			int pr = 0;
			for (int i = 0; i <= 10; i++) {
				if (i == n1) {
					pr = b1[i];
					it1 = b[i];
				}
				m.put(it1, pr);
			}
			ait2();
		}
	}

	public void ait2() {
		System.out.println(C.yellow + "If you want more: 1.Grains 2.Menu   3.view Cart " + C.reset);
		System.out.println();
		System.out.println(C.magent + C.blink + "Choose One Option........." + C.reset);
		int i1 = sc.nextInt();
		if (i1 == 1) {
			dup2();
		} else if (i1 == 2) {
			mp.putAll(m);
			m.clear();
			cart();
		} else if (i1 == 3) {
			mp.putAll(m);
			m.clear();
			AddCart.printCart(mp); // printCart is static method and pass hashmap
		} else {
			System.out.println(C.red + C.blink + "Inavlid Option...! Choose a Valid Option:" + C.reset);
			ait2();
		}
	}

	public void Sn() {
		System.out.println(C.seafoam + "Select a Snacks:" + C.reset);
		System.out.println();
		System.out.println(C.beet + "Enter 1: Potato Chips Rs:40");
		System.out.println("Enter 2: Banana Chips Rs:50");
		System.out.println("Enter 3: Puffed Snacks Rs:30");
		System.out.println("Enter 4: Aloo Bhujia Rs:90");
		System.out.println("Enter 5: Moong Dal Rs:55");
		System.out.println("Enter 6: Biscuits Rs:76");
		System.out.println("Enter 7: Butter Cookies Rs:84");
		System.out.println("Enter 8: Protein Bars Rs:90");
		System.out.println("Enter 9: Juice Rs:30");
		System.out.println("Enter 10: Lays Rs:45" + C.reset);
		String[] b = { "potatoChips", "BananaChips", "PuffedScancks", "AlooBujia", "MoonDal", "Biscuits",
				"ButterCookies", "ProtienBars", "Juice", "Lays" };
		int b1[] = { 40, 50, 30, 90, 55, 76, 84, 90, 30, 45 };
		System.out.println();
		System.out.println(C.seafoam + "Select Snacks:" + C.reset);
		int n1 = sc.nextInt();
		if (n1 < 1 || n1 > 10) {
			System.out.println(C.red + C.blink + "Inavlid Option...! Choose a Valid Option:" + C.reset);
			s1.Sn();

		} else {

			n1 = n1 - 1;
			String it1 = "";
			int pr = 0;
			for (int i = 0; i <= 10; i++) {
				if (i == n1) {
					pr = b1[i];
					it1 = b[i];
				}
				m.put(it1, pr);
			}
			ait3();
		}
	}

	public void ait3() {
		System.out.println(C.yellow + "If you want more: 1.Snacks 2.Menu   3.View Cart " + C.reset);
		System.out.println();
		System.out.println(C.magent + C.blink + "Choose One Option........." + C.reset);
		int i1 = sc.nextInt();
		if (i1 == 1) {
			dup3();
		} else if (i1 == 2) {
			mp.putAll(m);
			m.clear();
			cart();
		} else if (i1 == 3) {
			mp.putAll(m);
			m.clear();
			AddCart.printCart(mp); // printCart is static method and pass hashmap
		} else {
			System.out.println(C.red + C.blink + "Inavlid Option...! Choose a Valid Option:" + C.reset);
			ait3();
		}
	}

	public void Fdp() {
		System.out.println(C.pool + "Select a Frozen & Dairy Products:" + C.reset);
		System.out.println();
		System.out.println(C.macha + "Enter 1: Mixed Vegetables Rs:68");
		System.out.println("Enter 2: Butter Rs:52");
		System.out.println("Enter 3: Cheese Rs:130");
		System.out.println("Enter 4: Vanilla Ice Cream Rs:140");
		System.out.println("Enter 5: Kulfi Rs:70");
		System.out.println("Enter 6: Fruit pulp Rs:76");
		System.out.println("Enter 7: Full Cream Milk Rs:55");
		System.out.println("Enter 8: Panner Rs:98");
		System.out.println("Enter 9: Yogurt Rs:30");
		System.out.println("Enter 10: curd Rs:45");
		System.out.println("Enter 11: Milkshake Rs:30");
		System.out.println("Enter 12: Lassi Rs:20" + C.reset);
		String[] b = { "MixedVegetables", "Butter", "Cheese", "VanillaIceCream", "Kulfi", "Fruitpulp", "FullCreamMilk",
				"Panner", "Yogurt", "curd", "Milkshake", "Lassi" };
		int b1[] = { 68, 52, 130, 140, 70, 76, 55, 98, 30, 45, 30, 20 };
		System.out.println();
		System.out.println(C.pool + "Select Frozen & Dairy Products:" + C.reset);
		int n1 = sc.nextInt();
		if (n1 < 1 || n1 > 12) {
			System.out.println(C.red + C.blink + "Invalid option. Please select a valid option." + C.reset);
			s1.Fdp();

		} else {

			n1 = n1 - 1;
			String it1 = "";
			int pr = 0;
			for (int i = 0; i <= 12; i++) {
				if (i == n1) {
					pr = b1[i];
					it1 = b[i];
				}
				m.put(it1, pr);
			}
			ait4();
		}
	}

	public void ait4() {
		System.out.println(C.yellow + "If you want more: 1. Frozen & Dairy Products 2.Menu   3.View Cart " + C.reset);
		System.out.println();
		System.out.println(C.magent + C.blink + "Choose One Option........." + C.reset);
		int i1 = sc.nextInt();
		if (i1 == 1) {
			dup4();
		} else if (i1 == 2) {
			mp.putAll(m);
			m.clear();
			cart();
		} else if (i1 == 3) {
			mp.putAll(m);
			m.clear();
			AddCart.printCart(mp); // printCart is static method and pass hashmap
		} else {
			System.out.println(C.red + C.blink + "Inavlid Option...! Choose a Valid Option:" + C.reset);
			ait4();
		}
	}

	public void Pc() {
		System.out.println(C.rosewood + "Select a Personal Care:" + C.reset);
		System.out.println();
		System.out.println(C.celadon + "Enter 1: General Shampoo Rs 200 ");
		System.out.println("Enter 2: Santhoor Soap Rs 30 ");
		System.out.println("Enter 3: Conditioner Rs 40");
		System.out.println("Enter 4: Hari Oil Rs 55 ");
		System.out.println("Enter 5: Cleanser Rs 49 ");
		System.out.println("Enter 6: perfume Rs 99");
		System.out.println("Enter 7: Sunscreen Rs 89");
		System.out.println("Enter 8: Moisturizers Rs 99");
		System.out.println("Enter 9: Face Mask Rs 77");
		System.out.println("Enter 10: Body Wash Rs 120" + C.reset);
		String[] b = { "GeneralShampoo", "SanthoorSoap", "Conditioner", "HariOil", "Cleanser", "perfume", "Sunscreen",
				"Moisturizers", "FaceMask", "BodyWash" };
		int b1[] = { 200, 30, 40, 55, 49, 99, 89, 99, 77, 120 };
		System.out.println();
		System.out.println(C.rosewood + "Select Personal Care:" + C.reset);
		int n1 = sc.nextInt();
		if (n1 < 1 || n1 > 10) {
			System.out.println(C.red + C.blink + "Invalid option. Please select a valid option." + C.reset);
			s1.Pc();

		} else {

			n1 = n1 - 1;
			String it1 = "";
			int pr = 0;
			for (int i = 0; i <= 10; i++) {
				if (i == n1) {
					pr = b1[i];
					it1 = b[i];
				}
				m.put(it1, pr);
			}
			ait5();
		}
	}

	public void ait5() {
		System.out.println(C.yellow + "If you want more: 1. Personal Care 2.Menu   3.View Cart " + C.reset);
		System.out.println();
		System.out.println(C.magent + C.blink + "Choose One Option........." + C.reset);
		int i1 = sc.nextInt();
		if (i1 == 1) {
			dup5();
		} else if (i1 == 2) {
			mp.putAll(m);
			m.clear();
			cart();
		} else if (i1 == 3) {
			mp.putAll(m);
			m.clear();
			AddCart.printCart(mp); // printCart is static method and pass hashmap
		} else {
			System.out.println(C.red + C.blink + "Inavlid Option...! Choose a Valid Option:" + C.reset);
			ait5();
		}
	}

	public void Dr() {
		System.out.println(C.apricot + "Select a Drinks:" + C.reset);
		System.out.println();
		System.out.println(C.plum + "Enter 1: Coca-Cola Rs:20");
		System.out.println("Enter 2: Pepsi Rs:20");
		System.out.println("Enter 3: Sprite Rs:20");
		System.out.println("Enter 4: Thums up Rs:20");
		System.out.println("Enter 5: Fanta Rs:20");
		System.out.println("Enter 6: Apple Rs:50");
		System.out.println("Enter 7: Mango Rs:50");
		System.out.println("Enter 8: Orange Rs:50");
		System.out.println("Enter 9: Red Bull Rs:70");
		System.out.println("Enter 10: Monester Rs:100");
		System.out.println("Enter 11: String Rs:20" + C.reset);
		String[] b = { "CocaCola", "Pepsi", "Sprite", "Thumsup", "Fanta", "Apple", "Mango", "Orange", "RedBull",
				"Monester", "String" };
		int b1[] = { 20, 20, 20, 20, 20, 50, 50, 50, 70, 100, 20 };
		System.out.println();
		System.out.println(C.apricot + "Select Drinks:" + C.reset);
		int n1 = sc.nextInt();
		if (n1 < 1 || n1 > 11) {
			System.out.println(C.red + C.blink + "Invalid option. Please select a valid option." + C.reset);
			s1.Dr();

		} else {

			n1 = n1 - 1;
			String it1 = "";
			int pr = 0;
			for (int i = 0; i <= 11; i++) {
				if (i == n1) {
					pr = b1[i];
					it1 = b[i];
				}
				m.put(it1, pr);
			}
			ait6();
		}
	}

	public void ait6() {
		System.out.println(C.yellow + "If you want more: 1.Drinks 2.Menu   3.View Cart " + C.reset);
		System.out.println();
		System.out.println(C.magent + C.blink + "Choose One Option........." + C.reset);
		int i1 = sc.nextInt();
		if (i1 == 1) {
			dup6();
		} else if (i1 == 2) {
			mp.putAll(m);
			m.clear();
			cart();
		} else if (i1 == 3) {
			mp.putAll(m);
			m.clear();
			AddCart.printCart(mp); // printCart is static method and pass hashmap
		} else {
			System.out.println(C.red + C.blink + "Inavlid Option...! Choose a Valid Option:" + C.reset);
			ait6();
		}
	}

	public void Grocery() {
		System.out.println(C.hotpink + "Select a Grocery:" + C.reset);
		System.out.println();
		System.out.println(C.charteuse + "Enter 1: Basmati Rice Rs:300");
		System.out.println("Enter 2: Wheat Rs:100");
		System.out.println("Enter 3: Multigrain Rs:130");
		System.out.println("Enter 4: Ragi Flour Rs:80");
		System.out.println("Enter 5: Rice Flour Rs:70");
		System.out.println("Enter 6: Sunflower Oil Rs:150");
		System.out.println("Enter 7: Ground Oil Rs:162");
		System.out.println("Enter 8: Rock Salt Rs:62");
		System.out.println("Enter 9: Brown Sugar Rs:73");
		System.out.println("Enter 10: Turmeric Powder Rs:73");
		System.out.println("Enter 11: Red Chilli Powder Rs:48");
		System.out.println("Enter 12: Curry Powder Rs:78" + C.reset);
		String[] b = { "BasmatiRice", "Wheat", "Multigrain", "RagiFlour", "RiceFlour", "SunflowerOil", "GroundOil",
				"RockSalt", "BrownSugar", "TurmericPowder", "RedChilliPowder", "CurryPowder" };
		int b1[] = { 300, 100, 130, 80, 70, 150, 162, 62, 73, 73, 48, 78 };
		System.out.println();
		System.out.println(C.hotpink + "Select Grocery:" + C.reset);
		int n1 = sc.nextInt();
		if (n1 < 1 || n1 > 12) {
			System.out.println(C.red + C.blink + "Invalid option. Please select a valid option." + C.reset);
			s1.Grocery();

		} else {

			n1 = n1 - 1;
			String it1 = "";
			int pr = 0;
			for (int i = 0; i <= 12; i++) {
				if (i == n1) {
					pr = b1[i];
					it1 = b[i];
				}
				m.put(it1, pr);
			}
			ait7();
		}
	}

	public void ait7() {
		System.out.println(C.yellow + "If you want more: 1.Grocery  2.Menu   3.View Cart " + C.reset);
		System.out.println();
		System.out.println(C.magent + C.blink + "Choose One Option........." + C.reset);
		int i1 = sc.nextInt();
		if (i1 == 1) {
			dup7();
		} else if (i1 == 2) {
			mp.putAll(m);
			m.clear();
			cart();
		} else if (i1 == 3) {
			mp.putAll(m);
			m.clear();
			AddCart.printCart(mp); // printCart is static method and pass hashmap
		} else {
			System.out.println(C.red + C.blink + "Inavlid Option...! Choose a Valid Option:" + C.reset);
			ait7();
		}
	}

	public void Cp() {

		System.out.println(C.olive + "Select a Cleaning Products:" + C.reset);
		System.out.println();
		System.out.println(C.turquoise + "Enter 1: Lizol Rs:220");
		System.out.println("Enter 2: Harpic Rs:207");
		System.out.println("Enter 3: Colin Rs:101");
		System.out.println("Enter 4: Phenyl Rs:93");
		System.out.println("Enter 5: Dettol Rs:156");
		System.out.println("Enter 6: Vim Rs:125");
		System.out.println("Enter 7: Lifeboy Rs:199");
		System.out.println("Enter 8: Ariel Rs:120");
		System.out.println("Enter 9: Rin Rs:99");
		System.out.println("Enter 10: Surf Exel Rs:150" + C.reset);
		String[] b = { "Lizol", "Harpic", "Colin", "Phenyl", "Dettol", "Vim", "Lifeboy", "Ariel", "Rin", "Surf Exel" };
		int b1[] = { 300, 100, 130, 80, 70, 150, 162, 62, 73, 73, 48, 78 };
		System.out.println();
		System.out.println(C.olive + "Select Cleaning products:" + C.turquoise);
		int n1 = sc.nextInt();
		if (n1 < 1 || n1 > 10) {
			System.out.println(C.red + C.blink + "Invalid option. Please select a valid option." + C.reset);
			s1.Cp();

		} else {

			n1 = n1 - 1;
			String it1 = "";
			int pr = 0;
			for (int i = 0; i <= 10; i++) {
				if (i == n1) {
					pr = b1[i];
					it1 = b[i];
				}
				m.put(it1, pr);
			}
			ait8();
		}
	}

	public void ait8() {
		System.out.println(C.yellow + "If you want more: 1.Cleaning Products  2.Menu   3.View Cart " + C.reset);
		System.out.println();
		System.out.println(C.magent + C.blink + "Choose One Option........." + C.reset);
		int i1 = sc.nextInt();
		if (i1 == 1) {
			dup8();
		} else if (i1 == 2) {
			mp.putAll(m);
			m.clear();
			cart();
		} else if (i1 == 3) {
			mp.putAll(m);
			m.clear();
			AddCart.printCart(mp); // printCart is static method and pass hashmap
		} else {
			System.out.println(C.red + C.blink + "Inavlid Option...! Choose a Valid Option:" + C.reset);
			ait8();
		}
	}

	public void Bp() {
		System.out.println(C.charteuse + "Select a Baby Products:" + C.reset);
		System.out.println();
		System.out.println(C.lightpink + "Enter 1: Pampers Rs:150");
		System.out.println("Enter 2: Huggies Rs:160");
		System.out.println("Enter 3: Cerelac Rs:120");
		System.out.println("Enter 4: Sippy Cups Rs:89");
		System.out.println("Enter 5: Franing Spoons Rs:69");
		System.out.println("Enter 6: Mittens Rs:59");
		System.out.println("Enter 7: Towels Rs:159");
		System.out.println("Enter 8: Sunscreen Rs:249");
		System.out.println("Enter 9: Musical Toys Rs:129");
		System.out.println("Enter 10: Baby sheets Rs:149" + C.reset);
		String[] b = { "Pampers", "Huggies", "Cerelac", "SippyCups", "FraningSpoons", "Mittens", "Towels", "Sunscreen",
				"MusicalToys", "BabySheets" };
		int b1[] = { 150, 160, 120, 89, 69, 59, 159, 249, 129, 149 };
		System.out.println();
		System.out.println(C.charteuse + "Select Baby Products:" + C.reset);
		int n1 = sc.nextInt();
		if (n1 < 1 || n1 > 10) {
			System.out.println(C.red + C.blink + "Invalid option. Please select a valid option." + C.reset);
			s1.Bp();

		} else {

			n1 = n1 - 1;
			String it1 = "";
			int pr = 0;
			for (int i = 0; i <= 10; i++) {
				if (i == n1) {
					pr = b1[i];
					it1 = b[i];
				}
				m.put(it1, pr);
			}
			ait9();
		}
	}

	public void ait9() {
		System.out.println(C.yellow + "If you want more: 1.Baby Products  2.Menu   3.View Cart " + C.reset);
		System.out.println();
		System.out.println(C.magent + C.blink + "Choose One Option........." + C.reset);
		int i1 = sc.nextInt();
		if (i1 == 1) {
			dup9();
		} else if (i1 == 2) {
			mp.putAll(m);
			m.clear();
			cart();
		} else if (i1 == 3) {
			mp.putAll(m);
			m.clear();
			AddCart.printCart(mp); // printCart is static method and pass hashmap
		} else {
			System.out.println(C.red + C.blink + "Inavlid Option...! Choose a Valid Option:" + C.reset);
			ait9();
		}
	}

	public void Df() {
		System.out.println(C.lightgrey + "Select a Dry Fruits:" + C.reset);
		System.out.println();
		System.out.println(C.armygreen + "Enter 1: Almonds Rs:129");
		System.out.println("Enter 2: Cashews Rs:149");
		System.out.println("Enter 3: Pistachos Rs:189");
		System.out.println("Enter 4: Walnuts Rs:129");
		System.out.println("Enter 5: Pumpkin Seeds Rs:119");
		System.out.println("Enter 6: Sunflower Seeds Rs:100");
		System.out.println("Enter 7: Chia Seeds Rs:90");
		System.out.println("Enter 8: Dates Rs:250");
		System.out.println("Enter 9: Raisins Rs:80");
		System.out.println("Enter 10: Hazelnut Rs:159" + C.reset);
		String[] b = { "Almonds", "Cashews", "Pistachos", "Walnuts", "pumpkinSeeds", "SunFlowerSeeds", "ChiaSeeds",
				"Dates", "Raisins", "Hazelnut", };
		int b1[] = { 129, 149, 189, 129, 119, 100, 90, 250, 80, 159 };
		System.out.println();
		System.out.println(C.lightgrey + "Select Dry Fruits:" + C.reset);
		int n1 = sc.nextInt();
		if (n1 < 1 || n1 > 10) {
			System.out.println(C.red + C.blink + "Invalid option. Please select a valid option." + C.reset);
			s1.Df();

		} else {

			n1 = n1 - 1;
			String it1 = "";
			int pr = 0;
			for (int i = 0; i <= 10; i++) {
				if (i == n1) {
					pr = b1[i];
					it1 = b[i];
				}
				m.put(it1, pr);
			}
			ait10();
		}
	}

	public void ait10() {
		System.out.println(C.yellow + "If you want more: 1.Dry Fruits  2.Menu   3.View Cart " + C.reset);
		System.out.println();
		System.out.println(C.magent + C.blink + "Choose One Option........." + C.reset);
		int i1 = sc.nextInt();
		if (i1 == 1) {
			dup10();
		} else if (i1 == 2) {
			mp.putAll(m);
			m.clear();
			cart();
		} else if (i1 == 3) {
			mp.putAll(m);
			m.clear();
			AddCart.printCart(mp); // printCart is static method and pass hashmap
		} else {
			System.out.println(C.red + C.blink + "Inavlid Option...! Choose a Valid Option:" + C.reset);
			ait10();
		}
	}

	public void Kw() {
		System.out.println(C.beet + "Select a Kitchenware:" + C.reset);
		System.out.println();
		System.out.println(C.seafoam + "Enter 1: Frying Pans Rs:450");
		System.out.println("Enter 2: Cooking Pans Rs:560");
		System.out.println("Enter 3: Glasses Rs:99");
		System.out.println("Enter 4: Lunch Boxes Rs:159");
		System.out.println("Enter 5: Knife Rs:79");
		System.out.println("Enter 6: Spoons Rs:45");
		System.out.println("Enter 7: Forks Rs:39");
		System.out.println("Enter 8: Blenders Rs:459");
		System.out.println("Enter 9: Toasters Rs:699");
		System.out.println("Enter 10: Cups Rs:99" + C.reset);
		String[] b = { "FryingPans", "CookingPans", "Glasses", "LunchBoxes", "Knife", "Spoons", "Forks", "Blenders",
				"Toasters", "Cups", };
		int b1[] = { 450, 560, 99, 159, 79, 45, 39, 459, 699, 99 };
		System.out.println();
		System.out.println(C.beet + "Select Kitchenware:" + C.reset);
		int n1 = sc.nextInt();
		if (n1 < 1 || n1 > 10) {
			System.out.println(C.red + C.blink + "Invalid option. Please select a valid option." + C.reset);
			s1.Kw();

		} else {

			n1 = n1 - 1;
			String it1 = "";
			int pr = 0;
			for (int i = 0; i <= 10; i++) {
				if (i == n1) {
					pr = b1[i];
					it1 = b[i];
				}
				m.put(it1, pr);
			}
			ait11();
		}
	}

	public void ait11() {
		System.out.println(C.yellow + "If you want more: 1.Kitchenware 2.Menu   3.View Cart " + C.reset);
		System.out.println();
		System.out.println(C.magent + C.blink + "Choose One Option........." + C.reset);
		int i1 = sc.nextInt();
		if (i1 == 1) {
			dup11();
		} else if (i1 == 2) {
			mp.putAll(m);
			m.clear();
			cart();
		} else if (i1 == 3) {
			mp.putAll(m);
			m.clear();
			AddCart.printCart(mp); // printCart is static method and pass hashmap
		} else {
			System.out.println(C.red + C.blink + "Inavlid Option...! Choose a Valid Option:" + C.reset);
			ait11();
		}
	}

	public void St() {
		System.out.println(C.macha + "Select a Stationery:" + C.reset);
		System.out.println();
		System.out.println(C.pool + "Enter 1: Pens Rs:10");
		System.out.println("Enter 2: Pencils Rs:100");
		System.out.println("Enter 3: Crayons Rs:20");
		System.out.println("Enter 4: Markers Rs:30");
		System.out.println("Enter 5: Note Books Rs:55");
		System.out.println("Enter 6: Drawing Papers Rs:30");
		System.out.println("Enter 7: Dairies Rs:69");
		System.out.println("Enter 8: File Floders Rs:99");
		System.out.println("Enter 9: Stapler Rs:49");
		System.out.println("Enter 10: Scissors Rs:39" + C.reset);
		String[] b = { "Pens", "Pencils", "Crayons", "Markers", "NoteBooks", "DrawingPapers", "Dairies", "FileFlooders",
				"Stapler", "Scissors", };
		int b1[] = { 10, 100, 20, 30, 55, 30, 69, 99, 49, 39 };
		System.out.println();
		System.out.println(C.macha + "Select Stationery:" + C.reset);
		int n1 = sc.nextInt();
		if (n1 < 1 || n1 > 10) {
			System.out.println(C.red + C.blink + "Invalid option. Please select a valid option." + C.reset);
			s1.St();

		} else {

			n1 = n1 - 1;
			String it1 = "";
			int pr = 0;
			for (int i = 0; i <= 10; i++) {
				if (i == n1) {
					pr = b1[i];
					it1 = b[i];
				}
				m.put(it1, pr);
			}
			ait12();
		}
	}

	public void ait12() {
		System.out.println(C.yellow + "If you want more: 1.Stationery 2.Menu   3.View Cart " + C.reset);
		System.out.println();
		System.out.println(C.magent + C.blink + "Choose One Option........." + C.reset);
		int i1 = sc.nextInt();
		if (i1 == 1) {
			dup12();
		} else if (i1 == 2) {
			mp.putAll(m);
			m.clear();
			cart();
		} else if (i1 == 3) {
			mp.putAll(m);
			m.clear();
			AddCart.printCart(mp); // printCart is static method and pass hashmap
		} else {
			System.out.println(C.red + C.blink + "Inavlid Option...! Choose a Valid Option:" + C.reset);
			ait12();
		}
	}

	public void T() {
		System.out.println(C.celadon + "Select a Toys:" + C.reset);
		System.out.println();
		System.out.println(C.olive + "Enter 1: Teddy Bear Rs:259");
		System.out.println("Enter 2: Puzzles Rs:250");
		System.out.println("Enter 3: Cars Rs:130");
		System.out.println("Enter 4: Drones Rs:299");
		System.out.println("Enter 5: Ludo Rs:199");
		System.out.println("Enter 6: Chess Rs:399");
		System.out.println("Enter 7: Balls Rs:89");
		System.out.println("Enter 8: Skipping Ropes Rs:159");
		System.out.println("Enter 9: Snakes & Ladders Rs:99");
		System.out.println("Enter 10: Coloring Sets Rs:149" + C.reset);
		String[] b = { "TeddyBears", "Puzzles", "Cars", "Drones", "Ludo", "Chess", "Balls", "SkippingRopes",
				"Snakes&Ladders", "ColoringSets", };
		int b1[] = { 259, 250, 130, 299, 199, 399, 89, 159, 99, 149 };
		System.out.println();
		System.out.println(C.celadon + "Select Toys:" + C.reset);
		int n1 = sc.nextInt();
		if (n1 < 1 || n1 > 10) {
			System.out.println(C.red + C.blink + "Invalid option. Please select a valid option." + C.reset);
			s1.T();

		} else {

			n1 = n1 - 1;
			String it1 = "";
			int pr = 0;
			for (int i = 0; i <= 10; i++) {
				if (i == n1) {
					pr = b1[i];
					it1 = b[i];
				}
				m.put(it1, pr);
			}
			ait13();
		}
	}

	public void ait13() {
		System.out.println(C.yellow + "If you want more: 1.Toys 2.Menu   3.View Cart " + C.reset);
		System.out.println();
		System.out.println(C.magent + C.blink + "Choose One Option........." + C.reset);
		int i1 = sc.nextInt();
		if (i1 == 1) {
			dup13();
		} else if (i1 == 2) {
			mp.putAll(m);
			m.clear();
			cart();
		} else if (i1 == 3) {
			mp.putAll(m);
			m.clear();
			AddCart.printCart(mp); // printCart is static method and pass hashmap
		} else {
			System.out.println(C.red + C.blink + "Inavlid Option...! Choose a Valid Option:" + C.reset);
			ait13();
		}
	}

	public void Se() {
		System.out.println(C.plum + "Select a Sports Equipment:" + C.reset);
		System.out.println();
		System.out.println(C.apricot + "Enter 1: Carrom Boards Rs:799");
		System.out.println("Enter 2: Table Tennis Bats Rs:1599");
		System.out.println("Enter 3: Badminton Rackts & Shuttlecocks Rs:799");
		System.out.println("Enter 4: Cricket Bat Rs:599");
		System.out.println("Enter 5: Balls Rs:70");
		System.out.println("Enter 6: Stumps Rs:800");
		System.out.println("Enter 7: Gloves Rs:759");
		System.out.println("Enter 8: Football Rs:489");
		System.out.println("Enter 9: Volleyball Rs:549");
		System.out.println("Enter 10: Tennis Rackets & Ball Rs:799");
		System.out.println("Enter 11: Dumbbells Rs:449" + C.reset);
		String[] b = { "CarromBoards", "TableTennisBats", "BadmintonRackts&Shuttlecocks", "CricketBat", "Balls",
				"Stumps", "Gloves", "Football", "Volleyball", "TennisRackets&Ball", "Dumbbells", };
		int b1[] = { 799, 1599, 799, 599, 70, 800, 759, 489, 549, 799, 499 };
		System.out.println();
		System.out.println(C.plum + "Select Sports Equipmentoys:" + C.reset);
		int n1 = sc.nextInt();
		if (n1 < 1 || n1 > 11) {
			System.out.println(C.red + C.blink + "Invalid option. Please select a valid option." + C.reset);
			s1.Se();

		} else {

			n1 = n1 - 1;
			String it1 = "";
			int pr = 0;
			for (int i = 0; i <= 11; i++) {
				if (i == n1) {
					pr = b1[i];
					it1 = b[i];
				}
				m.put(it1, pr);
			}
			ait14();
		}
	}

	public void ait14() {
		System.out.println(C.yellow + "If you want more: 1.Sports Equipment 2.Menu   3.View Cart " + C.reset);
		System.out.println();
		System.out.println(C.magent + C.blink + "Choose One Option........." + C.reset);
		int i1 = sc.nextInt();
		if (i1 == 1) {
			dup14();
		} else if (i1 == 2) {
			mp.putAll(m);
			m.clear();
			cart();
		} else if (i1 == 3) {
			mp.putAll(m);
			m.clear();
			AddCart.printCart(mp); // printCart is static method and pass hashmap
		} else {
			System.out.println(C.red + C.blink + "Inavlid Option...! Choose a Valid Option:" + C.reset);
			ait14();
		}
	}

	public void Hf() {
		System.out.println(C.turquoise + "Select a Home Furnishings:" + C.reset);
		System.out.println();
		System.out.println(C.olive + "Enter 1: Bedsheets Rs:959");
		System.out.println("Enter 2: Pillow Covers Rs:249");
		System.out.println("Enter 3: Blankets Rs:699");
		System.out.println("Enter 4: Mattress Protectors Rs:498");
		System.out.println("Enter 5: Cushions Rs:389");
		System.out.println("Enter 6: Curtains Rs:899");
		System.out.println("Enter 7: Carpets Rs:759");
		System.out.println("Enter 8: Tablecloths Rs:259");
		System.out.println("Enter 9: Dining Table Mats Rs:159");
		System.out.println("Enter 10: Bath Towels Rs:249" + C.reset);
		String[] b = { "Bedsheets", "PillowCovers", "Blankets", "MattressProtectors", "Cushions", "Curtains", "Carpets",
				"Tablecloths", "DiningTableMats", "BathTowels", };
		int b1[] = { 959, 249, 699, 498, 389, 899, 759, 259, 159, 249 };
		System.out.println();
		System.out.println(C.turquoise + "Select Home Furnishings:" + C.reset);
		int n1 = sc.nextInt();
		if (n1 < 1 || n1 > 10) {
			System.out.println(C.red + C.blink + "Invalid option. Please select a valid option." + C.reset);
			s1.Hf();

		} else {

			n1 = n1 - 1;
			String it1 = "";
			int pr = 0;
			for (int i = 0; i <= 10; i++) {
				if (i == n1) {
					pr = b1[i];
					it1 = b[i];
				}
				m.put(it1, pr);
			}
			ait15();
		}
	}

	public void ait15() {
		System.out.println(C.yellow + "If you want more: 1.Home Furnishings 2.Menu   3.View Cart " + C.reset);
		System.out.println();
		System.out.println(C.magent + C.blink + "Choose One Option........." + C.reset);
		int i1 = sc.nextInt();
		if (i1 == 1) {
			dup15();
		} else if (i1 == 2) {
			mp.putAll(m);
			m.clear();
			cart();
		} else if (i1 == 3) {
			mp.putAll(m);
			m.clear();
			AddCart.printCart(mp); // printCart is static method and pass hashmap
		} else {
			System.out.println(C.red + C.blink + "Inavlid Option...! Choose a Valid Option:" + C.reset);
			ait15();
		}
	}

	public void Ta() {
		System.out.println(C.macha + "Select a Travel Accessories:" + C.reset);
		System.out.println();
		System.out.println(C.beet + "Enter 1: Neck Pillows Rs:259");
		System.out.println("Enter 2: Luggage Scales Rs:499");
		System.out.println("Enter 3: Packing Cubes Rs:389");
		System.out.println("Enter 4: Travel Toiletry Bottles Rs:259");
		System.out.println("Enter 5: Luggage Tags Rs:59");
		System.out.println("Enter 6: Eye Mask Rs:49");
		System.out.println("Enter 7: Earplugs Rs:129");
		System.out.println("Enter 8: Portable Chargers Rs:399");
		System.out.println("Enter 9: Travel Bottles Rs:159");
		System.out.println("Enter 10: Waterproof Phone Case Rs:59" + C.reset);
		String[] b = { "NeckPillows", "LuggageScales", "PackingCubes", "TravelToiletryBottles", "LuggageTags",
				"EyeMask", "Earplugs", "PortableCharges", "TravelBottles", "WaterProofPhoneCase", };
		int b1[] = { 259, 499, 389, 259, 59, 49, 129, 399, 159, 59 };
		System.out.println();
		System.out.println(C.macha + "Select Travel Accessories:" + C.reset);
		int n1 = sc.nextInt();
		if (n1 < 1 || n1 > 10) {
			System.out.println(C.red + C.blink + "Invalid option. Please select a valid option." + C.reset);
			s1.Ta();

		} else {

			n1 = n1 - 1;
			String it1 = "";
			int pr = 0;
			for (int i = 0; i <= 10; i++) {
				if (i == n1) {
					pr = b1[i];
					it1 = b[i];
				}
				m.put(it1, pr);
			}
			ait16();
		}
	}

	public void ait16() {
		System.out.println(C.yellow + "If you want more: 1.Travel Accessories 2.Menu   3.View Cart " + C.reset);
		System.out.println();
		System.out.println(C.magent + C.blink + "Choose One Option........." + C.reset);
		int i1 = sc.nextInt();
		if (i1 == 1) {
			dup16();
		} else if (i1 == 2) {
			mp.putAll(m);
			m.clear();
			cart();
		} else if (i1 == 3) {
			mp.putAll(m);
			m.clear();
			AddCart.printCart(mp); // printCart is static method and pass hashmap
		} else {
			System.out.println(C.red + C.blink + "Inavlid Option...! Choose a Valid Option:" + C.reset);
			ait16();
		}
	}

	public void Ei() {
		System.out.println(C.pool + "Select a Electrical Items:" + C.reset);
		System.out.println();
		System.out.println(C.seafoam + "Enter 1: Tube Light Rs:150");
		System.out.println("Enter 2: LED Bulbs Rs:59");
		System.out.println("Enter 3: Electric Kettles Rs:599");
		System.out.println("Enter 4: Geysers Rs:1999");
		System.out.println("Enter 5: Adoptors Rs:299");
		System.out.println("Enter 6: Table Fans Rs:1000");
		System.out.println("Enter 7: Ceiling Fans Rs:1099");
		System.out.println("Enter 8: Plug Top Rs:109");
		System.out.println("Enter 9: Bulb Holders Rs:99");
		System.out.println("Enter 10: Switches Rs:399" + C.reset);
		String[] b = { "TubeLight", "LEDBulbs", "ElectricKettles", "Geysers", "Adoptors", "TableFans", "CeilingFans",
				"PlugTop", "BulbHolders", "Switches", };
		int b1[] = { 150, 59, 599, 1999, 299, 1000, 1099, 109, 99, 399 };
		System.out.println();
		System.out.println(C.pool + "Select Electrical Items:" + C.reset);
		int n1 = sc.nextInt();
		if (n1 < 1 || n1 > 10) {
			System.out.println(C.red + C.blink + "Invalid option. Please select a valid option." + C.reset);
			s1.Ei();

		} else {

			n1 = n1 - 1;
			String it1 = "";
			int pr = 0;
			for (int i = 0; i <= 10; i++) {
				if (i == n1) {
					pr = b1[i];
					it1 = b[i];
				}
				m.put(it1, pr);
			}
			ait17();
		}
	}

	public void ait17() {
		System.out.println(C.yellow + "If you want more: 1.Electrical Items 2.Menu   3.View Cart " + C.reset);
		System.out.println();
		System.out.println(C.magent + C.blink + "Choose One Option........." + C.reset);
		int i1 = sc.nextInt();
		if (i1 == 1) {
			dup17();
		} else if (i1 == 2) {
			mp.putAll(m);
			m.clear();
			cart();
		} else if (i1 == 3) {
			mp.putAll(m);
			m.clear();
			AddCart.printCart(mp); // printCart is static method and pass hashmap
		} else {
			System.out.println(C.red + C.blink + "Inavlid Option...! Choose a Valid Option:" + C.reset);
			ait17();
		}
	}

	public void Ps() {
		System.out.println(C.lightpink + "Select a Party Supplies:" + C.reset);
		System.out.println();
		System.out.println(C.olive + "Enter 1: Balloons Rs:65");
		System.out.println("Enter 2: Table Centerpieces Rs:249");
		System.out.println("Enter 3: Banner Rs:99");
		System.out.println("Enter 4: Themed Decor Rs:89");
		System.out.println("Enter 5: Plate Rs:59");
		System.out.println("Enter 6: Cake Serving Rs:49");
		System.out.println("Enter 7: Trays Rs:79");
		System.out.println("Enter 8: Party Games Rs:399");
		System.out.println("Enter 9: Photo Booth Rs:200");
		System.out.println("Enter 10: DIY Craft Supplies Rs:159" + C.reset);
		String[] b = { "Balloons", "TableCenterpieces", "Banner", "ThemedDecor", "Plate", "CakeServing", "Trays",
				"PartyGames", "PhotoBooth", "DIYCraftSupplies", };
		int b1[] = { 65, 249, 99, 89, 59, 49, 79, 399, 200, 159 };
		System.out.println();
		System.out.println(C.lightpink + "Select Party Supplies:" + C.reset);
		int n1 = sc.nextInt();
		if (n1 < 1 || n1 > 10) {
			System.out.println(C.red + C.blink + "Invalid option. Please select a valid option." + C.reset);
			s1.Ps();

		} else {

			n1 = n1 - 1;
			String it1 = "";
			int pr = 0;
			for (int i = 0; i <= 10; i++) {
				if (i == n1) {
					pr = b1[i];
					it1 = b[i];
				}
				m.put(it1, pr);
			}
			ait18();
		}
	}

	public void ait18() {
		System.out.println(C.yellow + "If you want more: 1.Party Supplies 2.Menu   3.View Cart " + C.reset);
		System.out.println();
		System.out.println(C.magent + C.blink + "Choose One Option........." + C.reset);
		int i1 = sc.nextInt();
		if (i1 == 1) {
			dup18();
		} else if (i1 == 2) {
			mp.putAll(m);
			m.clear();
			cart();
		} else if (i1 == 3) {
			mp.putAll(m);
			m.clear();
			AddCart.printCart(mp); // printCart is static method and pass hashmap
		} else {
			System.out.println(C.red + C.blink + "Inavlid Option...! Choose a Valid Option:" + C.reset);
			ait18();
		}
	}

	public void Mn() {
		System.out.println(C.olive + "Select a Medical Need:" + C.reset);
		System.out.println();
		System.out.println(C.apricot + "Enter 1: Multivitamins Rs:99");
		System.out.println("Enter 2: Thermometer Rs:159");
		System.out.println("Enter 3: Antibacterial Soap Rs:89");
		System.out.println("Enter 4: Burn Ointments Rs:69");
		System.out.println("Enter 5: Cough Syrup Rs:89");
		System.out.println("Enter 6: Anti-itch Creams Rs:49");
		System.out.println("Enter 7: Ear Drops Rs:89");
		System.out.println("Enter 8: Surgical Gloves Rs:39");
		System.out.println("Enter 9: Face Mask Rs:15");
		System.out.println("Enter 10: Eye Drops Rs:109" + C.reset);
		String[] b = { "Multivitamins", "Thermometer", "AntiBacterialSoap", "BurnOIntments", "CoughSyrup",
				"AntiItchCreams", "EarDrops", "SurgicalGloves", "FaceMask", "EyeDrops", };
		int b1[] = { 99, 159, 89, 69, 89, 49, 89, 39, 15, 109, };
		System.out.println();
		System.out.println(C.olive + "Select Medical Need:" + C.reset);
		int n1 = sc.nextInt();
		if (n1 < 1 || n1 > 10) {
			System.out.println(C.red + C.blink + "Inavlid Option...! Choose a Valid Option:" + C.reset);
			s1.Mn();

		} else {

			n1 = n1 - 1;
			String it1 = "";
			int pr = 0;
			for (int i = 0; i <= 10; i++) {
				if (i == n1) {
					pr = b1[i];
					it1 = b[i];
				}
				m.put(it1, pr);
			}
			ait19();
		}
	}

	public void ait19() {
		System.out.println(C.yellow + "If you want more: 1.Medical Needs 2.Menu   3.View Cart " + C.reset);
		System.out.println();
		System.out.println(C.magent + C.blink + "Choose One Option........." + C.reset);
		int i1 = sc.nextInt();
		if (i1 == 1) {
			dup19();
		} else if (i1 == 2) {
			mp.putAll(m);
			m.clear();
			cart();
		} else if (i1 == 3) {
			mp.putAll(m);
			m.clear();
			AddCart.printCart(mp); // printCart is static method and pass hashmap
		} else {
			System.out.println(C.red + C.blink + "Inavlid Option...! Choose a Valid Option:" + C.reset);
			ait19();
		}
	}

}
