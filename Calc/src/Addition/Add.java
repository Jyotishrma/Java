package Addition;

public class Add {

	int a,b,c;

	public Add(int a, int b) {
		
		this.a = a;
		this.b = b;
		
	}

	void sum() {
		this.c=a+b;
				

	}
	void print() {
		System.out.println("The Sum is " +c);
	}
}
