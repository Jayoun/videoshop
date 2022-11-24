public class NewReleasePricePolicy extends PricePolicy {

    @Override
    public Movie.PriceCode getPriceCode() {
        return Movie.PriceCode.NEW_RELEASE;
    }

    @Override
    public double getCharge(int daysRented) {
        return daysRented * 3;
    }

    @Override
    public int getFrequentRenterPoints(int daysRented) {
        return (daysRented > 1) ? 2 : 1;
    }
}