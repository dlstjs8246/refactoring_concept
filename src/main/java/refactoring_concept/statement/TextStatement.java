package refactoring_concept.statement;

import refactoring_concept.Customer;
import refactoring_concept.Rental;

public class TextStatement extends Statement {
	@Override
	public String footerString(Customer aCustomer) {
		return String.format("누적 대여료 : %s%n적립포인트 : %s", aCustomer.getTotalCharge(),aCustomer.getTotalFrequentRenterPoints());
	}
	@Override
	public String eachRentalString(Rental aEach) {
		return String.format("\t%s\t%s%n", aEach.getMovie().getTitle(),aEach.getCharge());
	}
	@Override
	public String headerString(Customer aCustomer) {
		return String.format("%s 고객님의 대여 기록\n", aCustomer.getName());
	}
}
