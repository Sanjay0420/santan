package week4;

public class PassEntry {
	void propogation () {
		try {
		 a () ;
		}
		catch ( Exception e) {
			 System.out.println("Input Failed");
		}
			
	}
		void a () {
			a1 () ;
			System.out.println("Updated");
		}
		void a1 () {
			System.out.println(10/2);
			System.out.println("Checking the information");
			
		}
			
		
	

	public static void main(String[] args) {
		PassEntry p = new PassEntry () ;
		p.propogation();
		
		// TODO Auto-generated method stub

	}

}
