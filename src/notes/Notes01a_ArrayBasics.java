package notes;

/*
 * Array Basics
 * 
 *   1) Traversing
 *   2) Accumulation
 *   3) Finding Min / Max Value 
 * 
 */

public class Notes01a_ArrayBasics {

	public static void main(String[] args) {
		
		double[] nums = {1.2, 3.4, 3.4, 6.0, 3.5, 3, 2, -2.9};
		
		
		/*
		 * Traversing Arrays
		 * 
		 * looping through the array
		 */

		
		//print all the elements on separate lines
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 1 == 0.5) {
				System.out.println(nums[i]);
			}
		}
		
		
		
		//sum up all the values in an array
		double sum = 0; //something to store the sum
		for (int i = 0; i < nums.length; i++) {  //traverse the array
			sum += nums[i];  //add all elements to sum
		}
		System.out.println("The sum of everything in nums = " + sum);
		
		
		//find the average of the array above
		double average = sum / nums.length;
		System.out.println("The average of nums = " + average);
		
		
		//find max 
		double max = Double.MIN_VALUE;  //value to hold max, start as small as possible
		for (int i = 0; i < nums.length; i++) {
			max = Math.max(max, nums[i]); //grabs max between current max and current element
		}
		System.out.println("The max of nums = " + max);
		
		
		
		
		
		
		
		
		
	}
	
	
}
