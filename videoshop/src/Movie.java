
public class Movie {

    public enum PriceCode {
        REGULAR,
        NEW_RELEASE,
        CHILDRENS
    }

    private String title;

    private PricePolicy price;

    public Movie(String title, PriceCode priceCode) {
        this.title = title;
        setPriceCode(priceCode);
    }

    public String getTitle() {
        return title;
    }

    public PriceCode getPriceCode() {
        return price.getPriceCode();
    }

    public void setPriceCode(PriceCode arg) {
        switch (arg) {
            case REGULAR:
                price = new RegularPricePolicy();
                break;
            case CHILDRENS:
                price = new ChildrensPricePolicy();
                break;

            case NEW_RELEASE:
                price = new NewReleasePricePolicy();
                break;

            default:
                throw new IllegalArgumentException("Wrong Price code");
        }
    }

    public double getCharge(int daysRented) {
        return price.getCharge(daysRented);
    }

    public int getFrequentRenterPoints(int daysRented) {
    	return  price.getFrequentRenterPoints(daysRented);
    }
}