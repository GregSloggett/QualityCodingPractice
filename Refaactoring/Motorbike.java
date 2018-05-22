
public class Motorbike extends Vehicle{

	private String model;
	
	public Motorbike(String model) {
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
