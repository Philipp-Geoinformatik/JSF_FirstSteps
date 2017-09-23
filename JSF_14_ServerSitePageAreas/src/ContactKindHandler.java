import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.inject.Named;

@Singleton
@Named
public class ContactKindHandler {

	List<String> contactkinds;

	@PostConstruct
	private void init() {
		contactkinds = Arrays.asList("Telephone", "Email", "Post");
	}
	
	public List<String> getContactKinds() {
		return contactkinds;
	}
}
