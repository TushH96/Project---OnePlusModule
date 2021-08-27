package p;

public class dolly   {

	
	public static void main(String[] args) {
		
		
		// Anonymyous class
		
		
	/*	MyInterface ma = new MyInterface() {
			
			 public void show() {
				
				System.out.println("dolly");
			}
			
		};
		
		ma.show();*/
		
		
		
		MyInterface lambda = (x,y) ->{System.out.println(x+""+y);};
		
		lambda.show(20, "rasika");
		
		
	}
}
