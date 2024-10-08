import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Booking {
 String name;
 int flightno;
 Date date;
  Booking(){
	    Scanner scanner = new Scanner(System.in);
		System.out.println("Enter name of passenger: ");
		name = scanner.next();
		System.out.println("Enter flight no: ");
		flightno = scanner.nextInt();
		System.out.println("Enter date dd-mm-yyyy");
		String dateInput = scanner.next();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		
		try {
			date = dateFormat.parse(dateInput);
		} catch (ParseException e) {
			
			e.printStackTrace();
		}
  }
  public boolean isAvailable(ArrayList<Flight> flights,ArrayList<Booking> bookings) {
	  int capacity=0;
	  for(Flight f:flights) {
		  capacity=f.getCapacity();
	  }
	  int booked=0;
	  for(Booking b:bookings) {
		  if(b.flightno == this.flightno && b.date.equals(this.date)) {
			  booked++;
		  }
	  }
	  return booked<capacity? true: false;
  }
 
}
