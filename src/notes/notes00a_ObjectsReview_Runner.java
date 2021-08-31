package notes;

public class notes00a_ObjectsReview_Runner {

	public static void main(String[] args) {
		
		//create new object
		notes00a_ObjectsReview wb1 = new notes00a_ObjectsReview("silver", 3, "wide");
		
		//show how getter method worked
		System.out.println(wb1.getVolume());
		
		//change color to red
		wb1.setColor("red");
		
		
		
	}
	
	
	
}
