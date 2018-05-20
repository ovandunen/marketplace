package solutions.envisioning.repository;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class CountryRepository {

	private static final Map<String, Country> COUNTRIES = new HashMap<>();
	static {

		COUNTRIES.put("Israel", createIsrael());
		COUNTRIES.put("Spain", createSpain());
		COUNTRIES.put("Belarus", createBelarus());
	}

	private static Country createIsrael() {
		final Country israel = new Country();
		israel.setBrand("Shuk");
		israel.setDomain("shuk.co.il");
		israel.setName("Israel");
		israel.setCategories(Arrays.asList(new String[] { "Hummus", "Car" }));
		return israel;
	}

	private static Country createSpain() {
		final Country spain = new Country();
		spain.setBrand("Tienda");
		spain.setDomain("tienda.es");
		spain.setName("Spain");
		spain.setCategories(Arrays.asList(new String[] { "Wine", "Computers" }));
		return spain;
	}

	private static Country createBelarus() {
		final Country belarus = new Country();
		belarus.setBrand("Marketplace");
		belarus.setDomain("marketplace.com");
		belarus.setName("Belarus");
		belarus.setCategories(Arrays.asList(new String[] { "Wine", "Clothes" }));
		return belarus;
	}

	/**
	 * Returns the country found by the given name or null
	 * @param name the country's name
	 * @return the country or null
	 */
	public Country findCountryByName(final String name) {
		return COUNTRIES.get(name);
	}

}
