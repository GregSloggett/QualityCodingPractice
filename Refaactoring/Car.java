
public class Car extends Vehicle{

	private String model;
	
	public Car(String model) {
		super();
		this.model = model;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return model;
	}

}
