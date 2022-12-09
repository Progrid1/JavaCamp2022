package kodlamaioDay3Homework3.entities;

public class Course {
	
	private int id;
	private String name;
	private double price;
	private String categoryName;
	
	public Course(int id, String name, double price, String categoryName) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.categoryName = categoryName;
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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	
	
	
	
}
