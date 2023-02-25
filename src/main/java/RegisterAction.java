import com.opensymphony.xwork2.ActionSupport;

public class RegisterAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	String firstName;
	String lastName;
	String gender;
	Integer age;
	String email;
	String address;
	String selectedColor;

	public String execute() {
		System.out.println("execute() method called");
		System.out.println("123 :) Name: " + firstName);
		return SUCCESS;
	}

	public String getSelectedColor() {
		return selectedColor;
	}

	public void setSelectedColor(String selectedColor) {
		this.selectedColor = selectedColor;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/*
	 * @Override public void validate() { if (firstName.trim().equals("")) {
	 * addFieldError("firstName", "First name is required."); } if
	 * (lastName.trim().equals("")) { addFieldError("lastName",
	 * "Last name is required."); } if (gender == null) { addFieldError("gender",
	 * "Gender is requiered."); } if (age == null) { addFieldError("age",
	 * "Age is requiered."); } else if (age <= 18) { addFieldError("age",
	 * "Age should be above 18."); } if (email.trim().equals("")) {
	 * addFieldError("email", "Email name is required."); }
	 * 
	 * 
	 * }
	 */

}
