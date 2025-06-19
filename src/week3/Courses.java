package week3;

import java.util.Arrays;

enum Course_selection  {
	IAS,
	IPS,
	IFS
}


public class Courses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Course_selection c = Course_selection.valueOf("IAS");
System.out.println( "I need the " +c+ " Course");
System.out.println("The total Courses Available :" + Arrays.toString(Course_selection.values()\));
	}

}
