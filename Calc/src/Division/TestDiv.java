package Division;

import java.util.Scanner;

public class TestDiv {

	public static void main(String[] args) {

		Scanner S = new Scanner(System.in);
		System.out.println("Enter the value of A ");
		float x=S.nextFloat();
		System.out.println("Enter the value of B ");
		float z=S.nextFloat();
		Div q = new Div();
		q.a=x;
		q.b=z;
		q.Divi();
		q.print();
		
	}

}
