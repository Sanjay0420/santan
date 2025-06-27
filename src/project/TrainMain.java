package project;
import java.util.ArrayList;
import java.util.*;
import java.time.LocalDateTime;

public class TrainMain {
	static int AvailTicket = 3, upper=1, middle = 1, lower =1 ,wllist=0;
	static int PId=1;
	 static List <Passenger> BkdPassengers= new ArrayList <Passenger> ();
	 static List <Passenger> WlPassengers= new ArrayList <Passenger> ();
	 
	 public static void main(String [] args) {
		 System.out.println("Welcome to the Booking Platform");
		 Scanner s= new Scanner (System.in);
		 String isContinue = "Y";
		 while(isContinue.equalsIgnoreCase("Y")){
		 System.out.println("1.Book Ticket\n2.Cancel Ticket\n3.View Status\n4.Waiting List Status");
		 System.out.println("Enter your Choice");
		 int Choice = s.nextInt();
		 
		 switch (Choice) {
		 case 1 :
		 System.out.println("Enter your Name");
		 s.next();
		 String PassengerName = s.nextLine();
		 System.out.println("Preffered Berth"+Arrays.toString(Berth.values()));
		 String PrefBerth = s.nextLine();
		 Berth berth = Berth.valueOf(PrefBerth);
		 Passenger p= new Passenger () ;
		 p.setPId(PId);
		 p.setPassengerName(PassengerName);
		 p.setPrefBerth(berth);
		 booktickets(p);
		 break;
		 case 2 :
		 case 3 :
		 case 4 :
			 default :
				 System.out.println("Sorry The Ticket Slots Filled");
		 }
		 System.out.println("Do You Want to Continue Y/N");
		 }
		 
	 }
	 static void AllocatedBerth(Passenger p) {
		 switch (p.getPrefBerth()) {
		 case UPPER :
			 if(upper>0) {
				 p.setAllocatedBerth(Berth.UPPER);
				 BkdPassengers.add(p);
				 AvailTicket --;
				 upper --;
			 }else if (middle >0) {
				 p.setAllocatedBerth(Berth.MIDDLE);
				 BkdPassengers.add(p);
				 AvailTicket--;
				 middle --;
				 
			 }else {
				 p.setAllocatedBerth(Berth.LOWER);
				 BkdPassengers.add(p);
				 AvailTicket--;
				 lower--;
				
				 
			 }
		 case MIDDLE:
			 if (middle>0) {
				 p.setAllocatedBerth(Berth.MIDDLE);
				 BkdPassengers.add(p);
				 AvailTicket--;
				 middle --;
			 }else if (lower>0) {
				 p.setAllocatedBerth(Berth.LOWER);
				 BkdPassengers.add(p);
				 AvailTicket--;
				 lower--;
			 }else {
				 p.setAllocatedBerth(Berth.UPPER);
				 BkdPassengers.add(p);
				 AvailTicket--;
				 upper--;
				 
			 }
		 case LOWER:
			 if (lower>0) {
				 p.setAllocatedBerth(Berth.LOWER);
				 BkdPassengers.add(p);
				 AvailTicket--;
				 lower--;
			 }else if (upper >0) {
				 p.setAllocatedBerth(Berth.UPPER);
				 BkdPassengers.add(p);
				 AvailTicket--;
				 upper--;
			 }else {
				 p.setAllocatedBerth(Berth.MIDDLE);
				 BkdPassengers.add(p);
				 AvailTicket--;
				 middle--;
				 
			 }
			
		 }
		 
	 }

	private static void booktickets(Passenger p) {
	if (AvailTicket >1){
		if (p.getPrefBerth().equals("UPPER") && upper >0 ) {
			p.setAllocatedBerth(Berth.UPPER);
			BkdPassengers.add(p);
			
			AvailTicket --;
		upper --;
		}
		
	}else if (wllist <3 ) {
		WlPassengers.add(p);
		wllist++;
	}else {
		System.out.println("The Booking Slots Over");
	}
	}


}
