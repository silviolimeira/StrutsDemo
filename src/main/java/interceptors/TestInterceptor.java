package interceptors;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class TestInterceptor implements Interceptor {

	private static final long serialVersionUID = 1L;

	@Override
	public void destroy() {
		System.out.println("destroy() called");
	}

	@Override
	public void init() {
		System.out.println("init() called");
	}

	@Override
	public String intercept(ActionInvocation ai) throws Exception {
		System.out.println("Pre-processing");
		String result = ai.invoke();
		System.out.println("Post-processing");
		return result;
	}

}
