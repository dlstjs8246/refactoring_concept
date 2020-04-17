package refactoring_concept.price;

import refactoring_concept.Movie;

public class NewReleasePrice extends Price {

	@Override
	public int getPriceCode() {
		return Movie.NEW_RELEASE;
	}

	@Override
	public double getCharge(int aDaysRented) {
		double result = 0;
		result += aDaysRented * 3;
		return result;
	}

	public int getFrequentRenterPoints(int aDaysRented) {
		return (aDaysRented > 1)?2:1;
	}

}
