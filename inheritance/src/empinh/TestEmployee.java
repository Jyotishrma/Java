package empinh;

import java.util.Scanner;

public class TestEmployee {
	static int id;
	static String name;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 1 for Permanent Employee, 2 For Consultant Employee ");
		int choice = scan.nextInt();
		switch (choice) {
		case 1:
			System.out.println("Please Permanent Employee Enter ID:");
			id = scan.nextInt();
			scan.nextLine();
			System.out.println("Please EnterPermanent Employee Name:");
			name = scan.next();
			System.out.println("Please Enter Permanent Employee Basic Salary:");
			float basicsalary = scan.nextFloat();
			PermanetEmployee pe = new PermanetEmployee(id, name, basicsalary);
			pe.CalculateSalary();
			pe.print();
			break;
		case 2:
			System.out.println("Please Permanent Employee Enter ID:");
			id = scan.nextInt();
			scan.nextLine();
			System.out.println("Please EnterPermanent Employee Name:");
			name = scan.next();
			System.out.println("Please Enter Permanent Employee number fo hours:");
			int nohrs = scan.nextInt();
			System.out.println("Please Enter Permanent Employee number fo Rate:");
			float rate = scan.nextFloat();
			ConsultantEmployee ce = new ConsultantEmployee(id, name, nohrs, rate);
			ce.CalculateSalary();
			ce.print();
			break;

		default:
			System.out.println("Bad choice");
			break;
		}
//		if (choice == 1) {
//			System.out.println("Please Permanent Employee Enter ID:");
//			id = scan.nextInt();
//			scan.nextLine();
//			System.out.println("Please EnterPermanent Employee Name:");
//			name = scan.next();
//			System.out.println("Please Enter Permanent Employee Basic Salary:");
//			float basicsalary = scan.nextFloat();
//			PermanetEmployee pe = new PermanetEmployee(id, name, basicsalary);
//			pe.CalculateSalary();
//			pe.print();
//		} else if (choice == 2) {
//			System.out.println("Please Permanent Employee Enter ID:");
//			id = scan.nextInt();
//			scan.nextLine();
//			System.out.println("Please EnterPermanent Employee Name:");
//			name = scan.next();
//			System.out.println("Please Enter Permanent Employee number fo hours:");
//			int nohrs = scan.nextInt();
//			System.out.println("Please Enter Permanent Employee number fo Rate:");
//			float rate = scan.nextFloat();
//			ConsultantEmployee ce = new ConsultantEmployee(id, name, nohrs, rate);
//			ce.CalculateSalary();
//			ce.print();
//		} else {
//			System.out.println("Bad choice");
//		}
		scan.close();
	}

}
