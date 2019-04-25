package Multiplication;
import java.util.*;

public class TestMul {

	public static void main(String[] args) {
		
		Scanner M=new Scanner(System.in);
		System.out.println("Enter the value of A ");
		int x=M.nextInt();
		System.out.println("Enter the value of B ");
		int z=M.nextInt();
		Mult m=new Mult(x,z);
		m.mul();
		m.print();

	}

}
