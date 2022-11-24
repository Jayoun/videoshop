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
		String result = addHeader();		
		result += addBody(rentals);
		result += addFooter();
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
	
	private String addHeader() {
		return "Rental Record for " + getName() + "\n";
	}
	private String addBody(Iterator<Rental> rentals) {
		 String result ="";
		while(rentals.hasNext()) {
			Rental each = rentals.next();
			result += "\t" + each.getMovie().getTitle() + 
					  "\t" + String.valueOf(each.getCharge()) + "\n";
		}
		return result;
	}
	private String addFooter() {
		return "Amount owed is " + String.valueOf(getTotalCharge()) + "\n"
		       + "You earned " + String.valueOf(getTotalFrequentRenterPoints())
			   + " frequent renter points";
	}

}
