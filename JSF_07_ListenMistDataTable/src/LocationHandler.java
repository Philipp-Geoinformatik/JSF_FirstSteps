import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.inject.Named;

@Singleton
@Named
public class LocationHandler {

	List<Location> locations;

	@PostConstruct
	private void init() {
		locations = Arrays.asList(
				new Location("Standort Bremen", "Airbusallee 1", "0421 539", "philipp.grashorn@airbus.com"),
				new Location("Standort Hamburg", "Airbusstrasse 1", "23452334", "nils.schniels@airbus.com"));
	}

	public List<Location> getLocations() {
		return locations;
	}

}
