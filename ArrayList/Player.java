import java.util.Objects;

public class Player {

	static String Playername;
	static int totalrun;
	int noofwicket;
	int noofmatches;
	String country;
	int noofcentury;
	String Category = null;

	public static String getPlayername() {
		return Playername;
	}

	public void setPlayername(String playername) {
		Playername = playername;
	}

	public static int getTotalrun() {
		return totalrun;
	}

	public void setTotalrun(int totalrun) {
		this.totalrun = totalrun;
	}

	public int getNoofwicket() {
		return noofwicket;
	}

	public void setNoofwicket(int noofwicket) {
		this.noofwicket = noofwicket;
	}

	public int getNoofmatches() {
		return noofmatches;
	}

	public void setNoofmatches(int noofmatches) {
		this.noofmatches = noofmatches;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getNoofcentury() {
		return noofcentury;
	}

	public void setNoofcentury(int noofcentury) {
		this.noofcentury = noofcentury;
	}

	public String getCategory() {
		return Category;
	}

	public void setCategory(String category) {
		Category = category;
	}

	public Player(String playername, int totalrun, int noofwicket, int noofmatches, String country, int noofcentury,
			String category) {
		super();
		this.Playername = playername;
		this.totalrun = totalrun;
		this.noofwicket = noofwicket;
		this.noofmatches = noofmatches;
		this.country = country;
		this.noofcentury = noofcentury;
		Category = category;
	}

	void display () {

		System.out.println("Player Name : " + Playername);
		System.out.println("Total Run   : " + totalrun);
		System.out.println("NoOfWickets : " + noofwicket);
		System.out.println("NoOfMatches : " + noofmatches);
		System.out.println("Country     : " + country);
		System.out.println("NoOfCentury : " + noofcentury);
		System.out.println("Category    : " + Category);
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
	}

	@Override
	public int hashCode() {
		return Objects.hash(Category, Playername, country, noofcentury, noofmatches, noofwicket, totalrun);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Player other = (Player) obj;
		return Objects.equals(Category, other.Category) && Objects.equals(Playername, other.Playername)
				&& Objects.equals(country, other.country) && noofcentury == other.noofcentury
				&& noofmatches == other.noofmatches && noofwicket == other.noofwicket && totalrun == other.totalrun;
	}

}
