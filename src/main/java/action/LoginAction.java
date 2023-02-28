package action;

import com.opensymphony.xwork2.ActionSupport;

import dao.LoginDAO;
import pojo.LoginInfo;

public class LoginAction extends ActionSupport {

	String userName;
	String password;
	
	public String execute() {
		String statusCode = "";
		boolean isUserValid = LoginDAO.isUserValid(new LoginInfo(userName, password));
		if (isUserValid) {
			statusCode = "success";
		} else {
			statusCode = "input";
		}
		return statusCode;
	}
	
}
