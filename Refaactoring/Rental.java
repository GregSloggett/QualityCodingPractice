
// Represents a rental of a vehicle
public class Rental {

	public Rental(Vehicle vehicle, int daysRented) {
		_vehicle = vehicle;
		_daysRented = daysRented;
	}

	public int getDaysRented() {
		return _daysRented;
	}

	public Vehicle getVehicle() {
		return _vehicle;
	}

	public double rentalCost() {
		double rentAmount = 0;

		// determine amounts for each line
		switch (_vehicle.getTitle()) {
		case "Peugeot 207":
			rentAmount += 2;
			if (_daysRented > 2)
				rentAmount += (_daysRented - 2) * 1.5;
			break;
		case "Landrover Freelander":
			rentAmount += _daysRented * 3;
			break;
		case "Honda 50":
			rentAmount += 1.5;
			if (_daysRented > 3)
				rentAmount += (_daysRented - 3) * 1.5;
			break;
		}
		
		return rentAmount;
	}

	public int frequentRenterPoints() {
		int frequentRenterPoints = 0;
		
		// add frequent renter points
		frequentRenterPoints++;
		// add bonus for a two day all terrain rental
		if ((_vehicle.getTitle() == "Landrover Freelander") && _daysRented > 1)
			frequentRenterPoints++;
		
		return frequentRenterPoints;
	}


	private Vehicle _vehicle;
	private int _daysRented;
}