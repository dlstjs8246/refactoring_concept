package refactoring_concept.statement;

import refactoring_concept.Customer;
import refactoring_concept.Rental;

public class HtmlStatement extends Statement {
	@Override
	public String footerString(Customer aCustomer) {
		return String.format("<p>누적 대여료 : <EM>%s</EM>%n<p>적립포인트 : <EM> &s</EM><P>", aCustomer.getTotalCharge(),aCustomer.getTotalFrequentRenterPoints());
	}
	@Override
	public String eachRentalString(Rental aEach) {
		return String.format("%s : %s<br>%n", aEach.getMovie().getTitle(),aEach.getCharge());
	}
	@Override
	public String headerString(Customer aCustomer) {
		return String.format("<H1><EM>%s 고객님의 대여 기록 </EM></H1><P>%n", aCustomer.getName());
	}
}
