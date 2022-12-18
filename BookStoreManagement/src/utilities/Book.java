package utilities;

public class Book {
	private int id; 
	private String name; 
	private int price; 
	private String genre;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(String name, String genre) {
		super();
		this.name = name;
		this.genre = genre;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
}
