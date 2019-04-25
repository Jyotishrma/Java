package innerclasses;

public class TestS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Outer.Inner in =  Outer().new Inner();
		Star s= new Star("Hijawadi", "60");
		Star.Coffee c= s.new Coffee("a","22");
		s.printS();
		c.printC();
		
	}

}
