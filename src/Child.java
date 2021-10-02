
public class Child {
	private String firstName;
	private String lastName;
	private int age;
	
	/**
	 * Class constructor
	 * @param firstName
	 * @param lastName
	 * @param age
	 */
	public Child(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	
	/**
	 * Get the child age method
	 * @return integer age of the child
	 */
	public int getAge() {
		return this.age;
	}
	
	/**
	 * Get the child full name
	 * @return String fullname of the child
	 */
	public String getFullName() {
		return this.firstName+" "+this.lastName;
	}
	
}
