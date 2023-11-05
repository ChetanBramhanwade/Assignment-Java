import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class PlayerTest {
	public static void main(String[] args) {
		
		ArrayList<Player> al =PlayerManagement.addplayer();

		
			Scanner in = new Scanner(System.in);
			System.out.println("1)AddPlayer \n2)Display \n3)Delete \n4)Sort \n5)Update  ");
			System.out.println("Enter your Choice");
			int choice = in.nextInt();
			
			switch(choice) {
			
			case 1:
				PlayerManagement.display(al);		
				break;
				
			case 2:
				PlayerManagement.display(al);
				break;
				
			case 3:
				PlayerManagement.delete(al);
				PlayerManagement.display(al);
				break;
				
			case 4:
				PlayerManagement.sort(al);
				PlayerManagement.display(al);
				break;
				
			case 5:
				PlayerManagement.update(al);
				PlayerManagement.display(al);
				break;
				
			case 6:
				PlayerManagement.display(al);

				
				System.exit(choice);
				
			}
	}
}


















