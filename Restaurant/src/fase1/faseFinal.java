package fase1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class faseFinal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] menu = { "chicken", "steak", "hamburger", "spaghettis", "pizza" };
		int[] price = { 10, 15, 20, 5, 12 };

		for (int i = 0; i < menu.length; i++) {

			System.out.println("We have " + menu[i] + " for " + price[i] + "€");

		}
		boolean exists = false;
		boolean wantMore = true;
		int answer = 0;
		int yes = 1;
		int no = 0;

		List<String> Order = new ArrayList<String>();

		List<Integer> TotalPrice = new ArrayList<Integer>();

		Scanner keyboard = new Scanner(System.in);

		System.out.println("What do you want to eat?");

		do {

			String userOrder = keyboard.next().toLowerCase();
			
			exists = false;

			for (int i = 0; i < menu.length; i++) {

				if (userOrder.equals(menu[i])) {

					Order.add(userOrder);

					System.out.println("You ordered " + userOrder);

					TotalPrice.add(price[i]);

					exists = true;

				}

			}

			if (!exists) {

				System.out.println("Sorry, we don't have that");

			}

			System.out.println("Want something more? Say YES with 1 and NO with 0");

			answer = keyboard.nextInt();

			if (answer == yes) {

				wantMore = true;

				System.out.println("What else do you want?");

			} else if (answer == no) {

				wantMore = false;

			}

		} while (wantMore);

		int sum = TotalPrice.stream().mapToInt(Integer::intValue).sum();

		System.out.println("Order finished! \nYour order have " + Order);

		System.out.println("The total price is: " + sum);

	}

}

