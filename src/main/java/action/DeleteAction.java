package action;

import com.opensymphony.xwork2.ActionSupport;

import dao.ProductManagementDAO;

public class DeleteAction extends ActionSupport {
	
	private static final long serialVersionUID = 1L;
	
	Long id;

	public String execute() {
		String statusCode = "";
		System.out.println("Delete execute() method called");
		System.out.println("Product Id = " + id);
		int recordUpdated = ProductManagementDAO.deleteProduct(id);
		if (recordUpdated == 1) {
			statusCode = "success";
		} else {
			statusCode = "error";
		}
		return statusCode;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
