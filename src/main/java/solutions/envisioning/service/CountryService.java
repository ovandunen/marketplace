package solutions.envisioning.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import solutions.envisioning.repository.Country;
import solutions.envisioning.repository.CountryRepository;

/**
 * 
 * @author ola
 * 
 * Service which returns a default country if no specific country name given
 *
 */
@RestController
public class CountryService {
	
	@Autowired
	private CountryRepository repository;
	
	@RequestMapping("/country")
	public Country product(@RequestParam(value = "name", defaultValue = "Israel") String name) {
		return repository.findCountryByName(name);
	}
}
