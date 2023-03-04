package pojo;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Product {

	Long id;
	String name;
	String category;
	BigDecimal price;
	LocalDate created;
	String strCreated;

	public Product() {
	}

	public Product(Long id, String name, String category, BigDecimal price, LocalDate created) {
		this.id = id;
		this.name = name;
		this.category = category;
		this.price = price;
		this.created = created;
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		created.format(formatter);
		this.strCreated = created.format(formatter);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public LocalDate getCreated() {
		return created;
	}

	public void setCreated(LocalDate created) {
		this.created = created;
	}

	public String getStrCreated() {
		return strCreated;
	}

	public void setStrCreated(String strCreated) {
		this.strCreated = strCreated;
	}

}
