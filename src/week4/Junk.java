package week4;

public class Junk {
	public void finalize () {
		System.out.println("Storage Overloaded");
		
	}

	public static void main(String[] args) {
		for (int a =0 ; a<1000000000 ; a++) {
			
		
		Junk j = new Junk () ;
		}
	
		// TODO Auto-generated method stub

	}

}
