package action;

import java.math.BigDecimal;

import com.opensymphony.xwork2.ActionSupport;

import dao.ProductManagementDAO;
import pojo.Product;

public class UpdateDataAction extends ActionSupport {
	
	private static final long serialVersionUID = 1L;

	String id;
	String name;
	String category;
	BigDecimal price;

	public String execute() {
		System.out.println("execute() method called");
		Product product = ProductManagementDAO.getProductById(id);
		id = product.getId();
		name = product.getName();
		category = product.getCategory();
		price = product.getPrice();
		return "success";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
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

}
