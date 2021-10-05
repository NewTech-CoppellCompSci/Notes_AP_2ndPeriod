package notes;

import otherObjects.*;
import java.util.ArrayList;

/*
 * Notes ArrayLists
 * 
 * What are they?
 * Changeable Arrays that ONLY hold objects (NO Data Types)
 * 
 * 
 * 
 */


public class Notes02_ArrayLists {

	
	public static void main(String[] args) {
		
		//Pre-Created Objects used in the notes
		Animal animal1 = new Animal("bengal tiger", 5);
		Animal animal2 = new Animal("brown bear", 9);
		Animal animal3 = new Animal("panda", 8);
		Car car1 = new Car(2015, "Honda", "Accord", 85034);
		Car car2 = new Car(2020, "Dodge", "Viper", 10345);
		
	
		
		/*
		 * Declaring ArrayLists
		 * 
		 */
		ArrayList<Animal> animals = new ArrayList<Animal>();
		ArrayList<Car> cars = new ArrayList<Car>();
		
		
		
		
		
		/*
		 * Adding Elements
		 * 
		 * .add(<object>) = adds to the end of the list
		 * .add(<index>, <object>) = adds at that index and moves everything down
		 */
		animals.add(animal1);
		animals.add(animal2);
		animals.add(0, animal3);
		
		
		
		/*
		 * Printing their toString() method
		 * 
		 * just print the object itself.
		 * You don't need to add .toString()
		 */
		System.out.println(animals.get(0));
		
		
		
		/*
		 * How Many are in the List?
		 * 
		 * .size() = is the number of elemnts in the list
		 */
		System.out.println("There ar " + animals.size() + " animals on the list");
		
		
		/*
		 * Accessing Elements (and their methods)
		 * 
		 * 
		 */
		//get the panda's birthday method
		animals.get(0).hasBirthday();
		
		
		
		/*
		 * Removing Elements
		 * 
		 * .remove(<index>) = removes the element at that index and moves the list up
		 * .remove(<object>) = removes the FIRST instance of this object and moves the list up
		 */
		//removes index 1
		animals.remove(1);
		//finds the panda and removes it
		animals.remove(animal3);
		
		
		
		/*
		 * Anonymous Objects
		 * 
		 * Objects that don't have a variable reference.
		 * They are solely on a list.
		 * 
		 */
		//add a buffalo to the end of the list
		animals.add(new Animal("buffalo", 15));
		
		//put a snake at index 1
		animals.add(1, new Animal("snake", 3));
		
		
		
		/*
		 * Iterating Through ArrayLists (loops)
		 */
		System.out.println();
		for (int i = 0; i < animals.size(); i++) {
			System.out.println(animals.get(i));
		}
		
		System.out.println();
		//For Each loop
		//DO NOT use these loops to change the list.
		//you can change individual element properties, but not the list
		for (Animal a : animals) {
			System.out.println(a);
		}
		
		
		
		
		
		/*
		 * Passed By Value vs Passed By Reference
		 * 
		 * 
		 * 
		 * Items Passed by Value: Primitive data types = int, double, boolean, Strings
		 *    The actual VALUE is stored in the variable
		 * 
		 * Items Passed by Reference: All other objects
		 *    A reference to where the data is stored in memory is stored and passed
		 *    
		 *    
		 */
		
		cars.add(car1);
		cars.add(car1);
		
		System.out.println();
		for (Car c : cars) {
			System.out.println(c);
		}
		
		car1.addMiles(5000);
		System.out.println();
		for (Car c : cars) {
			System.out.println(c);
		}
		
		
		cars.get(0).addMiles(7000000);
		System.out.println();
		for (Car c : cars) {
			System.out.println(c);
		}
		
		
		
	}
	
}
