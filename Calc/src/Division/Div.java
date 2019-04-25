package Division;

public class Div {
	
	float a;
	float b;
	float c;
	float d;
	
	public Div() {
		this.a = a;
		this.b = b;
		
	}
	
	void Divi() {
		this.c=a/b;
		this.d=a%b;
	}
	
	void print() {
		System.out.println("The Remainder is  " +d);
		System.out.println("The Quotient is " +c);
	}
}
