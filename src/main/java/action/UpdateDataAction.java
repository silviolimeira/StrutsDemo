package action;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;

import dao.ProductManagementDAO;
import pojo.Product;

public class UpdateDataAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	private Long id;
	private String name;
	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	private String category;
	private BigDecimal price;
	private LocalDate created;
	private Date createdDate;
	

	public String execute() {
		System.out.println("execute() method called");
		Product product = ProductManagementDAO.getProductById(id);
		id = product.getId();
		name = product.getName();
		category = product.getCategory();
		price = product.getPrice();
		created = product.getCreated();
		createdDate = Date.from(product.getCreated().atStartOfDay(ZoneId.systemDefault()).toInstant());
		return "success";
	}

	public void validate() {
		System.out.println("UpdateDataAction validate() method called");
		System.out.println(created);
		System.out.println("] UpdateDataAction validate() method called");
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

}
