package notes_Inheritance;

public class Dog extends Animal{

	private boolean rabiesShotUpToDate; //store if their rabbies vaccination is current
	
	//constructor
	public Dog(int age, String name) {
		super(age, name);//call the Animal Constructor
		
		//anything else Dog needs
		
		rabiesShotUpToDate = true;
		
		
	}
	
	@Override
	public boolean equals(Object obj) {
		
		//type cast obj to a Dog
		Dog other = (Dog) obj;
		
		
		//compare whatever parameters you want
		if (super.getName().equals(other.getName()) 
			&& super.getAge() == other.getAge()) {
			return true;
		}
		
		return false;
	}
	
	
	
	@Override
	public String toString() {
		if (rabiesShotUpToDate) {
			return "This dog is " + super.getAge() + " years old, and is"
					+ " up to date on their rabis shot"
					+ "Their name is " + super.getName();
		}
		return "This dog is " + super.getAge() + " years old, and is"
		+ " not up to date on their rabis shot"
		+ "Their name is " + super.getName();
	}
	
	
	
	
}
