package studentexam;

public class TestStudent {

	private static java.util.Scanner scan;

	public static void main(String[] args) {
		scan = new java.util.Scanner(System.in);

		System.out.println("enter id name grade :");
		Student st = new Student(scan.nextInt(), scan.next(), scan.next());

		System.out.println("Enter No of Exams");
		Exam[] e = new Exam[scan.nextInt()];
		scan.nextLine();
		for (int i = 0; i < e.length; i++) {
			System.out.println("Enter Exam name & mark");
			String s = scan.next();
			float f = scan.nextFloat();
			e[i] = new Exam();
			e[i].setName(s);
			e[i].setMarks(f);

		}
		st.exams = e;

		st.print();

//			Student[] students= new Student[scan.nextInt()];
//			for (int i = 0; i < students.length; i++) {
//				System.out.println("Please Enter ID, Name, Marks");
//				students[i]= new Student(scan.nextInt(), scan.next(), scan.nextFloat(), scan.nextFloat(),scan.nextFloat(),scan.nextFloat(), scan.nextFloat());
//				
//			}
//			
//			for (int i = 0; i < students.length; i++) {
//				students[i].print();
//				
//			}
//		

	}
}
