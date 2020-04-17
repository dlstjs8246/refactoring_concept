package refactoring_concept.price;

public abstract class Price {
	public abstract int getPriceCode();
	public abstract double getCharge(int aDaysRented);
	public int getFrequentRenterPoints(int aDaysRented) {
		return 1;
	}
}
