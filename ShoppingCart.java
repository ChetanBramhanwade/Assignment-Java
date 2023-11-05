import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingCart {

	public static void main(String[] args) {
		ArrayList<String> cart = new ArrayList<>();

		int choice = -1;
		do {

			Scanner in = new Scanner(System.in);
			System.out.println(
					"1.Add Items \n2.Remove Items \n3.Empty the cart \n4.View The Items \n5.Checkout  \n0.exit");
			System.out.println("Enter your choice");
			choice = in.nextInt();

			switch (choice) {
			case 1: // add items
				String items = in.next();
				cart.add(items);
				System.out.println(cart);
				break;

			case 2: // remove items
				items = in.next();
				cart.remove(items);
				System.out.println(cart);
				break;

			case 3:
				cart.clear(); // clear items
				System.out.println(cart);
				break;

			case 4: // display
				System.out.println(cart);

				break;

			case 5:
				// checkout
				System.out.println("Thank you for Shopping");
				break;

			case 0:
				break;

			default:
				System.out.println("Try again");
			}
		} while (choice != 0);
	}
}
