package notes_Inheritance;

/*
 * Holds information for 1 animal
 */

public class Animal {
	
	private int age;
	private String name;
	
	public Animal(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	
	//raise the age by 1
	public void hasBirthday() {
		this.age++;
	}
	
	
	
	public String getName() { return this.name; }
	public int getAge() {
		return age;
	}
	
	
	
	@Override
	public String toString() {
		return "This animal is " + age + " years old.";
	}
	
	
}
