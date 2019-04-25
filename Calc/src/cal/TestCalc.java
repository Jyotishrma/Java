package cal;

import java.util.Scanner;

public class TestCalc {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		Calc c= new Calc();
		System.out.println("Enter your choice");
		int choice=scan.nextInt();
		switch (choice) {
		case 1:
			System.out.println("Enter the value of A ");
			float a=scan.nextFloat();
			System.out.println("Enter the value of B ");
			float b=scan.nextFloat();
			c.a=a;
			c.b=b;
			c.Add();
			c.print();
			break;
			
		case 2:
			System.out.println("Enter the value of A ");
			float e=scan.nextFloat();
			System.out.println("Enter the value of B ");
			float d=scan.nextFloat();
			c.a=e;
			c.b=d;
			c.Sub();
			c.print();
			break;
			
			
		case 3:
			System.out.println("Enter the value of A ");
			float x=scan.nextFloat();
			System.out.println("Enter the value of B ");
			float y=scan.nextFloat();
			c.a=x;
			c.b=y;
			c.Mul();
			c.print();
			break;
			
		case 4:
			System.out.println("Enter the value of A ");
			float m=scan.nextFloat();
			System.out.println("Enter the value of B ");
			float n=scan.nextFloat();
			c.a=m;
			c.b=n;
			c.Div();
			c.print();
			break;
		

		default:
			System.out.println("Invalid choice");
			break;
		}

	}

}
