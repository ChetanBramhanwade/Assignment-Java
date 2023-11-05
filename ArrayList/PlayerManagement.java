import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class PlayerManagement {

	public static ArrayList<Player> addplayer() {

		Player player1 = new Player("Rohit Sharma", 78, 24, 112, "Bharat", 5, null);
		Player player2 = new Player("Sachin Tendulkar", 34357, 74, 664, "Bharat", 100, null);
		Player player3 = new Player("KC Sangakkara", 26, 70, 594, "Sri Lanka", 6, null);
		Player player4 = new Player("Chris Gayle", 13, 112, 483, "West Indies", 42, null);
		Player player5 = new Player("Gautam Gambhir", 10324, 85, 242, "Bharat", 25, null);

		ArrayList<Player> al = new ArrayList<>();
		al.add(player1);
		al.add(player2);
		al.add(player3);
		al.add(player4);
		al.add(player5);

		return al;
	}

	public static void disp(ArrayList<Player> al) {
		for (Player p : al) {
			System.out.println(p);
		}
	}

	public static void display(ArrayList<Player> al) {
		for (Player p : al) {
			if (Player.getTotalrun() > 100) {
				p.display();
			}

		}

	}

	public static void delete(List<Player> al) {
		for (int i = 0; i < al.size(); i++) {
			Player player = al.get(i);
			if (Player.getTotalrun() < 100) {
				al.remove(i);
			}
		}
	}

	public static void update(ArrayList<Player> al) {
		System.out.println("**************After Update********************");

		for (int i = 0; i < al.size(); i++) {
			Player player = al.get(i);
			if (player.getNoofcentury() > 10) {
				player.setCategory("A");
			} else {
				player.setCategory("B");
			}
		}

	}

	public static void sort(List<Player> al) {
		System.out.println("*******************After Sort******************");

		Collections.sort(al, new Comparator<Player>() {

			@Override
			public int compare(Player o1, Player o2) {

				return Player.getPlayername().compareToIgnoreCase(Player.getPlayername());
			}

		});
	}

}
