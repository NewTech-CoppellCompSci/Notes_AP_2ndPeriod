package notes_Inheritance;

/*
 * Holds information for 1 animal
 */

public class Animal {
	
	private int age;
	
	public Animal(int age) {
		this.age = age;
	}
	
	
	//raise the age by 1
	public void hasBirthday() {
		this.age++;
	}
	
	
	
	
	public int getAge() {
		return age;
	}
	
	
	
	@Override
	public String toString() {
		return "This animal is " + age + " years old.";
	}
	
	
}
