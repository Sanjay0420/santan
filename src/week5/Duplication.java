package week5;

public class Duplication {
	static String st = ("hello java code");
	String substring (int start,int end) {
		return "" ;
	}
	


	public static void main(String[] args) {
		for (int i = 0; i < st.length(); i++) {
			if (st.indexOf(st.charAt(i))!=st.lastIndexOf(st.charAt(i))) {
			System.out.println("The First Duplication is :" +st.charAt(i));
			break;
			}
		}
		
}
}