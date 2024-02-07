package domain;

public class Product {
	private int id;
	
	private String name;
	
	private String description;
	
	private double value;
	
	private int quantity;
	
	private Category category;
	

	public Product(int id, String name, String description, double value, int quantity, Category category) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.value = value;
		this.quantity = quantity;
		this.category = category;
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

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", description=" + description + ", value=" + value
				+ ", quantity=" + quantity + ", category=" + category + "]";
	}
	
	
}