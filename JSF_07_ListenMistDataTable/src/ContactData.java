import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@SessionScoped
public class ContactData implements Serializable {

	private String firstName, lastName, email, phone, message, salutation, contactKind;
	private boolean topicDev, topicTraining, topicConsulting;

	@Inject
	private SalutationHandler salutationHandler;

	@PostConstruct
	private void init() {
		salutation = salutationHandler.getSalutations().get(0);
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getSalutation() {
		return salutation;
	}

	public void setSalutation(String salutation) {
		this.salutation = salutation;
	}

	public boolean isTopicDev() {
		return topicDev;
	}

	public void setTopicDev(boolean topicDev) {
		this.topicDev = topicDev;
	}

	public boolean isTopicTraining() {
		return topicTraining;
	}

	public void setTopicTraining(boolean topicTraining) {
		this.topicTraining = topicTraining;
	}

	public boolean isTopicConsulting() {
		return topicConsulting;
	}

	public void setTopicConsulting(boolean topicConsulting) {
		this.topicConsulting = topicConsulting;
	}

	public String getContactKind() {
		return contactKind;
	}

	public void setContactKind(String contactKind) {
		this.contactKind = contactKind;
	}

	
	
}
