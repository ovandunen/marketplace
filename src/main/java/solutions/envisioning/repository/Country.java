package solutions.envisioning.repository;

import java.util.List;


/**
 * Models the country of vendor
 * @author ola
 *
 */
public class Country {
	
	private String name;
	private String brand;
	private String domain;
	private List<String>categories;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	public List<String> getCategories() {
		return categories;
	}
	public void setCategories(List<String> categories) {
		this.categories = categories;
	}

}
