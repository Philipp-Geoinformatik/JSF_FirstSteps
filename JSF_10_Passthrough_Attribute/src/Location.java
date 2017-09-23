
public class Location {

	private String name, address, telephone, email;

	/**
	 * 
	 * @param name
	 * @param address
	 * @param telephone
	 * @param email
	 */
	public Location(String name, String address, String telephone, String email) {
		this.name = name;
		this.address = address.replace("\n", "<br/>");
		this.telephone = telephone;
		this.email = email;
	}
	/**
	 * 
	 */
	public Location() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
