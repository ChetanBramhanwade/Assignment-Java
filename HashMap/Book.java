
public class Book {

	String name; 
	double price; 
	String authorname;	
	String isbnno; 
	String publication;
	
	public Book(String name, double price, String authorname, String isbnno, String publication) {
		
		this.name = name;
		this.price = price;
		this.authorname = authorname;
		this.isbnno = isbnno;
		this.publication = publication;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getPublication() {
		return publication;
	}

	public void setPublication(String publication) {
		this.publication = publication;
	}

	@Override
	public String toString() {
		return "Book [name=" + name + ", price=" + price + ", authorname=" + authorname + ", isbnno=" + isbnno
				+ ", publication=" + publication + "]";
	}
	
	
	

}
