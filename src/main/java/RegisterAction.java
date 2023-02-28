import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import pojo.Product;

public class RegisterAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	String firstName;
	String lastName;
	String gender;
	Integer age;
	String email;
	String address;
	String selectedColor;
	List<String> colors;
	boolean subscription;
	List<String> hobbies;
	String selectedHobbies;
	List<Product> products;

	public String execute() {
		System.out.println("execute() method called");
		System.out.println("123 :) Name: " + firstName);

		if (subscription == true) {
			System.out.println("You are a subscriber");
		} else {
			System.out.println("You are not a subscriber");
		}

		return SUCCESS;
	}

	public String initializeFormFields() {
		initializeColors();
		initializeHobbies();
		initializeProducts();
		return "input";
	}

	public void initializeProducts() {
		products = new ArrayList<>();
		products.add(new Product("111", "iPhone", "Mobile Phone", new BigDecimal("7000.00")));
		products.add(new Product("222", "Sony", "Camera", new BigDecimal("700.00")));
	}

	public void initializeHobbies() {
		hobbies = Arrays.asList("Drawing", "Teaching", "Singing", "Programming");
	}

	public void initializeColors() {
		setColors(Arrays.asList("Red", "Blue", "Green", "White"));
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public String getSelectedHobbies() {
		return selectedHobbies;
	}

	public void setSelectedHobbies(String selectedHobbies) {
		this.selectedHobbies = selectedHobbies;
	}

	public List<String> getHobbies() {
		return hobbies;
	}

	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}

	public boolean isSubscription() {
		return subscription;
	}

	public void setSubscription(boolean subscription) {
		this.subscription = subscription;
	}

	public List<String> getColors() {
		return colors;
	}

	public void setColors(List<String> colors) {
		this.colors = colors;
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
