import javax.enterprise.context.Dependent;
import javax.inject.Named;

@Named
@Dependent
public class ContactController {

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
}
