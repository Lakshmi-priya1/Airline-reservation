import java.util.ArrayList;
import java.util.Scanner;

public class FlightDemo {
public static void main(String[] args) {
	ArrayList<Flight> flights = new ArrayList<Flight>();
	ArrayList<Booking> bookings = new ArrayList<Booking>();
	Scanner scanner=new Scanner(System.in);
	
	flights.add(new Flight(10,12,"First class"));
	flights.add(new Flight(20,13,"Second class"));
	
	for(Flight f:flights) {
		f.display();
	}
	
	int useroption=1;
	while(useroption==1) {
		System.out.println("Enter 1 to Book and 2 to exit");
		useroption = scanner.nextInt();
		
		
		if(useroption==1) {
			
			Booking b=new Booking();
			
			if(b.isAvailable(flights,bookings)) {
				bookings.add(b);
				System.out.println("Booking Confirmed");
			}
			else {
				System.out.println("Failed");
			}
			
		}
	}
	
}
}
