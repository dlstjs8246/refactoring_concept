package refactoring_concept.statement;

import refactoring_concept.Customer;
import refactoring_concept.Rental;

public class XmlStatement extends Statement {

	@Override
	public String headerString(Customer aCustomer) {
		return String.format("<movieHeader>%s 고객님의 대여 기록</movieHeader>%n<movieMain>%n", aCustomer.getName());
	}

	@Override
	public String eachRentalString(Rental aEach) {
		return String.format("<Rental>%s : %s</Rental>%n", aEach.getMovie().getTitle(),aEach.getCharge());
	}

	@Override
	public String footerString(Customer aCustomer) {
		return String.format("</movieMain>%n<movieFooter> 누적 대여료 : %s, 적립 포인트 : %s</movieFooter>",aCustomer.getTotalCharge(),aCustomer.getTotalFrequentRenterPoints());
	}

}
