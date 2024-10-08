public class Flight {
	int capacity;
	int flightno;
	String classtype;
	
	public Flight(int capacity, int flightno, String classtype) {
	
		this.capacity = capacity;
		this.flightno = flightno;
		this.classtype = classtype;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public int getFlightno() {
		return flightno;
	}
	public void setFlightno(int flightno) {
		this.flightno = flightno;
	}
	public String getClasstype() {
		return classtype;
	}
	public void setClasstype(String classtype) {
		this.classtype = classtype;
	}
	public void display() {
		System.out.println("Flight No: "+flightno+" Capacity: "+capacity+" ClassType: "+classtype);
	}

}
