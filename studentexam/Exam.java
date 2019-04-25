package studentexam;

public class Exam {
	private String name;
	private float marks;

	public Exam() {
		// TODO Auto-generated constructor stub
	}

	public Exam(String name, float marks) {
		super();
		this.name = name;
		this.marks = marks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getMarks() {
		return marks;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}

	void printExam() {
		System.out.println("Exam's name is: " + name);
		System.out.println("mark is "+ marks);

	}

}
