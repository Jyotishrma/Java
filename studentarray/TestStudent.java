package studentarray;

public class TestStudent {
	
	private static java.util.Scanner scan;
	
	
	public static void main(String[] args) {
		 scan = new java.util.Scanner(System.in);
		 System.out.println("Enter No of Students");
			Student[] students= new Student[scan.nextInt()];
			for (int i = 0; i < students.length; i++) {
				System.out.println("Please Enter ID, Name, Marks");
				students[i]= new Student(scan.nextInt(), scan.next(), scan.nextFloat(), scan.nextFloat(),scan.nextFloat(),scan.nextFloat(), scan.nextFloat());
				
			}
			
			for (int i = 0; i < students.length; i++) {
				students[i].print();
				
			}
		

}
}
