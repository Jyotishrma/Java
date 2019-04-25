package containment;

import java.util.Scanner;

public class TestCon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s= new Scanner(System.in);
		System.out.println(" Enter id , name, salary");
		Employee e= new Employee(s.nextInt(),s.next(),s.nextFloat());
		System.out.println("Enter Cername, grade , inistitution");
		Certificate c= new Certificate(s.next(),s.next(),s.next());
		e.setCertificate(c);
		e.print();
		
		s.close();

	}

}
