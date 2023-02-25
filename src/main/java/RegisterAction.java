import com.opensymphony.xwork2.Action;

public class RegisterAction implements Action {

	String message;
	String firstName;
	String lastName;
	String gender;
	String age;
	String email;

	public String execute() {
		System.out.println("execute() method called");
		message = "SUCCESS Message :- ) - " + firstName;
		System.out.println("123 :) Name: " + firstName);
		return SUCCESS;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

}
