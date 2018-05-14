package solutions.envisioning.repository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class PaymentRepository {
	
	
	private static final Map<String,List<Payment>> PAYMENTS_PER_COUMTRY = new HashMap<>();
	
	static  {
		
		PAYMENTS_PER_COUMTRY.put("Israel", paymentForIsrael());
		PAYMENTS_PER_COUMTRY.put("Spain", paymentForSpain());
		PAYMENTS_PER_COUMTRY.put("Belarus", paymentForBelarus());
	}

	private static List<Payment> paymentForIsrael() {
		final List<Payment>  payments = new ArrayList<>();
		
		final Payment cash = new Payment();
		cash.setAmount(BigDecimal.ZERO);
		cash.setMethod("Cash");
		// TODO find out currency 
		payments.add(cash);
		
		final Payment awesome = new Payment();
		awesome.setAmount(new BigDecimal(50));
		awesome.setMethod("AwesomePay");
		awesome.setCurrency("cents"); //TODO shouldn't be EURO?
		payments.add(awesome);
		
		final Payment paypal= new Payment();
		paypal.setAmount(new BigDecimal(20));
		paypal.setMethod("Paypal");
		paypal.setCurrency("EUR");
		payments.add(paypal);
		
		return payments;
	}
	
	private static List<Payment> paymentForSpain() {
		
		final List<Payment>  payments = new ArrayList<>();
		
		final Payment cash = new Payment();
		cash.setAmount(BigDecimal.ZERO);
		cash.setMethod("Cash");
		// TODO find out currency
		payments.add(cash);
		
		final Payment awesome = new Payment();
		awesome.setAmount(new BigDecimal(50));
		awesome.setMethod("AwesomePay");
		awesome.setCurrency("EUR");
		payments.add(awesome);
		
		final Payment paypal= new Payment();
		paypal.setAmount(new BigDecimal(20));
		paypal.setMethod("Paypal");
		paypal.setCurrency("cents");  //TODO shouldn't be EURO?
		payments.add(paypal);
		
		return payments;
	}
	
	private static List<Payment> paymentForBelarus() {
		
		final List<Payment>  payments = new ArrayList<>();
		
		final Payment cash = new Payment();
		cash.setAmount(BigDecimal.ZERO);
		cash.setMethod("Cash");
		// TODO find out which currency?
		payments.add(cash);
		
		final Payment paypal= new Payment();
		paypal.setAmount(BigDecimal.ZERO);
		paypal.setMethod("Paypal");
		// TODO find out which currency?
		payments.add(paypal);
		
		return payments;
	}
	
	/**
	 * Returns the payments  which are specific to the given country or null i
	 * @param country the name of the country
	 * @return a list of payments or an empty list
	 */
	public List<Payment> findPaymentsPerCounry(final String country) {
		
		final List<Payment>payments;
		
		if(!PAYMENTS_PER_COUMTRY.containsKey(country)) {
			payments = Collections.emptyList();
		}else {
			payments =  PAYMENTS_PER_COUMTRY.get(country);
		}
		return payments;
	}

}
