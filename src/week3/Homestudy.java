package week3;
abstract class Cars {
	abstract void price () ;
	void interest () {
		System.err.println("No interest rate is given ");
	}
}
class Audi extends Cars {
	void price () {
		int p = 60000 ;
		int charge = 4000;
		System.out.println("The total Price of Audi is :" + (p+charge));
	}
}

	class BMW extends Cars {
		void price() {
			int p1 = 90000 ;
			int charge = 3500;
			System.out.println("The total price of BMW is :" + (p1+charge));
		}
	}
	


public class Homestudy {

	public static void main(String[] args) {
		Cars c= new Audi () ;
		c.price();
		Cars c1= new BMW () ;
		c1.price();
		
		// TODO Auto-generated method stub

	}

}
