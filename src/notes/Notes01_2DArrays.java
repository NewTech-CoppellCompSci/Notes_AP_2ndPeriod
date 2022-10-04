package notes;

/*
 * Notes on 2D Arrays
 * 
 * Remember
 * 
 * 2D arrays are NOT checker boards.  You can think
 * of them like that, but they're really and array
 * in another array.
 * 
 * 
 */

public class Notes01_2DArrays {

	public static void main(String[] args) {
		
		//declare arrays
		int[] nums = new int[5]; //1D array with 5 elements
		int[][] nums2 = new int[5][7];  //2D array with 5 rows and 7 columns
		int[][][] nums3 = new int[5][7][9];  //3D array with 5 rows 7 columns and 9 deep
		
		
		//loop through arrays
		
		//1D
		for (int i = 0; i < nums.length; i++) {
			nums[i] = i;
			
			System.out.print(nums[i] + " ");
		}
		System.out.println("\n");
		
		
		//2D
		for (int i = 0; i < nums2.length; i++) {
			for (int j = 0; j < nums2[i].length; j++) {
				
				nums2[i][j] = i+j;
				
				System.out.print(nums2[i][j] + " ");
				
			}
			System.out.println();
		}
		System.out.println();
		
		
	}
	
	
	
}
