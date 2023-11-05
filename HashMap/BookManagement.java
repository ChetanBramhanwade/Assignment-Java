import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BookManagement {
	
	static Scanner in=new Scanner(System.in);

	public static void addObj(HashMap<Integer,Book> hMap) {

		Book book1 = new Book("Java Programming", 1000, "James Gosling", "1234567890", "O'Reilly");
		Book book2 = new Book("Python Programming", 800, "Guido van Rossum", "9876543210", "Addison-Wesley");
		Book book3 = new Book("C++ Programming", 900, "Bjarne Stroustrup", "0987654321", "Addison-Wesley");
		Book book4 = new Book("JavaScript Programming", 700, "Brendan Eich", "1098765432", "O'Reilly");
		Book book5 = new Book("C Programming", 600, "Dennis Ritchie", "2109876543", "Pearson");

		hMap.put(1, book1);
		hMap.put(2, book2);
		hMap.put(3, book3);
		hMap.put(4, book4);
		hMap.put(5, book5);
		}
	 
	public static void disp(HashMap<Integer,Book> hMap) {
		for(Map.Entry<Integer, Book> b : hMap.entrySet()) {
			System.out.println(b);
		}
	}
	
	public static void getkey(HashMap<Integer,Book> hMap) {
		int key = in.nextInt();
		System.out.println(hMap.get(key));
	}
	
	public static void reduceprice(HashMap<Integer,Book> hMap) {
		System.out.println("Enter the publication name");
		String publication = in.next();
		
		for(Map.Entry<Integer,Book> b : hMap.entrySet()) {
			if(b.getValue().getPublication().equals(publication)) {
				double price= b.getValue().getPrice()-0.1*b.getValue().getPrice();			
				b.getValue().setPrice(price);
			}
		}
		
	}
}
