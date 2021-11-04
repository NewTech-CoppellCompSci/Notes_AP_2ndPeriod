package notes_Inheritance;

public class Dog extends Animal{

	private boolean rabiesShotUpToDate; //store if their rabbies vaccination is current
	
	//constructor
	public Dog(int age) {
		super(age);//call the Animal Constructor
		
		//anything else Dog needs
		
		rabiesShotUpToDate = true;
		
		
	}
	
	
	
	@Override
	public String toString() {
		if (rabiesShotUpToDate) {
			return "This dog is " + super.getAge() + " years old, and is"
					+ " up to date on their rabis shot";
		}
		return "This dog is " + super.getAge() + " years old, and is"
		+ " not up to date on their rabis shot";
	}
	
	
	
	
}
