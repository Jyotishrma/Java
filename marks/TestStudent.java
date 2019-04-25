package marks;



public class TestStudent {
	
	private static java.util.Scanner scan;
	static float percentage;
	
	public static void main(String[] args) {
		 scan = new java.util.Scanner(System.in);
		
		//Student st= new Student();
		
//		System.out.println("Please Enter ID:");
//		st.setId(scan.nextInt());
//		System.out.println("Please Enter Name:");
//		st.setName(scan.next());
//		System.out.println("Please Enter 1mark:");
//		st.setM1(scan.nextFloat());
//		System.out.println("Please Enter 2mark:");
//		st.setM2(scan.nextFloat());
//		System.out.println("Please Enter 3mark:");
//		st.setM3(scan.nextFloat());
//		System.out.println("Please Enter 4mark:");
//		st.setM4(scan.nextFloat());
//		System.out.println("Please Enter 5mark:");
//		st.setM5(scan.nextFloat());
		
		 
		 System.out.println("Please Enter ID, Name, Marks");
		 Student st= new Student(scan.nextInt(), scan.next(), scan.nextFloat(), scan.nextFloat(),scan.nextFloat(),scan.nextFloat(), scan.nextFloat());
				 percentage=st.calculatePer();
		 
		 st.print();

}
}
