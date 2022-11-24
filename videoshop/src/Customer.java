import java.util.*;

public class Customer {
	private String _name;
	private List<Rental> _rentals;

	public Customer(String name) {
		_name = name;
		_rentals = new ArrayList<Rental>();

	};

	public void addRental(Rental arg) {
		_rentals.add(arg);
	}

	public String getName() {
		return _name;
	};

	public String statement() {
		Iterator<Rental> rentals = _rentals.iterator();
		String result = "Rental Record for " + getName() + "\n";
		while(rentals.hasNext()) {
		     Rental each = rentals.next();
				result += "\t" + each.getMovie().getTitle() + "\t"
						+ String.valueOf(each.getCharge()) + "\n";
		}

		// add footer lines
		result += "Amount owed is " + String.valueOf(getTotalCharge()) + "\n";
		result += "You earned " + String.valueOf(getTotalFrequentRenterPoints())
				+ " frequent renter points";
		return result;
	}

	private double getTotalCharge() {
		int totalCharge = 0;
		Iterator<Rental> rentals = _rentals.iterator();
		while(rentals.hasNext()) {
		     Rental each = rentals.next();
		     totalCharge += each.getCharge();
		}
		return totalCharge;
	}

	private int getTotalFrequentRenterPoints() {
		int totalPoint = 0;
		Iterator<Rental> rentals = _rentals.iterator();
		while(rentals.hasNext()) {
		     Rental each = rentals.next();
		     totalPoint += each.getFrequentRenterPoints();
		}
		return totalPoint;
	}
}
