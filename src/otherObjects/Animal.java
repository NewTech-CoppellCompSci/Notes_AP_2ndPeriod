package otherObjects;

/*
 * Holds information for 1 animal
 */

public class Animal {

	private String type;
	private int age;
	
	public Animal(String type, int age) {
		this.type = type;
		this.age = age;
	}
	
	
	//raise the age by 1
	public void hasBirthday() {
		this.age++;
	}
	
	
	
	//Getter Methods
	public String getType() {
		return type;
	}
	public int getAge() {
		return age;
	}
	
	
	
	@Override
	public String toString() {
		return String.format("A %d year old %s", age, type);
	}
	
	
}
