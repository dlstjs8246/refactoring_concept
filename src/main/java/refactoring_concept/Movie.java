package refactoring_concept;

import refactoring_concept.price.ChildrenPrice;
import refactoring_concept.price.NewReleasePrice;
import refactoring_concept.price.Price;
import refactoring_concept.price.RegularPrice;

public class Movie {
	public static final int REGULAR = 0;
	public static final int NEW_RELEASE = 1;
	public static final int CHILDENS = 2;
	private String title;
	private int priceCode;
	private Price price;
	public Movie(String title, int priceCode) {
		this.title = title;
		setPriceCode(priceCode);
	}
	public int getPriceCode() {
		return priceCode;
	}
	public void setPriceCode(int aPriceCode) {
		switch(aPriceCode) {
		case REGULAR : price = new RegularPrice(); break;
		case CHILDENS : price = new ChildrenPrice(); break;
		case NEW_RELEASE : price = new NewReleasePrice(); break;
		default : throw new IllegalArgumentException("가격 코드가 잘못 됐습니다");
		}
	}
	public double getCharge(int aDaysRented) {
		return price.getCharge(aDaysRented);
	}
	public String getTitle() {
		return title;
	}
	public int getFrequentRenterPoints(int aDaysRented) {
		return price.getFrequentRenterPoints(aDaysRented);
	}
	
}
