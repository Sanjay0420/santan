package week3;
class Animals {
	void sound () {
		System.out.println("not defined specifically");
		
	}
}
class Cat extends Animals {
	void sound () {
		System.out.println("meow");
	}
}
class Peacock extends Animals {
	void sound () {
		System.out.println("scream");
	}
}
public class Day2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Animals c = new Cat () ;
c.sound () ;
Animals c1 = new Peacock () ;
c1.sound () ;
	}

}
