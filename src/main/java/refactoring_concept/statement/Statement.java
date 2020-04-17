package refactoring_concept.statement;

import refactoring_concept.Customer;
import refactoring_concept.Rental;

public abstract class Statement {
	public String value(Customer aCustomer) {
		StringBuilder result = new StringBuilder(headerString(aCustomer));
		for(Rental each : aCustomer.getRentals()) {
			result.append(eachRentalString(each));
		}
		result.append(footerString(aCustomer));
		
		return result.toString();
	}
	public abstract String headerString(Customer aCustomer);
	public abstract String eachRentalString(Rental aEach);
	public abstract String footerString(Customer aCustomer);
}
