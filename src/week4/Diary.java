package week4;
import java.io.BufferedWriter;
import java.io.FileWriter;
public class Diary {

	public static void main(String[] args) {
		try {
		FileWriter fw = new FileWriter ("Diary.txt",true);
		BufferedWriter bw = new BufferedWriter (fw);
		bw.write("Today");
		bw.newLine ();
		bw.write("MAY 31");
		bw.close ();
		System.out.println("Updated");
		}
		catch(Exception e) {
			System.out.println("Something went wrong");
		}
		

	}

}
