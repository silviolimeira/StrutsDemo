package interceptors;

import java.util.Optional;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;
import com.opensymphony.xwork2.util.ValueStack;

public class AgeGroupInterceptor implements Interceptor {

	private static final long serialVersionUID = 1L;

	@Override
	public void destroy() {
		System.out.println("AgeGroup destroy() called");
	}

	@Override
	public void init() {
		System.out.println("AgeGroup init() called");
	}

	@Override
	public String intercept(ActionInvocation ai) throws Exception {
		System.out.println("AgeGroup Pre-processing");
		ValueStack stack = ai.getStack();
		Integer age = (Integer) stack.findValue("age");
		String ageGroup = "";
		if (age != null) {
			if (age <= 18) {
				ageGroup = "Children";
			} else if (age > 18 && age <= 50) {
				ageGroup = "Adult";
			} else {
				ageGroup = "Senior";
			}
			stack.set("age", age + " (" + ageGroup + ")");
		}
		String result = ai.invoke();
		System.out.println("AgeGroup Post-processing");
		return result;
	}

}
