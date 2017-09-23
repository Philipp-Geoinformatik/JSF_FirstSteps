import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.inject.Named;

@Named
@Singleton
public class SalutationHandler {

	private List<String> salutations;

	@PostConstruct
	private void init() {
		salutations = Arrays.asList("---","Herr", "Frau", "Dr.", "Prof.");
	}

	public List<String> getSalutations() {
		return this.salutations;
	}

}
