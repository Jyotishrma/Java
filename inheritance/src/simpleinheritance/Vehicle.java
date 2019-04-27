package simpleinheritance;

public class Vehicle {
	String name;
	String color;
	int speed;
	
	public Vehicle() {
		
	}
	
	public Vehicle(String name, String color, int speed) {
		super();
		this.name = name;
		this.color = color;
		this.speed = speed;
	}

	void accelirate() {
		System.out.println("Accelirate soeed .");
		
	}
	
	void print() {
		System.out.println("Vehicle name is " + name);
		System.out.println("Vehicle color is " + color);
		System.out.println("Vehicle speed is " + speed);
	}

}
