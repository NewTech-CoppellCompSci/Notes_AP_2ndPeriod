package notes_Inheritance;

public class Runner {

	public static void main(String[] args) {
		
		
		Animal a1 = new Animal(5, "Fred");
		System.out.println(a1);
		
		Dog d1 = new Dog(7, "Butch");
		d1.hasBirthday();
		System.out.println(d1);
		Dog d2 = new Dog(10, "Butch");
		Dog d4 = new Dog(8, "Butch");
		
		
		Snake s1 = new Snake(4, "Slimy");
		s1.shed();
		System.out.println(s1);
		
		
		
		System.out.println("\n\nEquals Testing");
		
		System.out.println(d1.equals(d2));
		System.out.println(d1.equals(d4));
		
	}
	
}
