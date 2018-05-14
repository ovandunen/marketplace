package solutions.envisioning.repository;

import java.math.BigDecimal;

/**
 * models the payment
 * @author ola
 *
 */
public class Payment {
	
	
    private String method;
    
    private BigDecimal amount;
    
    private String currency;

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}
    
    
    
    
    

}
