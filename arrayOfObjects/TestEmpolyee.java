package arrayOfObjects;

import java.util.Scanner;

public class TestEmpolyee {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter No of Employees");
		Employee[] employees= new Employee[s.nextInt()];
		for (int i = 0; i < employees.length; i++) {
			System.out.println("Enter id , name , salary");
			employees[i]= new Employee();
			employees[i].setId(s.nextInt());
			s.nextLine();
			employees[i].setName(s.next());
			employees[i].setSalary(s.nextFloat());
		}
		
		for (int i = 0; i < employees.length; i++) {
			employees[i].print();
		}

	}

}
