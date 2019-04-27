package simpleinheritance;

public class TestVehicle {

	public static void main(String[] args) {
		
		Car c = new Car();
		c.name= "TOYOTA";
		c.color= "Red";
		c.speed= 50;
		c.geartype= "normal";
		c.print();
		
		Car cc= new Car ("BMW","White",120,"high");
		cc.accelirate();
		

	}

}
