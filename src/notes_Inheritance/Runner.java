package notes_Inheritance;

public class Runner {

	public static void main(String[] args) {
		
		
		Animal a1 = new Animal(5);
		System.out.println(a1);
		
		Dog d1 = new Dog(7);
		d1.hasBirthday();
		System.out.println(d1);
		
		
		Snake s1 = new Snake(4);
		s1.shed();
		System.out.println(s1);
		
		
		
	}
	
}
