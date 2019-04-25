package studentarray;

public class Student {
	private int id;
	private String name;
	private float m1,m2,m3;
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getM1() {
		return m1;
	}

	public void setM1(float m1) {
		this.m1 = m1;
	}

	public float getM2() {
		return m2;
	}

	public void setM2(float m2) {
		this.m2 = m2;
	}

	public float getM3() {
		return m3;
	}

	public void setM3(float m3) {
		this.m3 = m3;
	}

	
	
	

	
	public Student() {
		
	}
	

	public Student(int id, String name, float m1, float m2, float m3, float m4, float m5) {
		//super();
		this.id = id;
		this.name = name;
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
		
	}

	
	
	void print() {
		System.out.println("Id is:" + id);
		System.out.println("Name is:" + name);
		System.out.println("Marks " + m1+ "," + m2+ "," + m3 );
		
	}

}
