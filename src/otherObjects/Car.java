package otherObjects;

/*
 * Holds information about 1 car
 */

public class Car {

	private int year;
	private String make;
	private String model;
	private int mileage;
	
	public Car(int year, String make, String model, int mileage) {
		this.year = year;
		this.make = make;
		this.model = model;
		this.mileage = mileage;
	}
	
	
	//Adds parameter to mileage
	public void addMiles(int miles) {
		this.mileage += miles;
	}
	
	
	
	//Getter Methods
	public int getYear() {
		return year;
	}
	public int getMileage() {
		return mileage;
	}
	public String getMake() {
		return make;
	}
	public String getModel() {
		return model;
	}
	
	
	
	@Override
	public String toString() {
		return String.format("%d %s %s with %,d miles", year, make, model, mileage);
	}
	
	
}
