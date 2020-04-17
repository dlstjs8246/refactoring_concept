package refactoring_concept;

import java.util.ArrayList;
import java.util.List;

import refactoring_concept.statement.HtmlStatement;
import refactoring_concept.statement.TextStatement;
import refactoring_concept.statement.XmlStatement;

public class Customer {
	private String name;
	private List<Rental> rentals = new ArrayList<>();
	public Customer(String name) {
		this.name = name;
	}
	public void addRental(Rental rental) {
		this.rentals.add(rental);
	}
	public String getName() {
		return name;
	}
	public List<Rental> getRentals() {
		return rentals;
	}
	public String statement() {
		return new TextStatement().value(this);
	}
	public String htmlStatement() {
		return new HtmlStatement().value(this);
	}
	public String xmlStatement() {
		return new XmlStatement().value(this);
	}
	public int getTotalFrequentRenterPoints() {
		int frequentRenterPoints = 0;
		for(Rental each : rentals) {
			frequentRenterPoints += each.getFrequentRenterPoints();
		}
		return frequentRenterPoints;
		
	}
	public double getTotalCharge() {
		double totalAmount = 0;
		for(Rental each : rentals) {
			totalAmount += each.getCharge();
		}
		return totalAmount;
	}
}
