package project;
import java.time.LocalDate;
import java.time.LocalDateTime;

enum Berth{
	UPPER,
	MIDDLE,
	LOWER
	
}

public class Passenger {
	private int PId;
	private String PassengerName ;
	private Berth PrefBerth;
	private Berth AllocatedBerth;
	private LocalDateTime bkdDt;

	public int getPId() {
		return PId;
	}

	public void setPId(int pId) {
		PId = PId;
	}

	public String getPassengerName() {
		return PassengerName;
	}

	public void setPassengerName(String passengerName) {
		PassengerName = passengerName;
	}

	public Berth getPrefBerth() {
		return PrefBerth;
	}

	public void setPrefBerth(Berth prefBerth) {
		PrefBerth = prefBerth;
	}

	public Berth getAllocatedBerth() {
		return AllocatedBerth;
	}

	public void setAllocatedBerth(Berth allocatedBerth) {
		AllocatedBerth = allocatedBerth;
	}

	public LocalDateTime getBkdDt() {
		return bkdDt;
	}

	public void setBkdDt(LocalDateTime bkdDt) {
		this.bkdDt = bkdDt;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
