package week3;
 abstract class Fruits {
	abstract void Price () ; 
		
	
}
 class Apple extends Fruits {
	 void Price () {
		 int r = (100);

		 System.out.println("Price of apple is :" + r );
	 }
	 
 }
 class Orange extends Fruits {
	 void Price()  {
		 int r1 = 150 ;
	
		 System.out.println("Price of Orange is:" + r1 );
		 
		 
	 }
 }

public class Abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Fruits f= new Apple ();
f.Price();
Fruits f1 = new Orange ();
f1.Price();

	}

}
