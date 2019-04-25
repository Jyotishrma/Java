package cal;

public class Calc {
	
	float a,b,c,d;

	public Calc() {
		this.a = a;
		this.b = b;
		
	}
	
	
	
//	public Calc(float a, float b) {
//		
//		this.a = a;
//		this.b = b;
//	}



	void Add() {
		this.c=a+b;
		
	}
	
	void Sub() {
		this.c=a-b;
		
	}
	
	void Mul() {
		this.c=a*b;
		
	}
	
	void Div() {
		this.c=a/b;
		this.d=a%b;
		System.out.println("The rem is " +d);
		
		
	}
	
	void print() {
	System.out.println("The answer is " +c);
	
	
	}
	

}
