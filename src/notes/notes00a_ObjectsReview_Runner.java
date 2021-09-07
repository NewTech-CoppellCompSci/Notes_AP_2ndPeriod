package notes;

public class notes00a_ObjectsReview_Runner {

	public static void main(String[] args) {
		
		//create new object
		notes00a_ObjectsReview wb1 = new notes00a_ObjectsReview("silver", 3, "wide");
		notes00a_ObjectsReview wb2 = new notes00a_ObjectsReview("green", 0, "straw");
		
		
		//show how getter method worked
		System.out.println(wb1.getVolume());
		
		//change color to red
		wb1.setColor("red");
		System.out.println(wb1.getColor());
		
		
		
	}
	
	
	
}
