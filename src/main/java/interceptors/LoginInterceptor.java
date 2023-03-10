package interceptors;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

import action.LoginAction;

public class LoginInterceptor implements Interceptor {

	private static final long serialVersionUID = 1L;

	@Override
	public void destroy() {
		System.out.println("LoginInterceptor destroy() called");
	}

	@Override
	public void init() {
		System.out.println("LoginInterceptor init() called");
	}

	@Override
	public String intercept(ActionInvocation ai) throws Exception {

		Object user = ServletActionContext.getContext().getSession().get("loggedinUser");
		
		if (user == null) {
			if (ai.getAction().getClass().equals(LoginAction.class)) {
				return ai.invoke();
			}
			return "input";
		}
		
		return ai.invoke();
		
	}

}
