package action;

import com.opensymphony.xwork2.ActionSupport;

import dao.LoginDAO;
import dao.ProductManagementDAO;
import pojo.LoginInfo;
import pojo.Product;

public class DeleteAction extends ActionSupport {
	
	private static final long serialVersionUID = 1L;
	
	String id;

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

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
