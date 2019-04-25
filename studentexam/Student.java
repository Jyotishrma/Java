package studentexam;

public class Student {
	private int id;
	private String name;
	private String grade;
	Exam[] exams;

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

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public Exam[] getExams() {
		return exams;
	}

	public void setExams(Exam[] exams) {
		this.exams = exams;
	}

	public Student() {

	}

	public Student(int id, String name, String grade) {
		super();
		this.id = id;
		this.name = name;
		this.grade = grade;
	}

	void print() {
		System.out.println("Id is:" + id);
		System.out.println("Name is:" + name);
		System.out.println("Grade " + grade);
		for (int i = 0; i < this.exams.length; i++) {
			this.exams[i].printExam();
		}

	}

}
