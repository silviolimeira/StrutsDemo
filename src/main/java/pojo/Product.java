package pojo;

import java.math.BigDecimal;

public class Product {

	String Id;
	String Name;
	String Category;
	BigDecimal Price;

	public Product() {
	}

	public Product(String id, String name, String category, BigDecimal price) {
		Id = id;
		Name = name;
		Category = category;
		Price = price;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getCategory() {
		return Category;
	}

	public void setCategory(String category) {
		Category = category;
	}

	public BigDecimal getPrice() {
		return Price;
	}

	public void setPrice(BigDecimal price) {
		Price = price;
	}

	@Override
	public String toString() {
		return "Product [Id=" + Id + ", Name=" + Name + ", Category=" + Category + ", Price=" + Price + "]";
	}

}
