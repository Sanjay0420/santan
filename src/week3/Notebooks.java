package week3;

import java.util.Arrays;

enum Authors {
	SANJAY,
	MANOJ,
	SIVA,
	TANU
}


public class Notebooks {

	public static void main(String[] args) {

		
		// TODO Auto-generated method stub
System.out.println("The Total Author Names" + Arrays.toString(Authors.values()));
		Authors a= Authors.valueOf("TANU");
		System.out.println("The Famous Author is :" + a );
	}

}
