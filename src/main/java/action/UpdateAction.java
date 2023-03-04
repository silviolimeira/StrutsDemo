package action;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;

import dao.ProductManagementDAO;
import pojo.Product;

public class UpdateAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	private Long id;
	private String name;
	private String category;
	private BigDecimal price;
	private LocalDate created;
	private Date createdDate;

	public String execute() {
		String statusCode = "";
		System.out.println("execute() method called");
		created = LocalDate.parse(new SimpleDateFormat("yyyy-MM-dd").format(createdDate));			
		Product product = new Product(id, name, category, price, created);
		int recordUpdated = ProductManagementDAO.updateProduct(product);
		if (recordUpdated == 1) {
			statusCode = "success";
		} else {
			statusCode = "error";
		}
		return statusCode;
	}

	public void validate() {
		System.out.println("validate() method called");
		System.out.println(created);

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

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

}
