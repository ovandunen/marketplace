package solutions.envisioning.service;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import solutions.envisioning.repository.Payment;
import solutions.envisioning.repository.PaymentRepository;

/**
 * 
 * Service which return the payment type implemented by the vendor in the given country
 */
@RestController
public class PaymentService {

	@Autowired
	private PaymentRepository repository;
	
	@RequestMapping("/payment")
	public List<Payment> getPossiblePayments(@RequestParam(value = "country")String country) {
		
		final List<Payment> payments;
		if(country==null|| country.trim().isEmpty()) {
			payments = Collections.emptyList();
		} else {
			payments = repository.findPaymentsPerCounry(country);
		}
		return payments;
		
	}
	
}
