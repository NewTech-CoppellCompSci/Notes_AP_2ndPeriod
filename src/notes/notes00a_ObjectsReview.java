package notes;

/*
 * This is a blueprint for a single instance
 * 
 * We'll use a water bottle for this one.
 * 
 * 
 */
public class notes00a_ObjectsReview {

	//instance variables / parameters
	private String color;  //the color of the bottle
	private double volume;  //how much water it holds in ounces
	private String lidType;  //stores the type of lid this bottle has
	
	
	//Constructors build the object in memory and initialize variables
	public notes00a_ObjectsReview(String color, double volume, String lidType) {
		this.color = color;
		this.volume = volume;
		this.lidType = lidType;
	}
	
	
	//sets the objects color to the parameter
	public void setColor(String color) {
		this.color = color; 
	}
	
	
	//returns the objects volume
	public double getVolume() {
		return this.volume;  
	}
	
	
	
}
