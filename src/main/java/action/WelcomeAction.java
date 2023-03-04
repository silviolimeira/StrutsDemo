package action;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import dao.ProductManagementDAO;
import pojo.Product;

public class WelcomeAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	private List<Product> products;
	private String name;
	private String category;
	private LocalDate created;
	private Date createdDate;

	public void initializeProducts() {
		System.out.println("******* Fiter Data *****");
		System.out.println(name);
		System.out.println(category);
		System.out.println(createdDate);
		products = ProductManagementDAO.getAllProducts(name, category, createdDate);
	}

	public String execute() {
		System.out.println("WELCOME execute() method called");
		initializeProducts();
		return "success";
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
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

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public LocalDate getCreated() {
		return created;
	}

	public void setCreated(LocalDate created) {
		this.created = created;
	}

	
	
}
