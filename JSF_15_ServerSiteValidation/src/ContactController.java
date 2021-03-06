import javax.enterprise.context.Dependent;
import javax.faces.event.ActionEvent;
import javax.faces.event.ValueChangeEvent;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@Dependent
public class ContactController {

	private boolean valueChanged = true;
	
	@Inject
	private ContactData contactData;
	/**
	 * 
	 * @return
	 */
	public String showData() {
		return "data";
	}

	/**
	 * 
	 * @return
	 */
	public String showInputData() {

		return "index";
	}

	/**
	 * 
	 * @param e
	 */
	public void valueChanged(ValueChangeEvent e) {
		Long age = (Long) e.getNewValue();

		if (age > 0 && age < 140)
			contactData.setAgeByController(age.intValue());
	}

	/*
	 * 
	 */
	public void handleLocationViewModeChanged(ActionEvent a) {
		contactData.setLocationAsBlock(!contactData.isLocationAsBlock());

	}

	public boolean isValueChanged() {
		return valueChanged;
	}

	public void setValueChanged(boolean valueChanged) {
		this.valueChanged = valueChanged;
	}
}
