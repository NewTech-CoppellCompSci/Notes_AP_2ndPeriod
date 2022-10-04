package notes;

/*
 * Recursive Methods
 * 
 * Methods that call themselves
 * 
 * 2 parts
 *  - Base Case
 *  - Any other case, this one calls itself
 * 
 */

public class Notes03_Recursive_Methods {

	public static void main(String[] args) {
		
		System.out.println(addNums(10));
		System.out.println(addNums(45));
		System.out.println(factorial(5));
		System.out.println(factorial(31));
		System.out.println(fibonacci(4));
		System.out.println(fibonacci(8));
		System.out.println(hasY("asdfghj"));
		System.out.println(hasY("yellow"));
		System.out.println(hasY("happy"));
		System.out.println(hasY("asdYYfghj"));
		System.out.println(hasY("asdYfgyhj"));
		
	}
	
	
	
	/*
	 * Adds all numbers <= num
	 */
	public static int addNums(int num) {
		
		//base case
		if (num == 1) {
			return 1;
		}
		//all others
		else {
			return num + addNums(num - 1);
		}
		
		
	}
	
	
	/*
	 * Factorial
	 */
	public static int factorial(int num) {
		
		if (num == 1) { //base case
			return 1;
		}
		else {
			return num * factorial(num - 1);
		}
		
	}
	
	
	/*
	 * fibonacci sequence
	 * num = the nth term
	 * 
	 * 1 2 3 4 5 6 7  8  9  10
	 * 1 1 2 3 5 8 13 21 34 55
	 */
	public static int fibonacci(int num) {
		
		//base cases
		if (num == 1) {
			return 1;
		}
		else if (num == 2) {
			return 1;
		}
		//everything else
		else {
			return fibonacci(num - 1) + fibonacci(num - 2); 
		}
		
		
		
	}
	
	
	/*
	 * hasY
	 * return true if string has a y
	 * 
	 * asdfghj
	 */
	public static boolean hasY(String str) {
		
		if (str.length() == 0) {  //base case (more catching trips)
			return false;
		}
		else if (str.length() == 1) {  //base case
			if (str.equalsIgnoreCase("y")) {
				return true;
			}
			else {
				return false;
			}
		}
		//everything else
		else {
			//check first letter for a y
			if (str.toLowerCase().charAt(0) == 'y') {
				return true;
			}
			else {
				return hasY(str.substring(1));
			}
				
				
			
		}
		
		
	}
	
	
	
	
	
	
	
	
}
