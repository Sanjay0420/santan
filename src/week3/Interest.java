package week3;
//parent class
class RBI {
	int interestrsate = 8;
	int amount = 5000;
	void calcint () {
		System.out.println("not defined");
	}
}
class HDFC extends RBI {
	int amount = 6000;
	void calcint () {
		System.out.println("the interest is :"+ super.interestrsate * amount);
	}
}
class SBI extends RBI {
	int interestrate=3;
	int amount = 4000 ;
	void calcint () {
	    System.out.println("SBI interest is :" + interestrate * amount);
	    

	}
}
public class Interest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
RBI r = new HDFC () ;
r.calcint();
RBI r2= new SBI () ;
r2.calcint();
	}

}
