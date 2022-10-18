package oopHomeWorkWeek3.entities;

public class Course {
	private int id;
	private String name;
	private String description;
	private String instructor;
	private String imageUrl;
	private int price;
	public Course(int id, String name, String description, String instructor, String imageUrl, int price) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.instructor = instructor;
		this.imageUrl = imageUrl;
		this.price = price;
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getInstructor() {
		return instructor;
	}
	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	
	
	

}
