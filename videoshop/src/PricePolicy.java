public abstract class PricePolicy {
    public abstract Movie.PriceCode getPriceCode();
    public abstract double getCharge(int _daysRented);
    public int getFrequentRenterPoints(int _daysRented) {
        return 1;
    }
}