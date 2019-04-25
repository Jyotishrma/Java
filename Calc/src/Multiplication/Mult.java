package Multiplication;

public class Mult {
	
	int a;
	int b;
	int c;
	
	public Mult(int a, int b) {
		this.a = a;
		this.b = b;
		}
	 void mul() {
		 this.c=a*b;
		}
	void print() {
		System.out.println("The multiplication is " +c);
	}

}
