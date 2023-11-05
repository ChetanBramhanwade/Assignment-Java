import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCTest {

		public static void main(String[] args) throws ClassNotFoundException, SQLException {
			Connection con = JDBC.createConnection();
			
			Scanner in = new Scanner(System.in);
			int choice=-1;
			do {
			System.out.println("1.Insert \n2.Delete \n3.Update \n4.Display");
			System.out.println("Enter you choice");
			choice = in.nextInt();
			
			switch(choice) {
			case 1:
				JDBC.insert(con);
				break;
				
			case 2:
				JDBC.delete(con);
				break;
				
			case 3:
				JDBC.update(con);
				break;
				
			case 4:
				JDBC.display(con);
				break;
				
			case 0:
				break;
			}
			}while(choice !=0);
		}
}
