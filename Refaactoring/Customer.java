import java.util.ArrayList;
import java.util.List;

public class Customer {

	public Customer(String name) {
		_name = name;
	}

	public void addRental(Rental arg) {
		_rentals.add(arg);
	}

	public String getName() {
		return _name;
	}

	public String statement() {
		double totalRentalAmount = 0;
		int frequentRenterPoints = 0;
		String result = "Rental Record for " + getName() + "\n";

		for (Rental currentRental: _rentals) {

			frequentRenterPoints += currentRental.frequentRenterPoints();

			// show figures for this rental
			result += "\t" + currentRental.getVehicle().getTitle() + "\t" + String.valueOf(currentRental.rentalCost()) + "\n";
			totalRentalAmount += currentRental.rentalCost();
		}

		// add footer lines
		result += "Amount owed is " + String.valueOf(totalRentalAmount) + "\n";
		result += "You earned " + String.valueOf(frequentRenterPoints) + " frequent renter points";

		return result;
	}

	private String _name;
	private List<Rental> _rentals = new ArrayList<Rental>();
}
