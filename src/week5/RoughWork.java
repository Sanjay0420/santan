package week5;

public class RoughWork {

	public static void main(String[] args) {
		String st = "Hello iam here";
		System.out.println(st.startsWith("he"));
		System.out.println(st.endsWith("here"));
		System.out.println(st.contains("am"));
		String st1= "He";
		st1+= "llo";
		String k= "hello";
				System.out.println(st1.equalsIgnoreCase(k));
				System.out.println(st.substring(6, 9));
				Character ch = 'a';
				System.out.println(ch.compareTo('d'));
				String h= "      Hello    ";
				System.out.println(h.length());
				System.out.println(h);
				System.out.println(h.trim());
				System.out.println(h.trim().length());
				System.out.println(st.concat("hi"));
				st= st.concat("hii");
				System.out.println(st);

	}

}  
