
public class RegularPricePolicy extends PricePolicy {
    @Override
    public Movie.PriceCode getPriceCode() {
        return Movie.PriceCode.REGULAR;
    }
    @Override
    public double getCharge(int daysRented) {
        double result = 2;
        if (daysRented > 2) {
            result += (daysRented - 2) * 1.5;
        }
        return result;
    }
}