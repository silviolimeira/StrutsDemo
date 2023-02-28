package action;

import java.math.BigDecimal;

import com.opensymphony.xwork2.ActionSupport;

import dao.ProductManagementDAO;
import pojo.Product;

public class UpdateAction extends ActionSupport{
	
	private static final long serialVersionUID = 1L;
	
	String id;
	String name;
	String category;
	BigDecimal price;
	
	public String execute() {
		String statusCode = "";
		System.out.println("execute() method called");
		Product product = new Product(id, name, category, price);
		int recordUpdated = ProductManagementDAO.updateProduct(product);
		if (recordUpdated == 1) {
			statusCode = "success";
		} else {
			statusCode = "error";
		}
		return statusCode;
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
