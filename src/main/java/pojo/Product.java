package pojo;

import java.math.BigDecimal;

public class Product {

	String id;
	String mame;
	String category;
	BigDecimal price;

	public Product() {
	}

	public Product(String id, String mame, String category, BigDecimal price) {
		this.id = id;
		this.mame = mame;
		this.category = category;
		this.price = price;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMame() {
		return mame;
	}

	public void setMame(String mame) {
		this.mame = mame;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

}
