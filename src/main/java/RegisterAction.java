import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import pojo.Product;

/*
 * A classe deve ficar na pasta /src/main/java, juntamente com o -validation.xml para a validação
 * funcionar 
 */

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

	boolean valid = false;

	public String execute() {
		System.out.println("RegisterAction execute() method called");
		initializeFormFields();

		System.out.println("execute() method called");
		System.out.println("123 :) Name: " + firstName);

		if (subscription == true) {
			System.out.println("You are a subscriber");
		} else {
			System.out.println("You are not a subscriber");
		}

		if (valid) {
			return SUCCESS;
		} else {
			return INPUT;
		}

	}

	@Override
	public void validate() {
		System.out.println("RegisterAction validate() method called");
		initializeFormFields();
		if (age != null && age > 0) valid = true;
	}

	public void initializeFormFields() {
		System.out.println("RegisterAction initializeFormFields() method called");
		initializeColors();
		initializeHobbies();
		initializeProducts();
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


}
