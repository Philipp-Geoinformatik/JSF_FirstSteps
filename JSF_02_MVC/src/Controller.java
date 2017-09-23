import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@SessionScoped
public class Controller implements Serializable {
	@Inject
	private Model model;

	/**
	 * 
	 * @return
	 */
	public String goToNextPage() {
		return model.getName().length() > 1 ? "page2" : "index";
	}

}
