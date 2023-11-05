import java.util.HashMap;

public class TestBookM {
	
	public static void main(String[] args) {

		HashMap<Integer, Book> hMap = new HashMap<>();
		
		BookManagement.addObj(hMap);
		BookManagement.disp(hMap);
		BookManagement.getkey(hMap);
		BookManagement.reduceprice(hMap);
		BookManagement.disp(hMap);

		
	}
}
