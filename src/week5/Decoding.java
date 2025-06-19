package week5;

public class Decoding {


	public static void main(String[] args) {
		String s = "   sfg34#4    ";
		int l=0,d=0,s1=0,w=0;
		for (int i = 0; i <s.length(); i++) {
			char c1= s.charAt(i);
			if (Character.isLetter(c1)) {
			l++;
			} else if (Character.isDigit(c1)) {
				d++;
			}else if (Character.isWhitespace(c1)) {
				w++;
			} else {
				s1++;
			}
		
			}	
		System.out.println("Letter is :" +l);
			System.out.println("Digit is :" +d);
			System.err.println("Symbol is :" +s1);
				System.out.println("Space is :"+w);
		
		
		// TODO Auto-generated method stub

	}
	}


