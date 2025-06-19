package week3;
interface Bike {
	void Price () ;
	int interest = 4000 ;
}
class Honda implements Bike {
	public void Price () {
		int Amount = 50000 ;
		
		System.out.println("the price of Honda is :" +(Amount+interest));
	}
	}
	class Hero implements Bike {
		public void Price () {
			int Amount = 70000 ;
			System.out.println("The Price of Hero is :" + (Amount+interest));
		}
	}
		
	


public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Bike b = new Honda () ;
       b.Price();
       Bike c2= new Hero () ;
       c2.Price() ;
       }

}
