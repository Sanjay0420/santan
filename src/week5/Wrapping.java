package week5;

public class Wrapping {
	static Integer n=15 ;
	static Character c= '4' ;

	public static void main(String[] args) {
		
	System.out.println(n.doubleValue());
	System.out.println(n.equals(15));
	System.out.println(n.compareTo(15));
	System.out.println(Integer.MIN_VALUE);
	System.out.println(Integer.compare(35, 15));
	System.out.println(Character.isLowerCase(c));
	System.out.println(Character.isLetterOrDigit(c));
	System.out.println(Character.isWhitespace(c));

	}

}
