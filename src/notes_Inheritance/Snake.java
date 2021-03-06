package notes_Inheritance;

public class Snake extends Animal {

	private int numTimesShed; //how many times the snake has shed
	
	public Snake(int age, String name) {
		super(age, name); //call Animal Contructor
		
		numTimesShed = 0;
		
	}
	
	public void shed() {
		numTimesShed++;
	}
	
	
	
	@Override
	public String toString() {
		return "This snake is " + super.getAge() + " years old and "
				+ "has shed " + numTimesShed + " time(s)."
				+ "Their name is " + super.getName();
	}
	
	
	
	
	
	
}
