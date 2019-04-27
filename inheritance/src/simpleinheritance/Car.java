package simpleinheritance;

public class Car extends Vehicle {
	String geartype;
	
	public Car() {
		
	}
	public Car(String name, String color, int speed, String geartype) {
		super(name,color,speed);
		this.geartype = geartype;
	}
	
	void print() {
		super.print();
		System.out.println("Geare type is: " + geartype);
	}
	
	void accelirate() {
		super.print();
		System.out.println("Accelirate by 5Km/h");
	}
	
	

	
}
