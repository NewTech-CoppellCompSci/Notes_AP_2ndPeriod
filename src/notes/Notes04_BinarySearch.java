package notes;

import java.util.Scanner;

import jdk.internal.misc.FileSystemOption;

/*
 * Basic Binary Search Algorithm
 */

public class Notes04_BinarySearch {

	public static void main(String[] args) {
		
		/*
		 * you need 4 variables
		 * 
		 * 1) what your looking for
		 * 2) track the high end
		 * 3) track the low end
		 * 4) calculate average of current low and high
		 * 
		 * Your done either when you find it
		 *   or the low end is above the high.
		 * 
		 * 
		 */
		
		
		int[] nums = new int[1000];
		
		for (int i = 0; i < nums.length; i++) {
			nums[i] = 2 * i + 1000;
		}
		
		Scanner inKey = new Scanner(System.in);
		System.out.print("Enter a number from 1000 to 3000 ");
		int key = inKey.nextInt();
		
		int low = 0;       //stores the current bottom index
		int high = nums.length;   //stores the current top index
		int mid = 0;	//stores the current average of high and low indexes
		int answerIndex = 0;
		int count = 0;
		while (true) {
			count++;
			mid = (low + high) / 2;
			
			//1, 2, 3, 4, 5, 6, 7, 8, 9
			System.out.println("Cycle #" + count);
			System.out.println("   mid Value = " + nums[mid]);
			System.out.println("   low = " + low);
			System.out.println("   mid = " + mid);
			System.out.println("   high= " + high);
			
			
			if (nums[mid] == key) {  //we found it
				answerIndex = mid;
				System.out.println("Found it!");
				break;
			}
			else if (low > high) {
				System.out.println("Does not exist");
				break;
			}
			else if (nums[mid] > key) {
				high = mid - 1;
				System.out.println("   new high= " + high);
			}
			else if (nums[mid] < key) {
				low = mid + 1;
				System.out.println("   new low= " + low);
			}
			
			System.out.println();
			
		}
		
		
		System.out.println("Answer Index: " + answerIndex);
		System.out.println("Key:          " + nums[answerIndex]);
		
		
		
		
		
		
	}
	
	
	
	
	
}
