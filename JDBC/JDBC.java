import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBC {

	Connection con;

	public static Connection createConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Book", "root", "root");
		System.out.println("Connection Created");
		return con;
	}

	public static void insert(Connection con) throws SQLException {
		String q1 = "insert into Books values(?, ?, ?, ?)";
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your BookId");
		int BookId = in.nextInt();
		System.out.println("Enter your BookName");
		String BookName = in.next();
		System.out.println("Enter book price");
		int Price = in.nextInt();
		System.out.println("Enter Qty");
		int Qty = in.nextInt();

		PreparedStatement pmt = con.prepareStatement(q1);

		pmt.setInt(1, BookId);
		pmt.setString(2, BookName);
		pmt.setInt(3, Price);
		pmt.setInt(4, Qty);

		int nor = pmt.executeUpdate();
		System.out.println(nor + "row inserted ");
	}

	public static void delete(Connection con) throws SQLException {

		String q1 = "delete from books where bookid = ?";

		Scanner in = new Scanner(System.in);
		System.out.println("Insert bookid ");
		int BookId = in.nextInt();
		PreparedStatement pmt = con.prepareStatement(q1);
		pmt.setInt(1, BookId);

		int nor = pmt.executeUpdate();
		System.out.println(nor + "Row deleted");

	}

	public static void update(Connection con) throws SQLException {
		
		String q1 = "update Books set Price = ? where BookId = ?";
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Price");
		int Price = in.nextInt();
		System.out.println("Enter the BookId");
		int BookId = in.nextInt();

		PreparedStatement pmt = con.prepareStatement(q1);
		pmt.setInt(1, Price);
		pmt.setInt(2, BookId);

		int res = pmt.executeUpdate();
		System.out.println(res + " update successfully");
	}

	public static void display(Connection con) throws SQLException {
		
		String q1 = "Select * from Books";
		PreparedStatement pmt = con.prepareStatement(q1);
		ResultSet rs = pmt.executeQuery();
		while (rs.next()) {
			System.out.println("BookId " + rs.getInt(1) + ", BookName " + rs.getString(2) + " ,Price " + rs.getInt(3)
					+ " ,Qty " + rs.getInt(4));
		}

	}

}
